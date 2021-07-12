package one.digitalinnovation.digionebank

class Pessoa {
    var nome : String = "Fernando"
    var cpf : String = "999.999.999-77"
}

fun main(){
    val p1 = Pessoa()
    println(p1.nome)
    println(p1.cpf)
}