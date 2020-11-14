package com.imnstudios.newsapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.imnstudios.newsapp.R
import com.imnstudios.newsapp.ui.MainActivity
import com.imnstudios.newsapp.ui.viewmodels.NewsViewModel

class ArticleFragment : Fragment(R.layout.fragment_article){

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = (activity as MainActivity).viewModel


    }
}