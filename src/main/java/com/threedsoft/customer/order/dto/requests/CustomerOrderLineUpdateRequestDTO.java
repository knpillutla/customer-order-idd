package com.threedsoft.customer.order.dto.requests;

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
public class CustomerOrderLineUpdateRequestDTO extends WMSRequestDTO {
	Long id;
	Long orderId;
	Integer orderLineNbr;
	String busName;
	Integer locnNbr;
	String itemBrcd;
	Integer origOrderQty;
	Integer orderQty;
	String refField1;
	String refField2;
	String source;
	String transactionName;
	String userId;
}
