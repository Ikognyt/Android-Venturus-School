package com.vntfian.trilhasoftex.class8

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.vntfian.trilhasoftex.R

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val editText = findViewById<AppCompatEditText>(R.id.first_activity_edit_text)

        findViewById<AppCompatButton>(R.id.btn_to_second_activity).setOnClickListener {

            if(editText.text?.isNotEmpty() == true){
                val sendIntent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, editText.text.toString())
                    type = "text/plain"

                }

                //To send text for another app
                val shareIntent = Intent.createChooser(sendIntent, null)
                //startActivity(shareIntent)

                //To send text to a next Screen
                val secondScreenIntent = Intent(this, SecondActivity::class.java).apply {
                    action = Intent.ACTION_VIEW
                    putExtra(Intent.EXTRA_TEXT, editText.text.toString())
                    type = "text/plain"
                }
                startActivity(secondScreenIntent)

            } else
                Toast.makeText(this, "Texto Inválido", Toast.LENGTH_SHORT).show()
        }





    }

}