//Malcolm Armstrong
//Sept. 29th, 2021
//Assignment 2A

class CalculatorDriver {
    public static void main (String[] args) {
        //Creating a Calculator object
        Calculator c = new Calculator();
        
        /*input values in this format and order:
         * a,b,c for QF
         * x1,y1,x2,y2 for slope
         * x1,y1,x2,y2 for midpoint
         * incrimenting value, initial value, number of values for arithmetic series
         * rate of increase, initial value, number of values for geometric series
         */
        c.display(1,5,6,
        0,0,2,3,
        0,0,2,3,
        1,1,5,
        2,3,3);
    }
}