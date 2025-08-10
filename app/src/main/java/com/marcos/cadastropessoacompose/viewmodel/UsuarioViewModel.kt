package com.marcos.cadastropessoacompose.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.marcos.cadastropessoacompose.dto.Usuario
import com.marcos.cadastropessoacompose.retrofit.RetrofitClient
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class UsuarioViewModel: ViewModel() {

    private val _usuarios = MutableStateFlow<List<Usuario>>(emptyList())
    val usuarios : StateFlow<List<Usuario>> = _usuarios

    fun carregarUsuarios(){
        viewModelScope.launch {
            try {
                val response = RetrofitClient.api.buscarUsuarios()
                _usuarios.value = response
            } catch (e: Exception){
                e.printStackTrace()
            }
        }
    }

}