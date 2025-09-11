fun main(){
    println("Enter Your Age")
    val age=readLine()!!.toInt()

    if(age>=18){
        println("Adult")
    }
    else if(age>=10  && age<18){
        println("Teenager")
    }
    else if(age>=5 &&  age<10){
        println("Child")
    }
    else{
        println("Chhoti bachhi ho kya!")
    }
    
    val condition=if(age>=18)"Adult"else if(age>=10  && age<18)"Child" else if(age>=5 &&  age<10)"Child"else"Chhoti bachhi ho kya!";
     println(condition)
}