package pers.strategy;

import java.util.Comparator;

public class PopComparator implements Comparator<ProductInfo> {

	public PopComparator()
	{
		
	}
	
	@Override
	public int compare(ProductInfo p1, ProductInfo p2) {
		// TODO Auto-generated method stub
		Integer name1 = new Integer(p1.getItem().getPopular());
		Integer name2 = new Integer(p2.getItem().getPopular());
		return name1.compareTo((int)name2);
	}

}
