package id.project.spring.springbootinquirypulsa.controller;

import id.project.spring.springbootinquirypulsa.model.Product;
import id.project.spring.springbootinquirypulsa.repository.InquiryRepository;
import id.project.spring.springbootinquirypulsa.request.InquiryRequest;
import id.project.spring.springbootinquirypulsa.response.ContenResponse;
import id.project.spring.springbootinquirypulsa.response.MessageResponse;
import id.project.spring.springbootinquirypulsa.utility.Formatter;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Arza Jasmelia.
 * springboot-inquiry-pulsa
 * on 12/09/2020
 */

@RestController
@RequestMapping("/api/v1")
public class InquiryController extends Formatter{

    @Autowired
    InquiryRepository inquiryRepository;

    @PostMapping("/product/InquiryProduct")
    @ApiOperation(value = "Inquiry Product",notes = "Inquiry Product")
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "InquiryProduct found"),
            @ApiResponse(code = 404,message = "InquiryProduct not found")
    })
    public MessageResponse inquiryProduct(@RequestBody InquiryRequest inquiryRequest){

        Product product = inquiryRepository.findByProductCode(inquiryRequest.getProductCode());
        ContenResponse contenResponse = new ContenResponse();
        contenResponse.setProductCode(product.getProductCode());
        contenResponse.setProductName(product.getProductName());
        contenResponse.setSubscriberNumber(inquiryRequest.getSubscriberNumber());
        contenResponse.setAmount(product.getAmount());
        contenResponse.setAdminFee(product.getAdminFee());
        contenResponse.setReffNumber(inquiryRequest.getReffNumber());
        int total = Integer.parseInt(product.getAmount()) + Integer.parseInt(product.getAdminFee());
        contenResponse.setTotal(String.valueOf(total));

        MessageResponse messageResponse = new MessageResponse();
        messageResponse.setCode("0000");
        messageResponse.setMessage("Success");
        messageResponse.setDate(getDate());
        messageResponse.setTime(getTime());
        messageResponse.setContent(contenResponse);

        return messageResponse;


    }
}
