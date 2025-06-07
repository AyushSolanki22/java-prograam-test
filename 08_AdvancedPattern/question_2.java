public class question_2 {
    public static void main(String[] args) {
        for (int i=0; i<7; ++i) {
            // int num=i;
            for (int j=1+ i; j<=7+i; ++j) {
                System.out.print(j == 7 ? 7 : j % 7);

            }
            System.out.println();
        }
    }

    public static void way2() {
        for (int i=1; i<=7; ++i) {
            int num=i;
            for (int j=1; j<=7; ++j) {
                System.out.println(num);
                ++num;
                if (num>7) {
                    num=1;
                }
            }
        System.out.println();
        }
    }
        
    
}