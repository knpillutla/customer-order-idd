package com.threedsoft.customer.order.dto.events;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.customer.order.dto.requests.CustomerOrderUpdateRequestDTO;
import com.threedsoft.util.dto.events.ExceptionEvent;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Data
public class CustomerOrderUpdateFailedEvent extends ExceptionEvent{
	public CustomerOrderUpdateFailedEvent(CustomerOrderUpdateRequestDTO req, String serviceName,
			String errorMsg) {
		this(req, serviceName, errorMsg, null);
	}

	public CustomerOrderUpdateFailedEvent(CustomerOrderUpdateRequestDTO req, String serviceName,
			String errorMsg, Exception exObj) {
		this(req, serviceName, errorMsg, exObj, null);
	}

	public CustomerOrderUpdateFailedEvent(CustomerOrderUpdateRequestDTO req, String serviceName,
			String errorMsg, Exception exObj, Map headerMap) {
		super("CustomerOrderUpdateFailedEvent", req.getBusName(), req.getLocnNbr(), req.getCompany(),
				req.getDivision(), req.getBusUnit(), "CustomerOrder", req.getOrderNbr(), serviceName, req, errorMsg,
				exObj);
		if (headerMap != null)
			this.setHeaderMap(headerMap);
	}	
}
