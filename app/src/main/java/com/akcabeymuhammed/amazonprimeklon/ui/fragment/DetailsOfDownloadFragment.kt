package com.akcabeymuhammed.amazonprimeklon.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.akcabeymuhammed.amazonprimeklon.R
import com.akcabeymuhammed.amazonprimeklon.databinding.FragmentDetailsOfDownloadBinding
import com.google.android.material.snackbar.Snackbar


class DetailsOfDownloadFragment : Fragment() {
    private lateinit var binding:FragmentDetailsOfDownloadBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDetailsOfDownloadBinding.inflate(inflater,container, false)

        val bundle: DetailsOfDownloadFragmentArgs by navArgs()
        val comeMovie = bundle.downDetails

        binding.ivDetail.setImageResource(
            resources.getIdentifier(comeMovie.movie,"drawable", requireContext().packageName))

        binding.tvMovieName.text = comeMovie.movie_name

        binding.ivProfileDtl.setOnClickListener {
            Snackbar.make(it,"An unexpected error occurred.", Snackbar.LENGTH_SHORT).show()
        }
        binding.ivCastDtl.setOnClickListener {
            Snackbar.make(it,"Searching for devices...",Snackbar.LENGTH_SHORT).show()
        }
        binding.btnDownload.setOnClickListener {
            Snackbar.make(it,"We can't process your transaction right now, try again later.",Snackbar.LENGTH_SHORT)
                .show()
        }
        binding.btnPlay.setOnClickListener {
            Snackbar.make(it,"We can't process your transaction right now, try again later.",Snackbar.LENGTH_SHORT)
                .show()
        }
        binding.ivTrailer.setOnClickListener {
            Snackbar.make(it,"Try again later",Snackbar.LENGTH_SHORT).show()
        }
        binding.ivWatchlist.setOnClickListener {
            Snackbar.make(it,"Watchlist added.",Snackbar.LENGTH_SHORT).show()
        }
        binding.ivMore.setOnClickListener {
            Snackbar.make(it,"Try again later.",Snackbar.LENGTH_SHORT).show()
        }

        return binding.root
    }
}