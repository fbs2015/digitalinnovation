package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente
import java.math.BigDecimal

fun main(){
    val g1 = Gerente("Fernando", "999.999.999-77", BigDecimal.valueOf(5000), "senha123")

    ImprimeRelatorioFuncionario.imprime(g1)

    TesteAutenticacao().autentica(g1)
}