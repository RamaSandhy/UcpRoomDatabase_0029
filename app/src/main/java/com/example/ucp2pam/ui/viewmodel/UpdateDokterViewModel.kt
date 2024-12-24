package com.example.ucp2pam.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ucp2pam.data.entity.Dokter
import com.example.ucp2pam.data.repository.DoctorRepository
import kotlinx.coroutines.launch

class UpdateDokterViewModel(private val doctorRepository: DoctorRepository) : ViewModel() {

    // MutableLiveData untuk status operasi update
    private val _updateStatus = MutableLiveData<Boolean>()
    val updateStatus: LiveData<Boolean> get() = _updateStatus

    // Fungsi untuk memperbarui data dokter
    fun updateDokter(dokter: Dokter, onSuccess: () -> Unit, onError: (Exception) -> Unit) {
        viewModelScope.launch {
            try {
                // Memanggil fungsi update dari repository
                doctorRepository.update(dokter)
                _updateStatus.value = true
                onSuccess()
            } catch (e: Exception) {
                _updateStatus.value = false
                onError(e)
            }
        }
    }
}
