package pers.strategy;

import java.util.Comparator;

public class PriceComparator implements Comparator<ProductInfo> {

	public PriceComparator()
	{
		
	}
	
	@Override
	public int compare(ProductInfo p1, ProductInfo p2) {
		// TODO Auto-generated method stub
		Double name1 = new Double(p1.getP_Price());
		Double name2 = new Double(p2.getP_Price());
		return name1.compareTo((double)name2);
	}

}
