package com.akcabeymuhammed.amazonprimeklon.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.akcabeymuhammed.amazonprimeklon.data.entity.Movies
import com.akcabeymuhammed.amazonprimeklon.databinding.MovieTasarim4Binding
import com.akcabeymuhammed.amazonprimeklon.ui.fragment.HomeFragmentDirections

class Movie4Adapter(var mContext:Context, var moviesList4:List<Movies>)
    :RecyclerView.Adapter<Movie4Adapter.MovieTasarim4Tutucu>() {
    inner class MovieTasarim4Tutucu(var tasarim:MovieTasarim4Binding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType:Int):MovieTasarim4Tutucu{
        val binding = MovieTasarim4Binding.inflate(LayoutInflater.from(mContext),parent,false)
        return MovieTasarim4Tutucu(binding)
    }
    override fun onBindViewHolder(holder:MovieTasarim4Tutucu, position:Int){
        val movie4 = moviesList4.get(position)
        val t = holder.tasarim

        t.imageView8.setImageResource(
            mContext.resources.getIdentifier(movie4.movies_image, "drawable", mContext.packageName))
        t.cardViewMovie4.setOnClickListener {
            val gecis = HomeFragmentDirections.sliderDetayGecis(movie=movie4)
            Navigation.findNavController(it).navigate(gecis)
        }
    }

    override fun getItemCount(): Int {
        return moviesList4.size
    }

}