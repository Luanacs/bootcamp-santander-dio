package one.digitalinnovation.digionebank

class Pessoa{
    var nome: String = "Luana"
    var cpf: String = "123.123.123.11"
    private set

    constructor()

    fun pessoaInfo()= "$nome e $cpf"
}
fun main(){
    val luana = Pessoa()
    println(luana.pessoaInfo())
}
