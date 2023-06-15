package com.ajp.yummer.controllers.interfaces;

import com.ajp.yummer.contants.UriConstants;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Alaa Jawhar
 */
public interface IUserAuthenticationController {

    @RequestMapping(value = UriConstants.SIGN_IN,
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Object signin(@RequestBody Object obj);

    @RequestMapping(value = UriConstants.SIGN_UP,
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Object signup(@RequestBody Object obj);

    @RequestMapping(value = UriConstants.SIGN_OUT,
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Object signout(@RequestBody Object obj);

    @RequestMapping(value = UriConstants.FORGOT_PASSWORD,
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Object forgotPassword(@RequestBody Object obj);

    @RequestMapping(value = UriConstants.RESET_PASSWORD,
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Object resetPassword(@RequestBody Object obj);
}
