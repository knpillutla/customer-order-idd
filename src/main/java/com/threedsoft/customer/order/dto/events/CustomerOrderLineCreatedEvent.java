package com.threedsoft.customer.order.dto.events;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.threedsoft.customer.order.dto.responses.CustomerOrderLineResourceDTO;
import com.threedsoft.util.dto.events.WMSEvent;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class CustomerOrderLineCreatedEvent extends WMSEvent {
	public CustomerOrderLineCreatedEvent(CustomerOrderLineResourceDTO customerOrderDTO, String serviceName) {
		this(customerOrderDTO, serviceName, null);
	}

	public CustomerOrderLineCreatedEvent(CustomerOrderLineResourceDTO customerOrderDTO, String serviceName, Map headerMap) {
		super("CustomerOrderLineCreatedEvent", customerOrderDTO.getBusName(), customerOrderDTO.getLocnNbr(),
				customerOrderDTO.getCompany(), customerOrderDTO.getDivision(), customerOrderDTO.getBusUnit(),
				"CustomerOrder", customerOrderDTO.getOrderNbr(), serviceName, customerOrderDTO);
		if (headerMap != null)
			this.setHeaderMap(headerMap);
	}
}
