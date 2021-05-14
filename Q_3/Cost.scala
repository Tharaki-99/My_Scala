
object Cost extends App{
  def find_cost (c:Int):Double={
    var x:Double=0
    if(c>=50){
    x=24.95*60/100*c+3*50+(c-50)*0.75
    return x
    }
    else {
    x=24.95*60/100*c+3*c
    return x
    }
  }
  println (find_cost(60));
}
