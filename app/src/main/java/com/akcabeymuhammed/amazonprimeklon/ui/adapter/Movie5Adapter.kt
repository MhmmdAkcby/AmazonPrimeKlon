package com.akcabeymuhammed.amazonprimeklon.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.akcabeymuhammed.amazonprimeklon.data.entity.Movies
import com.akcabeymuhammed.amazonprimeklon.databinding.MovieTasarim5Binding
import com.akcabeymuhammed.amazonprimeklon.ui.fragment.HomeFragmentDirections

class Movie5Adapter(var mContext:Context, var movieList5:List<Movies>)
    :RecyclerView.Adapter<Movie5Adapter.MovieTasarim5Tutucu>(){
    inner class MovieTasarim5Tutucu(var tasarim:MovieTasarim5Binding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieTasarim5Tutucu {
        val binding = MovieTasarim5Binding.inflate(LayoutInflater.from(mContext),parent,false)
        return MovieTasarim5Tutucu(binding)
    }
    override fun onBindViewHolder(holder: MovieTasarim5Tutucu, position: Int) {
        val movie5 = movieList5.get(position)
        val t = holder.tasarim

        t.imageView5.setImageResource(
            mContext.resources.getIdentifier(movie5.movies_image,"drawable", mContext.packageName))

        t.cardViewMovie5.setOnClickListener {
            val gecis = HomeFragmentDirections.sliderDetayGecis(movie=movie5)
            Navigation.findNavController(it).navigate(gecis)
        }
    }
    override fun getItemCount(): Int {
        return movieList5.size
    }
}