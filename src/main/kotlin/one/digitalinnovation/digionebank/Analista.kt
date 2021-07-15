package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Analista(
    nome : String,
    cpf : String,
    salario : BigDecimal
) : Funcionario(nome, cpf, salario) {

    override fun calculoAuxilio() = salario * BigDecimal.valueOf(0.1)
}