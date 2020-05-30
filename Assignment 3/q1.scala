
import scala.io.StdIn.readInt;
object q1{
	def primeNum(num:Int,i:Int):Boolean =
	{
		if(i==1)
			return true;
		if(num%i == 0)
			return false;
		else
			primeNum(num,(i-1));

	}

	def main(args: Array[String]):Unit = {
		println("Enter number =>")
	var number:Int = readInt()
	println(primeNum(number,number/2));
	
	}
}