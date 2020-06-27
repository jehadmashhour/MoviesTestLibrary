package com.madfooatcom.movietestlibrary.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.madfooatcom.movietestlibrary.R

@BindingAdapter("image")
fun loadImage(img: ImageView, imagePath: String?) {
    imagePath.let {
        Glide.with(img.context)
                .load("https://image.tmdb.org/t/p/w500" + it)
                .placeholder(R.drawable.play)
                .into(img)
    }
}

