package com.example.ronquilloactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
    var a = "A"
    var b = "B"
    var c = "C"
    var stack = ""
    var sum = 0
    var operator = ""
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val A = findViewById<Button>(R.id.button)
        A.setOnClickListener {
            if (operator == "") {
                Toast.makeText(this, "Select an operator first", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (operator == "+") {
                stack += a
                Toast.makeText(applicationContext, stack, Toast.LENGTH_SHORT).show()
            }
            if (operator == "-") {
                stack=stack.dropLast(1)
                Toast.makeText(applicationContext, stack, Toast.LENGTH_SHORT).show()
            }
            operator = ""
        }
        val B = findViewById<Button>(R.id.button2)
        B.setOnClickListener {
            if (operator == "") {
                Toast.makeText(this, "Select an operator first", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (operator == "+") {
                stack += b
                Toast.makeText(applicationContext, stack, Toast.LENGTH_SHORT).show()
            }
            if (operator == "-") {
                stack=stack.dropLast(1)
                Toast.makeText(applicationContext, stack, Toast.LENGTH_SHORT).show()
            }
            operator = ""
        }
        val C = findViewById<Button>(R.id.button3)
        C.setOnClickListener {
            if (operator == "") {
                Toast.makeText(this, "Select an operator first", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (operator == "+") {
                stack += c
                Toast.makeText(applicationContext, stack, Toast.LENGTH_SHORT).show()
            }
            if (operator == "-") {
                stack=stack.dropLast(1)
                Toast.makeText(applicationContext, stack, Toast.LENGTH_SHORT).show()
            }
            operator = ""
        }
        val button1 = findViewById<Button>(R.id.button4)
        button1.setOnClickListener {
            if (operator == "") {
                Toast.makeText(this, "Select an operator first", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (operator == "+") {
                sum += 1
                Toast.makeText(applicationContext, sum.toString(), Toast.LENGTH_SHORT).show()
            }
            if (operator == "-") {
                val temp = sum - 1
                if (temp < 0) {
                    sum = 0
                    Toast.makeText(this, "Sum must not be less than 0", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                sum = temp
                Toast.makeText(applicationContext, sum.toString(), Toast.LENGTH_SHORT).show()
            }
            operator = ""
        }
        val button2 = findViewById<Button>(R.id.button5)
        button2.setOnClickListener {
            if (operator == "") {
                Toast.makeText(this, "Select an operator first", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (operator == "+") {
                sum += 2
                Toast.makeText(applicationContext, sum.toString(), Toast.LENGTH_SHORT).show()
            }
            if (operator == "-") {
                val temp = sum - 2
                if (temp < 0) {
                    sum = 0
                    Toast.makeText(this, "Sum must not be less than 0", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                sum = temp
                Toast.makeText(applicationContext, sum.toString(), Toast.LENGTH_SHORT).show()
            }
            operator = ""
        }
        val button3 = findViewById<Button>(R.id.button6)
        button3.setOnClickListener {
            if (operator == "") {
                Toast.makeText(this, "Select an operator first", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (operator == "+") {
                sum += 3
                Toast.makeText(applicationContext, sum.toString(), Toast.LENGTH_SHORT).show()
            }
            if (operator == "-") {
                val temp = sum - 3
                if (temp < 0) {
                    sum = 0
                    Toast.makeText(this, "Sum must not be less than 0", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                sum = temp
                Toast.makeText(applicationContext, sum.toString(), Toast.LENGTH_SHORT).show()
            }
            operator = ""
        }
        val plus = findViewById<Button>(R.id.button7)
        plus.setOnClickListener {
            operator = "+"
        }
        val minus = findViewById<Button>(R.id.button8)
        minus.setOnClickListener {
            operator = "-"
        }
    }

}