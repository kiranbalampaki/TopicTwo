package com.example.topictwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.topictwo.fragments.AreaofcircleFragment;
import com.example.topictwo.fragments.AutomorphicFragment;
import com.example.topictwo.fragments.PalindromeFragment;
import com.example.topictwo.fragments.ReverseNumberFragment;
import com.example.topictwo.fragments.ReverseStringFragment;
import com.example.topictwo.fragments.SumFragment;

public class MainActivity extends AppCompatActivity {
    private Button btnSum, btnAreaOfCircle, btnReverseNumber, btnPalindrome, btnAutomorphic, btnReverseString;
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSum = findViewById(R.id.btnSum);
        btnAreaOfCircle = findViewById(R.id.btnAreaOfCircle);
        btnReverseNumber = findViewById(R.id.btnReverseNumber);
        btnPalindrome = findViewById(R.id.btnPalindrome);
        btnAutomorphic = findViewById(R.id.btnAutomorphic);
        btnReverseString = findViewById(R.id.btnReverseString);


        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                SumFragment sumFragment = new SumFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, sumFragment);
                fragmentTransaction.commit();
            }
        });

        btnAreaOfCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                AreaofcircleFragment areaofcircleFragment = new AreaofcircleFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, areaofcircleFragment);
                fragmentTransaction.commit();
            }
        });

        btnReverseNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ReverseNumberFragment reverseNumberFragment = new ReverseNumberFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, reverseNumberFragment);
                fragmentTransaction.commit();
            }
        });

        btnPalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                PalindromeFragment palindromeFragment = new PalindromeFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, palindromeFragment);
                fragmentTransaction.commit();
            }
        });

        btnAutomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                AutomorphicFragment automorphicFragment = new AutomorphicFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, automorphicFragment);
                fragmentTransaction.commit();
            }
        });

        btnReverseString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ReverseStringFragment reverseStringFragment = new ReverseStringFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, reverseStringFragment);
                fragmentTransaction.commit();
            }
        });
    }
}
