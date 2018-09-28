package com.example.customer.order.dto.events;

import com.example.customer.order.dto.requests.CustomerOrderLineStatusUpdateRequestDTO;
import com.example.util.dto.events.ExceptionEvent;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class CustomerOrderLineAllocationFailedEvent extends ExceptionEvent{
	public CustomerOrderLineStatusUpdateRequestDTO customerOrderLineStatusUpdateRequestDTO;
	private static String EVENT_NAME = "CustomerOrderLineAllocationFailedEvent";
	public CustomerOrderLineAllocationFailedEvent(CustomerOrderLineStatusUpdateRequestDTO req, String errorMsg) {
		super(EVENT_NAME, errorMsg);
		this.customerOrderLineStatusUpdateRequestDTO = req;
		this.addHeader("eventName", getEventName());
		this.addHeader("busName", customerOrderLineStatusUpdateRequestDTO.getBusName());
		this.addHeader("locnNbr", customerOrderLineStatusUpdateRequestDTO.getLocnNbr());
		this.addHeader("OrderNbr", customerOrderLineStatusUpdateRequestDTO.getOrderNbr());
		this.addHeader("company", customerOrderLineStatusUpdateRequestDTO.getCompany());
		this.addHeader("division", customerOrderLineStatusUpdateRequestDTO.getDivision());
		this.addHeader("busUnit", customerOrderLineStatusUpdateRequestDTO.getBusUnit());
	}

}
