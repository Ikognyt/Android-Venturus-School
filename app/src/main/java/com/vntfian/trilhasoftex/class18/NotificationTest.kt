package com.vntfian.trilhasoftex.class18

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.vntfian.trilhasoftex.R

internal class NotificationTest {

    fun showNotification(context: Context) = with(context) {
        val builder = NotificationCompat.Builder(this, "1")
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle("Teste Title")
            .setContentText("Text of test")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        NotificationManagerCompat.from(this).notify(999, builder.build())
    }

    fun createNotificationChannel(context: Context) =  with(context){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val name = "Teste"
            val descriptionText = "description text"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel("1", name, importance).apply {
                description = descriptionText
            }

            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }


}