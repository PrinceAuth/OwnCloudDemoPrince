package com.example.basicownclouddemo.activity.main

import android.accounts.Account
import android.accounts.AccountManager
import android.annotation.SuppressLint
import android.app.Activity
import android.net.Uri
import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.basicownclouddemo.activity.MainAppC
import com.owncloud.android.lib.common.OwnCloudAccount
import com.owncloud.android.lib.common.OwnCloudClient
import com.owncloud.android.lib.common.OwnCloudClientFactory
import com.owncloud.android.lib.common.SingleSessionManager
import com.owncloud.android.lib.common.accounts.AccountUtils
import com.owncloud.android.lib.common.authentication.OwnCloudCredentialsFactory
import com.owncloud.android.lib.resources.files.ReadRemoteFolderOperation
import com.owncloud.android.lib.resources.status.services.implementation.OCServerInfoService
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private var client: OwnCloudClient? = null

    companion object {
        private var TAG = "MainViewModel"
    }

    fun setCloud(activity: Activity) {
        GlobalScope.launch {
            val serverUri: Uri = Uri.parse("baseUrl")
            SingleSessionManager.setUserAgent(MainAppC.userAgent)
            // set base url
            client = OwnCloudClientFactory.createOwnCloudClient(
                serverUri,
                activity,  // Activity or Service context
                true
            )
            // set username and password
            client?.credentials = OwnCloudCredentialsFactory
                .newBasicCredentials("username", "password")
            // set account with credentials

            val saved = OwnCloudAccount(client?.baseUri , client?.credentials)
            client?.account = saved
            Log.e(TAG, "saved account : " + saved.savedAccount)
            // check server
            checkServer()
        }
    }

    @SuppressLint("LogNotTimber")
    private fun checkServer() {
        GlobalScope.launch {
            val server = OCServerInfoService().getRemoteStatus(client?.baseUri.toString(), client!!)
            val data = server.data
            Log.e(TAG, "OCServerInfoService Server Info : " + data.isSecureConnection)

            val readFolders = ReadRemoteFolderOperation("/")
            // val readFolders = ReadRemoteFolderOperation("/")
            val readResponses = readFolders.execute(client)
            Log.e(TAG, "ReadRemoteFolderOperation Error Code :${readResponses.code}" )
           /* if (readResponses.data?.isNullOrEmpty()!!){
                Log.e(TAG, "setCloud: "+ readResponses.exception.message)
            } else {
                Log.e(TAG, "setCloud: "+ readResponses.data.size)
            }*/
        }
    }
}