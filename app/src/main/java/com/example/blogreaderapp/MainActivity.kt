package com.example.blogreaderapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.blogreaderapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvArticle.layoutManager = LinearLayoutManager(this)
        displayInfo()

    }
    fun displayInfo(){
        val articles  = Article("Jane","John","born a crime","1 June 2024","View More")
        val articles2 = Article("Jane","John","born a crime","1 June 2024","View More")
        val articles3 = Article("Jane","John","born a crime","1 June 2024","View More")
        val articles4 = Article("Jane","John","born a crime","1 June 2024","View More")
        val articles5 = Article("Jane","John","born a crime","1 June 2024","View More")
        val articles6 = Article("Jane","John","born a crime","1 June 2024","View More")
        val articles7 = Article("Jane","John","born a crime","1 June 2024","View More")
        val articles8 = Article("Jane","John","born a crime","1 June 2024","View More")


        var articleList = listOf(articles,articles2,articles3,articles4,articles5,articles6,articles7,articles8)
        var ArticleAdapter = ArticleAdapter(articleList)
        binding.rvArticle.adapter=ArticleAdapter
    }

}