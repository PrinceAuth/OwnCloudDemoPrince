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
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.text.buildString

public class CoreCapabilitiesJsonAdapter(
  moshi: Moshi
) : JsonAdapter<CoreCapabilities>() {
  private val options: JsonReader.Options = JsonReader.Options.of("pollinterval")

  private val nullableIntAdapter: JsonAdapter<Int?> = moshi.adapter(Int::class.javaObjectType,
      emptySet(), "pollinterval")

  public override fun toString(): String = buildString(38) {
      append("GeneratedJsonAdapter(").append("CoreCapabilities").append(')') }

  public override fun fromJson(reader: JsonReader): CoreCapabilities {
    var pollinterval: Int? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> pollinterval = nullableIntAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return CoreCapabilities(
        pollinterval = pollinterval
    )
  }

  public override fun toJson(writer: JsonWriter, value_: CoreCapabilities?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("pollinterval")
    nullableIntAdapter.toJson(writer, value_.pollinterval)
    writer.endObject()
  }
}
