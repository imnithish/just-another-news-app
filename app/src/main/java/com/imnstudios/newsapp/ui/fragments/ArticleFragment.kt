package com.imnstudios.newsapp.ui.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import com.imnstudios.newsapp.R
import com.imnstudios.newsapp.ui.MainActivity
import com.imnstudios.newsapp.ui.viewmodels.NewsViewModel
import kotlinx.android.synthetic.main.fragment_article.*

class ArticleFragment : Fragment(R.layout.fragment_article) {

    lateinit var viewModel: NewsViewModel
    private val args: ArticleFragmentArgs by navArgs()

    @SuppressLint("SetJavaScriptEnabled")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel

        val article = args.article
        webView?.apply {
            webViewClient = WebViewClient()
            loadUrl(article.url)
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
        }

        fab.setOnClickListener {
            viewModel.saveArticle(article)
            Snackbar.make(it, "Article Saved!", Snackbar.LENGTH_SHORT).show()
        }
    }
}