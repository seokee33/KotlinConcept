package datatype
/*
var : 일반적으로 통용되는 변수 언제든지 읽기 쓰기가 가능함
val : 선언시에만 초기화 가능 중간에 값을 변경할 수 없음
 */


fun main(){

    //var nullValue:Int? = null //nullable 변수

    //정수형
    var iNum: Int = 123
    println("정수형\niNum : $iNum")

    //실수형
    var dNum: Double = 123.5
    var dNum2: Double = 123.5e10
    var fNum: Float = 123.5f
    println("\n실수형")
    println("dNum : $dNum")
    println("dNum2 : $dNum2")
    println("fNum : $fNum")

    //문자형
    var charValue:Char = 'a'
    var koreanCharValue:Char = '가'
    println("\n문자형")
    println("charValue : $charValue")
    println("koreanCharValue : $koreanCharValue")

    //문자열
    val stringValue = "one line string test"
    //"""???""" ???-> 줄바꿈이나 특수문자까지 그대로 문자열로 사용가능
    val multiLineStringValue = """Multiline
        string
        test"""
    println("\n문자열")
    println("stringValue : $stringValue")
    println("multiLineStringValue : $multiLineStringValue")

    //boolean
    var booleanValueTrue:Boolean = true
    var booleanValueFalse:Boolean = false
    println("\nboolean")
    println("booleanValueTrue : $booleanValueTrue")
    println("booleanValueFalse : $booleanValueFalse")
}