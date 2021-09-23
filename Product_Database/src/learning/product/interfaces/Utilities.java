package learning.product.interfaces;

public interface Utilities {
	public void AddProduct(int newID, String newName);
	public void DeleteProduct(int targetID);
	public String FindProductName(int targetID);
	public void PrintProducts();
}
