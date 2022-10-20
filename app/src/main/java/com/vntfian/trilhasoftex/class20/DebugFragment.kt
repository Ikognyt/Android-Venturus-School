package com.vntfian.trilhasoftex.class20

import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import com.vntfian.trilhasoftex.R

class DebugFragment : Fragment(R.layout.debug_test_a20) {

    private lateinit var editTextName: EditText

    private lateinit var messageButton: Button

    private lateinit var textMessage: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.debug_test_a20, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editTextName = view.findViewById(R.id.edittext_name)
        messageButton = view.findViewById(R.id.button_show_message)
        textMessage = view.findViewById(R.id.text_message)


        messageButton.setOnClickListener {
            val name = editTextName.text.toString()
            textMessage.text = name
        }

        editTextName.addTextChangedListener { text ->
            if (text?.isBlank() == true)
                messageButton.visibility = View.INVISIBLE
            else
                messageButton.visibility = View.VISIBLE
        }



    }



}