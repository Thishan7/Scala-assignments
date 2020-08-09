import scala.math.sqrt
case class point (a:Int , b:Int)
{
def x:Int=a
def y:Int=b
def z:Int=1
def move(dx:Int,dy:Int)=point(this.x+dx,this.y+dy)
def add(p1:point)=point(this.x+p1.x,this.y+p1.y)
def distance(p1:point)=sqrt(((this.x-p1.x)*(this.x-p1.x))+((this.y-p1.y)*(this.y-p1.y)))
def invert()=point(this.y,this.x)
}

object App1
{
	 def main(args: Array[String]) : Unit =
    { 
    	
	val point1 = point(2,3);
	/**val point2 = point(5,10);*/
	val point2 = point1.move(2,4);
	val point3 = point1.add(point2);
	val distance = point1.distance(point2);
	val point5= point1.invert();
	println("sample point");
	println(point1);
	println("Moving point 1 by (2,4) coordinates (point 2):")
	println(point2);
	println("Add point (5,10) to point 1 (point3):")
	println(point3);
	println("distance between point1 & point2:")
	println(distance);
	println("Invertion of point1:")
	println(point5);
    }


} 
