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

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReverseStringFragment extends Fragment implements View.OnClickListener{
    private EditText etString;
    private Button btnReverseString;
    private TextView tvReversedString;

    public ReverseStringFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reverse_string, container, false);

        etString = view.findViewById(R.id.etString);
        btnReverseString = view.findViewById(R.id.btnReverseString);
        tvReversedString = view.findViewById(R.id.tvReversedString);

        btnReverseString.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etString.getText())){
            etString.setError("Enter a Text");
            return;
        }

        String textToReverse = etString.getText().toString();
        StringBuilder reversedText = new StringBuilder(textToReverse);

        tvReversedString.setText(reversedText.reverse().toString());
    }
}
