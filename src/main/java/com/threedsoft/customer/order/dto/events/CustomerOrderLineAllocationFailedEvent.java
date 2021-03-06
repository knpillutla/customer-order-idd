package com.threedsoft.customer.order.dto.events;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.customer.order.dto.requests.CustomerOrderLineUpdateRequestDTO;
import com.threedsoft.util.dto.events.ExceptionEvent;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class CustomerOrderLineAllocationFailedEvent extends ExceptionEvent {
	public CustomerOrderLineAllocationFailedEvent(CustomerOrderLineUpdateRequestDTO req, String serviceName,
			String errorMsg) {
		this(req, serviceName, errorMsg, null);
	}

	public CustomerOrderLineAllocationFailedEvent(CustomerOrderLineUpdateRequestDTO req, String serviceName,
			String errorMsg, Exception exObj) {
		this(req, serviceName, errorMsg, exObj, null);
	}

	public CustomerOrderLineAllocationFailedEvent(CustomerOrderLineUpdateRequestDTO req, String serviceName,
			String errorMsg, Exception exObj, Map headerMap) {
		super("CustomerOrderLineAllocationFailedEvent", req.getBusName(), req.getLocnNbr(), "",
				"", "", "CustomerOrder", req.getOrderId().toString(), serviceName, req, errorMsg,
				exObj);
		if (headerMap != null)
			this.setHeaderMap(headerMap);
	}

}
