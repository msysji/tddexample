package money;

class Money {
	
	protected int amount;

	public Money() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
				&& getClass().equals(money.getClass());
	}
}
