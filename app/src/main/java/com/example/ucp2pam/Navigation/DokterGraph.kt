package com.example.ucp2pam.Navigation

import com.example.ucp2pam.data.entity.Dokter
import com.example.ucp2pam.data.dao.Dokterdao

data class DokterGraph(
    val dokter: Dokter,
    val connectedDokters: List<Dokter> = listOf()
)

class DoctorRepository(private val DokterDao: Dokterdao) {

    suspend fun getAllDokter(): List<Dokter> {
        return DokterDao.getAllDokter()
    }

}
