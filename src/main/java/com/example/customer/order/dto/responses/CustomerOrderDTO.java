package com.example.customer.order.dto.responses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.util.dto.BaseDTO;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
@AllArgsConstructor
public class CustomerOrderDTO  extends BaseDTO implements Serializable{
	Long id;
	String busName;
	Integer locnNbr;
	String company;
	String division;
	String busUnit;
	String externalBatchNbr;
	String batchNbr;
	String orderNbr;
	Integer statCode;
	Date orderDttm;
	Date shipByDttm;
	Date expectedDeliveryDttm;
	String deliveryType;
	boolean isGift;
	String giftMsg;
	String source;
	String transactionName;
	String refField1;
	String refField2;
	String updatedBy;
	List<CustomerOrderLineDTO> orderLines = new ArrayList<>();
	

    public void addOrderLine(CustomerOrderLineDTO orderLineDTO) {
    	orderLines.add(orderLineDTO);
    }
 
    public void removeOrderLine(CustomerOrderLineDTO orderLineDTO) {
    	orderLines.remove(orderLineDTO);
    }
}
