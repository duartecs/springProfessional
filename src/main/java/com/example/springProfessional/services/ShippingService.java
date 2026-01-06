package com.example.springProfessional.services;

import com.example.springProfessional.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double shipment(Order order) {
        Double basic = order.getBasic();

        if(basic < 100.00){
            return 20.00;
        }

        if(basic >= 100.00 && basic < 200.00){
            return 12.00;
        }

        return 0.0;
    }


}
