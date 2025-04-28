package a6.calculator.view;

import android.app.Activity;
import android.widget.Button;

import a6.calculator.R;
import a6.calculator.controller.CalculatorButtonController;
import a6.calculator.model.CalculatorModel;

public class CalculatorView {

    CalculatorModel model;
    Button[][] mainButtons = new Button[4][4];
    Button clear;
    Button add;
    Button sub;
    Button mul;
    Button div;

    public CalculatorView(Activity Act, CalculatorModel model) {
        mainButtons[0][0] = Act.findViewById(R.id.one);
        mainButtons[0][0].setOnClickListener(new CalculatorButtonController(mainButtons[0][0], model));
        mainButtons[0][1] = Act.findViewById(R.id.four);
        mainButtons[0][1].setOnClickListener(new CalculatorButtonController(mainButtons[0][1], model));
        mainButtons[0][2] = Act.findViewById(R.id.seven);
        mainButtons[0][2].setOnClickListener(new CalculatorButtonController(mainButtons[0][2], model));
        mainButtons[0][3] = Act.findViewById(R.id.plusminus);
        mainButtons[0][3].setOnClickListener(new CalculatorButtonController(mainButtons[0][3], model));
        mainButtons[1][0] = Act.findViewById(R.id.two);
        mainButtons[1][0].setOnClickListener(new CalculatorButtonController(mainButtons[1][0], model));
        mainButtons[1][1] = Act.findViewById(R.id.five);
        mainButtons[1][1].setOnClickListener(new CalculatorButtonController(mainButtons[1][1], model));
        mainButtons[1][2] = Act.findViewById(R.id.eight);
        mainButtons[1][2].setOnClickListener(new CalculatorButtonController(mainButtons[1][2], model));
        mainButtons[1][3] = Act.findViewById(R.id.zero);
        mainButtons[1][3].setOnClickListener(new CalculatorButtonController(mainButtons[1][3], model));
        mainButtons[2][0] = Act.findViewById(R.id.three);
        mainButtons[2][0].setOnClickListener(new CalculatorButtonController(mainButtons[2][0], model));
        mainButtons[2][1] = Act.findViewById(R.id.six);
        mainButtons[2][1].setOnClickListener(new CalculatorButtonController(mainButtons[2][1], model));
        mainButtons[2][2] = Act.findViewById(R.id.nine);
        mainButtons[2][2].setOnClickListener(new CalculatorButtonController(mainButtons[2][2], model));
        mainButtons[2][3] = Act.findViewById(R.id.enter);
        mainButtons[2][3].setOnClickListener(new CalculatorButtonController(mainButtons[2][3], model));

        clear = Act.findViewById(R.id.clear);
        clear.setOnClickListener(new CalculatorButtonController(clear, model));
        add = Act.findViewById(R.id.add);
        add.setOnClickListener(new CalculatorButtonController(add, model));
        sub = Act.findViewById(R.id.sub);
        sub.setOnClickListener(new CalculatorButtonController(sub, model));
        mul = Act.findViewById(R.id.mul);
        mul.setOnClickListener(new CalculatorButtonController(mul, model));
        div = Act.findViewById(R.id.div);
        div.setOnClickListener(new CalculatorButtonController(div, model));
    }


}
