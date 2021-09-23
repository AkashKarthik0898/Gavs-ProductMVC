package learning.product.controller;

import java.util.ArrayList;

import learning.product.model.Product;
import learning.product.operations.Operations;
import learning.product.operations.PackageUtilities;

class Products {

	public static PackageUtilities p = new PackageUtilities(new ArrayList<Product>());



	public static void main(String[] args) {
		Operations.operations(p.m_vProds,p);

	}
}