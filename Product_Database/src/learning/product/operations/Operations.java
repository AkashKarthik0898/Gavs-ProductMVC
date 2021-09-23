package learning.product.operations;

import java.util.List;

import learning.product.model.Product;

public class Operations {

	public static void operations(List<Product> m_vProds, PackageUtilities p)
{
	String s;
	p.AddProduct(55, "Dell");
	p.AddProduct(23, "HP");
	p.AddProduct(91, "Samsung");
	p.AddProduct(45, "MAC");
	p.PrintProducts();
	s = p.FindProductName(23);
	System.out.println(s);
	s = p.FindProductName(24);
	System.out.println(s);
	p.DeleteProduct(23);
	p.PrintProducts();
}
}
