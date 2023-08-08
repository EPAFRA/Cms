package com.epafra.nms.api;

import com.epafra.nms.Service.customerServices;
import com.epafra.nms.models.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerResource {
    @Autowired
    private customerServices customerServices;
    @PostMapping
    public Customers addCustomer(@RequestBody Customers customer){
        return customerServices.addCustomer(customer);
    }
    @GetMapping
    public List<Customers>getCustomer(){
        return customerServices.getCustomers();
    }
    @GetMapping(value  ="/{customerId}")
    public Customers getCustomer(@PathVariable("customerId") int customerId){
        return customerServices.getCustomers(customerId);
    }
    @PutMapping(value  ="/{customerId}")
    public Customers updateCustomer(@PathVariable("customerId") int customerId, @RequestBody Customers customers){
        return customerServices.updateCustomer(customerId, customers);
    }
    @DeleteMapping(value="/{customerId}")
    public void deleteCustomer(@PathVariable("customerId") int customerId){
        customerServices.deleteCustomer(customerId);
    }

}
