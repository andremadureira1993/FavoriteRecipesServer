package com.recipe.api;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.recipe.openapi.LoginApi;
import com.recipe.openapi.LoginRequest;
import com.recipe.openapi.LoginResponse;
import com.recipe.services.LoginService;

@Controller
public class LoginController implements LoginApi {

    @Autowired
    private LoginService authService;

    @Override
    public ResponseEntity<LoginResponse> login(@Valid LoginRequest loginRequest) {
        return ResponseEntity.ok(authService.authenticate(loginRequest));
    }
}
