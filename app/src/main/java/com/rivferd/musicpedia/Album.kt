package com.rivferd.musicpedia

data class Album(
    var albumName: String = "",
    var artist: String = "",
    var albumArt: Int = 0,
    var releaseYear:Int = 0,
    var trackList: Array<String> = arrayOf(),
    var albumSize: Int = 0, // Store how many song in this Album
    var isFavorite: Boolean = false,
    var spotifyLink: String = "#"
)