package com.example.ucp2pam.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ucp2pam.data.entity.Dokter
import com.example.ucp2pam.data.repository.DoctorRepository
import kotlinx.coroutines.launch

class HomeDokterViewModel(private val doctorRepository: DoctorRepository) : ViewModel() {

    // MutableLiveData untuk menyimpan daftar dokter
    private val _dokterList = MutableLiveData<List<Dokter>>()
    val dokterList: LiveData<List<Dokter>> get() = _dokterList

    // Fungsi untuk mendapatkan semua dokter dari repository
    fun getAllDokter() {
        // Menjalankan coroutine untuk mengambil data dari repository
        // (saran: gunakan ViewModelScope atau implementasi lainnya sesuai kebutuhan)
        viewModelScope.launch {
            _dokterList.value = doctorRepository.getAllDokter()
        }
    }


    fun searchDokter(query: String) {
        val filteredList = _dokterList.value?.filter {
            it.nama.contains(query, ignoreCase = true) || it.spesialis.contains(query, ignoreCase = true)
        } ?: emptyList()
        _dokterList.value = filteredList
    }

}
