import scala.io.StdIn.readInt;
object q6 {
def feb(x:Int,y:Int,z:Int)
{
	if((y+z)>x)
	{}
	else
	{
println(y+z);
feb(x,z,y+z)
	}	
}


def main(args: Array[String]):Unit = {
println("Enter number =>")
var a:Int=0;
var b:Int=1;

var num:Int = readInt()
println(a);
println(b);
feb(num,a,b);
}
}
//Done with warning