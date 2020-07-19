object test3{
def main(args: Array[String]): Unit = {

val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"


println("Enter message\n")
val str=scala.io.StdIn.readLine()
println("Enter Key value\n")
val keyval=scala.io.StdIn.readInt()

val ct=cipher(E,str,keyval,alphabet)
val pt=cipher(D,ct,keyval,alphabet)
println(ct)
println(pt)
}

val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
val D=(c:Char,key:Int,a:String)=> a((a.size+(a.indexOf(c.toUpper)-key))%a.size)
val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

}
