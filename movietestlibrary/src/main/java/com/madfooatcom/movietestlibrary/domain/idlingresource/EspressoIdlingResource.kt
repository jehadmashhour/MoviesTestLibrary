package com.madfooatcom.movietestlibrary.domain.idlingresource

import androidx.test.espresso.idling.CountingIdlingResource
import com.madfooatcom.movietestlibrary.utils.loggingError

object EspressoIdlingResource {
    private const val RESOURCE = "GLOBAL"
    val idlingResource = CountingIdlingResource(RESOURCE)
    fun increment() {
        loggingError("Idle", "Increment")
        idlingResource.increment()
    }

    fun decrement() {
        loggingError("Idle", "decrement")
        if (!idlingResource.isIdleNow) {
            idlingResource.decrement()
        }
    }
}
