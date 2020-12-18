fun main() {
    isPositive(10)
    println("max is ${max(10,12,11)}")
    println("absolute value is "+abs(-5))
    divbyfivelev(145)
    println(triangle(22,10,10))
    isalph('9')
}

fun isPositive(num: Int){
    if(num > 0) println("Positive") else if (num < 0) println("Negative") else println("zero")
}

fun max(a: Int, b: Int, c: Int) = if (a>b) if (a>c) a else c else if (b>c) b else c
fun abs (a: Int) = if(a>0) a else -a
fun divbyfivelev(a: Int){
   if(a%155 == 0) println("$a is divisible by 5 and 11") else println("$a is not divisible by 5 and 11") 
}
fun triangle(a: Int,b: Int,c: Int): String{
    if(a+b>c && b+c>a && a+c>b)
    if(a==b && a==c) return "Equilateral" else if (a==b || a==c || b==c) return "Isoceles" else return "Scalene"
    else return "Not a triangle"
}
fun isalph(a: Char){
    if (a in 'a'..'z' || a in 'A'..'Z') println("Alphabet")
    else println("Not Alphabet")
}
