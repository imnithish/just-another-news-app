package com.imnstudios.newsapp.data.repositories

import com.imnstudios.newsapp.data.db.ArticleDatabase
import com.imnstudios.newsapp.data.models.Article
import com.imnstudios.newsapp.network.RetrofitInstance

class NewsRepository(
    private val db: ArticleDatabase
) {

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}