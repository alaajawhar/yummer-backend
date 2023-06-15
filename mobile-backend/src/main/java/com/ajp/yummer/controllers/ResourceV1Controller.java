package com.ajp.yummer.controllers;

import com.ajp.yummer.contants.AppConstants;
import com.ajp.yummer.controllers.interfaces.IResourceController;
import com.ajp.yummer.dtos.ResourceDTO;
import com.ajp.yummer.services.interfaces.IResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alaa Jawhar
 */
@RequiredArgsConstructor
@RestController
@RequestMapping(AppConstants.V1)
public class ResourceV1Controller implements IResourceController {

    private final IResourceService resourceService;

    @Override
    public ResponseEntity<byte[]> getResource(@PathVariable("filename") String filename) {
        ResourceDTO resource = resourceService.getResource(filename);
        return new ResponseEntity<byte[]>(resource.getResource(), resource.getHeaders(), HttpStatus.OK);
    }
}
