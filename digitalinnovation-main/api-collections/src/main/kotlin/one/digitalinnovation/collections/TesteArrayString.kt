package one.digitalinnovation.collections

fun main() {
    val names = Array<String>(3){""}
    names[0]="maria"
    names[1]="zazá"
    names[2]="josé"

    for (name in names){
        println(name)
    }
    println("---------------")
    names.sort()
    names.forEach { println(it) }

    println("---------------")
    val names2= arrayOf("Maria","Zazá", "Pedro")
    names2.sort()
    names2.forEach { println(it) }
}