package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceimpl implements CustomerService {
    @Override
    public CustomerDto getCustById(UUID custId) {
        return CustomerDto.builder()
                .ID(custId)
                .name("Karen")
                .build();
    }
}
