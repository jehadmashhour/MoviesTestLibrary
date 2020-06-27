package com.madfooatcom.movietestlibrary.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.madfooatcom.movietestlibrary.R
import com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity
import com.madfooatcom.movietestlibrary.databinding.ItemFavoriteMoviesBinding
import com.madfooatcom.movietestlibrary.ui.handler.EventHandler
import com.madfooatcom.movietestlibrary.utils.getSimpleDate

class MovieFavoriteAdapter : PagedListAdapter<MovieDetailEntity, MovieFavoriteAdapter.ViewHolder>(DIFF_CALBACK) {

    companion object {
        private val DIFF_CALBACK = object :
                DiffUtil.ItemCallback<MovieDetailEntity>() {
            override fun areItemsTheSame(oldItem: MovieDetailEntity, newItem: MovieDetailEntity): Boolean = oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: MovieDetailEntity, newItem: MovieDetailEntity): Boolean =
                    oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ItemFavoriteMoviesBinding>(inflater, R.layout.item_favorite_movies, parent,false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movies = getItem(position)
        holder.bind(movies)
    }

    inner class ViewHolder(var view: ItemFavoriteMoviesBinding) : RecyclerView.ViewHolder(view.root) {
        fun bind(movies: MovieDetailEntity?) {
            view.movie = movies
            view.image = movies?.posterPath
            view.handler = EventHandler(view.root.context)
            view.sdf = getSimpleDate(movies?.releaseDate)
        }

    }
}