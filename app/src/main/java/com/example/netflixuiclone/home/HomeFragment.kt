package com.example.netflixuiclone.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.netflixuiclone.R
import com.example.netflixuiclone.data.setData
import com.example.netflixuiclone.databinding.FragmentHomeBinding
import com.example.netflixuiclone.ui.DetailsActivity

class HomeFragment : Fragment() {
    var binding: FragmentHomeBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        val list = setData.movieList()

        loadImage(list[0].url, binding!!.one)
        loadImage(list[1].url, binding!!.two)
        loadImage(list[2].url, binding!!.three)

        binding!!.one.setOnClickListener{
            val intent = Intent(context, DetailsActivity::class.java)
            intent.putExtra("movie", list[0])
            startActivity(intent)

        }


        return binding?.root
    }

    private fun loadImage(url: String, one: ImageView) {
        Glide.with(this)
            .load(url)
            .into(one)
    }

    override fun onDestroy() {
        super.onDestroy()
        if (binding!=null) {
            binding = null
        }
    }


}