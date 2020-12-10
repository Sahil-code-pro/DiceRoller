package com.example.hope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val rollButton:Button =findViewById(R.id.roll_Button)
//        rollButton.text = " lets roll"
//        rollButton.setOnClickListener{
//            Toast.makeText(this,"Button Clicked",Toast.LENGTH_SHORT).show()
//        }
 //       roll_Button.setOnClickListener{Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()}


       // val rollButton:Button =findViewById(R.id.roll_Button)
        roll_Button.setOnClickListener{rollDice()}

    }

    private fun rollDice() {

        // resultText.text = "Dice  rolled $randomint "
       var randomint  = Random().nextInt(6) +1
  // val diceImage: ImageView =
      var drawableresourse =   when(randomint){
          1 -> R.drawable.dice_1
          2-> R.drawable.dice_2
          3 -> R.drawable.dice_3
          4 -> R.drawable.dice_4
          5 -> R.drawable.dice_5
          else -> R.drawable.dice_6
      }
       // val diceImage: ImageView =findViewById(R.id.dice_Image)
        dice_Image.setImageResource(drawableresourse)
    }
}