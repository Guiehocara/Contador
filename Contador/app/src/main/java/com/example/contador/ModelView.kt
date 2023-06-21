package com.example.contador

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ModelView: ViewModel() {
    private val contador = MutableStateFlow(2)
    val valor: StateFlow<Int> get() = contador
    fun incrementa(){
        contador.value += 1;
    }

}