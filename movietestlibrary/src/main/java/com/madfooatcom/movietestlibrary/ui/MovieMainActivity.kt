package com.madfooatcom.movietestlibrary.ui

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.madfooatcom.movietestlibrary.R
import com.madfooatcom.movietestlibrary.ui.feature.favorite.FavoriteFragment
import com.madfooatcom.movietestlibrary.ui.feature.movie.MovieFragment
import com.madfooatcom.movietestlibrary.ui.feature.tvshow.TVShowFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_moviemain.*
import org.koin.android.ext.android.inject

class MovieMainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    private val SELECTED_MENU = "selected_menu"
    private val movieFragment by inject<MovieFragment>()
    private val tvShowFragment by inject<TVShowFragment>()
    private val favoriteFragment by inject<FavoriteFragment> ()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moviemain)
        if (savedInstanceState != null) {
            savedInstanceState.getInt(SELECTED_MENU)
        } else {
            setFragment(movieFragment)
        }
        btmNavigationView.setOnNavigationItemSelectedListener(this)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(SELECTED_MENU, btmNavigationView.selectedItemId)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.action_movie -> {
                setFragment(movieFragment)
            }
            R.id.action_tv_show -> {
                setFragment(tvShowFragment)
            }
            R.id.action_fav -> {
                setFragment(favoriteFragment)
            }
        }
        return true
    }

    private fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(R.id.container, fragment)
                .commit()
    }
}
