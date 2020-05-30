import scala.io.StdIn.readInt;
object q5 {

def addnum(x:Int):Int=
{
if(x==2)
	return 2;
else
{
	x+addnum(x-2);
}
}

def main(args: Array[String]):Unit = {
println("Enter number =>")
var num:Int = readInt()
if(num%2==0)
 println(addnum(num));
else
	println(addnum(num-1));
}
}