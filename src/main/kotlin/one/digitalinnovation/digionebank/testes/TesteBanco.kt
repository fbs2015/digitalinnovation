package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco("DigiOne", 12)

    println(digiOneBank.info())

    val banco2 = digiOneBank.copy(nome = "Banco2")

    println(banco2.nome)
    println(banco2.numero)
}