fun main() {
  val digits = Digits(22,44,56)
    digits.add()
    println(digits)


    var y = isPalidrome("madam")
    println(y)



}
class Digits(var num1:Int, var num2:Int, var num3:Int){
    fun add(nums:Array<Int>):Int{
        var result = nums.sum()

    }
}
class Word(var statement: String){

}

class Sphere()






fun isPalidrome(word: String):Boolean{
    if(word.reversed()==word)
        return true
    else{
        return false
    }

}


