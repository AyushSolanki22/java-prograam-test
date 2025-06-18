public class shortestPath {
    public static float getShortestPath(String p) {
        int x=0,y=0;  //origin

        for (int i=0; i<p.length(); ++i) {
            char dir=p.charAt(i);
            //South
            if (dir=='S') {
                --y;
            }
            //north
            else if(dir=='N') {
                ++y;
            }
            else if (dir=='W') {
                --x;
            }
            else {
                ++x;
            }   
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2); //math.sqrt return value in double dataType.


    }
    public static void main(String[] args) {
        String path="WNEENESENNN";

        System.out.println("Shortest path: "+getShortestPath(path));

    }
}
