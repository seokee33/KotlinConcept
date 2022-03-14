package datatype
/*
* 함수 생성
매개변수(Parameter)만 있는 경우
fun add(a: Int, b: Int, c: Int){

}
매개변수(Parameter)와 리턴값이 있는 경우
fun add(a: Int, b: Int, c: Int): Int{
    return a+b+c
}
*
*
* */
/**
 *단일 표현식 함수
fun add2(a: Int, b: Int, c: Int) = a+b+c
*/

fun main(){
    println(add(5,6,7))
    println(add2(5,6,7))
}



fun add(a: Int, b: Int, c: Int): Int{
    return a+b+c
}

fun add2(a: Int, b: Int, c: Int) = a+b+c