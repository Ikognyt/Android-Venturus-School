package com.vntfian.trilhasoftex.class8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import com.vntfian.trilhasoftex.R

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        if(intent?.action == Intent.ACTION_VIEW && intent?.type == "text/plain"){
            val text = intent?.getStringExtra(Intent.EXTRA_TEXT)
            val textView = findViewById<AppCompatTextView>(R.id.text_received)
            textView.text = text
        }


        findViewById<AppCompatButton>(R.id.btn_to_first_activity).setOnClickListener {
            startActivity(Intent(this, FirstActivity::class.java))
        }

    }

}