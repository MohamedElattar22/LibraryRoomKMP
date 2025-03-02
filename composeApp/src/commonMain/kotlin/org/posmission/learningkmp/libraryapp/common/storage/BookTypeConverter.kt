package org.posmission.learningkmp.libraryapp.common.storage

import androidx.room.TypeConverter
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.json.Json

class BookTypeConverter {

    @TypeConverter
    fun fromString(value: String): List<String> {
        return Json.decodeFromString(
            ListSerializer(String.serializer()),
            value
        )
    }

    @TypeConverter
    fun toString(list: List<String>): String {
        return Json.encodeToString(
            ListSerializer(String.serializer()),
            list
        )
    }

}