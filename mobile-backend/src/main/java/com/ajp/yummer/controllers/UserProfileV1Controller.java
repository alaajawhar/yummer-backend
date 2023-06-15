package com.ajp.yummer.controllers;

import com.ajp.yummer.contants.AppConstants;
import com.ajp.yummer.controllers.interfaces.IUserProfileController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alaa Jawhar
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(AppConstants.V1)
public class UserProfileV1Controller implements IUserProfileController {

    @Override
    public Object getUserProfileInit() {
        return "    {\n" +
                "      \"firstName\": \"Alaa Jawhar\",\n" +
                "      \"lastName\": \"alaajawhar@mail.com\",\n" +
                "      \"phoneNumber\": \"+961 71 784741\",\n" +
                "      \"location\": \"Tripoli - North-Lebanon\",\n" +
                "      \"imageUrl\": \"/resource/static/myprofile.jpeg\"\n" +
                "    }";
    }

    @Override
    public Object getUserAddressList() {
        return "{\n" +
                "    \"list\": [\n" +
                "        {\n" +
                "            \"id\": 1,\n" +
                "            \"title\": \"Home\",\n" +
                "            \"subtitle\": \"Tripoli - North Lebanon\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2,\n" +
                "            \"title\": \"Work\",\n" +
                "            \"subtitle\": \"Dbayeh - Jounieh\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 3,\n" +
                "            \"title\": \"Other\",\n" +
                "            \"subtitle\": \"Al wurud\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }
}
