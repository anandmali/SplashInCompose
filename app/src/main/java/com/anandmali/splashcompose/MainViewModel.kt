package com.anandmali.splashcompose

import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
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

    init {
        checkForSession()
    }

    private fun checkForSession() {
        viewModelScope.launch {
            delay(3000)
            _showSplash.value = false
        }
    }
}