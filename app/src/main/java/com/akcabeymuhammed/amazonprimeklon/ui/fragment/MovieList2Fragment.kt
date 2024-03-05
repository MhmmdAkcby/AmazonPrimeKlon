package com.akcabeymuhammed.amazonprimeklon.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.akcabeymuhammed.amazonprimeklon.R
import com.akcabeymuhammed.amazonprimeklon.data.entity.Movies
import com.akcabeymuhammed.amazonprimeklon.databinding.FragmentMovieList2Binding
import com.akcabeymuhammed.amazonprimeklon.ui.adapter.MovieList2Adapter


class MovieList2Fragment : Fragment() {
   private lateinit var binding:FragmentMovieList2Binding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMovieList2Binding.inflate(inflater,container, false)

        val movieList2 = ArrayList<Movies>()
        val rm1 = Movies(12,"r1","Reacher")
        val rm2 = Movies(13,"r2","Game Of Thrones")
        val rm3 = Movies(14,"r3","John Wick")
        val rm4 = Movies(15,"r4","Chernobyl")
        val rm5 = Movies(16,"r5","The Covenant")

        movieList2.add(rm1)
        movieList2.add(rm2)
        movieList2.add(rm3)
        movieList2.add(rm4)
        movieList2.add(rm5)

        val movieList2Count = movieList2.count()

        binding.rvList2.layoutManager=LinearLayoutManager(requireContext())
        val movieList2Adapter = MovieList2Adapter(requireContext(), movieList2)
        binding.rvList2.adapter = movieList2Adapter

        binding.tvCountMovie2.text = "${movieList2Count} videos"

        return binding.root
    }

}