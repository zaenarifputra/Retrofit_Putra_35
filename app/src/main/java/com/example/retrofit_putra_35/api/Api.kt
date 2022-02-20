package com.example.retrofit_putra_35.api

import com.example.retrofit_putra_35.model.IndonesiaResponse
import com.example.retrofit_putra_35.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET ("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET ("csaenumberprovince.json")
    fun getProvince():  Call<ArrayList<ProvinceResponse>>
}