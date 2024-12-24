package com.example.ucp2pam.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ucp2pam.data.entity.Dokter

class DetailDokterViewModel : ViewModel() {

    // MutableLiveData untuk menyimpan detail dokter
    private val _dokter = MutableLiveData<Dokter>()
    val dokter: LiveData<Dokter> get() = _dokter

    // Fungsi untuk mengatur data dokter
    fun setDokter(dokter: Dokter) {
        _dokter.value = dokter
    }
}
