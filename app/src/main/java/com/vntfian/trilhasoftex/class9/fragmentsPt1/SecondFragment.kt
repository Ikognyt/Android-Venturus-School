package com.vntfian.trilhasoftex.class9.fragmentsPt1

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.vntfian.trilhasoftex.R

class SecondFragment: Fragment(R.layout.second_fragment_layout) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<AppCompatButton>(R.id.btn_to_first_fragment).setOnClickListener {
            findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToFirstFragment())
        }
    }
}