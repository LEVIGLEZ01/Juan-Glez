package com.lewis23.productos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var listaProductos: MutableList<dtProductos> = mutableListOf()
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listaProductos.add(
            dtProductos("1","Galletas","$14.00","$8.75"))
        listaProductos.add(
            dtProductos("2", "Jugos", "$14", "$10"))
        listaProductos.add(
            dtProductos("3", "Sabritas", "$14", "$10"))
        listaProductos.add(
            dtProductos("4", "Desodorante", "$14", "$10"))
        listaProductos.add(
            dtProductos("5", "Cepillos", "$14", "$10"))
        listaProductos.add(
            dtProductos("6", "Pasta", "$14", "$10"))
        listaProductos.add(
            dtProductos("7", "Gel", "$14", "$10"))
        listaProductos.add(
            dtProductos("8", "Crema", "$14", "$10"))
        listaProductos.add(
            dtProductos("9", "Maicena", "$14", "$10"))
        listaProductos.add(
            dtProductos("10", "Libros", "$14", "$10"))
        listaProductos.add(
            dtProductos("11", "Vasos", "$14", "$10"))
        listaProductos.add(
            dtProductos("12", "Sopas", "$14", "$10"))
        listaProductos.add(
            dtProductos("13", "Gasas", "$14", "$10"))
        listaProductos.add(
            dtProductos("14", "Pizzas", "$14", "$10"))
        listaProductos.add(
            dtProductos("15", "Tortilla", "$14", "$10"))
        listaProductos.add(
            dtProductos("16", "Jamon", "$14", "$10"))
        listaProductos.add(
            dtProductos("17", "Queso", "$14", "$10"))
        listaProductos.add(
            dtProductos("18", "Pan", "$14", "$10"))
        listaProductos.add(
            dtProductos("19", "Crema para cabello", "$14", "$10"))
        listaProductos.add(
            dtProductos("20", "Rastrillos", "$14", "$10"))

        var tabla= findViewById<RecyclerView>(R.id.tablaProductos)
        recycler=tabla
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=ProductosAdapter(this, listaProductos)

    }
}