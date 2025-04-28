package a6.calculator.controller;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import a6.calculator.R;

public class CalculatorButtonController implements View.OnClickListener{

    Button button;

    public CalculatorButtonController(Button button) {

        this.button = button;

    }

    public void onClick(View v) {
        Log.d("YOMAMA", "onClick: CLICKED");
    }


}
