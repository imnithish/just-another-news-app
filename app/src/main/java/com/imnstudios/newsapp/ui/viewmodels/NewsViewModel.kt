package com.imnstudios.newsapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.imnstudios.newsapp.data.repositories.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel(){


}