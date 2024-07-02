package com.example.blogreaderapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.core.view.WindowInsetsCompat.Type
import androidx.recyclerview.widget.RecyclerView

class ArticleAdapter (val articleList:List<Article>): RecyclerView.Adapter<ArticleViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.article_list_item,parent,false)
        return ArticleViewHolder((itemView))
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = articleList[position]
        holder.tvPublishedDate.text = article.publishDate
        holder.tvAuther.text = article.auther
        holder.Link .text=article.link
        holder.tvTitle.text = article.title
        holder.AriclePreview.text=article.articlePreview
    }

    override fun getItemCount(): Int {
        return articleList.size
    }
}
class ArticleViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView){
        var tvAuther = itemView.findViewById<TextView>(R.id.tvAuthor)
        var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        var tvPublishedDate = itemView.findViewById<TextView>(R.id.tvPublishDate)
        var AriclePreview = itemView.findViewById<TextView>(R.id.tvArticlePreview)
        var Link = itemView.findViewById<TextView>(R.id.tvLink)
    }