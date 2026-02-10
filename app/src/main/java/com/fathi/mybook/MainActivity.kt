package com.fathi.mybook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var cpBook: RecyclerView
    private var list: ArrayList<Book> = arrayListOf()
    private var title: String = "My Favorite Book"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        cpBook = findViewById(R.id.best_book)
        cpBook.setHasFixedSize(true)

        list.addAll(BookData.listData)
        showRecyclerCardView()
    }


    private fun showRecyclerCardView() {
        cpBook.layoutManager = LinearLayoutManager(this)
        val cardViewBookAdapter = CardViewBookAdapter(list, this)
        cpBook.adapter = cardViewBookAdapter
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

}