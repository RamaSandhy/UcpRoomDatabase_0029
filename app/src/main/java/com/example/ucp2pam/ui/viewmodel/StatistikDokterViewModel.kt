package com.example.ucp2pam.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.ucp2pam.data.entity.Dokter

class StatistikDokterViewModel {
    private val _totalDokter = MutableLiveData<Int>()
    val totalDokter: LiveData<Int> get() = _totalDokter

    private val _dokterPerSpesialis = MutableLiveData<Map<String, Int>>()
    val dokterPerSpesialis: LiveData<Map<String, Int>> get() = _dokterPerSpesialis

    fun updateStatistik(dokterList: List<Dokter>) {
        // Hitung total dokter
        _totalDokter.value = dokterList.size
    }
}