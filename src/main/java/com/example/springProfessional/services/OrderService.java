package com.example.springProfessional.services;

import com.example.springProfessional.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public Double total(Order order){
        return order.getBasic() - order.getDiscount() + shippingService.shipment(order);
    }
}
