package com.example.myapplication;

import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.myapplication.R;
public class MyViewModel extends ViewModel {
    private MutableLiveData<Boolean> buttonClicked = new MutableLiveData<>(false);

    public LiveData<Boolean> getButtonClicked() {
        return buttonClicked;
    }

    public void onButtonClicked(TextView textView) {
        if (!buttonClicked.getValue()){
            textView.setText(R.string.my_text_view_text_new);
            buttonClicked.setValue(true);
        }
        else {
            textView.setText(R.string.my_text_view_text);
            buttonClicked.setValue(false);
        }
    }
}
