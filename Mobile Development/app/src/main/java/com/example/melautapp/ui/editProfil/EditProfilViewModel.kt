package com.example.melautapp.ui.editProfil

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EditProfilViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is edit profil Fragment"
    }
    val text: LiveData<String> = _text
}