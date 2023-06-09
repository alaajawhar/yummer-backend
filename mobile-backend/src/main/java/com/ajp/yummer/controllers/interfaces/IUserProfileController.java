package com.ajp.yummer.controllers.interfaces;

import com.ajp.yummer.contants.UriConstants;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Alaa Jawhar
 */
public interface IUserProfileController {

    @RequestMapping(value = UriConstants.GET_PROFILE_INIT,
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Object getUserProfileInit();

    @RequestMapping(value = UriConstants.GET_ADDRESS_LIST,
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Object getUserAddressList();
}
