package com.vntfian.trilhasoftex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    companion object val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Repository.getInstance().getFormattedUserNames().forEach(){ user -> Log.i(tag, "onCreate Trace User: $user") }
    }
}