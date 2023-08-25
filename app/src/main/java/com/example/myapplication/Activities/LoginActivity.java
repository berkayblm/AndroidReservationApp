package com.example.myapplication.Activities;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

     TextView signUpTextView, forgetPasswordTextView, loginLabel;
     Button loginButton, googleSignInButton, facebookSignInButton;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        initializeFields(); // init fields

        startSlideUpAnimation();    // start the animation
        startHorizontalSlideAnimation(); // horizontal label anim



        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });


    }

    private void initializeFields() {
        loginButton = findViewById(R.id.loginButton);
        googleSignInButton = findViewById(R.id.googleSingInButton);
        facebookSignInButton = findViewById(R.id.facebookSignInButton);
        signUpTextView = findViewById(R.id.signUpTextView);
        forgetPasswordTextView = findViewById(R.id.forgetPasswordTextView);
        layout = findViewById(R.id.fragment_container);
        loginLabel = findViewById(R.id.loginLabel);

    }

    public void goToSignInActivity(View view) {
        Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);

        startActivity(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Paused Activity");
        //startSlideUpAnimation();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("Restarted Activity");
        startSlideUpAnimation();
        startHorizontalSlideAnimation();


    }

    private void startHorizontalSlideAnimation() {
        Animation label_anim = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.horizontal_anim);

        // Start animation
        loginLabel.startAnimation(label_anim);
    }
    private void startSlideUpAnimation() {
        Animation slide_up = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slideup);

        // Start animation
        layout.startAnimation(slide_up);
    }

    private void startSlideDownAnimation() {
        Animation slide_down = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slidedown);

        layout.startAnimation(slide_down);

    }


}