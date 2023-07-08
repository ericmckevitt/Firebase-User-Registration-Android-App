package com.example.firebaseuserauthentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firebaseuserauthentication.databinding.ActivityUpdateUserBinding


class UpdateUserActivity : AppCompatActivity() {
    lateinit var updateUserBinding: ActivityUpdateUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        updateUserBinding = ActivityUpdateUserBinding.inflate(layoutInflater)
        val view = updateUserBinding.root
        setContentView(view)

        supportActionBar?.title = "Update User"

        getAndSetData()
    }

    fun getAndSetData(){
        val name = intent.getStringExtra("name")
        val age = intent.getIntExtra("age",0).toString()
        val email = intent.getStringExtra("email")

        updateUserBinding.editTextUpdateName.setText(name)
        updateUserBinding.editTextUpdateAge.setText(age)
        updateUserBinding.editTextUpdateEmail.setText(email)
    }
}