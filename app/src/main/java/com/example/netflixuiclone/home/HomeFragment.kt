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
import com.example.netflixuiclone.data.MovieData
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

        setPoster(list)
        openActivity(list)



        return binding?.root
    }

    private fun openActivity(list: List<MovieData>) {
        val one = binding!!.one
        val two = binding!!.two
        val three = binding!!.three
        val four = binding!!.four
        val five = binding!!.five
        val six = binding!!.six
        val seven = binding!!.seven
        val eight = binding!!.eight
        val nine = binding!!.nine

        openDetailActivity(list, one, 0)
        openDetailActivity(list, two, 1)
        openDetailActivity(list, three, 2)
        openDetailActivity(list, four, 3)
        openDetailActivity(list, five, 4)
        openDetailActivity(list, six, 5)
        openDetailActivity(list, seven, 6)
        openDetailActivity(list, eight, 7)
        openDetailActivity(list, nine, 8)
    }

    private fun setPoster(list: List<MovieData>) {
        loadImage(list[0].url, binding!!.one)
        loadImage(list[1].url, binding!!.two)
        loadImage(list[2].url, binding!!.three)
        loadImage(list[3].url, binding!!.four)
        loadImage(list[4].url, binding!!.five)
        loadImage(list[5].url, binding!!.six)
        loadImage(list[8].url, binding!!.seven)
        loadImage(list[2].url, binding!!.eight)
        loadImage(list[7].url, binding!!.nine)
    }

    private fun openDetailActivity(list: List<MovieData>, one: ImageView, i: Int) {
            one.setOnClickListener{
            val intent = Intent(context, DetailsActivity::class.java)
            intent.putExtra("movie", list[i])
            startActivity(intent)

        }
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