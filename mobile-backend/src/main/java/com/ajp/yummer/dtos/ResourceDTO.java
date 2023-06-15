package com.ajp.yummer.dtos;

import lombok.Data;
import org.springframework.http.HttpHeaders;

/**
 * @author Alaa Jawhar
 */
@Data
public class ResourceDTO {
    byte[] resource;
    HttpHeaders headers;
}
