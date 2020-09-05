package com.example.madlevel1task2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var resultaat = 0

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
        val ptAnswer1 = binding.ptAnswer1
        val ptAnswer2 = binding.ptAnswer2
        val ptAnswer3 = binding.ptAnswer3
        val ptAnswer4 = binding.ptAnswer4
        val answer1 = ptAnswer1.text.toString().capitalize()
        val answer2 = ptAnswer2.text.toString().capitalize()
        val answer3 = ptAnswer3.text.toString().capitalize()
        val answer4 = ptAnswer4.text.toString().capitalize()

        calculate(answer1, "T", ptAnswer1)
        calculate(answer2, "F", ptAnswer2)
        calculate(answer3, "F", ptAnswer3)
        calculate(answer4, "F", ptAnswer4)

        Toast.makeText(this, "You have $resultaat answers correct!",Toast.LENGTH_SHORT).show()
    }

    private fun calculate(result: String, answer: String, reference: TextView) {
        if (answer == result) {
            reference.setTextColor(Color.GREEN)
            resultaat++
        } else {
            reference.setTextColor(Color.RED)
        }
    }
}