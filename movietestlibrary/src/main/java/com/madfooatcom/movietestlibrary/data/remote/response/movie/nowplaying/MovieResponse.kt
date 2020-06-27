package com.madfooatcom.movietestlibrary.data.remote.response.movie.nowplaying

import com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity
import com.google.gson.annotations.SerializedName

data class MovieResponse(

        @field:SerializedName("dates")
        val dates: Dates? = null,

        @field:SerializedName("page")
        val page: Int? = null,

        @field:SerializedName("total_pages")
        val totalPages: Int? = null,

        @field:SerializedName("results")
        val results: List<MovieEntity>,

        @field:SerializedName("total_results")
        val totalResults: Int? = null
)