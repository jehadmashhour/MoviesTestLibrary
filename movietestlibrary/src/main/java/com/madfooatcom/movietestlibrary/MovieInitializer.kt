package com.madfooatcom.movietestlibrary

import android.content.Context
import androidx.annotation.Keep
import com.madfooatcom.movietestlibrary.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

object MovieInitializer {
    @JvmStatic
    fun init(context: Context) {
        startKoin {
            androidContext(context)
            modules(appModule)
        }
    }
}