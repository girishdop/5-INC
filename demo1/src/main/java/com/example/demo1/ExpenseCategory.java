
package com.example.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExpenseCategory {
    public int Travel;
    private int Printing;
    private int Stationery;
    private int Utility;
    private int Refreshment;
    private int HouseKeeping;
    private int Courier;
    private int DrinkingWater;
    private int InternetBills;
    private int Accomodation;

}