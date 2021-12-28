package com.example.covidapp.api

import retrofit2.Call
import com.example.covidapp.model.IndonesiaResponse
import com.example.covidapp.model.ProvinceResponse
import retrofit2.http.GET

interface Api {
    @GET("indonesia")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET("indonesia/provinsi")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}