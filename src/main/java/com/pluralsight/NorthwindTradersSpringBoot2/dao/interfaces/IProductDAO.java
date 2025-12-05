package com.pluralsight.NorthwindTradersSpringBoot2.dao.interfaces;


import com.pluralsight.NorthwindTradersSpringBoot2.models.Product;

import java.util.List;

/**
 * Interface for Data Access Object (DAO) operations related to the Product model.
 */
public interface IProductDAO {

    /**
     * Adds a new product to products.
     *
     * @param product The Product object to be added.
     * @return the new product
     */
    Product add(Product product);

    /**
     * Retrieves all products from products.
     *
     * @return A list of all products.
     */
    List<Product> getAllProducts();

    /**
     * Retrieves a specific product by its productId.
     *
     * @param productId The productId of the product to retrieve.
     * @return The Product object if found, or null otherwise.
     */
    Product getProductById(int productId);

    /**
     * Updates an existing product in the data.
     *
     * @param productId The ID of the product to update.
     * @param product The Product object with updated information.
     */
    void update(int productId, Product product);

    /**
     * Deletes a product from the data.
     *
     * @param productId The ID of the product to delete.
     */
    void delete(int productId);
}
