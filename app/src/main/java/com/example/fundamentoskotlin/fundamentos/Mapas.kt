package com.example.fundamentoskotlin.fundamentos

fun main(){
    val mapAnimales=mutableMapOf(
        1 to "Gato",
        2 to "Perro",
        3 to "Narval"
    )

    println(mapAnimales[2])

    mapAnimales.put(4,"Ornitorrinco")
    mapAnimales[5]="Cocodrilo"
    println(mapAnimales)

    for(ani in mapAnimales){
        //println(ani.key)
        println(ani.value)
    }

    val mapPersona=mapOf(
        "12345678-9" to "Wacoldo",
        "45678912-3" to "Diogenes",
        "98786543-6" to "Wenceslao"
    )

    println(mapPersona["98786543-6"])


}