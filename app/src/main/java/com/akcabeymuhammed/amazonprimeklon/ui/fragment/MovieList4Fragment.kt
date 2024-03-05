package com.akcabeymuhammed.amazonprimeklon.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.akcabeymuhammed.amazonprimeklon.R
import com.akcabeymuhammed.amazonprimeklon.data.entity.Movies
import com.akcabeymuhammed.amazonprimeklon.databinding.FragmentMovieList4Binding
import com.akcabeymuhammed.amazonprimeklon.ui.adapter.MovieList4Adapter


class MovieList4Fragment : Fragment() {
    private lateinit var binding:FragmentMovieList4Binding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMovieList4Binding.inflate(inflater,container,false)

        val movieList1 = ArrayList<Movies>()
        val r6 = Movies(6,"r6","Once Upon A Tıme In Anatolia")
        val r7 = Movies(7,"r7","Inception")
        val r8 = Movies(8,"r8","Django")
        val r9 = Movies(9,"r9","Interstellar")
        val r10 = Movies(10,"r10","The Hateful Eight")
        val r11 = Movies(11,"r11","The Pianist")

        movieList1.add(r6)
        movieList1.add(r7)
        movieList1.add(r8)
        movieList1.add(r9)
        movieList1.add(r10)
        movieList1.add(r11)

        val countMovie = movieList1.count()

        binding.rvList3.layoutManager = LinearLayoutManager(requireContext())
        val movieList4Adapter = MovieList4Adapter(requireContext(), movieList1)
        binding.rvList3.adapter = movieList4Adapter

        binding.tvCountMovie3.text = "${countMovie} videos"


        return binding.root
    }
}