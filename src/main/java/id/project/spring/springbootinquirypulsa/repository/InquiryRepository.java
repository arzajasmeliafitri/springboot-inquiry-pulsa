package id.project.spring.springbootinquirypulsa.repository;

import id.project.spring.springbootinquirypulsa.model.Product;
import id.project.spring.springbootinquirypulsa.request.InquiryRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Arza Jasmelia.
 * springboot-inquiry-pulsa
 * on 12/09/2020
 */

@Repository
public interface InquiryRepository extends CrudRepository<Product, String>{
    Product findByProductCode(String productCode);
}
