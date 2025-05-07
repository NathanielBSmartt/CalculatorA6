package a6.calculator.model;

import java.util.LinkedList;

public class StackCalculator extends LinkedList<Integer> {

    private DisplayState dState = DisplayState.INPUT;


    public Integer addFn(){
        try{
            int sum = Math.addExact(this.pop(), this.pop());
            return sum;
        } catch (ArithmeticException e){
            throw new OverflowException("Ouch!");

        }
    }

    public void setDisplayState(DisplayState ds){
        dState = ds;
    }

    public DisplayState getDisplayState(DisplayState ds){
        return this.dState;
    }

}
