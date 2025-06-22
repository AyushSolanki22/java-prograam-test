public class problem12 {
    public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[] ) {
        if (idx==str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==false){
            //unique
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);

        }
        else {
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }


    }
    public static void main(String[] args) {
        String str="ayyyuushhsollannkkkkii";

        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
//Note: 
//Which contains uppercase letters like A, S.
// ⚠️ 'A' - 'a' gives a negative number → causes ArrayIndexOutOfBoundsException