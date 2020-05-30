//print all prime numbers
import scala.io.StdIn.readInt;
object q22{

def primeNum(num:Int,i:Int):Boolean =
	{
		if(i==1)
			return true;
		if(num%i == 0)
			return false;
		else
			primeNum(num,(i-1));

	}


def check(x:Int)
{
	if(primeNum(x,x/2)&&x>1)
	{println(x)}
	if(x>2)
	check(x-1)
}


def main(args: Array[String]):Unit = {
println("Enter number =>")
var num:Int = readInt()
check(num-1);
}
}