package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Gerente(
    nome: String,
    cpf: String,
    salario: BigDecimal,
    val senha : String
) : Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel{

    override fun calculoAuxilio(): BigDecimal {
        return salario * BigDecimal.valueOf(0.4)
    }

    override fun login(): Boolean = "senha123" == senha
}