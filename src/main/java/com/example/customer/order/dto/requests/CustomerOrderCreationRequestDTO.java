package com.example.customer.order.dto.requests;

import java.util.Date;
import java.util.List;

import com.example.customer.order.dto.BaseDTO;
import com.example.customer.order.dto.events.ExceptionEvent;
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
public class CustomerOrderCreationRequestDTO extends BaseDTO{
	String busName;
	Integer locnNbr;
	String company;
	String division;
	String busUnit;
	String externalBatchNbr;
	String orderNbr;
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
	String userId;
	List<CustomerOrderLineCreationRequestDTO> orderLines;
	
	public void createHeaders() {
		this.addHeader("eventName", "NewCustomerOrderEvent");
	}
}

