package com.example.netflixuiclone.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.netflixuiclone.MainActivity
import com.example.netflixuiclone.R
import com.example.netflixuiclone.data.MovieData
import com.example.netflixuiclone.data.setData
import com.example.netflixuiclone.databinding.ActivityDetailsBinding
import com.example.netflixuiclone.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {
    var binding: ActivityDetailsBinding? = null
    val list = setData.movieList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        val movie = intent.getParcelableExtra<MovieData>("movie")

        // display information
        setInformation(movie)
        loadRealtedMovies()
        openRealtedMovies()

        binding!!.backarrow.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    private fun openRealtedMovies() {
        val seven = binding!!.seven
        val eight = binding!!.eight
        val nine = binding!!.nine

        openDetailActivity(list, seven, 6)
        openDetailActivity(list, eight, 7)
        openDetailActivity(list, nine, 8)
    }

    private fun loadRealtedMovies() {
        loadImage(list[6].url, binding!!.seven)
        loadImage(list[7].url, binding!!.eight)
        loadImage(list[8].url, binding!!.nine)

    }

    private fun loadImage(url: String, one: ImageView) {
        Glide.with(this)
            .load(url)
            .into(one)
    }

    private fun openDetailActivity(list: List<MovieData>, one: ImageView, i: Int) {
        one.setOnClickListener{
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("movie", list[i])
            startActivity(intent)
            finish()
        }
    }

    private fun setInformation(movie: MovieData?) {
        // poster
        Glide.with(this).
        load(movie?.url).
        into(binding!!.poster)

        // details
        binding!!.name.text = movie!!.name
        binding!!.year.text = "${movie!!.year}"
        binding!!.genric.text = "-${movie!!.generic}"
        binding!!.length.text = "-${movie!!.length}"
        binding!!.directortext.text = " ${movie.director}"
        binding!!.description.text = movie.decp
    }
}