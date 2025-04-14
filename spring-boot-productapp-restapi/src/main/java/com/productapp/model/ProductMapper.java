package com.productapp.model;

public class ProductMapper {
	
	public ProductDTO convertToDTO(Product product) {
		
		ProductDTO productDTO=new ProductDTO();
		productDTO.setProductName(product.getProductName());
		productDTO.setCategory(product.getCategory());
		productDTO.setProductId(product.getProductId());
		productDTO.setPrice(product.getPrice());
		
		return productDTO;
	}
	
public Product convertToEntity(ProductDTO productDTO) {
		
		Product product=new Product();
		product.setProductName(productDTO.getProductName());
		product.setCategory(productDTO.getCategory());
		product.setProductId(productDTO.getProductId());
		product.setPrice(productDTO.getPrice());
		
		return product;
	}

}
