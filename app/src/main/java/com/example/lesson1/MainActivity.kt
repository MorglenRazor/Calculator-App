package com.example.lesson1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initClickNumber()
        //debugClick()
    }

    @SuppressLint("SetTextI18n")
    private fun initClickNumber() {
        mainOneNumber.setOnClickListener { mainEditText.text = mainEditText.text.toString() + mainOneNumber.text }
        mainTwoNumber.setOnClickListener { mainEditText.text = mainEditText.text.toString() + mainTwoNumber.text }
        mainThreeNumber.setOnClickListener { mainEditText.text = mainEditText.text.toString() + mainThreeNumber.text }
        mainFourNumber.setOnClickListener { mainEditText.text = mainEditText.text.toString() + mainFourNumber.text }
        mainFiveNumber.setOnClickListener { mainEditText.text = mainEditText.text.toString() + mainFiveNumber.text }
        mainSixNumber.setOnClickListener { mainEditText.text = mainEditText.text.toString() + mainSixNumber.text }
        mainSevenNumber.setOnClickListener { mainEditText.text = mainEditText.text.toString() + mainSevenNumber.text }
        mainEightNumber.setOnClickListener { mainEditText.text = mainEditText.text.toString() + mainEightNumber.text }
        mainNineNumber.setOnClickListener { mainEditText.text = mainEditText.text.toString() + mainNineNumber.text }
        mainZeroNumber.setOnClickListener { mainEditText.text = mainEditText.text.toString() + mainZeroNumber.text }

    }


//    private fun debugClick() {
//        mainButtonShow.setOnClickListener {
//            val text = inputNumber()
//            val builder =
//                AlertDialog.Builder(this)
//            builder.setMessage("dasda" + text).setCancelable(false).setTitle("Info")
//            val alert = builder.create()
//            alert.show()
//        }
//    }

}