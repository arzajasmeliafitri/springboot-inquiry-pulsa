package id.project.spring.springbootinquirypulsa.request;

import lombok.Data;

/**
 * @author Arza Jasmelia.
 * springboot-inquiry-pulsa
 * on 12/09/2020
 */

@Data
public class InquiryRequest {
    private String productCode;
    private String subscriberNumber;
    private String reffNumber;
}
