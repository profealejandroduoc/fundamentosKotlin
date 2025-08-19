package com.example.fundamentoskotlin.fundamentos

fun main()
{
    var op:Int=65


    when(op) {
        1-> println("Opcion 1")
        2-> println("Opcion 2")
        3-> println("opcion 3")
    }


    var permiso:String?=null

    when(permiso){
        "admin"->println("Acceso completo")
        "usuario"-> println("Acceso sin privilegios")
        else->println("Debe logearse")
    }


    var edad:Int=65

    when{
        edad < 18 -> println("Es niño")
        edad < 60 -> println("Es adulto")
        edad <120 -> println("Tatita")
        else-> println("Se murio!!! ")
    }
}