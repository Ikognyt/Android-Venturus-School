package com.vntfian.trilhasoftex.class10

import android.os.Bundle
import android.view.*
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.vntfian.trilhasoftex.R

class ButtonsMenuUi: Fragment(R.layout.fragment_buttons_menu_ui) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_buttons_menu_ui, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val toolbar: androidx.appcompat.widget.Toolbar = view.findViewById(R.id.menu_toolbar)
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
    }

    @Deprecated("Deprecated in Java")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.menu_item_settings -> {
                Toast.makeText(context,"Settings", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_item_delete -> {
                Toast.makeText(context,"Delete", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_item_select -> {
                Toast.makeText(context,"Select", Toast.LENGTH_SHORT).show()
                true
            }

            else -> { super.onOptionsItemSelected(item) }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_buttons_ui, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
}