package com.idtkb.trykotlin

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_fragment2.*

class Fragment2 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_fragment2, container, false)
    }

    override fun onStart() {
        super.onStart()
        fragment1Button?.setOnClickListener {
            fragmentManager.beginTransaction()
                    .replace(R.id.containerFrameLayout, Fragment1.newInstance())
                    .commit()
        }
    }

    companion object {
        fun newInstance(): Fragment2 {
            val fragment = Fragment2()
            return fragment
        }
    }
}