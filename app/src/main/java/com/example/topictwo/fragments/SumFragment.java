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
import android.widget.Toast;

import com.example.topictwo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SumFragment extends Fragment implements View.OnClickListener {
    private EditText etFirst, etSecond;
    private TextView tvSum;
    private Button btnCalculate;

    public SumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sum, container, false);

        etFirst = view.findViewById(R.id.etFirst);
        etSecond = view.findViewById(R.id.etSecond);
        btnCalculate = view.findViewById(R.id.btnCalculate);
        tvSum = view.findViewById(R.id.tvSum);

        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etFirst.getText())){
            etFirst.setError("Enter a number");
            return;
        }
        else if (TextUtils.isEmpty(etSecond.getText())){
            etSecond.setError("Enter a number");
            return;
        }

        int first = Integer.parseInt(etFirst.getText().toString());
        int second = Integer.parseInt(etSecond.getText().toString());
        int result = first + second;

        tvSum.setText("The Sum is : " + result);
    }
}
