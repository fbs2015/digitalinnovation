package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Gerente(
    nome: String,
    cpf: String,
    salario: BigDecimal
) : Funcionario(nome = nome, cpf = cpf, salario = salario){

    override fun calculoAuxilio(): BigDecimal {
        return salario * BigDecimal.valueOf(0.4)
    }
}