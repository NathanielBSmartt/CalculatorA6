package a6.calculator.view;

import android.app.Activity;
import android.widget.Button;

import a6.calculator.R;
import a6.calculator.controller.CalculatorButtonController;

public class CalculatorView {

    Button[][] mainButtons = new Button[4][4];
    Button clear;
    Button add;
    Button sub;
    Button mul;
    Button div;

    public CalculatorView(Activity Act) {
        mainButtons[0][0] = Act.findViewById(R.id.one);
        mainButtons[0][0].setOnClickListener(new CalculatorButtonController(mainButtons[0][0]));
        mainButtons[0][1] = Act.findViewById(R.id.four);
        mainButtons[0][1].setOnClickListener(new CalculatorButtonController(mainButtons[0][1]));
        mainButtons[0][2] = Act.findViewById(R.id.seven);
        mainButtons[0][2].setOnClickListener(new CalculatorButtonController(mainButtons[0][2]));
        mainButtons[0][3] = Act.findViewById(R.id.plusminus);
        mainButtons[0][3].setOnClickListener(new CalculatorButtonController(mainButtons[0][3]));
        mainButtons[1][0] = Act.findViewById(R.id.two);
        mainButtons[1][0].setOnClickListener(new CalculatorButtonController(mainButtons[1][0]));
        mainButtons[1][1] = Act.findViewById(R.id.five);
        mainButtons[1][1].setOnClickListener(new CalculatorButtonController(mainButtons[1][1]));
        mainButtons[1][2] = Act.findViewById(R.id.eight);
        mainButtons[1][2].setOnClickListener(new CalculatorButtonController(mainButtons[1][2]));
        mainButtons[1][3] = Act.findViewById(R.id.zero);
        mainButtons[1][3].setOnClickListener(new CalculatorButtonController(mainButtons[1][3]));
        mainButtons[2][0] = Act.findViewById(R.id.three);
        mainButtons[2][0].setOnClickListener(new CalculatorButtonController(mainButtons[2][0]));
        mainButtons[2][1] = Act.findViewById(R.id.six);
        mainButtons[2][1].setOnClickListener(new CalculatorButtonController(mainButtons[2][1]));
        mainButtons[2][2] = Act.findViewById(R.id.nine);
        mainButtons[2][2].setOnClickListener(new CalculatorButtonController(mainButtons[2][2]));
        mainButtons[2][3] = Act.findViewById(R.id.enter);
        mainButtons[2][3].setOnClickListener(new CalculatorButtonController(mainButtons[2][3]));

        clear = Act.findViewById(R.id.clear);
        clear.setOnClickListener(new CalculatorButtonController(clear));
        add = Act.findViewById(R.id.add);
        add.setOnClickListener(new CalculatorButtonController(add));
        sub = Act.findViewById(R.id.sub);
        sub.setOnClickListener(new CalculatorButtonController(sub));
        mul = Act.findViewById(R.id.mul);
        mul.setOnClickListener(new CalculatorButtonController(mul));
        div = Act.findViewById(R.id.div);
        div.setOnClickListener(new CalculatorButtonController(div));
    }


}
