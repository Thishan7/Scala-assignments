class Rational(x:Int, y:Int) {
  def num = x
  def dom = y
  def neg = new Rational(-this.num, this.dom)

  def sub(r:Rational) = new Rational(this.num*r.dom - this.dom*r.num, this.dom*r.dom)

  override def toString = num +  "/" + dom
}

object question2{
def main(args: Array[String]): Unit = {

val x = new Rational(3, 5)
val y = new Rational(7, 9)
val z = new Rational(4, 2)
println(x.sub(y).sub(z))
}

}




