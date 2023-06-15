package com.ajp.yummer.services.interfaces;

import com.ajp.yummer.dtos.ResourceDTO;

/**
 * @author Alaa Jawhar
 */
public interface IResourceService {

    ResourceDTO getResource(String filename);
}
