//multipe functions with the same name but different parameters.

public class method_overloading {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.5, (float)2.5)); //explicit typecasting,as default-double
        System.out.println(calc.sum(1,2,3));

    }    
}
class Calculator {
    int sum(int a,int b) {
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a,int b,int c) {
        return a+b+c;
    }
}
//it is compile-time polymorphism, as compiler knows before run only, which function to be called when.