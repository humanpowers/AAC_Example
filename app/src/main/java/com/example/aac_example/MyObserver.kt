package com.example.aac_example

import android.util.Log
import androidx.annotation.NonNull
import androidx.lifecycle.*

class MyObserver : LifecycleObserver,DefaultLifecycleObserver {
    private val TAG = "MyObserver"

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        // 액티비티나 프래그먼트가 생성될 때 호출될 동작 정의
        Log.d(TAG, "onCreate")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
        // 액티비티나 프래그먼트가 시작될 때 호출될 동작 정의
        Log.d(TAG, "onStart")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        // 액티비티나 프래그먼트가 재개될 때 호출될 동작 정의
        Log.d(TAG, "onResume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        // 액티비티나 프래그먼트가 일시정지될 때 호출될 동작 정의
        Log.d(TAG, "onPause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        // 액티비티나 프래그먼트가 정지될 때 호출될 동작 정의
        Log.d(TAG, "onStop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        // 액티비티나 프래그먼트가 소멸될 때 호출될 동작 정의
        Log.d(TAG, "onDestroy")
    }


    override fun onCreate(owner: LifecycleOwner) {
        Log.d(TAG, "onCreate")
    }


    override fun onStart(owner: LifecycleOwner) {
        Log.d(TAG, "onStart")
    }


    override fun onResume(owner: LifecycleOwner) {
        Log.d(TAG, "onResume")
    }

    override fun onPause(owner: LifecycleOwner) {
        Log.d(TAG, "onPause")
    }

    override fun onStop(owner: LifecycleOwner) {
        Log.d(TAG, "onStop")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        Log.d(TAG, "onDestroy")
    }
}