package com.vntfian.trilhasoftex.class6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.vntfian.trilhasoftex.R

class MainActivity : AppCompatActivity() {

    companion object val tag = "DebugFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Repository.getInstance().getFormattedUserNames().forEach { user -> Log.i(tag, "onCreate Trace User: $user") }
    }
}