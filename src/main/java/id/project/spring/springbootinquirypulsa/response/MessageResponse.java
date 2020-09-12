package id.project.spring.springbootinquirypulsa.response;

import id.project.spring.springbootinquirypulsa.model.Product;
import lombok.Data;

/**
 * @author Arza Jasmelia.
 * springboot-add-nasabah
 * on 11/09/2020
 */


@Data
public class MessageResponse {
    private String code;
    private String message;
    private String date;
    private String time;
    private ContenResponse content;
}
