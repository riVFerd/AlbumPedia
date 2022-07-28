package com.rivferd.musicpedia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SongAdapter(private val listSong: Array<String>) : RecyclerView.Adapter<SongAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvSongNumber: TextView = itemView.findViewById(R.id.tv_song_number)
        val tvSongName: TextView = itemView.findViewById(R.id.tv_song_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_song, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val songNumber = position + 1
        holder.tvSongNumber.text = songNumber.toString()
        holder.tvSongName.text = listSong[position]
    }

    override fun getItemCount(): Int {
        return listSong.size
    }
}