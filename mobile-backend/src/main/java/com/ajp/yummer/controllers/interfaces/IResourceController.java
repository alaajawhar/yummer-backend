package com.ajp.yummer.controllers.interfaces;

import com.ajp.yummer.contants.UriConstants;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Alaa Jawhar
 */
public interface IResourceController {

    @RequestMapping(value = UriConstants.GET_STATIC_RESOURCE_BY_ID, method = RequestMethod.GET)
    ResponseEntity<byte[]> getResource(@PathVariable("filename") String filename);
}
