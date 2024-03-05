package com.akcabeymuhammed.amazonprimeklon.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.akcabeymuhammed.amazonprimeklon.data.entity.Movies
import com.akcabeymuhammed.amazonprimeklon.databinding.MovieTasarim6Binding
import com.akcabeymuhammed.amazonprimeklon.ui.fragment.HomeFragmentDirections

class Movie6Adapter(var mContext:Context, var movieList6:List<Movies>)
    :RecyclerView.Adapter<Movie6Adapter.MovieTasarim6Tutucu>() {
    inner class MovieTasarim6Tutucu(var tasarim: MovieTasarim6Binding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieTasarim6Tutucu {
        val binding = MovieTasarim6Binding.inflate(LayoutInflater.from(mContext),parent,false)
        return MovieTasarim6Tutucu(binding)
    }
    override fun onBindViewHolder(holder: MovieTasarim6Tutucu, position: Int) {
        val movie6 = movieList6.get(position)
        val t = holder.tasarim

        t.imageView9.setImageResource(
            mContext.resources.getIdentifier(movie6.movies_image,"drawable", mContext.packageName))

        t.cardViewMovie6.setOnClickListener {
            val gecis = HomeFragmentDirections.sliderDetayGecis(movie=movie6)
            Navigation.findNavController(it).navigate(gecis)
        }
    }
    override fun getItemCount(): Int {
        return movieList6.size
    }


}