package banana.code.instagramdownloader.ui

import android.app.Application
import banana.code.instagramdownloader.core.database.AppDatabase

class MyApp: Application() {

    override fun onCreate() {
        super.onCreate()
        AppDatabase.initDatabase(this)
    }

}