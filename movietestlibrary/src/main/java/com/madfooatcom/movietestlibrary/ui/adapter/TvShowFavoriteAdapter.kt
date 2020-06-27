package com.madfooatcom.movietestlibrary.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.madfooatcom.movietestlibrary.R
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity
import com.madfooatcom.movietestlibrary.databinding.ItemFavoriteTvShowBinding
import com.madfooatcom.movietestlibrary.ui.handler.EventHandler
import com.madfooatcom.movietestlibrary.utils.getSimpleDate

class TvShowFavoriteAdapter : PagedListAdapter<TvShowDetailEntity, TvShowFavoriteAdapter.ViewHolder>(DIFF_CALBACK) {

    companion object {
        private val DIFF_CALBACK = object :
                DiffUtil.ItemCallback<TvShowDetailEntity>() {
            override fun areItemsTheSame(oldItem: TvShowDetailEntity, newItem: TvShowDetailEntity): Boolean = oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: TvShowDetailEntity, newItem: TvShowDetailEntity): Boolean =
                    oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ItemFavoriteTvShowBinding>(inflater, R.layout.item_favorite_tv_show, parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tvShow = getItem(position)
        holder.bind(tvShow)
    }

    inner class ViewHolder(var view: ItemFavoriteTvShowBinding) : RecyclerView.ViewHolder(view.root) {
        fun bind(tvShow: TvShowDetailEntity?) {
            view.tvShows = tvShow
            view.image = tvShow?.posterPath
            view.handler = EventHandler(view.root.context)
            view.sdf = getSimpleDate(tvShow?.firstAirDate)
        }

    }
}