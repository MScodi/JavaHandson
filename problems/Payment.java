package problems;

public class Payment {
	private int paymentID;
	private String paymentType;
	private int amount;
	private String Status;
	public Payment() {
		// TODO Auto-generated constructor stub
	}
	public Payment(int paymentID, String paymentType, int amount, String status) {
		super();
		this.paymentID = paymentID;
		this.paymentType = paymentType;
		this.amount = amount;
		Status = status;
	}
	public int getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "\n Payment [paymentID=" + paymentID + ", paymentType=" + paymentType + ", amount=" + amount + ", Status="
				+ Status + "]";
	}
	
	
	

}