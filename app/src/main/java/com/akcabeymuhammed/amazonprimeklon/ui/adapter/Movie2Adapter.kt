package com.akcabeymuhammed.amazonprimeklon.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.akcabeymuhammed.amazonprimeklon.data.entity.Movies
import com.akcabeymuhammed.amazonprimeklon.databinding.MovieTasarim2Binding
import com.akcabeymuhammed.amazonprimeklon.ui.fragment.HomeFragmentDirections

class Movie2Adapter(var mContext:Context, var movieList2:List<Movies>)
    :RecyclerView.Adapter<Movie2Adapter.MovieTasarim2Tutucu>(){
    inner class MovieTasarim2Tutucu(var tasarim2:MovieTasarim2Binding):RecyclerView.ViewHolder(tasarim2.root)

    override fun onCreateViewHolder(parent:ViewGroup, viewType:Int):MovieTasarim2Tutucu{
        var binding = MovieTasarim2Binding.inflate(LayoutInflater.from(mContext),parent,false)
        return MovieTasarim2Tutucu(binding)
    }
    override fun onBindViewHolder(holder:MovieTasarim2Tutucu, position:Int){
        val movies2 = movieList2.get(position)
        val mt2 = holder.tasarim2

        mt2.imageView3.setImageResource(
            mContext.resources.getIdentifier(movies2.movies_image,"drawable",mContext.packageName))

        mt2.cardViewMovie2.setOnClickListener {
            val gecis = HomeFragmentDirections
                .sliderDetayGecis(movie = movies2)
            Navigation.findNavController(it).navigate(gecis)
        }
    }
    override fun getItemCount():Int{
        return movieList2.size
    }
}