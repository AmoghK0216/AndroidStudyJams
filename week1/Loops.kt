fun main(){
    var a = 5
    println("$a! = ${factorial(a)}")
    sumOfFactorials(a)
    sumofeven(10)
    pyramid(4)
    Armstrong(153)
}

fun factorial(a: Int): Int{
    var fac = 1
    for(i in a downTo 1){
        fac *= i
    }
    return fac
}
fun sumOfFactorials(a: Int){
    var sof = 0
    for(i in 1..a){
        sof += factorial(i)
    }
    println("Sum of Factorials is $sof")
}
fun sumofeven(a: Int){
    var soe = 0
    for(i in 0..a step 2){
        soe += i
    }
    println("Sum of even numbers is $soe")
}
fun pyramid(a: Int){
    for(i in 1..a){
        for(j in 1..i){
            print("#")
        }
        println()
    }
}
fun Armstrong(a: Int){
    var b = 0
    var num = a
    var sum = 0
    while(num/10 != 0){
        b = num%10
        sum += (b*b*b)
    	num = num/10
    }
    b = num
    sum += (b*b*b)
    if(sum == a) println("Armstrong number")
    else println("Not Armstrong number")
}
