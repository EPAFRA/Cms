package com.epafra.nms.da;

import com.epafra.nms.models.Customers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO extends CrudRepository<Customers,Integer> {
    @Override
    List<Customers> findAll();
}
