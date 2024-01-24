package com.wecp.progressive.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.dao.CustomerDAO;
import com.wecp.progressive.entity.Customers;

public class CustomerServiceImpl implements CustomerService{

    private static List<Customers> al=new ArrayList<>();
    private CustomerDAO customerDao;
    private CustomerServiceImpl(CustomerDAO customerDao){
        this.customerDao=customerDao;
    }

    @Override
    public int addCustomer(Customers customers) throws SQLException {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public List<Customers> addCustomersToArrayList(Customers customers) {
        // TODO Auto-generated method stub
        al.add(customers);
        return al;
    }

    @Override
    public void deleteCustomer(int customerId) throws SQLException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        al=new ArrayList<>();
        
    }

    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Customers> getAllCustomersFromArrayList() {
        // TODO Auto-generated method stub
        return al;
    }

    @Override
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Customers> getAllCustomersSortedByNameFromArrayList() {
        // TODO Auto-generated method stub
        List<Customers> sortedAl=al;
        Collections.sort(sortedAl);
        return sortedAl;
    }

    @Override
    public Customers getCustomerById(int customerId) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateCustomer(Customers customers) throws SQLException {
        // TODO Auto-generated method stub
        
    }
    
}
