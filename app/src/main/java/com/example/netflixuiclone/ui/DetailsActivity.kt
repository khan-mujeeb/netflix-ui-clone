package com.example.netflixuiclone.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.netflixuiclone.R
import com.example.netflixuiclone.data.MovieData
import com.example.netflixuiclone.databinding.ActivityDetailsBinding
import com.example.netflixuiclone.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {
    var binding: ActivityDetailsBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val movie = intent.getParcelableExtra<MovieData>("movie")

        Glide.with(this).
                load(movie?.url).
                into(binding!!.poster)

        binding!!.name.text = movie!!.name
        binding!!.year.text = "${movie!!.year}"
        binding!!.genric.text = "-${movie!!.generic}"
        binding!!.length.text = "-${movie!!.length}"
        binding!!.directortext.text = " ${movie.director}"
        binding!!.description.text = movie.decp
    }
}