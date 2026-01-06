package com.example.springProfessional;

import com.example.springProfessional.entities.Order;
import com.example.springProfessional.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProfessionalApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(SpringProfessionalApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Order order = new Order(1309, 95.90, 00.00);

        System.out.println("Pedido codigo: " + order.getCode());
        System.out.println("Valor total: R$ " + orderService.total(order));
    }
}
