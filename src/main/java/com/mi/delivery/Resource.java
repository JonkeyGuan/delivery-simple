package com.mi.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
@RequestMapping("/api")
public class Resource {

    @Autowired
    private DeliveryService service;

    @GetMapping(path = "/id")
    public Delivery deliveryId() {
        return service.generateDeliveryId();
    }
}
