package com.example.ucp2pam.data.repository

import com.example.ucp2pam.data.entity.Dokter
import com.example.ucp2pam.data.dao.Dokterdao

class DoctorRepository(private val DokterDao: Dokterdao) {

    suspend fun getAllDokter(): List<Dokter> {
        return DokterDao.getAllDokter()
    }

    // Di dalam DoctorRepository
    suspend fun update(dokter: Dokter) {
        DokterDao.updateDokterdao(dokter)
    }

    suspend fun insert(dokter: Dokter) {
        DokterDao.insertDokterdao(dokter)
    }

    suspend fun delete(dokter: Dokter) {
        DokterDao.deleteDokterdao(dokter)
    }
}
