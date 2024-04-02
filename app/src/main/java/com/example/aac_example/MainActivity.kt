package com.example.aac_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.aac_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "메인"
    private val myObserver = MyObserver()
    lateinit var binding : ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private var count :Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: ")
        // binding을 통해 activity_main.xml과 MainActivity.kt를 연결
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        // LifecycleOwner 지정
        binding.lifecycleOwner = this

        // LifecycleObserver를 구현한 클래스를 등록
        lifecycle.addObserver(myObserver)

        //ViewModelProvider를 사용하지 않고 viewModel을 초기화
        viewModel =MainViewModel()

        // ViewModelProvider를 사용하여 viewModel을 초기화
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        // 위 2가지 초기화 중 한개만 사용

        // xml에 선언한 mainViewModel과 초기화한 viewModel을 연결
        binding.mainViewModel=viewModel

        // mainCountPlusButton클릭 시 이벤트
        binding.mainCountPlusButton.setOnClickListener {
            viewModel.plusBtnOnClick()
        }

        // mainCountMinusButton클릭 시 이벤트
        binding.mainCountMinusButton.setOnClickListener {
            viewModel.minusBtnOnClick()
        }

        // liveData의 observe메서드를 사용하여 countText를 관찰
        viewModel.countText.observe(this){
            count++
            binding.mainLivedataText.text = count.toString()
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
        // Observer 등록 해제
        lifecycle.removeObserver(myObserver)
    }
}