package com.example.kotlintwo.data.api

import com.example.kotlintwo.data.api.model.Photos
import retrofit2.http.GET

interface ApiClient {

    @GET("/photos")
    suspend fun getAllPhotos() : List<Photos>


}