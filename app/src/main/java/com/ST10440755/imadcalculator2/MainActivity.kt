package com.ST10440755.imadcalculator2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Button


class MainActivity : AppCompatActivity() {

    private var etNum1: EditText? = null
    private var etNum2: EditText? = null
    private var tvDisplay: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        tvDisplay = findViewById(R.id.tvDisplay)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener { add() }

        val btnSub = findViewById<Button>(R.id.btnSub)
        btnSub.setOnClickListener { sub() }

        val btnMul = findViewById<Button>(R.id.btnMul)
        btnMul.setOnClickListener { mul() }

        val btnDiv = findViewById<Button>(R.id.btnDiv)
        btnDiv.setOnClickListener { div() }

        val btnSqr = findViewById<Button>(R.id.btnSqr)
        btnSqr.setOnClickListener { sqr() }

        val btnPow = findViewById<Button>(R.id.btnPow)
        btnPow.setOnClickListener { pow() }

        val btnNextSc = findViewById<Button>(R.id.btnNextScreen)
        btnNextSc.setOnClickListener {
            // call the next screen
            val intent = Intent(this, MainActivity2::class.java)
            // start your next activity
            startActivity(intent)
        }


    }

    private fun add() {
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDisplay?.text = "Please enter valid numbers."
            return
        }

        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0


        intAnswer = intNum1 + intNum2
        //val tvDisplay = null
        tvDisplay?.text = intAnswer.toString()

    }

    private fun sub() {
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDisplay?.text = "Please enter valid numbers."
            return
        }

        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0


        intAnswer = intNum1 - intNum2

        tvDisplay?.text = intAnswer.toString()

    }

    private fun mul() {
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDisplay?.text = "Please enter valid numbers."
            return
        }

        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0


        intAnswer = intNum1 * intNum2
        //val tvDisplay = null
        tvDisplay?.text = intAnswer.toString()
    }

    private fun div() {
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDisplay?.text = "Please enter valid numbers."
            return
        }

        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0

        if (intNum2 == 0) {

            tvDisplay?.text = "Division by zero is not allowed"
        } else {

            intAnswer = intNum1 / intNum2

            tvDisplay?.text = intAnswer.toString()
        }


    }

    private fun sqr(): Int {
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDisplay?.text = "Please enter valid numbers."
            return
        }


        val intNum1 = input1.toInt()
        // val intNum2 = input2.toInt()
        var fltAnswer = 0

        fltAnswer = sqr(intNum1)

        tvDisplay?.text = fltAnswer.toString()

    }


    private fun pow() {

        val intNum1 = etNum1?.text?.toString()!!.toInt()
        val intNum2 = etNum2?.text?.toString()?.toInt()
        var intAnswer: Int = 1

        for (i in 1..intNum2!!) {
            intAnswer *= intNum1
        }
        tvDisplay?.text = intAnswer.toString()

    }}
