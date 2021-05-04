// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package com.owncloud.android.lib.resources.status.responses

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import java.lang.NullPointerException
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.text.buildString

public class FileSharingCapabilitiesJsonAdapter(
  moshi: Moshi
) : JsonAdapter<FileSharingCapabilities>() {
  private val options: JsonReader.Options = JsonReader.Options.of("api_enabled", "public",
      "resharing", "federation")

  private val nullableBooleanAdapter: JsonAdapter<Boolean?> =
      moshi.adapter(Boolean::class.javaObjectType, emptySet(), "fileSharingApiEnabled")

  private val nullableFileSharingPublicAdapter: JsonAdapter<FileSharingPublic?> =
      moshi.adapter(FileSharingPublic::class.java, emptySet(), "fileSharingPublic")

  private val nullableFileSharingFederationAdapter: JsonAdapter<FileSharingFederation?> =
      moshi.adapter(FileSharingFederation::class.java, emptySet(), "fileSharingFederation")

  public override fun toString(): String = buildString(45) {
      append("GeneratedJsonAdapter(").append("FileSharingCapabilities").append(')') }

  public override fun fromJson(reader: JsonReader): FileSharingCapabilities {
    var fileSharingApiEnabled: Boolean? = null
    var fileSharingPublic: FileSharingPublic? = null
    var fileSharingReSharing: Boolean? = null
    var fileSharingFederation: FileSharingFederation? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> fileSharingApiEnabled = nullableBooleanAdapter.fromJson(reader)
        1 -> fileSharingPublic = nullableFileSharingPublicAdapter.fromJson(reader)
        2 -> fileSharingReSharing = nullableBooleanAdapter.fromJson(reader)
        3 -> fileSharingFederation = nullableFileSharingFederationAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return FileSharingCapabilities(
        fileSharingApiEnabled = fileSharingApiEnabled,
        fileSharingPublic = fileSharingPublic,
        fileSharingReSharing = fileSharingReSharing,
        fileSharingFederation = fileSharingFederation
    )
  }

  public override fun toJson(writer: JsonWriter, value_: FileSharingCapabilities?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("api_enabled")
    nullableBooleanAdapter.toJson(writer, value_.fileSharingApiEnabled)
    writer.name("public")
    nullableFileSharingPublicAdapter.toJson(writer, value_.fileSharingPublic)
    writer.name("resharing")
    nullableBooleanAdapter.toJson(writer, value_.fileSharingReSharing)
    writer.name("federation")
    nullableFileSharingFederationAdapter.toJson(writer, value_.fileSharingFederation)
    writer.endObject()
  }
}