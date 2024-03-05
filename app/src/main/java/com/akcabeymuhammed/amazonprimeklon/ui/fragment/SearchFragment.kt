package com.akcabeymuhammed.amazonprimeklon.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.akcabeymuhammed.amazonprimeklon.R
import com.akcabeymuhammed.amazonprimeklon.databinding.FragmentSearchBinding
import com.google.android.material.snackbar.Snackbar


class SearchFragment : Fragment() {
    private lateinit var binding:FragmentSearchBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSearchBinding.inflate(inflater, container, false)

        binding.ivCastSrc.setOnClickListener {
            Snackbar.make(it,"Searching for devices...", Snackbar.LENGTH_SHORT).show()
        }
        binding.ivProfileSrc.setOnClickListener {
            Snackbar.make(it,"An unexpected error occurred.", Snackbar.LENGTH_SHORT).show()
        }
        binding.btnComedy.setOnClickListener {
            Snackbar.make(it,"An unexpected error occurred.", Snackbar.LENGTH_SHORT).show()
        }
        binding.btnDocumentary.setOnClickListener {
            Snackbar.make(it,"An unexpected error occurred.", Snackbar.LENGTH_SHORT).show()
        }
        binding.btnDrama.setOnClickListener {
            Snackbar.make(it,"An unexpected error occurred.", Snackbar.LENGTH_SHORT).show()
        }
        binding.btnFantastic.setOnClickListener {
            Snackbar.make(it,"An unexpected error occurred.", Snackbar.LENGTH_SHORT).show()
        }
        binding.btnHorror.setOnClickListener {
            Snackbar.make(it,"An unexpected error occurred.", Snackbar.LENGTH_SHORT).show()
        }
        binding.btnActionAdven.setOnClickListener {
            Snackbar.make(it,"An unexpected error occurred.", Snackbar.LENGTH_SHORT).show()
        }
        binding.btnSeeMore.setOnClickListener {
            Snackbar.make(it,"An unexpected error occurred.", Snackbar.LENGTH_SHORT).show()
        }

        return binding.root
    }
}