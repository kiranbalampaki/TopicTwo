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
public class AreaofcircleFragment extends Fragment implements View.OnClickListener {
    private EditText etRadius;
    private TextView tvArea;
    private Button btnCalculate;

    public AreaofcircleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_areaofcircle, container, false);

        etRadius = view.findViewById(R.id.etRadius);
        btnCalculate = view.findViewById(R.id.btnCalculate);
        tvArea = view.findViewById(R.id.tvArea);

        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etRadius.getText())){
            etRadius.setError("Enter radius");
            return;
        }
        double radius = Double.parseDouble(etRadius.getText().toString());
        double area = Math.PI * radius * radius;

        tvArea.setText("The Area is : " + Double.toString(area).substring(0,6));
    }
}
