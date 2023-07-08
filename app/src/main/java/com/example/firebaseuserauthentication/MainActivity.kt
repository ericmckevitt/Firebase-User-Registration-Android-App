package com.example.firebaseuserauthentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firebaseuserauthentication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding : ActivityMainBinding
    // Trivial Comment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

    }
}