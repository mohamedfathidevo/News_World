package com.mohameddevo.newsworld.models

import com.mohameddevo.newsworld.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)