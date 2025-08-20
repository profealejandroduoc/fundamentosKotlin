package com.example.fundamentoskotlin.fundamentos

import android.os.Build
import androidx.annotation.RequiresApi


fun main(){
    val lista=listOf("Wacoldo","Diogenes",true,50)
    println(lista[1])
    println(lista.get(2))

    val listaStrings=listOf<String>("Hola","Chao","Kotlin","Soabachele","hagaargo")
    println(listaStrings[3])
    println("Indice de Chao:" + listaStrings.indexOf("Chao"))
    println(listaStrings.subList(3,5))
    println(listaStrings.last())
    println(listaStrings.first())



    val listaNumeros=listOf<Int>(1,2,43,5,75,5,67,7)
    println(listaNumeros)

    var animales=mutableListOf<String>("Gato","Perro","Manati")
    println(animales)
    animales.add("Narval")
    println(animales)
    animales.removeAt(0)
    println(animales)
}