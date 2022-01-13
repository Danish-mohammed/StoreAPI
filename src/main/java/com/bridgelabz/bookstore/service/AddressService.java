package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.dto.AddressDto;
import com.bridgelabz.bookstore.exception.UserRegistrationException;
import com.bridgelabz.bookstore.model.Address;
import com.bridgelabz.bookstore.model.UserRegistrationData;
import com.bridgelabz.bookstore.repository.AddressRepository;
import com.bridgelabz.bookstore.repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
public class AddressService  implements IAddressDetailsService{

    @Autowired
    IUserRegistrationService userService;

    @Autowired
    AddressRepository addressRepo;

    @Autowired
    UserRegistrationRepository userRepo;

    @Override
    public Address getData(int userId) {
        
        return addressRepo.findById(userId);
                // .orElseThrow(() -> new UserRegistrationException("User  with id " + userId + " does not exist in database..!"));
                
       
    }

    @Override
    public Address customerDetails(AddressDto addressDto) {
        System.out.println("UserId: "+addressDto.userId);
        int id = addressDto.userId;
        System.out.println(id);
        Optional<UserRegistrationData> user = Optional.ofNullable(userService.getUserById(id));
        System.out.println("UserId: " +user);
        if (user != null) {
            Address addressData = new Address(user.get(), addressDto);
            System.out.println("Address" +addressData);
            return addressRepo.save(addressData);
        }
        return null;
    }

    @Override
    public Address updateCustomerAddress(int userId, AddressDto addressDto) {
        return null;
    }
}
