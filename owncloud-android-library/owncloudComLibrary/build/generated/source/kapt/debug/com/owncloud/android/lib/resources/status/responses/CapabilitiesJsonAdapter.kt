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
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.text.buildString

public class CapabilitiesJsonAdapter(
  moshi: Moshi
) : JsonAdapter<Capabilities>() {
  private val options: JsonReader.Options = JsonReader.Options.of("core", "files_sharing", "files",
      "dav")

  private val nullableCoreCapabilitiesAdapter: JsonAdapter<CoreCapabilities?> =
      moshi.adapter(CoreCapabilities::class.java, emptySet(), "coreCapabilities")

  private val nullableFileSharingCapabilitiesAdapter: JsonAdapter<FileSharingCapabilities?> =
      moshi.adapter(FileSharingCapabilities::class.java, emptySet(), "fileSharingCapabilities")

  private val nullableFileCapabilitiesAdapter: JsonAdapter<FileCapabilities?> =
      moshi.adapter(FileCapabilities::class.java, emptySet(), "fileCapabilities")

  private val nullableDavCapabilitiesAdapter: JsonAdapter<DavCapabilities?> =
      moshi.adapter(DavCapabilities::class.java, emptySet(), "davCapabilities")

  public override fun toString(): String = buildString(34) {
      append("GeneratedJsonAdapter(").append("Capabilities").append(')') }

  public override fun fromJson(reader: JsonReader): Capabilities {
    var coreCapabilities: CoreCapabilities? = null
    var fileSharingCapabilities: FileSharingCapabilities? = null
    var fileCapabilities: FileCapabilities? = null
    var davCapabilities: DavCapabilities? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> coreCapabilities = nullableCoreCapabilitiesAdapter.fromJson(reader)
        1 -> fileSharingCapabilities = nullableFileSharingCapabilitiesAdapter.fromJson(reader)
        2 -> fileCapabilities = nullableFileCapabilitiesAdapter.fromJson(reader)
        3 -> davCapabilities = nullableDavCapabilitiesAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return Capabilities(
        coreCapabilities = coreCapabilities,
        fileSharingCapabilities = fileSharingCapabilities,
        fileCapabilities = fileCapabilities,
        davCapabilities = davCapabilities
    )
  }

  public override fun toJson(writer: JsonWriter, value_: Capabilities?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("core")
    nullableCoreCapabilitiesAdapter.toJson(writer, value_.coreCapabilities)
    writer.name("files_sharing")
    nullableFileSharingCapabilitiesAdapter.toJson(writer, value_.fileSharingCapabilities)
    writer.name("files")
    nullableFileCapabilitiesAdapter.toJson(writer, value_.fileCapabilities)
    writer.name("dav")
    nullableDavCapabilitiesAdapter.toJson(writer, value_.davCapabilities)
    writer.endObject()
  }
}
