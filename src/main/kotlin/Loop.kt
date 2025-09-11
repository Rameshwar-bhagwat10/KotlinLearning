fun main(){
    var i=0;
//    for(element in 1 .. 50){
//        println(element)
//    }
    for(i in 10 downTo 1 step 2){
        if(i==6){
            continue;
        }
        println("$i ")
    }
}