package com.example.minesweeper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioGroup
import android.widget.Switch
import androidx.core.content.ContextCompat
import com.example.minesweeper.databinding.ActivityBoardBinding
import com.example.minesweeper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.startButton.setOnClickListener{
            binding.difficultyGroup.setOnCheckedChangeListener { Group, checkedId ->
            when(checkedId){
                R.id.Easy -> StartGame(9 , 9 , 20)
                R.id.Medium -> StartGame(16,16,63)
                R.id.Hard -> StartGame(30,16,119)
            }
        }
        }



    }

    private fun StartGame(rows: Int,columns: Int, mines: Int){
        val intent = Intent(this, Board::class.java).apply{
            putExtra("ROWS", rows)
            putExtra("COLUMNS",columns)
            putExtra("MINES",mines)
        }
        startActivity(intent)
    }


}