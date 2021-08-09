//Q4 : A recursive function to determine even and odd numbers
//Q5 : A recursive function to get the addition of all even numbers less than given n

object Q4andQ5 {
  def main(Args:Array[String]) : Unit ={
    //Check whether given number is odd or even(Q4)
    println("3 is Odd number - " + IsOdd(3))
    println("6 is odd number - " + IsOdd(6))
    println("8 is even number - " + IsEven(8))
    println("21 is even number - " + IsEven(21))
    //get the addition of all even numbers less than given n(Q5)
    SumEven(10)
  }
  
  def IsOdd(x:Int): Boolean = {
    if (x==0){
      return false
    }
    else 
      return IsEven(x-1)
  }
  
  def IsEven(x:Int): Boolean = {
    if (x==0){
      return true
    }
    else 
      return IsOdd(x-1)
  }
  
  def SumEven(n:Int,i:Int=2,result:Int=0):Any = {//recursive function for get Sum of even numbers less than n
    if(n<1){
      println("n should be greater than 0")//If user enter  zero or negative number
    }
    else if(i<n){
      if(IsEven(i)){
        return SumEven(n,i+1,result+i)
      }
      else{
        return SumEven(n,i+1,result)
      }
    }
    else{
      println("Sum of Even numbers less than "+n+" : "+result)
    }
  }
}