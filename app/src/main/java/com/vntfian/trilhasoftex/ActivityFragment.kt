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
import com.vntfian.trilhasoftex.class18.NotificationTest
import com.vntfian.trilhasoftex.class19.AcessibilityFragment
import com.vntfian.trilhasoftex.class20.DebugFragment
import com.vntfian.trilhasoftex.class21.Calculadora

class ActivityFragment: AppCompatActivity(R.layout.fragment_activity) {

    private val fragmentManager = supportFragmentManager
    private val transaction = fragmentManager.beginTransaction()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        //add(MusicListFragment())
        //add(FirstFragment())
        //add(ButtonsMenuUi())
        //add(SharedPref())
        //add(AcessibilityFragment())
        add(DebugFragment())
        commit()

        val notification = NotificationTest()
        notification.createNotificationChannel(this)
        notification.showNotification(this)

    }

    private fun add(fragment: Fragment){
        transaction.add(R.id.fragment_container_view, fragment)
    }

    private fun commit(){
        transaction.commit()
    }
}