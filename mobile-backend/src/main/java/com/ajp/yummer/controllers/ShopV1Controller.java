package com.ajp.yummer.controllers;

import com.ajp.yummer.contants.AppConstants;
import com.ajp.yummer.controllers.interfaces.IShopController;
import com.ajp.yummer.models.GetShopItemResponse;
import com.ajp.yummer.models.ShopItem;
import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alaa Jawhar
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(AppConstants.V1)
public class ShopV1Controller implements IShopController {

    @Override
    public Object getShopCategoryList(Object obj) {
        return "{\n" +
                "    \"list\": [\n" +
                "        {\n" +
                "            \"id\": 1,\n" +
                "            \"title\": \"Burger\",\n" +
                "            \"imageUrl\": \"/resource/static/burger.svg\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2,\n" +
                "            \"title\": \"Pizza\",\n" +
                "            \"imageUrl\": \"/resource/static/pizza.svg\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 3,\n" +
                "            \"title\": \"Salads\",\n" +
                "            \"imageUrl\": \"/resource/static/salad.svg\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 4,\n" +
                "            \"title\": \"Pasta\",\n" +
                "            \"imageUrl\": \"/resource/static/pasta.svg\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 5,\n" +
                "            \"title\": \"Desserts\",\n" +
                "            \"imageUrl\": \"/resource/static/desert.svg\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }

    @Override
    public Object getShopCategoryById(Object obj) {
        return "Success";
    }

    @Override
    public Object getShopItemList(Object obj) {
        System.out.println(obj);
        GetShopItemResponse getShopItemResponse = new GetShopItemResponse();

        Faker faker = new Faker();
        for (int i = 0; i < 10; i++) {
            ShopItem shopItem = new ShopItem();
            shopItem.setId(faker.number().randomDigitNotZero());
            shopItem.setTitle(faker.pokemon().name());
            shopItem.setSubtitle(faker.pokemon().location());
            shopItem.setDistance("0.2 km");
            shopItem.setDeliveryCharge("Free");
            shopItem.setRating(5);
            getShopItemResponse.addShopItem(shopItem);
        }

        return getShopItemResponse;
    }

    @Override
    public Object getShopItemById() {
        return "    {\n" +
                "      \"images\": [\n" +
                "        \"/resource/static/shopItem1.jpeg\",\n" +
                "        \"/resource/static/shopItem2.jpeg\",\n" +
                "        \"/resource/static/shopItem3.jpeg\"\n" +
                "      ],\n" +
                "      \"title\": \"Cheese Cake\",\n" +
                "      \"subTitle\": \"Delicious Cheese Cake with an amazing app\",\n" +
                "      \"price\": \"$9.95\",\n" +
                "      \"weight\": \"350g\"\n" +
                "    }";
    }

    @Override
    public Object getPromocodeList() {
        return "{\n" +
                "    \"list\": [\n" +
                "        {\n" +
                "            \"title\": \"AJ\",\n" +
                "            \"subtitle\": \"50% off\",\n" +
                "            \"validity\": \"30/06/2024\",\n" +
                "            \"isUsed\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"title\": \"MM\",\n" +
                "            \"subtitle\": \"30% off\",\n" +
                "            \"validity\": \"30/06/2024\",\n" +
                "            \"isUsed\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"title\": \"ES\",\n" +
                "            \"subtitle\": \"50% off\",\n" +
                "            \"validity\": \"30/06/2024\",\n" +
                "            \"isUsed\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"title\": \"CbG\",\n" +
                "            \"subtitle\": \"25% off\",\n" +
                "            \"validity\": \"30/06/2024\",\n" +
                "            \"isUsed\": false\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }

    @Override
    public Object getPaymentMethods() {
        return "{\n" +
                "    \"paymentMethod\": \"APPLE_PAY\",\n" +
                "    \"creditCardList\": [\n" +
                "        {\n" +
                "            \"id\": 1,\n" +
                "            \"isSelected\": false,\n" +
                "            \"cardNumber\": \"7741********6644\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2,\n" +
                "            \"isSelected\": false,\n" +
                "            \"cardNumber\": \"7632********6754\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }

    @Override
    public Object getOrderHistory() {
        return "{\n" +
                "    \"list\": [\n" +
                "        {\n" +
                "            \"id\": 2,\n" +
                "            \"title\": \"Filada Family Bar\",\n" +
                "            \"subtitle\": \"May 26, 2021 - 10:38 AM\",\n" +
                "            \"status\": \"DELIVERED\",\n" +
                "            \"totalPrice\": \"$10,24\",\n" +
                "            \"itemList\": [\n" +
                "                {\n" +
                "                    \"id\": 1,\n" +
                "                    \"name\": \"Banana\",\n" +
                "                    \"count\": 1,\n" +
                "                    \"price\": \"$10.38\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 1,\n" +
                "                    \"name\": \"Apple\",\n" +
                "                    \"count\": 1,\n" +
                "                    \"price\": \"$07.92\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 1,\n" +
                "                    \"name\": \"Chicken\",\n" +
                "                    \"count\": 1,\n" +
                "                    \"price\": \"$17.04\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }

    @Override
    public Object getAvailableOfferList(Object obj) {
        return "    {\n" +
                "      \"list\": [\n" +
                "        {\n" +
                "          \"id\": 1,\n" +
                "          \"url\": \"/resource/static/offer1.png\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"id\": 2,\n" +
                "          \"url\": \"/resource/static/offer2.png\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"id\": 3,\n" +
                "          \"url\": \"/resource/static/offer3.png\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }";
    }
}
