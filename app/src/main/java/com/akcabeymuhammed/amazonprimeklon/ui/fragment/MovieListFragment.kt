package com.akcabeymuhammed.amazonprimeklon.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.akcabeymuhammed.amazonprimeklon.R
import com.akcabeymuhammed.amazonprimeklon.data.entity.Movies
import com.akcabeymuhammed.amazonprimeklon.databinding.FragmentMovieListBinding
import com.akcabeymuhammed.amazonprimeklon.ui.adapter.MovieList3Adapter


class MovieListFragment : Fragment() {
    private lateinit var binding:FragmentMovieListBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMovieListBinding.inflate(inflater,container,false)

        val movieList = ArrayList<Movies>()
        val m6 = Movies(29,"r15","The Fast And The Furious TokyoDrift")
        val m1 = Movies(17,"r22","Fetih 1453")
        val m2 = Movies(18,"r12","The Rings Of Power")
        val m3 = Movies(19,"r2","Game Of Thrones")
        val m4 = Movies(20,"r21","Fear The Walking Dead")
        val m5 = Movies(21,"r20","Friends")

        movieList.add(m1)
        movieList.add(m2)
        movieList.add(m3)
        movieList.add(m4)
        movieList.add(m5)
        movieList.add(m6)

        val movieCount = movieList.count()

        binding.rvList.layoutManager = LinearLayoutManager(requireContext())
        val movieList3Adapter = MovieList3Adapter(requireContext(),movieList)
        binding.rvList.adapter = movieList3Adapter

        binding.tvCountMovie.text = "${movieCount} video "

        return binding.root
    }
}