package com.example.helloconstraint

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import helloconstraint.R

class MainActivity : AppCompatActivity() {
    private var mCount = 0
    private lateinit var mShowCount: TextView
    private lateinit var buttonZero: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        mShowCount = findViewById(R.id.show_count)
        buttonZero = findViewById(R.id.button_zero)
    }

    fun showToast(view: View) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()
    }

    fun countUp(view: View) {
        mCount++
        if (mCount % 2 == 0) {
            view.setBackgroundColor(Color.GREEN)
        } else {
            view.setBackgroundColor(Color.BLUE)
        }
        buttonZero.setBackgroundColor(Color.MAGENTA)
        showCount()
    }

    fun countToZero(view: View) {
        mCount = 0
        view.setBackgroundColor(Color.GRAY)
        showCount()
    }

    private fun showCount() {
        mShowCount.text = mCount.toString()
    }

}