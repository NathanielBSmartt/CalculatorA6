package a6.calculator.model;

import android.os.Build;

import java.util.LinkedList;

public class StackCalculator extends LinkedList<Integer> {

    private DisplayState dState = DisplayState.INPUT;
    private String overFlowMessage = "Overflow";
    private String argumentMessage = "Not enough args";
    private String divByZeroMessage = "Division by 0";

    //add top two items and push sum to stack
    public void addFn(){
        if(checkSize()){
            try{
                int sum = Math.addExact(this.pop(), this.pop());
                this.push(sum);
            } catch (ArithmeticException e){
                throw new OverflowException(overFlowMessage);

            }
        } else {
            throw new NotEnoughArgumentsException(argumentMessage);
        }
    }
    public void subtractFn() {
        if(checkSize()){
            try{
                int num1 = this.pop();
                int difference = Math.subtractExact(this.pop(),num1);
                this.push(difference);
            } catch (ArithmeticException e){
                throw new OverflowException(overFlowMessage);

            }
        } else {
            throw new NotEnoughArgumentsException(argumentMessage);
        }
    }

    public void multiplyFn() {
        if(checkSize()){
            try{
                int product = Math.multiplyExact(this.pop(), this.pop());
                this.push(product);
            } catch (ArithmeticException e){
                throw new OverflowException(overFlowMessage);

            }
        } else {
            throw new NotEnoughArgumentsException(argumentMessage);
        }
    }

    public void divideExact() {
        if(checkSize()){
            if(this.peek() == 0){
                throw new DivisionByZeroException(divByZeroMessage);
            }else {
                try{
                    int num1 = this.pop();
                    int quotient;
                    //NOTE THIS OCCURRED BECAUSE DIVIDE-EXACT REQUIRED LATER SDK
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.VANILLA_ICE_CREAM) {
                        quotient = Math.divideExact(this.pop(), num1);
                    }else{
                        quotient = this.pop() / num1;
                    }
                    this.push(quotient);
                } catch (ArithmeticException e){
                    throw new OverflowException(overFlowMessage);
                }
            }
        } else {
            throw new NotEnoughArgumentsException(argumentMessage);
        }
    }

    //checks for numbers in stack to be more than 1 or throws exception
    public boolean checkSize(){
        if (this.size() > 1){
            return true;
        }else{
            return false;
        }
    }

    public void setDisplayState(DisplayState ds){
        dState = ds;
    }

    public DisplayState getDisplayState(DisplayState ds){
        return this.dState;
    }


}
