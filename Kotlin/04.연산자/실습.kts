// 산술연산자
val number1 : Int = 1 + 10
val number2 : Int = 2 - 10
val number3 : Int = 2 * 40
val number4 : Int = 2 / 40
val number5 : Int = 45 % 7
println(number5)
val number6 : Int = 10 * 5205 % 55 + 107 // 할당하려는 값이 타입을 알기 어려운 경우 코틀린에게 타입을 맡겨도된다

// 대입연산자
var number7 : Int = 22
println(number7)
number7 = 100
println(number7)

// 복합대입연산자
// A+=B -> A = A + B
var number8 : Int = 12
number8+=8
number8-=10
number8*=2
number8/=5
println(number8)

// 증감연산자 (++, --)
var number9 : Int = 10
println(number9++)
println(number9)

// 비교연산자
val number10 : Int = 1
val number11 : Int = 2
val result : Boolean = number10 > number11
println(result)
val result2 : Boolean = number10 == number11
println(result2)
// ===, !== -> 잘 사용하지 않는다
// - 주소값이 같은지 물어보는 연산자
// ==, !=
// - 값이 같은지 물어보는 연산자

// 논리연산자
val boolean1 : Boolean = false
val boolean2 : Boolean = true
val result4 : Boolean = boolean1 && boolean2
val result5 : Boolean = boolean1 || boolean2
println(result5)



