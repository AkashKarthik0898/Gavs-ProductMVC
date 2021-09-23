package learning.product.operations;

import java.util.ArrayList;
import java.util.List;

import learning.product.interfaces.Utilities;
import learning.product.model.Product;

public class PackageUtilities implements Utilities {

	public List<Product> m_vProds;

	public PackageUtilities(ArrayList<Product> arrayList) {
		m_vProds = arrayList;
	}

	public void AddProduct(int newID, String newName) {
		int i;
		Product p;
		for (i = 0; i < m_vProds.size(); i++) {
			p = (Product) m_vProds.get(i);
			if (p.GetID() > newID) {
				break;
			}
		}
		if (i == m_vProds.size()) {
			m_vProds.add(new Product(newID, newName));
		} else {
// In this case insert new element at position i
			m_vProds.add(i, new Product(newID, newName));
		}
	}

	public void DeleteProduct(int targetID) {
		int i;
		i = m_vProds.indexOf(new Product(targetID, ""));
		if (i < 0)
			return;
		m_vProds.remove(i);
	}

	public String FindProductName(int targetID) {
		int i;
		String s = "";
		i = m_vProds.indexOf(new Product(targetID, ""));
		if (i >= 0)
			s = ((Product) m_vProds.get(i)).GetName();
		return s;
	}

	public void PrintProducts() {
		Product p;
		for (int i = 0; i < m_vProds.size(); i++) {
			p = (Product) m_vProds.get(i);
			p.PrintValues();
		}
	}
}
