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
public class AutomorphicFragment extends Fragment implements View.OnClickListener{
    EditText etNumber;
    TextView tvResult;
    Button btnCheckAutomorphic;

    public AutomorphicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);

        etNumber = view.findViewById(R.id.etNumber);
        tvResult = view.findViewById(R.id.tvResult);
        btnCheckAutomorphic = view.findViewById(R.id.btnCheckAutomorphic);

        btnCheckAutomorphic.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etNumber.getText())){
            etNumber.setError("Enter a Number");
            return;
        }

        int number = Integer.parseInt(etNumber.getText().toString());
        int squaredNumber = number * number;

        if(Integer.toString(squaredNumber).endsWith(Integer.toString(number))){
            tvResult.setText("The number is Automorphic");
        }
        else {
            tvResult.setText("The number is not Automorphic");
        }
    }
}
