package com.marcos.cadastropessoacompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.marcos.cadastropessoacompose.dto.Usuario
import com.marcos.cadastropessoacompose.ui.theme.CadastroPessoaComposeTheme
import com.marcos.cadastropessoacompose.viewmodel.UsuarioViewModel
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CadastroPessoaComposeTheme {
                AppPrincipal()
            }
        }
    }
}

@Composable
fun AppPrincipal() {
    val viewModel: UsuarioViewModel = viewModel()
    val usuarios by viewModel.usuarios.collectAsState()
    LaunchedEffect(Unit) {
        while (true){
            viewModel.carregarUsuarios()
            delay(60000)
        }
    }
    LazyColumn (
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ){
        items(usuarios){ usuario ->
            UsuarioItem(usuario)
        }
    }
}

@Composable
fun UsuarioItem(usuario: Usuario){
    Column (
        modifier = Modifier.fillMaxWidth().padding(8.dp)
    ){
        Text(usuario.nome, fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(4.dp))
        Text(usuario.email)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CadastroPessoaComposeTheme {
        AppPrincipal()
    }
}