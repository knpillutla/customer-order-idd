package com.threedsoft.customer.order.dto.responses;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.util.dto.WMSResourceDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
@AllArgsConstructor
public class CustomerOrderLineResourceDTO  extends WMSResourceDTO implements Serializable{
	Long id;
	Long orderId;
	Integer orderLineNbr;
	String orderNbr;
	String busName;
	Integer locnNbr;
	String company;
	String division;
	String busUnit;
	String itemBrcd;
	Integer origOrderQty;
	Integer orderQty;
	Integer cancelledQty;
	Integer shortQty;
	Integer pickedQty;
	Integer packedQty;
	Integer shippedQty;
	String status;
	String olpn;
	String source;
	String transactionName;
	String refField1;
	String refField2;
	LocalDateTime updatedDttm;
	String updatedBy;
	Integer archived;
}
