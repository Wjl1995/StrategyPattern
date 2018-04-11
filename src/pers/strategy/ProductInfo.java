package pers.strategy;

public class ProductInfo {

	private String pName;
	private double p_Price;
	private String pic_Path;
	private int pMount;
	private ItemBean item;
	
	public ProductInfo()
	{
	}
	public ProductInfo(String pName, double p_Price, String pic_Path)
	{
		this.pName = pName;
		this.p_Price = p_Price;
		this.pic_Path = pic_Path;
	}
	
	public String getPName() {
		return pName;
	}
	public void setPName(String pName) {
		this.pName = pName;
	}
	public double getP_Price() {
		return p_Price;
	}
	public void setP_Price(double p_Price) {
		this.p_Price = p_Price;
	}
	public String getPic_Path() {
		return pic_Path;
	}
	public void setPic_Path(String pic_Path) {
		this.pic_Path = pic_Path;
	}
	public int getPMount() {
		return pMount;
	}
	public void setPMount(int pMount) {
		this.pMount = pMount;
	}
	public ItemBean getItem() {
		return item;
	}
	public void setItem(ItemBean item) {
		this.item = item;
	}
}
