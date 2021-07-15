package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import one.digitalinnovation.digionebank.testes.ImprimeRelatorioFuncionario
import java.math.BigDecimal

fun main() {

    val f1 = Analista("FBS", "999.999.999-77", BigDecimal.valueOf(3000))

    ImprimeRelatorioFuncionario.imprime(f1)
}
