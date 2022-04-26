package banana.code.instagramdownloader.core.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "posts")
data class Post(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
)
