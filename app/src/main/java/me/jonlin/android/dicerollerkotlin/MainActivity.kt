package me.jonlin.android.dicerollerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceIV : ImageView
    lateinit var dice2IV : ImageView
    lateinit var rollBt : Button

    // const val diceIV : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceIV = findViewById(R.id.dice_iv)
        dice2IV = findViewById(R.id.dice2_iv)
        rollBt = findViewById(R.id.roll_bt)

        var rollDice : (ImageView) -> Unit = {
            val rInt = Random.nextInt(1,7)
            val diceId = when(rInt)
            {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            it.setImageResource(diceId)
        }

        rollBt.setOnClickListener{rollDice(diceIV); rollDice(dice2IV)}
    }
}
