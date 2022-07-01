package one.digitalinnovation.digionebank

class Pessoa{
    var nome: String = "Luana"
    var cpf: String = "123.123.123.11"
    private set
}
fun main(){
    val luana = Pessoa()

    println(luana.nome)
    println(luana.cpf)

}
