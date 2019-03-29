package com.trm.service.Impl;


import com.trm.models.Customer;
import com.trm.repositroy.CustomerMapper;
import com.trm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CustomerService")
public class CustomerServiceimpl implements CustomerService {
    @Autowired(required = false)
    private CustomerMapper dao;


    @Override
    public int addCustomer(Customer customer) {
        return dao.insert(customer);
    }
}
