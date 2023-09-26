package com.example.ticketorder

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.ticketorder.databinding.ActivityMainBinding
import com.example.ticketorder.databinding.ActivitySecondBinding

class secondActivity : AppCompatActivity() {
    private val TAG = "MainActivityLifecycle"
    private lateinit var binding: ActivitySecondBinding
    companion object{

    }
    private val countries = arrayOf(
        "Indonesia",
        "United States",
        "United Kingdom",
        "Germany",
        "France",
        "Australia",
        "Japan",
        "China",
        "Brazil",
        "Canada"
    )
    private val kelas = arrayOf(
        "Ekonomi",
        "Business",
        "First class"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            tombolKedua.setOnClickListener {
                val intentToSecondActivity =
                    Intent(this@secondActivity, thirdActivity::class.java)
                startActivity(intentToSecondActivity)
            }
            val adapterKeberangkata = ArrayAdapter(this@secondActivity,
                R.layout.simple_spinner_item, countries)
            adapterKeberangkata.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spBerangkat.adapter = adapterKeberangkata
            val adapterTujuan = ArrayAdapter(this@secondActivity,
                R.layout.simple_spinner_item, countries)
            adapterTujuan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spTujuan.adapter = adapterTujuan
            val adapterKelas = ArrayAdapter(this@secondActivity,
                R.layout.simple_spinner_item, kelas)
            adapterKelas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spKelas.adapter = adapterKelas
        }
        Log.d(TAG, "onCreate: dipanggil")
    }
}