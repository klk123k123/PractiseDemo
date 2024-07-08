package Java8;

public class MoneyReward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
GooglePay g=new GooglePay();
g.doTransaction();
g.addCoupon();
Payment.TransactionReport();
PhonePay p=new PhonePay();
p.doTransaction();
p.addCoupon();
Payment.TransactionReport();
	}

}
