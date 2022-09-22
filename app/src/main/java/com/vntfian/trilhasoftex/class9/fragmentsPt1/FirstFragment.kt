package com.vntfian.trilhasoftex.class9.fragmentsPt1

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.vntfian.trilhasoftex.R


class FirstFragment: Fragment(R.layout.first_fragment_layout) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_to_second_fragment).setOnClickListener{
            findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment())
        }
    }


}