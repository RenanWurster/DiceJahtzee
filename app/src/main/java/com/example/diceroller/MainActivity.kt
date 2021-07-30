package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private lateinit var diceImage1: ImageView
    private lateinit var diceImage2: ImageView
    private lateinit var diceImage3: ImageView
    private lateinit var diceImage4: ImageView
    private lateinit var diceImage5: ImageView
    private lateinit var roll5: Button
    private lateinit var roll4: Button
    private lateinit var roll3: Button
    private lateinit var roll2: Button
    private lateinit var roll1: Button

    private lateinit var clearButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)
        diceImage3 = findViewById(R.id.dice_image3)
        diceImage4 = findViewById(R.id.dice_image4)
        diceImage5 = findViewById(R.id.dice_image5)

        roll5 = findViewById(R.id.roll_5)
        roll4 = findViewById(R.id.roll_4)
        roll3 = findViewById(R.id.roll_3)
        roll2 = findViewById(R.id.roll_2)
        roll1 = findViewById(R.id.roll_1)

        clearButton = findViewById(R.id.clear_button)

        roll5.setOnClickListener { rollDice5() }
        roll4.setOnClickListener{rollDice4()}
        roll3.setOnClickListener{rollDice3()}
        roll2.setOnClickListener{rollDice2()}
        roll1.setOnClickListener{rollDice1()}
        clearButton.setOnClickListener { clearButton() }
    }

    private fun rollDice1() {
        diceImage1.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(R.drawable.empty_dice)
        diceImage3.setImageResource(R.drawable.empty_dice)
        diceImage4.setImageResource(R.drawable.empty_dice)
        diceImage5.setImageResource(R.drawable.empty_dice)
        Toast.makeText(this, "Renan is cool :)", Toast.LENGTH_SHORT).show()
    }

    private fun rollDice2() {
        diceImage1.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
        diceImage3.setImageResource(R.drawable.empty_dice)
        diceImage4.setImageResource(R.drawable.empty_dice)
        diceImage5.setImageResource(R.drawable.empty_dice)

        Toast.makeText(this, "Renan is cool :)", Toast.LENGTH_SHORT).show()
    }

    private fun rollDice3() {
        diceImage1.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
        diceImage3.setImageResource(getRandomDiceImage())
        diceImage4.setImageResource(R.drawable.empty_dice)
        diceImage5.setImageResource(R.drawable.empty_dice)
        Toast.makeText(this, "Renan is cool :)", Toast.LENGTH_SHORT).show()
    }


    private fun rollDice4() {
        diceImage1.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
        diceImage3.setImageResource(getRandomDiceImage())
        diceImage4.setImageResource(getRandomDiceImage())
        diceImage5.setImageResource(R.drawable.empty_dice)
        Toast.makeText(this, "Renan is cool :)", Toast.LENGTH_SHORT).show()
    }


    private fun rollDice5() {
        diceImage1.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
        diceImage3.setImageResource(getRandomDiceImage())
        diceImage4.setImageResource(getRandomDiceImage())
        diceImage5.setImageResource(getRandomDiceImage())
        Toast.makeText(this, "Renan is cool :)", Toast.LENGTH_SHORT).show()
    }


    private fun getRandomDiceImage(): Int {
        return when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

    }

    private fun clearButton() {
        val lol = R.drawable.empty_dice
        diceImage1.setImageResource(lol)
        diceImage2.setImageResource(lol)
        diceImage3.setImageResource(lol)
        diceImage4.setImageResource(lol)
        diceImage5.setImageResource(lol)
    }
}
