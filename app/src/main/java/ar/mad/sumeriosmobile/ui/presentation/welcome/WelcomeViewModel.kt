package ar.mad.sumeriosmobile.ui.presentation.welcome

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ar.mad.sumeriosmobile.domain.usecase.GetServerStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WelcomeViewModel @Inject constructor(
    private val getServerStatusUseCase: GetServerStatus
) : ViewModel() {

    private val _apiConnected = MutableStateFlow<Boolean?>(null)
    val apiConnected: StateFlow<Boolean?> = _apiConnected.asStateFlow()


    init {
        checkBackendConnection()
    }

    private fun checkBackendConnection() {
        viewModelScope.launch {
            try {
                val result = getServerStatusUseCase()
                _apiConnected.value = result == "ready"
            } catch (e: Exception) {
                Log.e("BackendResponse", "Error conectando al servidor", e)
                _apiConnected.value = false
            }
        }
    }
}
