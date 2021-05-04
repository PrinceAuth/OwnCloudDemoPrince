// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package com.owncloud.android.lib.resources.shares.responses

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.text.buildString

public class ShareeValueJsonAdapter(
  moshi: Moshi
) : JsonAdapter<ShareeValue>() {
  private val options: JsonReader.Options = JsonReader.Options.of("shareType", "shareWith",
      "shareWithAdditionalInfo")

  private val intAdapter: JsonAdapter<Int> = moshi.adapter(Int::class.java, emptySet(), "shareType")

  private val stringAdapter: JsonAdapter<String> = moshi.adapter(String::class.java, emptySet(),
      "shareWith")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "additionalInfo")

  public override fun toString(): String = buildString(33) {
      append("GeneratedJsonAdapter(").append("ShareeValue").append(')') }

  public override fun fromJson(reader: JsonReader): ShareeValue {
    var shareType: Int? = null
    var shareWith: String? = null
    var additionalInfo: String? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> shareType = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("shareType",
            "shareType", reader)
        1 -> shareWith = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("shareWith",
            "shareWith", reader)
        2 -> additionalInfo = nullableStringAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return ShareeValue(
        shareType = shareType ?: throw Util.missingProperty("shareType", "shareType", reader),
        shareWith = shareWith ?: throw Util.missingProperty("shareWith", "shareWith", reader),
        additionalInfo = additionalInfo
    )
  }

  public override fun toJson(writer: JsonWriter, value_: ShareeValue?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("shareType")
    intAdapter.toJson(writer, value_.shareType)
    writer.name("shareWith")
    stringAdapter.toJson(writer, value_.shareWith)
    writer.name("shareWithAdditionalInfo")
    nullableStringAdapter.toJson(writer, value_.additionalInfo)
    writer.endObject()
  }
}