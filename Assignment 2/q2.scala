/* If ticket price increase by 5, audiance decrease by 20
If ticket price decrease by 5, audiance increase by 20
seems like a Leniar equation, so Rs1 will affect for 4 people in audiance
increasing ticket price for 45 rupeese will affects for no audiance. so the maximum ticket price is 44 rupeese.*/

object q2
{
		def Income(TicketPrice:Float, Audiance:Float, Cost:Float,HallFee: Float ):Float =
		{
			return (TicketPrice*Audiance)-(Audiance*Cost)-HallFee;
		}


	def main(args: Array[String]):Unit =
	{
			var TicketPrice:Float =44f;
			var Audiance:Float = 4f;
			var maxIncome:Float = 0;
			var maxTicket:Float = 0;
			var a:Float =0;
		while(TicketPrice > 0)
		{
			a = Income(TicketPrice,Audiance,3f,500f);
			if(a > maxIncome)
			{
				maxIncome = a;
				maxTicket =	TicketPrice;	
			}
			TicketPrice=TicketPrice-1;
			Audiance=Audiance+4;
				
		}
		println(s"Max ticket is:$maxTicket");
		println(s"Max income is:$maxIncome")
	}
}