package com.example.lab2.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lab2.R

class ContentFr4agment : Fragment() {

    companion object {
        fun newInstance(id: Int): ContentFr4agment {
            val newFragment = ContentFr4agment()
            return newFragment
        }
    }

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_content_fr4agment, container, false)
        return view
    }


}
