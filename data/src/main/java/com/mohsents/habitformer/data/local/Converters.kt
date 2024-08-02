package com.mohsents.habitformer.data.local

import androidx.room.TypeConverter

object Converters {

    @TypeConverter
    fun List<String>.separateTags() = this.joinToString(STRING_SEPARATOR)

    @TypeConverter
    fun String.tagsToList() = this.split(STRING_SEPARATOR)

    private const val STRING_SEPARATOR = "|"
}