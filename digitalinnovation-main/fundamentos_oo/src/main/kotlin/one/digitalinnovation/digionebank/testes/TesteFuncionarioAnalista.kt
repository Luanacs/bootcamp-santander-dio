package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main(){
    val joao = Analista("Joao Fulano", "123.123.123.12",2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)

}
