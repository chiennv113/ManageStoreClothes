package com.android.mob104.managestoreclothes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActicity extends AppCompatActivity implements View.OnClickListener {

    private TextInputLayout textInputLayout1;
    private TextInputEditText edtUsername;
    private TextView tvForgotpass;
    private TextInputLayout textInputLayout;
    private TextInputEditText edtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_acticity);
        initView();

        btnLogin.setOnClickListener(this);

    }

    private void initView() {
        textInputLayout1 = findViewById(R.id.textInputLayout1);
        edtUsername = findViewById(R.id.edt_username);
        tvForgotpass = findViewById(R.id.tv_forgotpass);
        textInputLayout = findViewById(R.id.textInputLayout);
        edtPassword = findViewById(R.id.edt_password);
        btnLogin = findViewById(R.id.btn_login);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                startActivity(new Intent(LoginActicity.this, HomeActivity.class));
                break;
        }
    }
}
