package fizzbuzz_when

fun main(args: Array<String>) {
    val n = 20

    for (i in 1..n) {
        println(fizzBuzz2(i))
    }
}

// 冗長に書いたパターン
fun fizzBuzz1(i: Int): String {
    val result: String

    when {
        i % 15 == 0 -> {
            result = "FizzBuzz"
        }
        i % 3 == 0 -> {
            result = "Fizz"
        }
        i % 5 == 0 -> {
            result = "Buzz"
        }
        else -> {
            result = "$i"
        }
    }

    return result
}

// returnの戻り値にするパターン
fun fizzBuzz2(i: Int): String {
    return when {
        i % 15 == 0 -> {
            "FizzBuzz"
        }
        i % 3 == 0 -> {
            "Fizz"
        }
        i % 5 == 0 -> {
            "Buzz"
        }
        else -> {
            "$i"
        }
    }
}