package com.ajp.yummer.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alaa Jawhar
 */
@Data
public class GetShopItemResponse {
    private List<ShopItem> list;

    public void addShopItem(ShopItem shopItem) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(shopItem);
    }
}
