package com.example.musicappui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

class MainViewMdel {
    private val _currentscreen: MutableState<Screen> = mutableStateOf(Screen.DrawerScreen.AddAccount)

    val currentScreen: MutableState<Screen>
        get() =_currentscreen

    fun setCurrentScreen(screen: Screen){
        currentScreen.value = screen
    }
}