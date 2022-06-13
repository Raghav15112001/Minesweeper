package com.example.minesweeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.minesweeper.databinding.ActivityBoardBinding

class Board : AppCompatActivity() {
    private lateinit var binding : ActivityBoardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBoardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.checking.text = intent.getIntExtra("ROWS",9).toString()

    }
}