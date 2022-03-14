package basic

fun main() {
    var a = 7
    if (a > 10) {
        println("a는 10보다 크다")
    } else {
        println("a는 10보다 작다")
    }

    if (a is Int) {
        println("a는 Int형입니다.")
    }


    var iValue = 1
    doWhen(iValue)

    var strValue = "Kotlin"
    doWhen(strValue)

    var lValue = 3L
    doWhen(lValue)

    var fValue = 1.3
    doWhen(fValue)

    var strValue2 = "Seokee"
    doWhen(strValue2)
}

//when exam1
fun doWhen(a: Any) {
    when (a) {
        1 -> println("정수 1입니다.")
        "Kotlin" -> println("Kotlin 입니다.")
        is Long -> println("Long 타입 입니다.")
        !is String -> println("String 타입이 아닙니다.")
        else -> println("어떤 조건도 만족하지 않습니다.")
    }
}

//when exam2
fun doWhen2(a: Any) {
    var result = when (a) {
        1 -> println("정수 1입니다.")
        "Kotlin" -> println("Kotlin 입니다.")
        is Long -> println("Long 타입 입니다.")
        !is String -> println("String 타입이 아닙니다.")
        else -> println("어떤 조건도 만족하지 않습니다.")
    }
    println(result)
}