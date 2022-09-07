package com.vntfian.trilhasoftex.class9

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import com.vntfian.trilhasoftex.R


class RotationSaveInstance: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rotation_instance)

        val text = savedInstanceState?.getString("KEY_TEXT") ?: ""

        var value = 0
        val textview = findViewById<AppCompatTextView>(R.id.rotation_value)
        textview.text = text
        Log.i("RotationSaveInstance", "onSaveInstanceState Trace : ${textview.text}")
        findViewById<AppCompatButton>(R.id.btn_to_add_value).setOnClickListener {
            value += 1
            textview.text = value.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        val textview = findViewById<AppCompatTextView>(R.id.rotation_value)
        Log.i("RotationSaveInstance", "onSaveInstanceState Trace : $textview")
        outState.putString("KEY_TEXT", textview.text.toString())
    }
}