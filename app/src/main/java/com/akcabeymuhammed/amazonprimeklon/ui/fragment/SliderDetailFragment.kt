package com.akcabeymuhammed.amazonprimeklon.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.akcabeymuhammed.amazonprimeklon.R
import com.akcabeymuhammed.amazonprimeklon.databinding.FragmentSliderDetailBinding
import com.google.android.material.snackbar.Snackbar

class SliderDetailFragment : Fragment() {
    private lateinit var binding:FragmentSliderDetailBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSliderDetailBinding.inflate(inflater,container,false)

        val bundle:SliderDetailFragmentArgs by navArgs()
        var sliderDtl = bundle.movie

        binding.ivDetailSlider.setImageResource(
            resources.getIdentifier(sliderDtl.movies_image, "drawable", requireContext().packageName))
        binding.tvMovieNameSlider.text = sliderDtl.movie_name

        binding.ivCastDtl.setOnClickListener {
            Snackbar.make(it,"Searching for devices...",Snackbar.LENGTH_SHORT).show()
        }
        binding.ProfileDtlSlider.setOnClickListener {
            Snackbar.make(it,"Try again later",Snackbar.LENGTH_SHORT).show()
        }
        binding.btnPlaySlider.setOnClickListener {
            Snackbar.make(it,"Try again later",Snackbar.LENGTH_SHORT).show()
        }
        binding.btnDownloadSlider.setOnClickListener {
            Snackbar.make(it,"Try again later",Snackbar.LENGTH_SHORT).show()
        }
        binding.ivTrailerSlider.setOnClickListener {
            Snackbar.make(it,"Try again later",Snackbar.LENGTH_SHORT).show()
        }
        binding.ivWatchlistSlider.setOnClickListener {
            Snackbar.make(it,"Try again later",Snackbar.LENGTH_SHORT).show()
        }
        binding.ivMoreSldr.setOnClickListener {
            Snackbar.make(it,"Try again later",Snackbar.LENGTH_SHORT).show()
        }

        return binding.root
    }
}