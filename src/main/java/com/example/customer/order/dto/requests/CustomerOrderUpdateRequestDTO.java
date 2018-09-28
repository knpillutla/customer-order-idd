package com.example.customer.order.dto.requests;

import java.util.Date;

import com.example.customer.order.dto.BaseDTO;
import com.example.customer.order.dto.events.CustomerOrderCreatedEvent;
import com.example.customer.order.dto.events.ExceptionEvent;
import com.example.customer.order.dto.responses.CustomerOrderDTO;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
@AllArgsConstructor
public class CustomerOrderUpdateRequestDTO extends BaseDTO{
	Long id;
	String busName;
	String locnNbr;
	String orderNbr;
	String company;
	String division;
	String busUnit;
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
}