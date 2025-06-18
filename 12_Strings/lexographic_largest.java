public class lexographic_largest {
    //Java has a compareTo function to compare string based on lexographic comparision.
    public static void main(String[] args) {
        String fruits[]={"apple","mango","banana"};

        String largest=fruits[0];
        for(int i=1; i<fruits.length; ++i) {
            if (largest.compareTo(fruits[i])<0) {
                 largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}
