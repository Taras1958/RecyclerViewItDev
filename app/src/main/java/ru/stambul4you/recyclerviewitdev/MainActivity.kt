package ru.stambul4you.recyclerviewitdev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.stambul4you.recyclerviewitdev.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}