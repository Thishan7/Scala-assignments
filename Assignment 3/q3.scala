import scala.io.StdIn.readInt;
object q3
{
	def	sum(x:Int):Int=
	{
		if(x==1)
			return 1;
		else
		{
			x + sum(x-1);
		}
			
	}

var sumt:Int=0;
def main(args:Array[String]):Unit=
{
	println("Enter number:")
	var num:Int = readInt()
	
	println("Sum is:");
	println(sum(num));
}


}