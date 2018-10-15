package com.threedsoft.customer.order.dto.events;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.customer.order.dto.requests.CustomerOrderCreationRequestDTO;
import com.threedsoft.customer.order.dto.responses.CustomerOrderResourceDTO;
import com.threedsoft.util.dto.events.WMSEvent;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class CustomerOrderDownloadEvent extends WMSEvent {
	public CustomerOrderDownloadEvent(CustomerOrderCreationRequestDTO orderCreationRequestDTO, String serviceName) {
		this(orderCreationRequestDTO, serviceName, null);
	}

	public CustomerOrderDownloadEvent(CustomerOrderCreationRequestDTO orderCreationRequestDTO, String serviceName,
			Map headerMap) {
		super("CustomerOrderDownloadEvent", orderCreationRequestDTO.getBusName(), orderCreationRequestDTO.getLocnNbr(),
				orderCreationRequestDTO.getCompany(), orderCreationRequestDTO.getDivision(),
				orderCreationRequestDTO.getBusUnit(), "CustomerOrder", orderCreationRequestDTO.getOrderNbr(),
				serviceName, orderCreationRequestDTO);
		if (headerMap != null)
			this.setHeaderMap(headerMap);
	}

}
