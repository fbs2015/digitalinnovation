package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
/*    val p1 = Pessoa("FBS", "999.999.999-77")
    println(p1.nome)
    println(p1.cpf)
*/
    val f1 = Funcionario("FBS", "999.999.999-77", BigDecimal.valueOf(3000))
    println(f1.nome)
    println(f1.cpf)
    println(f1.salario)
}