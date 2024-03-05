package com.akcabeymuhammed.amazonprimeklon.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.akcabeymuhammed.amazonprimeklon.R
import com.akcabeymuhammed.amazonprimeklon.data.entity.Movies
import com.akcabeymuhammed.amazonprimeklon.databinding.FragmentMovieList5Binding
import com.akcabeymuhammed.amazonprimeklon.ui.adapter.MovieList5Adapter


class MovieList5Fragment : Fragment() {
    private lateinit var binding:FragmentMovieList5Binding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMovieList5Binding.inflate(inflater,container,false)

        val movieList4 = ArrayList<Movies>()
        val mi1 = Movies(22,"r12","The Rings Of Power")
        val mi2 = Movies(23,"r13","The Lord Of The Rings The Return Of The King")
        val mi3 = Movies(24,"r23","The Lord Of The Rings, The Two Towers")
        val mi4 = Movies(25,"r24","Hobbit The Battle Of The Five Armies")
        val mi5 = Movies(26,"r25","The Hobbit The Desolation Of Samug")
        val mi6 = Movies(27,"r14","The Hobbit The Battle of The Five Armies")
        val mi7 = Movies(28,"r2","Game Of Thrones")

        movieList4.add(mi1)
        movieList4.add(mi2)
        movieList4.add(mi3)
        movieList4.add(mi4)
        movieList4.add(mi5)
        movieList4.add(mi6)
        movieList4.add(mi7)

        val movieCount = movieList4.count()

        binding.rvList5.layoutManager = LinearLayoutManager(requireContext())
        val movieList5Adapter = MovieList5Adapter(requireContext(), movieList4)
        binding.rvList5.adapter = movieList5Adapter

        binding.tvCountMovie4.text = "${movieCount} videos"

        return binding.root
    }
}