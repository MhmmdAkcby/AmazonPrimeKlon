package com.akcabeymuhammed.amazonprimeklon.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.akcabeymuhammed.amazonprimeklon.data.entity.Movies
import com.akcabeymuhammed.amazonprimeklon.databinding.SliderTasarimBinding
import com.akcabeymuhammed.amazonprimeklon.ui.fragment.HomeFragment
import com.akcabeymuhammed.amazonprimeklon.ui.fragment.HomeFragmentDirections

class SliderAdapter (var mContext:Context, var movieSliderList:List<Movies>)
    :RecyclerView.Adapter<SliderAdapter.SliderTasarimTutucu>(){

    inner class SliderTasarimTutucu(var tasarim : SliderTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent:ViewGroup, viewType:Int):SliderTasarimTutucu{
        var binding = SliderTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return SliderTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: SliderTasarimTutucu, position: Int) {
         var movieSlider = movieSliderList.get(position)
         var ts = holder.tasarim

        ts.imageView.setImageResource(
            mContext.resources.getIdentifier(movieSlider.movies_image, "drawable",mContext.packageName))

        ts.cardViewSlider.setOnClickListener {
            val gecis = HomeFragmentDirections.sliderDetayGecis(movie=movieSlider)
            Navigation.findNavController(it).navigate(gecis)
        }

    }

    override fun getItemCount(): Int {
        return movieSliderList.size
    }
}