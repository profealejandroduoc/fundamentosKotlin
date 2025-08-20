package com.example.fundamentoskotlin.fundamentos

fun main(){

    var x=0
    while (x<=5){
        println("While!!!")
        x++
    }

    val lista=listOf("Wacoldo","Diogenes","Ladislao","Ermeregildo")

    println(lista.size) //Tip para obtener el largo de la lista
    var indice:Int=0

    do {
        println(lista[indice])
        indice++
    }while(indice<lista.size)
}