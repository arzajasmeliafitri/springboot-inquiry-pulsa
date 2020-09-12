package id.project.spring.springbootinquirypulsa.response;

import lombok.Data;

/**
 * @author Arza Jasmelia.
 * springboot-inquiry-pulsa
 * on 12/09/2020
 */

@Data
public class ContenResponse {
    private String productCode;
    private String productName;
    private String subscriberNumber;
    private String amount;
    private String adminFee;
    private String total;
    private String reffNumber;
}
