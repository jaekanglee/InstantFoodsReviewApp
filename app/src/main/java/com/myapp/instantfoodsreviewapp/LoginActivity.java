package com.myapp.instantfoodsreviewapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.myapp.instantfoodsreviewapp.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Button loginButton;
    private TextView loginTextView;
    private ActivityLoginBinding loginBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        init();

    }

    public void init() {
        loginButton = loginBinding.loginButton;
        loginButton.setOnClickListener(this);
        loginTextView = loginBinding.tvRegisterEmail;
        loginTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.login_button:
                break;
            case R.id.tv_register_email:
                intent = new Intent(this, RegisterActivity.class);
                break;
        }
        startActivity(intent);
    }


}
