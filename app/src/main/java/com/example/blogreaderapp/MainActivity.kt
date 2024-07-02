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
        val articles  = Article("Jane","Born A Crime","2016","Sometimes in big hollywood movies they'll have these crazy chase scenes where somebody jumps or gets thrown from a moving car.The person hits the ground and rolls for a bit. Then they come to a stop and pop up and dust themselves off, like it was no big deal.Whenever I see that I think,Thats rubbish.Getting thrown out of a moving car hurts way worse than that.","View More")
        val articles2 = Article("Jane","Born A Crime","2016","Sometimes in big hollywood movies they'll have these crazy chase scenes where somebody jumps or gets thrown from a moving car.The person hits the ground and rolls for a bit. Then they come to a stop and pop up and dust themselves off, like it was no big deal.Whenever I see that I think,Thats rubbish.Getting thrown out of a moving car hurts way worse than that.","View More")
        val articles3 = Article("Jane","Born A Crime","2016","Sometimes in big hollywood movies they'll have these crazy chase scenes where somebody jumps or gets thrown from a moving car.The person hits the ground and rolls for a bit. Then they come to a stop and pop up and dust themselves off, like it was no big deal.Whenever I see that I think,Thats rubbish.Getting thrown out of a moving car hurts way worse than that.","View More")
        val articles4 = Article("Jane","Born A Crime","2016","Sometimes in big hollywood movies they'll have these crazy chase scenes where somebody jumps or gets thrown from a moving car.The person hits the ground and rolls for a bit. Then they come to a stop and pop up and dust themselves off, like it was no big deal.Whenever I see that I think,Thats rubbish.Getting thrown out of a moving car hurts way worse than that.","View More")
        val articles5 = Article("Jane","Born A Crime","2016","Sometimes in big hollywood movies they'll have these crazy chase scenes where somebody jumps or gets thrown from a moving car.The person hits the ground and rolls for a bit. Then they come to a stop and pop up and dust themselves off, like it was no big deal.Whenever I see that I think,Thats rubbish.Getting thrown out of a moving car hurts way worse than that.","View More")
        val articles6 = Article("Jane","Born A Crime","2016","Sometimes in big hollywood movies they'll have these crazy chase scenes where somebody jumps or gets thrown from a moving car.The person hits the ground and rolls for a bit. Then they come to a stop and pop up and dust themselves off, like it was no big deal.Whenever I see that I think,Thats rubbish.Getting thrown out of a moving car hurts way worse than that.","View More")
        val articles7 = Article("Jane","Born A Crime","2016","Sometimes in big hollywood movies they'll have these crazy chase scenes where somebody jumps or gets thrown from a moving car.The person hits the ground and rolls for a bit. Then they come to a stop and pop up and dust themselves off, like it was no big deal.Whenever I see that I think,Thats rubbish.Getting thrown out of a moving car hurts way worse than that.","View More")
        val articles8 = Article("Jane","Born A Crime","2016","Sometimes in big hollywood movies they'll have these crazy chase scenes where somebody jumps or gets thrown from a moving car.The person hits the ground and rolls for a bit. Then they come to a stop and pop up and dust themselves off, like it was no big deal.Whenever I see that I think,Thats rubbish.Getting thrown out of a moving car hurts way worse than that.","View More")


        var articleList = listOf(articles,articles2,articles3,articles4,articles5,articles6,articles7,articles8)
        var ArticleAdapter = ArticleAdapter(articleList)
        binding.rvArticle.adapter=ArticleAdapter
    }

}