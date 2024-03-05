package com.akcabeymuhammed.amazonprimeklon.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.akcabeymuhammed.amazonprimeklon.data.entity.Movies
import com.akcabeymuhammed.amazonprimeklon.databinding.MovieTasarimBinding
import com.akcabeymuhammed.amazonprimeklon.ui.fragment.HomeFragmentDirections

class MovieAdapter(var mContext: Context, var moveList:List<Movies>)
    :RecyclerView.Adapter<MovieAdapter.MovieTasarimTutucu>() {
    inner class MovieTasarimTutucu(var tasarim: MovieTasarimBinding): RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent:ViewGroup, viewType:Int):MovieTasarimTutucu{
        val binding = MovieTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return MovieTasarimTutucu(binding)
    }
    override fun onBindViewHolder(holder:MovieTasarimTutucu, position:Int){
        val movie = moveList.get(position)
        val mt = holder.tasarim

        mt.imageViewMovie.setImageResource(
            mContext.resources.getIdentifier(movie.movies_image,"drawable",mContext.packageName))
        mt.cardViewMovie.setOnClickListener {
            var gecis = HomeFragmentDirections
                .sliderDetayGecis(movie=movie)
            Navigation.findNavController(it).navigate(gecis)
        }

    }
    override fun getItemCount():Int{
        return moveList.size
    }
}