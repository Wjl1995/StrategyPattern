package pers.strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductSort {

	public static List<ProductInfo> sort(List<ProductInfo> productList, Comparator<ProductInfo> c)
	{
		Collections.sort(productList, c);
		return productList;
	}
}
