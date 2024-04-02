package com.example.aac_example

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _countText = MutableLiveData<Int>().apply{value= 0}
    val countText: LiveData<Int>
        get() = _countText

    // _countText를 +1해주는 메서드
    fun plusBtnOnClick(){
        _countText.value = _countText.value?.plus(1)
    }

    // _countText를 -1해주는 메서드
    fun minusBtnOnClick(){
        _countText.value = _countText.value?.minus(1)
    }

}