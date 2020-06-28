package com.mohameddevo.newsworld.db

import android.content.Context
import androidx.room.*
import com.mohameddevo.newsworld.models.Article

@Database(
    entities = [Article::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class ArticlesDatabase : RoomDatabase() {
    abstract fun getArticlesDao(): ArticleDao

    companion object {
        @Volatile
        private var instance: ArticlesDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabase(context).also { instance = it }
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                ArticlesDatabase::class.java,
                "article_db.db"
            ).build()


    }
}