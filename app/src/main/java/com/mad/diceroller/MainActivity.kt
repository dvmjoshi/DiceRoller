package com.mad.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var diceImage:ImageView
    lateinit var diceimage2:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage=findViewById(R.id.result_Image)
        diceimage2=findViewById(R.id.result_Image2)
        val rollButton:Button=findViewById(R.id.roll_button)


        rollButton.setOnClickListener { rollDice() }
    }
    private fun rollDice(){

//        val  resultText:TextView=findViewById(R.id.result_text)
//        resultText.text=intRandom.toString()
        //Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT).show()
        //val diceImage:ImageView=findViewById(R.id.result_Image)


        diceImage.setImageResource(getrandomdice())
        diceimage2.setImageResource(getrandomdice())

    }
    private fun getrandomdice():Int{
        val intRandom = (1..6).random()
       return when(intRandom){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}
