package com.threedsoft.customer.order.dto.requests;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.util.dto.WMSRequestDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
@AllArgsConstructor
public class CustomerOrderSearchRequestDTO extends WMSRequestDTO{
	String busName;
	Integer locnNbr;
	String company;
	String division;
	String busUnit;
	String externalBatchNbr;
	String orderNbr;
	LocalDateTime orderDttm;
	LocalDateTime shipByDttm;
	LocalDateTime expectedDeliveryDttm;
	String deliveryType;
	String status;
	String isGift;
	String refField1;
	String refField2;
}

