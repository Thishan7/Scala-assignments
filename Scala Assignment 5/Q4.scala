class Account (n:Int, id:String, b:Double) {
  val nic = id
  val accountNo = n
  var balance = b

  def transfer(a:Account, b:Double): Unit = {
    a.balance += b
    balance -= b
  }

  override def toString = "["+accountNo+":"+nic+":"+balance+"]"
}

object question4{
def main(args: Array[String]): Unit = {
var a = new Account(96015002,"1234", 10000)
var b = new Account(96015027,"5678", 25000)	
var c = new Account(96675512,"9101",  4000)
//Q(4.1)
var bank:List[Account] = List(a, b, c)
val negativeAcc = bank.filter(_.balance < 0)
println(negativeAcc)

//Q(4.2)
val total = bank.map(x => x.balance).reduce((p, q) => p+q)
println(total)

//Q(4.3)
val interest = bank.map(x => if(x.balance >= 0) x.balance*1.05 else x.balance*1.1)
println(interest)
}
}

