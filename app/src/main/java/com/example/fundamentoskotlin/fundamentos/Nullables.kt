package com.example.fundamentoskotlin.fundamentos

fun main(){
    var nombre="Wacoldo"
    var asignatura:String?=null

    //asignatura="DSY1105"

    if(asignatura==null){
        println("$nombre no tiene asignaturas asignadas")
    }else
    {
        println("$nombre cursa $asignatura")
    }

    var numero:Int?=5
    var resultado=numero!!+10 //Esto puede detener el programa si es null

    println(resultado)

    var num:Int?=2
    var res= num?.plus(10) //esto devuelve el resultado o null
    println(res)

}