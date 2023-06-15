package com.ajp.yummer.services;

import com.ajp.yummer.dtos.ResourceDTO;
import com.ajp.yummer.services.interfaces.IResourceService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Alaa Jawhar
 */
@Service
public class ResourceService implements IResourceService {
    private Map<String, byte[]> imageMap = new HashMap<>();

    @Autowired
    private ResourceLoader resourceLoader;

    @Override
    public ResourceDTO getResource(String filename) {
        if (imageMap.get(filename) == null) {
            byte[] image = this.getImage("static/" + filename);
            imageMap.put(filename, image);
        }
        var resourceDTO = new ResourceDTO();
        resourceDTO.setResource(imageMap.get(filename));
        resourceDTO.setHeaders(getHttpHeaders(filename));
        return resourceDTO;
    }

    @SneakyThrows
    private byte[] getImage(String classPathFileName) {
        Resource resource = resourceLoader.getResource("classpath:" + classPathFileName);
        try (InputStream inputStream = resource.getInputStream()) {
            byte[] imageData = convertToByteArray(inputStream);
            return imageData;
        }
    }

    private byte[] convertToByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int bytesRead;

        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }

        return outputStream.toByteArray();
    }

    private static MediaType SVG_MEDIA_TYPE = new MediaType("image", "svg+xml");

    private HttpHeaders getHttpHeaders(String filename) {
        HttpHeaders headers = new HttpHeaders();

        if (filename.endsWith(".png")) {
            headers.setContentType(MediaType.IMAGE_JPEG);
        }

        if (filename.endsWith(".svg")) {
            headers.setContentType(SVG_MEDIA_TYPE);
        }

        return headers;
    }
}
