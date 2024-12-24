package com.example.ucp2pam.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ucp2pam.data.entity.Dokter
import com.example.ucp2pam.data.repository.DoctorRepository
import kotlinx.coroutines.launch

class TambahDokterViewModel(private val doctorRepository: DoctorRepository) : ViewModel() {

    fun tambahDokter(dokter: Dokter, onSuccess: () -> Unit, onError: (Exception) -> Unit) {
        viewModelScope.launch {
            try {
                doctorRepository.insert(dokter)
                onSuccess()
            } catch (e: Exception) {
                onError(e)
            }
        }
    }
}