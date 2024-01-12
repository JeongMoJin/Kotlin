class Calculator {
    var result : Int = 0
        set(value) {
            field = value
            println("중간 계산 값 : " + field)
        }

    fun sum(inputNumber : Int) {
        result += inputNumber
    }
    fun minus(inputNumber: Int) {
        result -= inputNumber
    }
    fun multiply(inputNumber: Int) {
        result *= inputNumber
    }
    fun divide(inputNumber: Int) {
        result /= inputNumber
    }
}
//val calculator1 = Calculator()
//calculator1.sum(10)
//calculator1.divide(2)
//calculator1.multiply(3)

class Calculator2 constructor(val initialValue: Int = 0) {
    var result : Int
    init {
        this.result = initialValue
    }

    fun calculate(function: Char, inputNumber: Int) {
        when(function) {
            '+'-> this.result += inputNumber
            '-'-> this.result -= inputNumber
            '*'-> this.result *= inputNumber
            '/'-> this.result /= inputNumber
            else -> println("잘못된 연산 입니다")
        }
    }
}
val calculator2 = Calculator2(10)
calculator2.calculate('+',10)
println(calculator2.result)