package com.vntfian.trilhasoftex.class11

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.vntfian.trilhasoftex.R
import java.net.URL

class MusicListAdapter(
val musicList: ArrayList<MusicItemModel>
): RecyclerView.Adapter<MusicListAdapter.ViewHolder>() {

    init {
        musicList.add(MusicItemModel("Better - Khalid", URL("https://www.youtube.com/watch?v=x3bfa3DZ8JM")))
        musicList.add(MusicItemModel("OTW - Khalid", URL("https://www.youtube.com/watch?v=2e9diL0xTN4")))
        musicList.add(MusicItemModel("Session One - Eminem", URL("https://www.youtube.com/watch?v=PaZx1p4TftM")))
        musicList.add(MusicItemModel("I'm Good(Blue) - David Guetta, Bebe Rexha", URL("https://www.youtube.com/watch?v=NN1f066QTMU")))
        musicList.add(MusicItemModel("My Universe - David Guetta, Coldplay, BTS", URL("https://www.youtube.com/watch?v=f1mKf7mjLgo")))
        musicList.add(MusicItemModel("Bad Habits - Ed Sheeran", URL("https://www.youtube.com/watch?v=ho1RzYneMtM")))
        musicList.add(MusicItemModel("Cold Heart - PNAU Remix - Elton John, Dua Lipa, PNAU", URL("https://www.youtube.com/watch?v=qod03PVTLqk")))
        musicList.add(MusicItemModel("Crazy What Love Can Do - David Guetta, Becky Hill, Ella Henderson", URL("https://www.youtube.com/watch?v=8bzesUu_a4I")))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.music_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.musicName.text = musicList[position].musicName

        holder.itemView.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(musicList[position].url.toString()))
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.setPackage("com.google.android.youtube")
        }

    }

    override fun getItemCount(): Int {
        return musicList.size
    }

    class ViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        val musicName: AppCompatTextView = itemView.findViewById(R.id.music_name)

    }

}