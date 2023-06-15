package com.ajp.yummer.controllers;

import com.ajp.yummer.contants.AppConstants;
import com.ajp.yummer.controllers.interfaces.IUserAuthenticationController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alaa Jawhar
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(AppConstants.V1)
public class UserAuthenticationV1Controller implements IUserAuthenticationController {
    @Override
    public Object signin(Object obj) {
        return  "    {\n" +
                "      \"authToken\": \"authTokenTest\",\n" +
                "      \"refreshToken\": \"refreshTokenTest\"\n" +
                "    }";
    }

    @Override
    public Object signup(Object obj) {
        return "    {\n" +
                "      \"authToken\": \"authTokenTest\",\n" +
                "      \"refreshToken\": \"refreshTokenTest\"\n" +
                "    }";
    }

    @Override
    public Object signout(Object obj) {
        return "    {\n" +
                "      \"isSuccess\": true,\n" +
                "      \"message\": \"Successfully signed out\"\n" +
                "    }";
    }

    @Override
    public Object forgotPassword(Object obj) {
        return "    {\n" +
                "      \"otpKey\": \"otpKeyTest\"\n" +
                "    }";
    }

    @Override
    public Object resetPassword(Object obj) {
        return "    {\n" +
                "      \"isSuccess\": true,\n" +
                "      \"message\": \"Your password had reset\"\n" +
                "    }";
    }
}
