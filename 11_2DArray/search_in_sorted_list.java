//search for a key in row wise & column wise sorted matrix.
public class search_in_sorted_list {
    public static boolean staircaseSearch(int m[][], int key) {
        //0(n+m) time complexity;
        int row=0,col=m.length-1;
        while (row<m.length && col>=0) {
             if (m[row][col]==key) {
                 System.out.println("Found key at ("+row+","+col+")");
                 return true;
             }
             //left
             else if(key<m[row][col]) {
                --col;
             }
             //bottom
             else {
                ++row;
             }
        }
        return false;
        
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};

        int key=32;
        boolean bool=staircaseSearch(matrix,key);
        System.out.println(bool==true? "":"Not found");
    }
}
