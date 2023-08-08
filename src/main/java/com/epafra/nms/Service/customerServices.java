package com.epafra.nms.Service;

import com.epafra.nms.da.CustomerDAO;
import com.epafra.nms.exception.CustomerNotFoundException;
import com.epafra.nms.models.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
@Component
public class customerServices {
    @Autowired
    private CustomerDAO customerDAO;

    private List<Customers> customersList=new CopyOnWriteArrayList<>();
    private int customerIdCount=1;
    public Customers addCustomer(Customers customer){
        return customerDAO.save(customer);

    }
    public List<Customers>getCustomers(){
        return customerDAO.findAll();
    }
    public Customers getCustomers(int CustomerId){
        Optional<Customers> optionalCustomers=customerDAO.findById(CustomerId);
        if (!optionalCustomers.isPresent())
            throw new CustomerNotFoundException("customer record is not available");

        return optionalCustomers.get();
    }

    public  Customers updateCustomer(int customerId, Customers customer){
        customer.setCustomerId(customerId);
     return customerDAO.save(customer)  ;
   }

    public void deleteCustomer(int customerId){
        customerDAO.deleteById(customerId);
    }
}
