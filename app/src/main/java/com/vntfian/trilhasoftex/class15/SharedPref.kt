package com.vntfian.trilhasoftex.class15

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import androidx.transition.Visibility
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.vntfian.trilhasoftex.R

class SharedPref: Fragment(R.layout.fragment_shared_pref) {

    companion object {
        val NAME_SHARED_PREF = "FIRST_ACESS"
        val KEY_SHARED_PREF_FIRST_ACESS = "primeiro_acesso"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sharedPreferences = activity?.getSharedPreferences(NAME_SHARED_PREF, Context.MODE_PRIVATE)
        val editor = sharedPreferences?.edit()

        val title = view.findViewById<AppCompatTextView>(R.id.title_shared_pref)
        title.visibility = View.GONE

        Log.i("SharedPref", "onViewCreated Trace : ${sharedPreferences?.contains(KEY_SHARED_PREF_FIRST_ACESS)}")

        if(sharedPreferences?.contains(KEY_SHARED_PREF_FIRST_ACESS) == false) {
            val alertDialogBuilder = MaterialAlertDialogBuilder(requireContext())
            alertDialogBuilder
                .setTitle("Primeiro acesso")
                .setPositiveButton("ok") { dialog, which ->
                    editor?.putString(KEY_SHARED_PREF_FIRST_ACESS, "ok")
                    editor?.apply()
                    dialog.dismiss()
                    title.visibility = View.VISIBLE
                }
                .setNegativeButton("", null)
                .create()
            alertDialogBuilder.show()

        } else {

            title.visibility = View.VISIBLE

        }

    }
}