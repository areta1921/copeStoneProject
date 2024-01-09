package com.bookstore.database.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.database.entity.Customer;

@Repository
public interface BillingDAO extends CrudRepository<Customer, Long> {

}
