package com.example.fragment_20200525.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.fragment_20200525.R;
import com.example.fragment_20200525.databinding.FragmentFirstBinding;

public class FirstFragment extends BaseFragment {
    FragmentFirstBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container,false);
        return binding.getRoot();
    }
// 나를 담고 있는 액티비티의 onCreate가 실행된 시점
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // 액티비티의 onCreate처럼 여러가지 기능 작성
        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = binding.messageEdt.getText().toString();
                binding.myTxt.setText(input);
            }
        });
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }
}
