package com.example.ucp2pam.data.repository

import com.example.ucp2pam.data.entity.Jadwal
import com.example.ucp2pam.data.dao.JadwalDao

class JadwalRepository(private val jadwalDao: JadwalDao) {

    suspend fun getAllJadwal(): List<Jadwal> {
        return jadwalDao.getAllJadwal()
    }
}
