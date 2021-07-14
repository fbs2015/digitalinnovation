package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach{e -> println("${e.name} - ${e.toString()}")}
    ClienteTipo.values().forEach{e -> println(e.name + " - " + e.descricao)}

    val pf = ClienteTipo.PF
    val pj = ClienteTipo.PJ

    println(pf)
    println(pf.name)
    println(pf.descricao)
}