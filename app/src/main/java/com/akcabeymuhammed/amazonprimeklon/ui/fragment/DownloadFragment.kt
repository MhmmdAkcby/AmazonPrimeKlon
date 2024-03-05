package com.akcabeymuhammed.amazonprimeklon.ui.fragment

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.akcabeymuhammed.amazonprimeklon.R
import com.akcabeymuhammed.amazonprimeklon.data.entity.DownloadMovie
import com.akcabeymuhammed.amazonprimeklon.databinding.FragmentDownloadBinding
import com.akcabeymuhammed.amazonprimeklon.ui.adapter.DownloadsAdapter
import com.google.android.material.snackbar.Snackbar


class DownloadFragment : Fragment() {
    private lateinit var binding:FragmentDownloadBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDownloadBinding.inflate(inflater,container, false)

        var dwnMovie = ArrayList<DownloadMovie>()
        val f1 = DownloadMovie(1,"r16","Dağ")
        val f2 = DownloadMovie(2,"r26","SpiderMan Home Coming")
        val f3 = DownloadMovie(3,"r15","The Fast and The Furious TokyoDrift")
        val f4 = DownloadMovie(4,"r3","John Wick 4")

        dwnMovie.add(f1)
        dwnMovie.add(f2)
        dwnMovie.add(f3)
        dwnMovie.add(f4)

        binding.rvDownload.layoutManager = LinearLayoutManager(requireContext())
        val downloadsAdapter = DownloadsAdapter(requireContext(),dwnMovie)
        binding.rvDownload.adapter = downloadsAdapter

        binding.btnEditDwn.setOnClickListener{
            Snackbar.make(it,"We can't process your transaction right now, try again later",Snackbar.LENGTH_SHORT)
                .show()
        }
        binding.btnDwnMoreVd.setOnClickListener {
            Snackbar.make(it,"We can't process your transaction right now, try again later",Snackbar.LENGTH_SHORT)
                .show()
        }
        binding.tvManage.setOnClickListener {
            Snackbar.make(it,"Try again later",Snackbar.LENGTH_SHORT).show()
        }
        binding.ivCast.setOnClickListener {
            Snackbar.make(it,"Searching for devices...",Snackbar.LENGTH_SHORT).show()
        }
        binding.ivProfile.setOnClickListener {
            Snackbar.make(it,"An unexpected error occurred", Snackbar.LENGTH_SHORT).show()
        }

        var countArrayList = dwnMovie.count()
        binding.tvInfo.text = "$countArrayList videos 10h 35min 13.6GB"

        return binding.root
    }
}