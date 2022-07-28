package com.rivferd.musicpedia

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvAlbums: RecyclerView
    private var listData = arrayListOf<Album>()
    private lateinit var imgProfilePhoto: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set up Appbar
        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.actionbar_withphoto)

        // Update data from AlbumData
        listData.addAll(AlbumData.listData)

        // Set up RecycleView
        rvAlbums = findViewById(R.id.rv_albums)
        rvAlbums.layoutManager = LinearLayoutManager(this)
        val albumAdapter = AlbumAdapter(listData)
        val thisActivityContext: Context = this
        albumAdapter.setStartDetailActivity(object : AlbumAdapter.StartDetailActivity{
            override var context: Context = thisActivityContext

            override fun start(moveIntent: Intent) {
                startActivity(moveIntent)
            }

        })
        rvAlbums.adapter = albumAdapter

        // Set listener for photo profile
        imgProfilePhoto = findViewById(R.id.img_profile_photo)
        imgProfilePhoto.setOnClickListener {
            val moveIntent = Intent(this, AboutActivity::class.java)
            startActivity(moveIntent)
        }
    }
}