package com.rivferd.musicpedia

object AlbumData {
    private val albumName = arrayOf(
        "A Head Full Of Dreams",
        "Daydream",
        "Different World",
        "E-Side",
        "Future Cake",
        "Happy End",
        "Red",
        "Talking Dreams",
        "The Garden",
        "Visions",
        "Warrior Songs"
    )

    private val artist = arrayOf(
        "Coldplay",
        "Aimer",
        "Alan Walker",
        "Yoasobi",
        "YUC'e",
        "HoneyComeBear",
        "Taylor Swift",
        "Echosmith",
        "The Peggies",
        "milet",
        "The Fat Rat"
    )

    private val albumArt = arrayOf(
        R.drawable.aheadfullofdreams_coldplay,
        R.drawable.daydream_aimer,
        R.drawable.differentworld_alanwalker,
        R.drawable.eside_yoasobi,
        R.drawable.futurecake_yuce,
        R.drawable.happyend_honeycomebear,
        R.drawable.red_taylorswift,
        R.drawable.talkingdreams_echosmith,
        R.drawable.thegarden_thepeggies,
        R.drawable.visions_milet,
        R.drawable.warriorsongs_thefatrat
    )

    private val releaseDate = arrayOf(
        2015, 2016, 2018, 2021, 2017, 2021, 2012, 2013, 2021, 2022, 2018
    )

    private val trackList = arrayOf(
        arrayOf(
            "A Head Full Of Dreams",
            "Birds",
            "Hymn For The Weekends",
            "Up&Up",
            "Adventure Of A Lifetime",
            "Everglow",
            "Fun (feat. Tove Lo)",
            "Kaleidoscope",
            "Army of One",
            "Amazing Day",
            "Colour Spectrum"
        ),
        arrayOf(
            "Insane Dream",
            "Ninelie",
            "Twoface",
            "Higher Ground",
            "Choucho Musubi",
            "Kataomoi",
            "Us",
            "Falling Alone",
            "Hz",
            "Closer",
            "Stars in The Rain"
        ),
        arrayOf(
            "Intro",
            "Lost Control",
            "Lily",
            "Different World",
            "Sing Me to Sleep",
            "Darkside",
            "Alone",
            "Faded",
            "All Falls Down",
            "I Don't Wanna Go",
            "Lonely",
            "Do It All for You",
            "Interlude",
            "Diamond Heart"
        ),
        arrayOf(
            "Into The Night",
            "Haven't",
            "Monster",
            "Comet",
            "RGB",
            "Encore",
            "Blue",
            "Tracing A Dream"
        ),
        arrayOf(
            "Future Cake",
            "Night Club Junkie",
            "POISON",
            "Future Candy",
            "Tick Tock",
            "Sengoku HOP",
            "intro-duck-tion!!",
            "MUDPIE",
            "Gemini Tale",
            "PUMP"
        ),
        arrayOf(
            "Natsu no Mahou",
            "Yumesanpo",
            "Uchiageboshi",
            "Akuten",
            "Kimi to Kimi",
            "Niraikanai",
            "Toka no Hana",
            "Itodenwa",
            "Sayonara no Shitaku",
            "Amaoyogi"
        ),
        arrayOf(
            "Red",
            "All Too Well",
            "Stay Stay Stay",
            "Everything Has Changed",
            "Begin Again",
            "State Of Grace",
            "Holy Ground",
            "Treacherous",
            "I Knew You Were Trouble",
            "22",
            "I Almost Do",
            "The Last Time",
            "Sad Beautiful Tragic",
            "The Lucky One",
            "Starlight",
            "The Moment I Knew",
            "Girl At Home"
        ),
        arrayOf(
            "Come Together",
            "Let's Love",
            "Cool Kids",
            "Bright",
            "Talking Dreams",
            "Come With Me",
            "Safest Place",
            "Surround You",
            "March into the Sun",
            "Tell Her You Love Her",
            "Ran Off in the Night",
            "Nothing's Wrong",
            "Up to You",
            "We're Not Alone"
        ),
        arrayOf(
            "Hello Sugar",
            "Centimeter",
            "TAIKIKEN",
            "Anemone",
            "Stand By Me",
            "Footprints",
            "Dramatic",
            "Sputnik",
            "Door",
            "Contrast"
        ),
        arrayOf(
            "Seventh Heave",
            "Fly High",
            "Outsider",
            "Checkmate",
            "Who I Am",
            "Loved By You",
            "Shed A Light",
            "Jam With Iri",
            "Wake Me Up",
            "Ordinary Days",
            "On the Edge",
            "Come Here",
            "The Hardest",
            "One Reason"
        ),
        arrayOf(
            "Warrior Song",
            "Origin",
            "Ascendancy",
            "Nemesis",
            "Elevate",
            "Kingdom Come",
            "Envelope",
            "Afterlife",
            "Origin Reprise",
            "Mad Moon Falling",
            "Threnody",
            "Reminiscence"
        )
    )

    var isFavorite = arrayOf(
        false, false, false, false, false, false, false, false, false, false, false
    )

    private val spotifyLink = arrayOf(
        "https://open.spotify.com/album/3cfAM8b8KqJRoIzt3zLKqw?si=x63JnvsOR16ui7e4HDJ3HA",
        "https://open.spotify.com/album/336m0kejdM5Fkw2HUX46Bw?si=wdQzzD6xQcakYtWjxCB6Ow",
        "https://open.spotify.com/album/3nzuGtN3nXARvvecier4K0?si=lhcN69QXT02qOQc2NWx7pw",
        "https://open.spotify.com/album/2Il38p3xyKeLHM5tHa4b6R?si=EOkr1-1WTpuPe2ZpNByFYw",
        "https://open.spotify.com/album/2EyfWmuiBm8ExLvog3Yk0P?si=af7IbrKqRayRb9PE6j58wQ",
        "https://open.spotify.com/album/6oUmJ1B0CmPuxa5Bg0GyeK?si=aLiS_0xITUKxEa68rIpUYw",
        "https://open.spotify.com/album/1KVKqWeRuXsJDLTW0VuD29?si=qd8yxf_aTser00-x1zjq0Q",
        "https://open.spotify.com/album/1oHY6eQmEG8skElDvFgKz2?si=gdkLiA4SRry-CJXC2C3ZLA",
        "https://open.spotify.com/album/13FIa91YpnboJjrwmKRrG8?si=jKb7VtzWT7msltmdt8i6dQ",
        "https://open.spotify.com/album/1SawHGXZXBBST8mGV0uJgK?si=BKk9p0UKQqek6M27uch6fA",
        "https://open.spotify.com/album/3SThH1mLW6BSqWWLuuABzT?si=NUmqa-vZRHernc7r7Wofww"
    )

    val listData: ArrayList<Album>
        get() {
            val list = arrayListOf<Album>()
            for (position in albumName.indices) {
                val album = Album()
                album.albumName = albumName[position]
                album.artist = artist[position]
                album.albumArt = albumArt[position]
                album.releaseYear = releaseDate[position]
                album.trackList = trackList[position]
                album.albumSize = album.trackList.size
                album.isFavorite = isFavorite[position]
                album.spotifyLink = spotifyLink[position]
                list.add(album)
            }
            return list
        }
}