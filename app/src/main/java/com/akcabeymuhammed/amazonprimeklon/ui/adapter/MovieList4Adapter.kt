package com.akcabeymuhammed.amazonprimeklon.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akcabeymuhammed.amazonprimeklon.data.entity.Movies
import com.akcabeymuhammed.amazonprimeklon.databinding.DownloadTasarimBinding

class MovieList4Adapter(var mContext:Context, var movieList4:List<Movies>)
    :RecyclerView.Adapter<MovieList4Adapter.DownloadTasarimTutucu>() {
    inner class DownloadTasarimTutucu(var tasarim:DownloadTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType:Int):DownloadTasarimTutucu{
        val binding = DownloadTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return DownloadTasarimTutucu(binding)
    }
    override fun onBindViewHolder(holder:DownloadTasarimTutucu, position:Int){
        var movie = movieList4.get(position)
        var t = holder.tasarim

        t.ivDownloadMovie.setImageResource(
            mContext.resources.getIdentifier(movie.movies_image,"drawable", mContext.packageName))
        t.tvDownloadMovieName.text = movie.movie_name

    }
    override fun getItemCount():Int{
        return movieList4.size
    }
}