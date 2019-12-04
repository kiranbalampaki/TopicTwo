package com.example.topictwo.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.topictwo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReverseNumberFragment extends Fragment implements View.OnClickListener {
    private EditText etNumber;
    private TextView tvReversedNumber;
    private Button btnReverse;

    public ReverseNumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reverse_number, container, false);

        etNumber = view.findViewById(R.id.etNumber);
        tvReversedNumber = view.findViewById(R.id.tvReversedNumber);
        btnReverse = view.findViewById(R.id.btnReverse);

        btnReverse.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etNumber.getText())){
            etNumber.setError("Enter a Number");
            return;
        }

        int numberToReverse = Integer.parseInt(etNumber.getText().toString());

        int reversedInteger = 0, remainder;

        while( numberToReverse != 0 )
        {
            remainder = numberToReverse % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            numberToReverse = numberToReverse/10;
        }

        tvReversedNumber.setText("The reversed number is : " + reversedInteger);
    }
}
