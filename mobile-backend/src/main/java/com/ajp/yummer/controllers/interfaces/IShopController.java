package com.ajp.yummer.controllers.interfaces;

import com.ajp.yummer.contants.UriConstants;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Alaa Jawhar
 */
public interface IShopController {

    @RequestMapping(value = UriConstants.GET_SHOP_CATEGORY_LIST,
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Object getShopCategoryList(@RequestBody Object obj);

    @RequestMapping(value = UriConstants.GET_SHOP_CATEGORY_BY_ID,
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Object getShopCategoryById(@RequestBody Object obj);

    @RequestMapping(value = UriConstants.GET_SHOP_ITEM_LIST,
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Object getShopItemList(@RequestBody Object obj);

    @RequestMapping(value = UriConstants.GET_SHOP_ITEM_BY_ID,
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Object getShopItemById();

    @RequestMapping(value = UriConstants.GET_PROMOCODE_LIST,
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Object getPromocodeList();

    @RequestMapping(value = UriConstants.GET_PAYMENT_METHOD,
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Object getPaymentMethods();

    @RequestMapping(value = UriConstants.GET_ORDER_HISTORY,
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Object getOrderHistory();

    @RequestMapping(value = UriConstants.GET_AVAILABLE_OFFER_LIST,
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Object getAvailableOfferList(@RequestBody Object obj);
}
