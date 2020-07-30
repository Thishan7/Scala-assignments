class Rational( p:Int,q:Int) {
  def number =  p
  def Dnom = q
  def neg = new Rational(-this.number, this.Dnom)

  def sub(r:Rational) = new Rational(this.number*r.Dnom - this.Dnom*r.number, this.Dnom*r.Dnom)

 override def toString = number +  "/" + Dnom
}

object test5{
def main(args: Array[String]): Unit = {
val p = new Rational(5, 4)

println(p.neg)
}
}
