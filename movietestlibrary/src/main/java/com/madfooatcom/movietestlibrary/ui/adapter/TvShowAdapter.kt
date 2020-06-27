package com.madfooatcom.movietestlibrary.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.madfooatcom.movietestlibrary.R
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity
import com.madfooatcom.movietestlibrary.databinding.ItemTvshowBinding
import com.madfooatcom.movietestlibrary.ui.handler.EventHandler
import com.madfooatcom.movietestlibrary.utils.getSimpleDate

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.ViewHolder>() {

    private val list = ArrayList<TvShowEntity?>()

    fun setTvShows(list: List<TvShowEntity?>) {
        if (this.list.isNotEmpty()) {
            this.list.clear()
        }
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ItemTvshowBinding>(inflater, R.layout.item_tvshow, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        list[position]?.let { holder.bind(it) }
    }

    inner class ViewHolder(var binding: ItemTvshowBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(tvShow: TvShowEntity) {
            binding.tvShows = tvShow
            binding.image = tvShow.posterPath
            binding.handler = EventHandler(binding.root.context)
            binding.sdf = getSimpleDate(tvShow.firstAirDate)
        }

    }

}