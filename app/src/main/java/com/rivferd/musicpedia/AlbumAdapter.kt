package com.rivferd.musicpedia

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlbumAdapter(private val listData: ArrayList<Album>) :
    RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder>() {

    private lateinit var startDetailActivity: StartDetailActivity

    fun setStartDetailActivity(startDetailActivity: StartDetailActivity) {
        this.startDetailActivity = startDetailActivity
    }

    inner class AlbumViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvAlbumName: TextView = itemView.findViewById(R.id.tv_album_name)
        var tvArtistName: TextView = itemView.findViewById(R.id.tv_artist_name)
        var imgAlbumArt: ImageView = itemView.findViewById(R.id.img_album_art)
        var tvReleaseDate: TextView = itemView.findViewById(R.id.tv_release_date)
        var tvAlbumSize: TextView = itemView.findViewById(R.id.tv_album_size)
        var btnFavorite: ImageButton = itemView.findViewById(R.id.btn_favorite)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_album, parent, false)
        return AlbumViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val album = listData[position]

        holder.tvAlbumName.text = album.albumName
        holder.tvArtistName.text = album.artist
        holder.imgAlbumArt.setImageResource(album.albumArt)
        holder.tvReleaseDate.text = album.releaseYear.toString()
        holder.tvAlbumSize.text = "${album.albumSize} Songs"
        var favoriteIcon: Int
        fun setFavoriteIcon() {
            favoriteIcon =
                if (album.isFavorite) R.drawable.ic_favorite else R.drawable.ic_favorite_border
            holder.btnFavorite.setImageResource(favoriteIcon)
        }
        setFavoriteIcon()

        holder.btnFavorite.setOnClickListener {
            val isFavorite = !AlbumData.isFavorite[position]
            AlbumData.isFavorite[position] = isFavorite
            album.isFavorite = isFavorite
            setFavoriteIcon()
        }

        // set Intent to move on detail activity
        holder.itemView.setOnClickListener {
            val moveIntent = Intent(startDetailActivity.context, DetailActivity::class.java)
            moveIntent.putExtra(DetailActivity.POSITION_KEY, position)
            startDetailActivity.start(moveIntent)
        }
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    interface StartDetailActivity {
        var context: Context
        fun start(moveIntent: Intent)
    }
}