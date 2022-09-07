package com.vntfian.trilhasoftex.class9.fragmentsPt1

import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.vntfian.trilhasoftex.R

class ActivityFragment: FragmentActivity(R.layout.fragment_activity) {

    private val fragmentManager = supportFragmentManager
    private val transaction = fragmentManager.beginTransaction()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        //add(MusicListFragment())
        add(FirstFragment())
        commit()

    }

    private fun add(fragment: Fragment){
        transaction.add(R.id.fragment_container_view, fragment)
    }

    private fun commit(){
        transaction.commit()
    }
}