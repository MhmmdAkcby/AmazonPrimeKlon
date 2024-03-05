package com.akcabeymuhammed.amazonprimeklon.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.akcabeymuhammed.amazonprimeklon.R
import com.akcabeymuhammed.amazonprimeklon.data.entity.Movies
import com.akcabeymuhammed.amazonprimeklon.databinding.FragmentMovieList6Binding
import com.akcabeymuhammed.amazonprimeklon.ui.adapter.MovieList6Adapter


class MovieList6Fragment : Fragment() {
    private lateinit var binding:FragmentMovieList6Binding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMovieList6Binding.inflate(inflater,container, false)

        val movieList5 = ArrayList<Movies>()
        val ivm1 = Movies(30,"r18","Ted")
        val ivm2 = Movies(31,"r20","Friends")
        val ivm3 = Movies(32,"r19","Ted 2")

        movieList5.add(ivm1)
        movieList5.add(ivm2)
        movieList5.add(ivm3)

        val movieCount = movieList5.count()

        binding.rvList6.layoutManager = LinearLayoutManager(requireContext())
        val movieList6Adapter = MovieList6Adapter(requireContext(),movieList5)
        binding.rvList6.adapter = movieList6Adapter

        binding.tvCountMovie6.text = "${movieCount} videos"

        return binding.root
    }
}