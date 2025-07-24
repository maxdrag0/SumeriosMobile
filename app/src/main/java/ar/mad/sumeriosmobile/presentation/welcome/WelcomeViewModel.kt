package ar.mad.sumeriosmobile.presentation.welcome

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import android.util.Log

class WelcomeViewModel : ViewModel() {
    private val _apiConnected = MutableStateFlow<Boolean?>(null)
    val apiConnected: StateFlow<Boolean?> = _apiConnected.asStateFlow()

    init {
        checkBackendConnection()
    }

    private fun checkBackendConnection() {
        viewModelScope.launch {
            try {


            } catch (e: Exception) {
                Log.e("BackendResponse", "Error conectando al servidor", e)
                _apiConnected.value = false
            }
        }
    }
}
