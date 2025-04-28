package a6.calculator.model;
import android.util.Log;

import java.util.Stack;

public class CalculatorModel {

    public Stack<Character> inputs;
    int firstNumber;
    int secondNumber;
    char operation;

    public CalculatorModel(){
        inputs = new Stack<Character>();
        firstNumber = 0;
        secondNumber = 0;
        operation = ' ';
    }

    public void printStack(){
        for(int i = 0; i < inputs.size(); i++){
            Log.i("YOMAMA", "printStack: " + inputs.get(i));
        }

    }

}