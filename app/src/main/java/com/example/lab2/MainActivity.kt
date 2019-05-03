package com.example.lab2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.lab2.Fragments.BarFragment
import com.example.lab2.Fragments.ContentFr4agment

class MainActivity : AppCompatActivity(), BarFragment.SearchNewListener {

    private lateinit var mainBotonesFragment: BarFragment
    private lateinit var colorFragment: ContentFr4agment
    private var listaColores: ArrayList<Int> = ArrayList()
    private var contador= 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        llenarLista()
        iniciarFragmento()
    }

    private fun iniciarFragmento(){
        mainBotonesFragment= BarFragment.newInstance()
        changeFragment(R.id.botonesFragment, mainBotonesFragment)
        colorFragment = ContentFr4agment.newInstance(0)
        changeFragment(R.id.imagenFragment, colorFragment)
    }

    private fun changeFragment(id: Int, frag: Fragment) {
        supportFragmentManager.beginTransaction().replace(id, frag).commit()
    }

    override fun clickSiguiente() {
        if(listaColores.size>contador+1) {
            colorFragment = ContentFr4agment.newInstance( 1)
            contador++
            changeFragment(R.id.imagenFragment, colorFragment)
        }else{
            colorFragment = ContentFr4agment.newInstance(0)
            contador=0
            changeFragment(R.id.imagenFragment, colorFragment)
        }
    }

    override fun clickAtras() {
        if(contador-1>=0) {
            colorFragment = ContentFr4agment.newInstance(0)
            contador--
            changeFragment(R.id.imagenFragment, colorFragment)
        }else{
            colorFragment = ContentFr4agment.newInstance(0)
            contador=listaColores.size-1
            changeFragment(R.id.imagenFragment, colorFragment)
        }
    }

    fun llenarLista() {
        listaColores.add(1)
    }


}
