package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created by Torossian on 2020-09-25.
 */
public interface CustomerService {
    CustomerDto getCustById(UUID custId);
}
