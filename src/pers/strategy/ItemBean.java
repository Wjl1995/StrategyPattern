package pers.strategy;


public class ItemBean {

	private int sale;
	private int popular;
	private int credit;
	
	public ItemBean(int sale, int popular, int credit)
	{
		this.sale = sale;
		this.popular = popular;
		this.credit = credit;
	}
	
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	public int getPopular() {
		return popular;
	}
	public void setPopular(int popular) {
		this.popular = popular;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
}
