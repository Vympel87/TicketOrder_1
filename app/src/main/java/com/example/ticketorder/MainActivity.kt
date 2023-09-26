package com.example.ticketorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.ticketorder.databinding.ActivityMainBinding
import com.example.ticketorder.secondActivity

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivityLifecycle"
    private lateinit var binding: ActivityMainBinding
    companion object{

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            tombolPertama.setOnClickListener {
                val intentToSecondActivity =
                    Intent(this@MainActivity, secondActivity::class.java)
                startActivity(intentToSecondActivity)
            }
        }
        Log.d(TAG, "onCreate: dipanggil")
    }
}