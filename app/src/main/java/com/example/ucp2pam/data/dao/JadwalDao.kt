package com.example.ucp2pam.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.ucp2pam.data.entity.Jadwal

@Dao
interface JadwalDao {
    @Insert
    suspend fun insertJadwal(jadwal: Jadwal)

    @Update
    suspend fun updateJadwal(jadwal: Jadwal)

    @Delete
    suspend fun deleteJadwal(jadwal: Jadwal)

    @Query("SELECT * FROM Jadwal")
    suspend fun getAllJadwal(): List<Jadwal>

    @Query("SELECT * FROM Jadwal WHERE id = :id")
    suspend fun getJadwalById(id: Int): Jadwal?

    @Query("DELETE FROM Jadwal")
    suspend fun deleteAllJadwal()
}



