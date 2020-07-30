class Account(n:Int, id:String, b:Double) {
  val nic = id
  val accountno = n
  var balance = b

  def transfer(a:Account, b:Double): Unit = {
    a.balance += b
    balance -= b
  }

  override def toString = "["+accountno+":"+nic+":"+balance+"]"
}

object question3{
def main(args: Array[String]): Unit = {

var a = new Account(96015002,"1234", 10000)
var b = new Account(96015027,"5678", 25000)	
b.transfer(a, 2500)
println(a.balance)
println(b.balance)
}}