package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente
import java.math.BigDecimal

fun main(){
    val maria = Gerente("Maria Fulano", "123.123.123.12",5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}
