// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package com.owncloud.android.lib.resources.shares.responses

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.emptySet
import kotlin.text.buildString

public class ShareeOcsResponseJsonAdapter(
  moshi: Moshi
) : JsonAdapter<ShareeOcsResponse>() {
  private val options: JsonReader.Options = JsonReader.Options.of("exact", "groups", "remotes",
      "users")

  private val nullableExactShareesAdapter: JsonAdapter<ExactSharees?> =
      moshi.adapter(ExactSharees::class.java, emptySet(), "exact")

  private val listOfShareeItemAdapter: JsonAdapter<List<ShareeItem>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, ShareeItem::class.java),
      emptySet(), "groups")

  public override fun toString(): String = buildString(39) {
      append("GeneratedJsonAdapter(").append("ShareeOcsResponse").append(')') }

  public override fun fromJson(reader: JsonReader): ShareeOcsResponse {
    var exact: ExactSharees? = null
    var groups: List<ShareeItem>? = null
    var remotes: List<ShareeItem>? = null
    var users: List<ShareeItem>? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> exact = nullableExactShareesAdapter.fromJson(reader)
        1 -> groups = listOfShareeItemAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("groups", "groups", reader)
        2 -> remotes = listOfShareeItemAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("remotes", "remotes", reader)
        3 -> users = listOfShareeItemAdapter.fromJson(reader) ?: throw Util.unexpectedNull("users",
            "users", reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return ShareeOcsResponse(
        exact = exact,
        groups = groups ?: throw Util.missingProperty("groups", "groups", reader),
        remotes = remotes ?: throw Util.missingProperty("remotes", "remotes", reader),
        users = users ?: throw Util.missingProperty("users", "users", reader)
    )
  }

  public override fun toJson(writer: JsonWriter, value_: ShareeOcsResponse?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("exact")
    nullableExactShareesAdapter.toJson(writer, value_.exact)
    writer.name("groups")
    listOfShareeItemAdapter.toJson(writer, value_.groups)
    writer.name("remotes")
    listOfShareeItemAdapter.toJson(writer, value_.remotes)
    writer.name("users")
    listOfShareeItemAdapter.toJson(writer, value_.users)
    writer.endObject()
  }
}