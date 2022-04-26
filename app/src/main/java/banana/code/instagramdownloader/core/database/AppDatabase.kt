package banana.code.instagramdownloader.core.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Post::class], version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract fun getPostDao(): PostDao

    companion object{
        lateinit var instance: AppDatabase
        private val DB_NAME = "downloader_database"

        fun initDatabase(context: Context){
            instance = Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                DB_NAME
            ).build()
        }
    }

}