package com.example.dz_1_first_hm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.dz_1_first_hm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn.setOnClickListener {
            val intent = Intent(this,TheSecondActivity::class.java)
            intent.putExtra("name",binding.text1.text.toString())
            intent.putExtra("name1",binding.text2.text.toString())
            intent.putExtra("name2",binding.text3.text.toString())
            startActivity(intent)
        }
    }

}