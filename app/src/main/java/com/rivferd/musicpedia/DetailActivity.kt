package com.rivferd.musicpedia

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetailActivity : AppCompatActivity() {

    private lateinit var rvSongs: RecyclerView
    private lateinit var tvAlbumName: TextView
    private lateinit var tvArtistName: TextView
    private lateinit var imgAlbumArt: ImageView
    private lateinit var tvAlbumSize: TextView
    private lateinit var tvReleaseYear: TextView
    private lateinit var btnSpotify: Button

    companion object {
        const val POSITION_KEY = "position"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.title = "AlbumDetail"

        // get value position from prev activity
        val position = intent.getIntExtra(POSITION_KEY, 0)

        // find view
        imgAlbumArt = findViewById(R.id.img_album_art)
        tvAlbumName = findViewById(R.id.tv_album_name)
        tvArtistName = findViewById(R.id.tv_artist_name)
        tvAlbumSize = findViewById(R.id.tv_album_size)
        tvReleaseYear = findViewById(R.id.tv_year)
        btnSpotify = findViewById(R.id.btn_spotify)
        rvSongs = findViewById(R.id.rv_song_list)

        // set value of each view
        imgAlbumArt.setImageResource(AlbumData.listData[position].albumArt)
        tvAlbumName.text = AlbumData.listData[position].albumName
        tvArtistName.text = AlbumData.listData[position].artist
        tvReleaseYear.text = AlbumData.listData[position].releaseYear.toString()
        tvAlbumSize.text = AlbumData.listData[position].albumSize.toString()

        btnSpotify.setOnClickListener {
            val moveIntent = Intent(Intent.ACTION_VIEW, Uri.parse(AlbumData.listData[position].spotifyLink))
            startActivity(moveIntent)
        }

        rvSongs.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        rvSongs.layoutManager = LinearLayoutManager(this)
        rvSongs.adapter = SongAdapter(AlbumData.listData[position].trackList)
    }
}