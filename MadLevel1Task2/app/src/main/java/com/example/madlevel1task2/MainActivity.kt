package com.example.madlevel1task2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var ptAnswer1 = binding.ptAnswer1
    private var ptAnswer2 = binding.ptAnswer2
    private var ptAnswer3 = binding.ptAnswer3
    private var ptAnswer4 = binding.ptAnswer4

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    /**
     * Set the initial (UI) state of the game.
     */
    private fun initViews() {
        binding.btSubmit.setOnClickListener {
            showResult()
        }
    }

    private fun showResult() {
        var result = 0
        var answer1 = ptAnswer1.text.toString().capitalize()
        var answer2 = ptAnswer2.text.toString().capitalize()
        var answer3 = ptAnswer3.text.toString().capitalize()
        var answer4 = ptAnswer4.text.toString().capitalize()

        if (answer1 == "T") {
            result++
            ptAnswer1.setTextColor(Color.GREEN)
        } else {
            ptAnswer1.setTextColor(Color.RED)
        }

        if (answer2 == "F") {
            result++
            ptAnswer2.setTextColor(Color.GREEN)
        } else {
            ptAnswer2.setTextColor(Color.RED)
        }

        if (answer3 == "F") {
            result++
            ptAnswer3.setTextColor(Color.GREEN)
        } else {
            ptAnswer3.setTextColor(Color.RED)
        }

        if (answer4 == "F") {
            result++
            ptAnswer4.setTextColor(Color.GREEN)
        } else {
            ptAnswer4.setTextColor(Color.RED)
        }

        Toast.makeText(this, "You have $result answers correct!",Toast.LENGTH_SHORT).show()
    }
}