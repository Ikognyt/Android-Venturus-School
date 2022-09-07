package com.vntfian.trilhasoftex.class9.fragmentsPt1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vntfian.trilhasoftex.R
import com.vntfian.trilhasoftex.class11.MusicListAdapter

class MusicListFragment(): Fragment(R.layout.layout_fragment_music_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val musicListRv: RecyclerView = view.findViewById(R.id.rv_music_list)
        val adapter = MusicListAdapter(ArrayList())

        musicListRv.layoutManager = LinearLayoutManager(this.context)
        musicListRv.adapter = adapter
        adapter.notifyDataSetChanged()
    }
}