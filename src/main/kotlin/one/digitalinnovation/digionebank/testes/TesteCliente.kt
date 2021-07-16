package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
        val fbs = Cliente("FBS", "999.999.999-77", ClienteTipo.PF, "123456")
        println(fbs.toString())
        TesteAutenticacao().autentica(fbs)
}
