package com.example.dev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.UserData
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dev.Adapters.UserAdapter

class MainActivity : AppCompatActivity() {
    val data = ArrayList<UserData>()

    private lateinit var adapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listImage = listOf<Int>(
            R.drawable.instagram,
            R.drawable.instagram,
            R.drawable.instagram,
            R.drawable.instagram

        )
        val listText_1 = listOf<String>(
            "Telegram",
            "Telegram",
            "Telegram",
            "Telegram"
        )
        val lisText_2 = listOf<String>(
            "srvsrv",
            "srvsrv",
            "srvsrv",
            "srvsrv"
        )
        (0..lisText_2.size-1).forEach {i->
            data.add(UserData(listImage[i]!!,listText_1[i]!!,lisText_2[i]!!))

        }
        val recyclerView :RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = UserAdapter(data)
        recyclerView.adapter = adapter
    }
}