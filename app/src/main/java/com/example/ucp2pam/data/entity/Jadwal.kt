package com.example.ucp2pam.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "Jadwal")
data class Jadwal(
    @PrimaryKey
    val id: String,
    val namadokter: String,
    val namapasien: String,
    val Nohp: String,
    val Tinggalkonsultasi: String,
    val Status: String
)

