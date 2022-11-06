package com.example.universitas_baik_laku

class Prodi(
    val warna : String,
    val jenjang : String,
    val nmProdi : String,
    val fakultas : String,
    val konsentrasi : Array<String> = arrayOf(nmProdi)
)