package com.madfooatcom.movietestlibrary.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.madfooatcom.movietestlibrary.R
import com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity
import com.madfooatcom.movietestlibrary.databinding.ItemMoviesBinding
import com.madfooatcom.movietestlibrary.ui.handler.EventHandler
import com.madfooatcom.movietestlibrary.utils.getSimpleDate

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    private val list = ArrayList<MovieEntity?>()

    fun setMovies(list: List<MovieEntity?>?) {
        if (this.list.isNotEmpty()) {
            this.list.clear()
        }
        list?.let { this.list.addAll(it) }
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        val binding = DataBindingUtil.inflate<ItemMoviesBinding>(inflater, R.layout.item_movies, parent, false)

        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        list[position]?.let { holder.bind(it) }
    }

    inner class ViewHolder(var dataBinding: ItemMoviesBinding) : RecyclerView.ViewHolder(dataBinding.root) {
        fun bind(movies: MovieEntity) {
            dataBinding.movie = movies
            dataBinding.image = movies.posterPath
            dataBinding.handler = EventHandler(dataBinding.root.context)
            dataBinding.sdf = getSimpleDate(movies.releaseDate)
        }

    }
}