package one.digitalinnovation.digionebank

class Pessoa {
    var nome : String = "Fernando"
    var cpf : String = "999.999.999-77"
    private set

   //Um exemplo de inner class. Por consequencia, nesse caso, Pessoa() é uma outer class
   // inner class Endereco{
   //     var rua : String = "Ruma Minha Rua 666"
   // }
}

fun main(){
    val p1 = Pessoa()
    println(p1.nome)
    println(p1.cpf)

}