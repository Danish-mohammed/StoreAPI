package com.bridgelabz.bookstore.repository;

import com.bridgelabz.bookstore.model.Address;
import com.bridgelabz.bookstore.model.UserRegistrationData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistrationData, Integer> {
    @Query(value = "select * from userregistration where email_Id= :emailId", nativeQuery = true)
    Optional<UserRegistrationData> findByEmailId(String emailId);

    Optional<UserRegistrationData> findByEmailIdAndPassword(String email_Id, String password);
}
