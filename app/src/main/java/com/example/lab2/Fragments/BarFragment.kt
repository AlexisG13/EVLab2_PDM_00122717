package com.example.lab2.Fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lab2.R
import kotlinx.android.synthetic.main.fragment_bar.view.*


class BarFragment : Fragment() {

    var listenerTool: SearchNewListener? = null
    companion object {
        fun newInstance(): BarFragment {
            val newFragment = BarFragment()
            return newFragment
        }
    }

    interface SearchNewListener {
        fun clickSiguiente()
        fun clickAtras()

    }

    fun initButtonA(container: View) {
        container.btn_next.setOnClickListener {
            listenerTool?.clickSiguiente()
        }
    }

    fun initButtonB(container: View) {
        container.btn_prev.setOnClickListener {
            listenerTool?.clickAtras()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_bar, container, false)
        initButtonA(view)
        initButtonB(view)
        return view
    }


    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is SearchNewListener) {
            listenerTool = context
        } else {
            throw RuntimeException("Se necesita una implementación de  la interfaz")

        }
    }

    override fun onDetach() {
        super.onDetach()
        listenerTool = null
    }

}



