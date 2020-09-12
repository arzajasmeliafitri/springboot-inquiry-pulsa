package id.project.spring.springbootinquirypulsa.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Arza Jasmelia.
 * springboot-inquiry-pulsa
 * on 12/09/2020
 */

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "product_code")
    private String productCode;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "admin_fee")
    private String adminFee;

    @Column(name = "amount")
    private String amount;

}