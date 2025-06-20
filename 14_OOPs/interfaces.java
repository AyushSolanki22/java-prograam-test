public class interfaces {
    public static void main(String[] args) {
        
    }
}
interface ChessPlayer {
    void moves();
}
class Queen implements ChessPlayer {
    public void moves() {     //we write public keyword as to ensure that this doesn't be default function.& also interface has made public moves() method.
         System.out.println("up,down,left,right,diagonal(in all 4 directions )");
    }
}
class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right,diagonal -(all 1 step only)");
    }
}
