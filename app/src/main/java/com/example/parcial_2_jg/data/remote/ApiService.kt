package com.example.parcial_2_jg.data.remote

import retrofit2.Call
import com.example.parcial_2_jg.data.model.NoteModel
import retrofit2.http.GET

interface ApiService {
  @GET("note")
    fun notes(): Call<List<NoteModel>>

  @GET("note/{id}")
    fun noteById(id: Int): Call<NoteModel>
}