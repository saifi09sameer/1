package com.menu.MenuApplication.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Menu {
    private int itemNumber;
    private String itemName;
    private String itemDescription;
    private String itemPrice;
    private String itemRating;
    private String itemUTL;
}