package com.ajp.yummer.models;

import lombok.Data;

/**
 * @author Alaa Jawhar
 */
@Data
public class ShopItem {
    public Integer id;
    public String title;
    public String deliveryCharge;
    public String subtitle;
    public String distance;
    public Integer rating;
}
