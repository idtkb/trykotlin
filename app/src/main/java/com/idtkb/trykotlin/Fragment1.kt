package com.idtkb.trykotlin

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_fragment1.*

class Fragment1 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_fragment1, container, false)
    }

    override fun onStart() {
        super.onStart()
        fragment2Button?.setOnClickListener {
            fragmentManager.beginTransaction()
                    .replace(R.id.containerFrameLayout, Fragment2.newInstance())
                    .commit()
        }
    }

    companion object {
        fun newInstance(): Fragment1 {
            val fragment = Fragment1()
            return fragment
        }
    }
}
