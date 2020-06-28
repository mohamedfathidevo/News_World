package com.mohameddevo.newsworld.ui

import androidx.lifecycle.ViewModel
import com.mohameddevo.newsworld.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}