package com.akcabeymuhammed.amazonprimeklon.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.RecyclerView
import com.akcabeymuhammed.amazonprimeklon.data.entity.DownloadMovie
import com.akcabeymuhammed.amazonprimeklon.databinding.DownloadTasarimBinding
import com.akcabeymuhammed.amazonprimeklon.ui.fragment.DownloadFragment
import com.akcabeymuhammed.amazonprimeklon.ui.fragment.DownloadFragmentDirections

class DownloadsAdapter(var mContext: Context,var downloadList:List<DownloadMovie>)
    :RecyclerView.Adapter<DownloadsAdapter.DownloadTasarimTutucu>(){
    inner class DownloadTasarimTutucu(var tasarim:DownloadTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType:Int):DownloadTasarimTutucu{
        var binding = DownloadTasarimBinding.inflate(LayoutInflater.from(mContext),parent, false)
        return DownloadTasarimTutucu(binding)
    }
    override fun onBindViewHolder(holder:DownloadTasarimTutucu, position:Int){
        var downMovie = downloadList.get(position)
        var t = holder.tasarim

        t.ivDownloadMovie.setImageResource(
            mContext.resources.getIdentifier(downMovie.movie, "drawable",mContext.packageName))
        t.tvDownloadMovieName.text = downMovie.movie_name

        t.cvDownload.setOnClickListener {
            val gecis = DownloadFragmentDirections
                .downloadGecis(downDetails = downMovie)
            Navigation.findNavController(it).navigate(gecis)
        }
    }
    override fun getItemCount():Int{
        return downloadList.size
    }
}