package com.threedsoft.customer.order.dto.events;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.customer.order.dto.responses.CustomerOrderResourceDTO;
import com.threedsoft.util.dto.events.WMSEvent;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class CustomerOrderAllocatedEvent extends WMSEvent {
	public CustomerOrderAllocatedEvent(CustomerOrderResourceDTO customerOrderDTO, String serviceName) {
		this(customerOrderDTO, serviceName, null);
	}

	public CustomerOrderAllocatedEvent(CustomerOrderResourceDTO customerOrderDTO, String serviceName, Map headerMap) {
		super("CustomerOrderAllocatedEvent", customerOrderDTO.getBusName(), customerOrderDTO.getLocnNbr(),
				customerOrderDTO.getCompany(), customerOrderDTO.getDivision(), customerOrderDTO.getBusUnit(),
				"CustomerOrder", customerOrderDTO.getOrderNbr(), serviceName, customerOrderDTO);
		if (headerMap != null)
			this.setHeaderMap(headerMap);
	}
}