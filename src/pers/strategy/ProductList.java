package pers.strategy;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
	
	static List<ProductInfo> productList;
	
	public void init()
	{
		productList = new ArrayList<ProductInfo>();
		
		ItemBean i1 = new ItemBean(3626, 300, 90);
		ProductInfo p1 = new ProductInfo("C++习题集", 100, "Images//000001.png");
		p1.setItem(i1);
		productList.add(p1);
		
		ItemBean i2 = new ItemBean(1119, 400, 70);
		ProductInfo p2 = new ProductInfo("Java开发实例", 120, "Images//000002.png");
		p2.setItem(i2);
		productList.add(p2);
		
		ItemBean i3 = new ItemBean(638, 80, 70);
		ProductInfo p3 = new ProductInfo("python教程", 120, "Images//000003.png");
		p3.setItem(i3);
		productList.add(p3);
		
		ItemBean i4 = new ItemBean(863, 80, 70);
		ProductInfo p4 = new ProductInfo("大数据时代", 150, "Images//000004.png");
		p4.setItem(i4);
		productList.add(p4);
	}
	
	public List<ProductInfo> getProductList()
	{
		return productList;
	}
	
	public void setProductList(List<ProductInfo> productList)
	{
		ProductList.productList = productList;
	}
}
