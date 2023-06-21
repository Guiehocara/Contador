package com.example.contador

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import com.example.contador.ui.theme.ContadorTheme
import com.example.contador.ui.theme.ContadorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var contador =  ViewModelProvider(this).get(ModelView::class.java)
        setContent {
            var model = ModelView()
            var contadorClasse by remember { mutableStateOf(0) }
            val contador by model.valor.collectAsState()

            ContadorTheme() {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Column {
                        Button(onClick = { model.incrementa() }) {
                            Text("incrementa")
                        }
                        Button(onClick = { contadorClasse += 1 }) {
                            Text("incrementa")
                        }
                        Text("Contador: ${contador}")
                        Text("Contador da classe: ${contadorClasse}")
                        Spacer(modifier = Modifier.height(50.dp))
                        Text("RM: 22309")
                        Text("Nome: Guilherme Rafael Figueiredo Pereira")

                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ContadorTheme {
        Greeting("Android")
    }
}