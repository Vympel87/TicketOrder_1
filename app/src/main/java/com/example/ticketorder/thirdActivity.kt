package com.example.ticketorder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ticketorder.databinding.ActivityThirdBinding

class thirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            datePicker.init(
                datePicker.year,
                datePicker.month,
                datePicker.dayOfMonth
            ) { _, year, monthOfYear, dayOfMonth ->
                val selectedDate = "$dayOfMonth/${monthOfYear + 1}/$year"
                Toast.makeText(this@thirdActivity, selectedDate, Toast.LENGTH_SHORT).show()
                timePicker.setOnTimeChangedListener { _, hourOfDay, minute ->
                    val selectedTime = String.format("%02d:%02d", hourOfDay, minute)
                    Toast.makeText(this@thirdActivity, selectedTime, Toast.LENGTH_SHORT).show()
                }
            }
            tombolKetiga.setOnClickListener {
                Toast.makeText(this@thirdActivity, "Tiket terkonfirmasi!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}