package com.example.androidproj1.network

import com.google.gson.annotations.SerializedName

data class APIResponse(@SerializedName("results")
                       val movies : List<Movie>)

data class Movie(
    @SerializedName("original_title")
    val movieName: String,

    @SerializedName("vote_average")
    val popularity: Double,

    val backdropPath: String,

    @SerializedName("poster_path")
    val imageURL : String,

    @SerializedName("id")
    val movie_id: String
)
