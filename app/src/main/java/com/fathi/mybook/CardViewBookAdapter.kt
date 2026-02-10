package com.fathi.mybook

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewBookAdapter(private val listBooks: ArrayList<Book>, val context: Context) : RecyclerView.Adapter<CardViewBookAdapter.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.cardview_book, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val book = listBooks[position]

        holder.itemView.setOnClickListener{
            val getData = listBooks.get(position)
            val DetailName: String = getData.title
            val DetailDesc: String = getData.detail
            val DetailPhoto: Int = getData.psd

            val moveToDetail = Intent(context,DetailActivity::class.java)
            moveToDetail.putExtra("bName", "DetailName")
            moveToDetail.putExtra("bDetail", "DetailDesc")
            moveToDetail.putExtra("bPhoto", "DetailPhoto")
            context.startActivity(moveToDetail)
        }

        Glide.with(holder.itemView.context)
            .load(book.psd)
            .apply(RequestOptions().override(55, 55))
            .into(holder.coupleBook)
        holder.fathiAnnaqi.text = book.title
        holder.annisaSakinah.text = book.detail

    }

    override fun getItemCount(): Int {
        return listBooks.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var coupleBook: ImageView = itemView.findViewById(R.id.photo_book)
        var fathiAnnaqi: TextView = itemView.findViewById(R.id.book_title)
        var annisaSakinah: TextView = itemView.findViewById(R.id.book_detail)
        var btnShare: Button = itemView.findViewById(R.id.action_share)


    }



}