package pers.strategy;

import java.util.Comparator;

public class CreditComparator implements Comparator<ProductInfo> {

	public CreditComparator()
	{
		
	}
	
	@Override
	public int compare(ProductInfo p1, ProductInfo p2) {
		// TODO Auto-generated method stub
		Integer name1 = new Integer(p1.getItem().getCredit());
		Integer name2 = new Integer(p2.getItem().getCredit());
		return name1.compareTo((int)name2);
	}

}
