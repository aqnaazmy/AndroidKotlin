package com.example.kotlintwo.data.repository

import com.example.kotlintwo.data.api.ApiClient
import com.example.kotlintwo.data.api.model.Photos
import javax.inject.Inject

class PhotoRepository @Inject constructor(
    private val apiClient: ApiClient
) {
    suspend fun getAllPhotos() : List<Photos>{
        return apiClient.getAllPhotos()
    }
}