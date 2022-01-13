package com.bridgelabz.bookstore.repository;

import com.bridgelabz.bookstore.model.Address;
import com.bridgelabz.bookstore.model.UserRegistrationData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {

    // Optional<UserRegistrationData> findAddressById(int userId);
   @Query(value = "select * from address where user_id= :userId", nativeQuery = true)
   Address findById(int userId);

//    Optional<Address> findById(UserRegistrationData userId);
}
