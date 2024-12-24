package com.example.ucp2pam.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ucp2pam.data.entity.Dokter

class FilterDokterViewModel : ViewModel() {

    private val _filteredDokterList = MutableLiveData<List<Dokter>>()
    val filteredDokterList: LiveData<List<Dokter>> get() = _filteredDokterList
}