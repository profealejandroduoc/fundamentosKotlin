package com.example.fundamentoskotlin.fundamentos

fun main(){
    val setAnimales=mutableSetOf<String>("Perro","Gato","Elefante")
    setAnimales.add("Ñu")
    setAnimales.add("Jirafa")
    setAnimales.add("Perro")


    println(setAnimales)
}