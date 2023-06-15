package com.ajp.yummerauthserver.controllers;

import com.ajp.yummerauthserver.constants.UriConstants;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Alaa Jawhar
 */
public interface IUserController {

    @RequestMapping(value = UriConstants.CREATE_USER,
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Object createUser(@RequestBody Object obj);

    @RequestMapping(value = UriConstants.UPDATE_USER,
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Object updateUser(@RequestBody Object obj);

    @RequestMapping(value = UriConstants.GET_USER_BY_CRITERIA,
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Object getUserByCriteria(@RequestBody Object obj);

    @RequestMapping(value = UriConstants.DELETE_USER,
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Object deleteUser(@RequestBody Object obj);
}
