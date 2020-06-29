package com.mohameddevo.newsworld.repository

import com.mohameddevo.newsworld.api.RetrofitInstance
import com.mohameddevo.newsworld.db.ArticlesDatabase
import com.mohameddevo.newsworld.models.Article

class NewsRepository(
    val db: ArticlesDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticlesDao().upsert(article)

    fun getSavedNews() = db.getArticlesDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticlesDao().deleteArticles(article)
}