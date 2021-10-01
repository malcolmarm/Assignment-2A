//Malcolm Armstrong
//Sept. 29th, 2021
//Assignment 2A

class Calculator {
    //No instance variables
    
    //Constructor
    public Calculator() {
        //nothing to put here
    }
    
    
    //Calculation Methods----------------------------------------------------------------------------------------------
    
    
    //Quadratic Formula pt 1
    
    public double qf1(int a, int b, int c) {
        return (-b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
    }
    
    //Quadratic Formula pt 2
    
    public double qf2(int a, int b, int c) {
        return (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
    }
    
    //Slope
    
    public double slope(int x1, int y1, int x2, int y2) {
        return ((double)y2-(double)y1)/((double)x2-(double)x1);
    }
    
    //Midpoint: USE TWICE
    
    public double midpoint(int num1, int num2) {
        return ((double)num1+(double)num2)/2;
    }
    
    //Sum of an arithmetic series
    
    public double sumA(double n, double a1, int k) {
        double ak = a1+((k-1)*n);
        return ((double)k/2)*(a1 + ak);
    }
    
    //Sum of a geometric series
    
    public double sumG(double r, double g1, int gk) {
        return g1*((1-Math.pow((double)r,gk))/(1-(double)r));
    }
    
    
    //Output-----------------------------------------------------------------------------------------------------------
    
    
    public void display(int a, int b, int c, //QF values
    int sx1, int sy1, int sx2, int sy2, //Slope values
    int mx1, int my1, int mx2, int my2, //Midpoint values
    double n, double a1, int k, //Arithmetic series values
    double r, double g1, int gk //Geometric series values
    ) {
        
        //QF output
        
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for "+a+"x^2 + "+b+"x + "+c+" are "+qf1(a,b,c)+" and "+qf2(a,b,c)+".");
        System.out.println();
        
        //Slope output
        
        System.out.println("SLOPE FORMULA");
        System.out.print("A line connecting the points ("+sx1+", "+sy1);
        System.out.println(") ("+sx2+", "+sy2+") has a slope of "+slope(sx1,sy1,sx2,sy2));
        System.out.println();
        
        //Midpoint output
        
        System.out.println("MIDPOINT FORMULA");
        System.out.print("The midpoint between ("+mx1+", "+my1+") and ("+mx2+", "+my2);
        System.out.println(") is ("+midpoint(mx1,mx2)+", "+midpoint(my1,my2)+")");
        System.out.println();
        
        //Arithmetic series output
        
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.println("The sum of the first "+k+" terms of an arithmetic series that starts with "+a1);
        System.out.println("and increases by "+n+" is "+sumA(n,a1,k));
        System.out.println();
        
        //Geometric series output
        
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
        System.out.println("The sum of the first "+gk+" terms of a finite geometric series that starts with "+g1);
        System.out.println("and increases by a rate of "+r+" is "+sumG(r,g1,gk));
        System.out.println();
    }
}