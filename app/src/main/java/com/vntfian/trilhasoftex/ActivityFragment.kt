package com.vntfian.trilhasoftex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavGraph
import androidx.navigation.NavGraphBuilder
import androidx.navigation.fragment.NavHostFragment
import com.vntfian.trilhasoftex.R
import com.vntfian.trilhasoftex.class10.ButtonsMenuUi
import com.vntfian.trilhasoftex.class15.SharedPref

class ActivityFragment: AppCompatActivity(R.layout.fragment_activity) {

    private val fragmentManager = supportFragmentManager
    private val transaction = fragmentManager.beginTransaction()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        //add(MusicListFragment())
        //add(FirstFragment())
        //add(ButtonsMenuUi())
        add(SharedPref())
        commit()


    }

    private fun add(fragment: Fragment){
        transaction.add(R.id.fragment_container_view, fragment)
    }

    private fun commit(){
        transaction.commit()
    }
}