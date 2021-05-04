// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package com.owncloud.android.lib.resources.oauth.responses

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.collections.emptySet
import kotlin.text.buildString

public class TokenResponseJsonAdapter(
  moshi: Moshi
) : JsonAdapter<TokenResponse>() {
  private val options: JsonReader.Options = JsonReader.Options.of("access_token", "expires_in",
      "refresh_token", "token_type", "user_id", "scope", "additional_parameters")

  private val stringAdapter: JsonAdapter<String> = moshi.adapter(String::class.java, emptySet(),
      "accessToken")

  private val intAdapter: JsonAdapter<Int> = moshi.adapter(Int::class.java, emptySet(), "expiresIn")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "refreshToken")

  private val nullableMapOfStringStringAdapter: JsonAdapter<Map<String, String>?> =
      moshi.adapter(Types.newParameterizedType(Map::class.java, String::class.java,
      String::class.java), emptySet(), "additionalParameters")

  public override fun toString(): String = buildString(35) {
      append("GeneratedJsonAdapter(").append("TokenResponse").append(')') }

  public override fun fromJson(reader: JsonReader): TokenResponse {
    var accessToken: String? = null
    var expiresIn: Int? = null
    var refreshToken: String? = null
    var tokenType: String? = null
    var userId: String? = null
    var scope: String? = null
    var additionalParameters: Map<String, String>? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> accessToken = stringAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("accessToken", "access_token", reader)
        1 -> expiresIn = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("expiresIn",
            "expires_in", reader)
        2 -> refreshToken = nullableStringAdapter.fromJson(reader)
        3 -> tokenType = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("tokenType",
            "token_type", reader)
        4 -> userId = nullableStringAdapter.fromJson(reader)
        5 -> scope = nullableStringAdapter.fromJson(reader)
        6 -> additionalParameters = nullableMapOfStringStringAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return TokenResponse(
        accessToken = accessToken ?: throw Util.missingProperty("accessToken", "access_token",
            reader),
        expiresIn = expiresIn ?: throw Util.missingProperty("expiresIn", "expires_in", reader),
        refreshToken = refreshToken,
        tokenType = tokenType ?: throw Util.missingProperty("tokenType", "token_type", reader),
        userId = userId,
        scope = scope,
        additionalParameters = additionalParameters
    )
  }

  public override fun toJson(writer: JsonWriter, value_: TokenResponse?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("access_token")
    stringAdapter.toJson(writer, value_.accessToken)
    writer.name("expires_in")
    intAdapter.toJson(writer, value_.expiresIn)
    writer.name("refresh_token")
    nullableStringAdapter.toJson(writer, value_.refreshToken)
    writer.name("token_type")
    stringAdapter.toJson(writer, value_.tokenType)
    writer.name("user_id")
    nullableStringAdapter.toJson(writer, value_.userId)
    writer.name("scope")
    nullableStringAdapter.toJson(writer, value_.scope)
    writer.name("additional_parameters")
    nullableMapOfStringStringAdapter.toJson(writer, value_.additionalParameters)
    writer.endObject()
  }
}
