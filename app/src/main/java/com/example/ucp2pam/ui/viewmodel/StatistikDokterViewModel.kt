package com.example.ucp2pam.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class StatistikDokterViewModel {
    private val _totalDokter = MutableLiveData<Int>()
    val totalDokter: LiveData<Int> get() = _totalDokter

    private val _dokterPerSpesialis = MutableLiveData<Map<String, Int>>()
    val dokterPerSpesialis: LiveData<Map<String, Int>> get() = _dokterPerSpesialis
}