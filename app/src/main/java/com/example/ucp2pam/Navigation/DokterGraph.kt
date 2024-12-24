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

    suspend fun getDokterGraph(): List<DokterGraph> {
        val dokterList = DokterDao.getAllDokter()
        val dokterGraphList = mutableListOf<DokterGraph>()

        dokterList.forEach { dokter ->
            val connectedDokters = dokterList.filter {
                it.spesialis == dokter.spesialis && it.id != dokter.id
            }
            dokterGraphList.add(DokterGraph(dokter, connectedDokters))
        }

        return dokterGraphList
    }
    suspend fun insert(dokter: Dokter) {
        DokterDao.insertDokterdao(dokter)
    }

    suspend fun delete(dokter: Dokter) {
        DokterDao.deleteDokterdao(dokter)

    }
}