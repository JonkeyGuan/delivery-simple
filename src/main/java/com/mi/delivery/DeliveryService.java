package com.mi.delivery;

import java.util.Random;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

    final private static Logger log = LoggerFactory.getLogger(DeliveryService.class);

    public Delivery generateDeliveryId() {
        Delivery result = new Delivery();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        result.setId(random(10));
        
        log.info("loaded: {}", gson.toJson(result));
        return result;
    }

    private String random(int len) {
        int digit = (int) Math.pow(10, len - 1);
        int rs = new Random().nextInt(digit * 10);
        if (rs < digit) {
            rs += digit;
        }
        return String.valueOf(rs);
    }
}
