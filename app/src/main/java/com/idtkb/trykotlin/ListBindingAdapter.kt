package com.idtkb.trykotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.idtkb.trykotlin.databinding.BookItemBinding
import com.idtkb.trykotlin.model.Book

class ListBindingAdapter(val context: Context?, val bookShelf: BookShelf): BaseAdapter() {
    var inflater: LayoutInflater = LayoutInflater.from(context)
    val books = bookShelf

    override fun getCount(): Int {
        return books.count
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var binding: BookItemBinding?

        if (convertView == null) {
            binding = BookItemBinding.inflate(inflater, parent, false)
            binding.root.tag = binding
        } else {
            binding = convertView.tag as BookItemBinding
        }
        binding?.book = getItem(position) as Book
        return binding?.root
    }

    override fun getItem(position: Int): Any? {
        return bookShelf.bookAt(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

}