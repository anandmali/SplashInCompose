package com.anandmali.splashcompose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    private val _showSplash = MutableStateFlow(true)
    val showSplash = _showSplash.asStateFlow()

    fun delayForSplashScreen() {
        viewModelScope.launch {
            delay(3000)
            _showSplash.value = false
        }
    }
}