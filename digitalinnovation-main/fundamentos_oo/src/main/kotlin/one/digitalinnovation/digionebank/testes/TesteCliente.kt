package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    val mario = Cliente(
        nome = "Mario Fulano",
        cpf= "123.123.123.12",
        clienteTipo = ClienteTipo.PF,
        senha ="123456"
    )
    println(mario)

    TesteAutenticacao().autentica(mario)
}