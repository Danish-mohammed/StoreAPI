package com.bridgelabz.bookstore.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
@ToString
public class UserRegistrationDto {
    @Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s.]{2,}$", message = "FirstName is invalid")
    @NotEmpty(message = "Name can not be NULL")
    public String fullName;

    public String emailId;
    public String password;

    public String mobileNumber;

//    @JsonFormat(pattern = "dd-MM-yyyy")
    public Date purchaseDate;

}
