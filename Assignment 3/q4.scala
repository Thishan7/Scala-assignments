import scala.io.StdIn.readInt;
object q4
{

def oddeven(x:Int):Boolean=
{
		if(x-2==0)
			return true;
		else if(x-2==1)
			return false;
		oddeven(x-2)
			

}


def main(args:Array[String]):Unit=
{
	println("Enter number:")
	var num:Int = readInt()
	
if(oddeven(num))
printf("Number is even")
else
printf("Number is odd");
}

}