package com.example.fundamentoskotlin.fundamentos

fun main(){
    var edad:Int=20

    if(edad>=18)
    {
        println("Es mayor de edad")
    }else
    {
        println("Es menor de edad")
    }


    if(edad<18)
    {
        println("Es niño")

    }else if(edad<60)
    {
        println("Es adulto")
    }else if(edad<120)
    {
        println("Es tatita")
    }
    else{
        println("Se murio!!!")
    }



}