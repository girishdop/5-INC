package com.example.demo1;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection="user")
public class user {
    @Id
    private String id;
    private Role role;
    //private LocalDateTime date;
    private String VendorName;
    private String LastName;
    private Gender gender;
    private int Amount;
    private ExpenseCategory expensecategory;
    private String Comments;
    private claim claim;

    public user(Role role, String vendorName, String lastName, Gender gender, int amount, ExpenseCategory expensecategory, String comments, com.example.demo1.claim claim) {
        this.role = role;
        VendorName = vendorName;
        LastName = lastName;
        this.gender = gender;
        Amount = amount;
        this.expensecategory = expensecategory;
        Comments = comments;
        this.claim = claim;
    }
}




