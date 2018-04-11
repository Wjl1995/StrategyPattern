package pers.strategy;

import java.util.Comparator;

public class SaleComparator implements Comparator<ProductInfo> {

	public SaleComparator()
	{
		
	}
	
	@Override
	public int compare(ProductInfo p1, ProductInfo p2) {
		// TODO Auto-generated method stub
		Integer name1 = new Integer(p1.getItem().getSale());
		Integer name2 = new Integer(p2.getItem().getSale());
		return name1.compareTo((int)name2);
	}

}
