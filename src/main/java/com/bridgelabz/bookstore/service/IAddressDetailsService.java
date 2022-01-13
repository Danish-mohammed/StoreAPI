package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.dto.AddressDto;
import com.bridgelabz.bookstore.model.Address;

public interface IAddressDetailsService {

    Address getData(int userId);
    Address customerDetails(AddressDto addressDto);
    Address updateCustomerAddress(int userId, AddressDto addressDto);
}
