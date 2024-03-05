package com.akcabeymuhammed.amazonprimeklon.ui.fragment

import android.graphics.Color
import android.graphics.Movie
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.akcabeymuhammed.amazonprimeklon.R
import com.akcabeymuhammed.amazonprimeklon.data.entity.Movies
import com.akcabeymuhammed.amazonprimeklon.databinding.FragmentHomeBinding
import com.akcabeymuhammed.amazonprimeklon.ui.adapter.Movie2Adapter
import com.akcabeymuhammed.amazonprimeklon.ui.adapter.Movie3Adapter
import com.akcabeymuhammed.amazonprimeklon.ui.adapter.Movie4Adapter
import com.akcabeymuhammed.amazonprimeklon.ui.adapter.Movie5Adapter
import com.akcabeymuhammed.amazonprimeklon.ui.adapter.Movie6Adapter
import com.akcabeymuhammed.amazonprimeklon.ui.adapter.MovieAdapter
import com.akcabeymuhammed.amazonprimeklon.ui.adapter.SliderAdapter
import com.google.android.material.snackbar.Snackbar

class HomeFragment : Fragment() {
    private lateinit var binding:FragmentHomeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.buttonAll.setOnClickListener { onButtonClicked(it) }
        binding.buttonMovies.setOnClickListener { onButtonClicked(it) }
        binding.buttonTvMovies.setOnClickListener { onButtonClicked(it) }


        val movieSliderList = ArrayList<Movies>()
        val r26 = Movies(30,"r26","SpiderMan Home Coming")
        val r1 = Movies(1,"r1","Reacher")
        val r2 = Movies(2,"r2","Game Of Thrones")
        val r3 = Movies(3,"r3","John Wick")
        val r4 = Movies(4,"r4","Chernobyl")
        val r5 = Movies(5,"r5","The Covenant")

        movieSliderList.add(r26)
        movieSliderList.add(r1)
        movieSliderList.add(r2)
        movieSliderList.add(r3)
        movieSliderList.add(r4)
        movieSliderList.add(r5)

        binding.rvSlider.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        val sliderAdapter =SliderAdapter(requireContext(), movieSliderList)
        binding.rvSlider.adapter = sliderAdapter


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

        binding.rvMovie1.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        val movieAdapter = MovieAdapter(requireContext(),movieList1)
        binding.rvMovie1.adapter = movieAdapter


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

        binding.rvMovie2.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        val movie2Adapter = Movie2Adapter(requireContext(),movieList2)
        binding.rvMovie2.adapter = movie2Adapter


        val movieList3 = ArrayList<Movies>()
        val m6 = Movies(29,"r15","The Fast And The Furious TokyoDrift")
        val m1 = Movies(17,"r22","Fetih 1453")
        val m2 = Movies(18,"r12","The Rings Of Power")
        val m3 = Movies(19,"r2","Game Of Thrones")
        val m4 = Movies(20,"r21","Fear The Walking Dead")
        val m5 = Movies(21,"r20","Friends")

        movieList3.add(m1)
        movieList3.add(m2)
        movieList3.add(m3)
        movieList3.add(m4)
        movieList3.add(m5)

        binding.rvMovie3.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        val movie3Adapter = Movie3Adapter(requireContext(), movieList3)
        binding.rvMovie3.adapter = movie3Adapter

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

        binding.rvMovie4.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        val movie4Adapter = Movie4Adapter(requireContext(), movieList4)
        binding.rvMovie4.adapter = movie4Adapter

        val movieList5 = ArrayList<Movies>()
        val ivm1 = Movies(30,"r18","Ted")
        val ivm2 = Movies(31,"r20","Friends")
        val ivm3 = Movies(32,"r19","Ted 2")

        movieList5.add(ivm1)
        movieList5.add(ivm2)
        movieList5.add(ivm3)

        binding.rvMovie5.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        val movi5Adapter = Movie5Adapter(requireContext(),movieList5)
        binding.rvMovie5.adapter = movi5Adapter

        val movieList6 = ArrayList<Movies>()
        val mt1 = Movies(33,"r16","Dağ")
        val mt2 = Movies(34,"r5","The Covenant")
        val mt3 = Movies(35,"r17","Dağ 2")

        movieList6.add(mt1)
        movieList6.add(mt2)
        movieList6.add(mt3)

        binding.rvMovie6.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        val movie6Adapter = Movie6Adapter(requireContext(),movieList6)
        binding.rvMovie6.adapter = movie6Adapter

        binding.ivCastDtl.setOnClickListener {
            Snackbar.make(it,"Searching...", Snackbar.LENGTH_SHORT).show()
        }
        binding.ivProfileDtl.setOnClickListener {
            Snackbar.make(it,"Try again later.",Snackbar.LENGTH_SHORT).show()
        }

        binding.ivMore.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.movieListGecis)
        }
        binding.tvPrimeTextChange.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.movieList2Gecis)
        }
        binding.tvContinueWatching.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.movieList4Gecis)
        }
        binding.tvFantasy.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.movieList5Gecis)
        }
        binding.tvComedy.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.movieList6Gecis)
        }
        binding.tvMtWrm.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.movieList7Gecis)
        }

        return binding.root
    }
    private fun onButtonClicked(clickedButton: View) {
        resetButtonStates()
        clickedButton.setBackgroundColor(Color.WHITE)
        (clickedButton as? Button)?.setTextColor(Color.BLACK)
    }

    private fun resetButtonStates() {
        binding.buttonAll.setBackgroundColor(Color.TRANSPARENT)
        binding.buttonAll.setTextColor(Color.WHITE)
        binding.buttonMovies.setBackgroundColor(Color.TRANSPARENT)
        binding.buttonMovies.setTextColor(Color.WHITE)
        binding.buttonTvMovies.setBackgroundColor(Color.TRANSPARENT)
        binding.buttonTvMovies.setTextColor(Color.WHITE)
    }
}
