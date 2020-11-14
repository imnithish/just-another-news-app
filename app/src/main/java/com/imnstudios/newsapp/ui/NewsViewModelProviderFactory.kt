package com.imnstudios.newsapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.imnstudios.newsapp.data.repositories.NewsRepository
import com.imnstudios.newsapp.ui.viewmodels.NewsViewModel

class NewsViewModelProviderFactory(
    private val newsRepository: NewsRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsViewModel(newsRepository) as T
    }
}