package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int i = 0; i < sideLength; i++) {
            String str="";
            for (int j = 0; j < sideLength; j++) {
                if(i==0 || i==sideLength-1){
                    str+="8";
                } else if (j==0||j==sideLength-1) {
                    str+="8";
                }else {
                    str+=" ";
                }
            }
            System.out.println(str);
        }
    }
}
