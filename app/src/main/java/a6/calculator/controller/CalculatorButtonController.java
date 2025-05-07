package a6.calculator.controller;

import static java.lang.Character.isDigit;

import android.view.View;
import android.widget.Button;

public class CalculatorButtonController implements View.OnClickListener{

    Button button;
    CalculatorModel model;

    public CalculatorButtonController(Button button, CalculatorModel model) {

        this.button = button;

    }

    public void onClick(View v) {

//        if(isDigit(button.getText().charAt(0)) && model.inputs != null && button.getText() != null) {
//            model.inputs.push(button.getText().charAt(0));
//        }
//
//
//        Log.d("YOMAMA", "onClick: PUSHING " + button.getText() + " TO STACK");
    }


}
