package com.example.apli_logi;

import androidx.annotation.Nullable;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL="http://localhost/Registro.php";
    private Map<String,String> params;
    public RegisterRequest(String name, String username, int edad, String password, String email, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null );
        params=new HashMap<>();
        params.put("name", name);
        params.put("username", username);
        params.put("3dad", edad+"");
        params.put("password", password);
        params.put("email", email);
    }

    @Nullable
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
