package com.example.customalarm.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.customalarm.data.entity.HolidayEntity

@Dao
interface HolidayDao {

    companion object {
        const val TABLE_NAME = "holiday"
    }

    @Query("SELECT * FROM $TABLE_NAME")
    suspend fun selectAll(): List<HolidayEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveHolidays(entities: List<HolidayEntity>)

}
