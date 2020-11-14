package com.imnstudios.newsapp.data.models

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)