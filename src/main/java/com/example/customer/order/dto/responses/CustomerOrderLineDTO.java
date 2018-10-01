package com.example.customer.order.dto.responses;

import java.io.Serializable;
import java.time.LocalDateTime;

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
public class CustomerOrderLineDTO  extends BaseDTO implements Serializable{
	Long id;
	Integer locnNbr;
	Long orderId;
	Integer orderLineNbr;
	String itemBrcd;
	Integer origOrderQty;
	Integer orderQty;
	Integer cancelledQty;
	Integer shortQty;
	Integer pickedQty;
	Integer packedQty;
	Integer shippedQty;
	Integer statCode;
	String olpn;
	String source;
	String transactionName;
	String refField1;
	String refField2;
	LocalDateTime updatedDttm;
	String updatedBy;
}
