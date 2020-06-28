package com.mohameddevo.newsworld.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.mohameddevo.newsworld.R
import com.mohameddevo.newsworld.ui.NewsActivity
import com.mohameddevo.newsworld.ui.NewsViewModel

class ArticleFragment: Fragment(R.layout.fragment_article) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }
}