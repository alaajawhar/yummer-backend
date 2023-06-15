package com.ajp.yummerauthserver.controllers;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alaa Jawhar
 */
@RestController
public class UserController implements IUserController {

    @Override
    public Object createUser(Object obj) {
        return "Created!";
    }

    @Override
    public Object updateUser(Object obj) {
        return "updateUser";
    }

    @Override
    public Object getUserByCriteria(Object obj) {
        return "getUserByCriteria";
    }

    @Override
    public Object deleteUser(Object obj) {
        return "deleteUser";
    }
}
