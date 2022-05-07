package com.example.dz_1_first_hm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz_1_first_hm.databinding.ActivityTheSecondBinding

class TheSecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTheSecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTheSecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*val text = intent.getStringExtra("key")
        binding.editText2.text = text*/
        val ololo = intent.getStringExtra("name")
        binding.text01.text = ololo
        val ololoo = intent.getStringExtra("name1")
        binding.text02.text = ololoo
        val ololooo = intent.getStringExtra("name2")
        binding.text03.text = ololooo
    }
}