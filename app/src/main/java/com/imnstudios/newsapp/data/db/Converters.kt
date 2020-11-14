package com.imnstudios.newsapp.data.db

import androidx.room.TypeConverter
import com.imnstudios.newsapp.data.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}