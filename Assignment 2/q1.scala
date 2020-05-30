object q1{
	// whp, ot, nwh, and oth represents "Working hour payment", "OT hour pament", "Number of working hours" and "Overtime working hours" respectively.
	def FindIncome(whp:Float,ot:Float,nwh:Float,oth:Float):Float=
	{
		return (150*40 + 75*20)/100*90;
	}

def main(args: Array[String]):Unit = {
	var a =FindIncome(150f,75f,40f,20f);
	println("Total income =>");
	println(s"$a");
}
}