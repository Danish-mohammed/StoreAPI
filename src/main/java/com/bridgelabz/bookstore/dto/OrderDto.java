package com.bridgelabz.bookstore.dto;

import com.bridgelabz.bookstore.model.BookDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private int totalPrice;
    private int userId;
    private boolean cancel = false;
}