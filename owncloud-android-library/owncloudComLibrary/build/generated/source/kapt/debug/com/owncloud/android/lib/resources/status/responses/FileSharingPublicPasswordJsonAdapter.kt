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

public class FileSharingPublicPasswordJsonAdapter(
  moshi: Moshi
) : JsonAdapter<FileSharingPublicPassword>() {
  private val options: JsonReader.Options = JsonReader.Options.of("enforced", "enforced_for")

  private val nullableBooleanAdapter: JsonAdapter<Boolean?> =
      moshi.adapter(Boolean::class.javaObjectType, emptySet(), "enforced")

  private val nullableFileSharingPublicPasswordEnforcedAdapter:
      JsonAdapter<FileSharingPublicPasswordEnforced?> =
      moshi.adapter(FileSharingPublicPasswordEnforced::class.java, emptySet(), "enforcedFor")

  public override fun toString(): String = buildString(47) {
      append("GeneratedJsonAdapter(").append("FileSharingPublicPassword").append(')') }

  public override fun fromJson(reader: JsonReader): FileSharingPublicPassword {
    var enforced: Boolean? = null
    var enforcedFor: FileSharingPublicPasswordEnforced? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> enforced = nullableBooleanAdapter.fromJson(reader)
        1 -> enforcedFor = nullableFileSharingPublicPasswordEnforcedAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return FileSharingPublicPassword(
        enforced = enforced,
        enforcedFor = enforcedFor
    )
  }

  public override fun toJson(writer: JsonWriter, value_: FileSharingPublicPassword?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("enforced")
    nullableBooleanAdapter.toJson(writer, value_.enforced)
    writer.name("enforced_for")
    nullableFileSharingPublicPasswordEnforcedAdapter.toJson(writer, value_.enforcedFor)
    writer.endObject()
  }
}