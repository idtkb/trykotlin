package com.idtkb.trykotlin

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.idtkb.trykotlin.model.User
import com.idtkb.trykotlin.databinding.FragmentFragment2Binding
import com.idtkb.trykotlin.model.Book
import kotlinx.android.synthetic.main.fragment_fragment2.*

class Fragment2 : Fragment() {

    private lateinit var binding: FragmentFragment2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        view?.let{ binding = FragmentFragment2Binding.bind(it) }
        val bookList = mutableListOf<Book>()
        for (i in 0..100) {
            bookList.add(Book(
                    title = "漫画 ($i)巻",
                    price = i
            ))
        }
        val bookShelf = BookShelf(books = bookList)
        list_view.adapter = ListBindingAdapter(context, bookShelf)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate<FragmentFragment2Binding>(inflater, R.layout.fragment_fragment2, container, false)
        val user = User("Test", "User")
        binding.user = user
        binding.activity = this

        return binding.root
    }

    override fun onStart() {
        super.onStart()
    }


    fun send(view: View) {
        fragmentManager?.run {
            beginTransaction()
                    .replace(R.id.containerFrameLayout, Fragment1.newInstance())
                    .commit()
        }
    }

    companion object {
        fun newInstance(): Fragment2= Fragment2()
    }
}