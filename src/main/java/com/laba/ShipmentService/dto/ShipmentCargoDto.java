package com.laba.ShipmentService.dto;

import java.io.Serializable;

public record ShipmentCargoDto(String orderNumber, long productId) implements Serializable {

}
