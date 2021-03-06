package com.example.jetpack._model.database._converters;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;

public class LongToDataConverter {

    @TypeConverter
    public static Date toDate(Long timestamp) {
        return timestamp == null ? null : new Date(timestamp);
    }

    @TypeConverter
    public static Long toTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }
}
