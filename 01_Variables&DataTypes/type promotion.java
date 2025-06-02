public class Main {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(a);
        System.out.println(a-b);  //In expressions, char, byte and short are converted tp int -- type promotion
        // char c = a-b;   --> it will cause error as int is not converted to short -- lossy conversion
        char c = (char)(a-b); //explicit typecasting
        System.out.println(c);

        //If one operator is long,double or float, the whole expression is promoted to long, double or float respectively. -- converted to the largest datatype used in expression.
        int i =10;
        float fl=25.25f;
        long l = 25;
        double d = 30;
        // int ans = a+b+c+d //the expression results in a double value ,, so it would be a lossy conversion - error.
        double ans = i+fl+l+d;
        System.out.println(ans);


        //Important concept below]]
        byte by =2;
        // b=b*2;   --> This woulg give error as it's lossy conversion from int to byte ,,#type promotion in expression makes b int.
        // logically here there have been no error but it's lossy conversion which lead to error in java

        by=(byte)(by*2);         //explicit typecasting
        System.out.println(by);
    }
}