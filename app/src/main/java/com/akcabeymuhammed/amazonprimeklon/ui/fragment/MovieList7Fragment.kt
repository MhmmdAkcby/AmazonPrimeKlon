package com.akcabeymuhammed.amazonprimeklon.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.akcabeymuhammed.amazonprimeklon.R
import com.akcabeymuhammed.amazonprimeklon.data.entity.Movies
import com.akcabeymuhammed.amazonprimeklon.databinding.FragmentMovieList7Binding
import com.akcabeymuhammed.amazonprimeklon.ui.adapter.MovieList7Adapter


class MovieList7Fragment : Fragment() {
    private lateinit var binding:FragmentMovieList7Binding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMovieList7Binding.inflate(inflater, container, false)

        val movieList6 = ArrayList<Movies>()
        val mt1 = Movies(33,"r16","Dağ")
        val mt2 = Movies(34,"r5","The Covenant")
        val mt3 = Movies(35,"r17","Dağ 2")

        movieList6.add(mt1)
        movieList6.add(mt2)
        movieList6.add(mt3)

        val movieCount = movieList6.count()

        binding.rvList7.layoutManager = LinearLayoutManager(requireContext())
        val movieList7Adapter = MovieList7Adapter(requireContext(),movieList6)
        binding.rvList7.adapter = movieList7Adapter

        binding.tvCountMovie7.text = "${movieCount} videos"

        return binding.root
    }
}