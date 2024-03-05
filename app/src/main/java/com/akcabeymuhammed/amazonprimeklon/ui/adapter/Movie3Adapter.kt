package com.akcabeymuhammed.amazonprimeklon.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.akcabeymuhammed.amazonprimeklon.data.entity.Movies
import com.akcabeymuhammed.amazonprimeklon.databinding.MovieTasarim3Binding
import com.akcabeymuhammed.amazonprimeklon.databinding.MovieTasarimBinding
import com.akcabeymuhammed.amazonprimeklon.ui.fragment.HomeFragmentDirections

class Movie3Adapter(var mContext:Context, var movieList3: List<Movies>)
    :RecyclerView.Adapter<Movie3Adapter.MovieTasarim3Tutucu>() {

    inner class MovieTasarim3Tutucu(var tasarim:MovieTasarim3Binding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent:ViewGroup, viewType:Int):MovieTasarim3Tutucu{
        val binding = MovieTasarim3Binding.inflate(LayoutInflater.from(mContext), parent, false)
        return MovieTasarim3Tutucu(binding)
    }

    override fun onBindViewHolder(holder:MovieTasarim3Tutucu, position:Int){
        val movie3 = movieList3.get(position)
        val t = holder.tasarim

        t.imageView2.setImageResource(
            mContext.resources.getIdentifier(movie3.movies_image, "drawable", mContext.packageName))

        t.cardViewMovie3.setOnClickListener {
            val gecis = HomeFragmentDirections.sliderDetayGecis(movie=movie3)
            Navigation.findNavController(it).navigate(gecis)
        }
    }

    override fun getItemCount():Int{
        return movieList3.size
    }
}