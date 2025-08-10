package com.marcos.cadastropessoacompose.retrofit
import com.marcos.cadastropessoacompose.dto.Usuario
import retrofit2.http.GET

interface ApiService {
    @GET("/pessoa/buscar")
    suspend fun buscarUsuarios(): List<Usuario>
}