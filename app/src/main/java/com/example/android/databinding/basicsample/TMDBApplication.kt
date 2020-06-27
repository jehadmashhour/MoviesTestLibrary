package com.example.android.databinding.basicsample

import android.app.Application
import com.madfooatcom.movietestlibrary.MovieInitializer

class TMDBApplication : Application() {


    override fun onCreate() {
        super.onCreate()
        MovieInitializer.init(this)
    }


}