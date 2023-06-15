package com.ajp.yummer.contants;

import static com.ajp.yummer.contants.AppConstants.V1;

/**
 * @author Alaa Jawhar
 */
public class UriConstants {

    public static final String SIGN_IN = "/user/signin";
    public static final String SIGN_UP = "/user/signup";
    public static final String SIGN_OUT = "/user/signout";
    public static final String FORGOT_PASSWORD = "/user/password/forgot";
    public static final String RESET_PASSWORD = "/user/password/reset";
    public static final String GET_PROFILE_INIT = "/profile/init";
    public static final String GET_ADDRESS_LIST = "/profile/address/list";
    public static final String GET_PROMOCODE_LIST = "/profile/promocode/list";
    public static final String GET_PAYMENT_METHOD = "/profile/payment-method/list";
    public static final String GET_ORDER_HISTORY = "/profile/order/list";
    public static final String GET_AVAILABLE_OFFER_LIST = "/offer/list";
    public static final String GET_SHOP_CATEGORY_LIST = "/shop/category/list";
    public static final String GET_SHOP_CATEGORY_BY_ID = "/shop/category/{id}";
    public static final String GET_SHOP_ITEM_LIST = "/shop/list";
    public static final String GET_SHOP_ITEM_BY_ID = "/shop/item/{id}";
    public static final String GET_STATIC_RESOURCE_BY_ID = "/resource/static/{filename}";


    public static final String[] UNSECURED_API = new String[]{
            "/v1/token",
            V1 + "/resource/static/{filename}"
    };

}
