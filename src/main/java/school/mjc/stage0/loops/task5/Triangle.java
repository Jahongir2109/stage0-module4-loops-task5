package school.mjc.stage0.loops.task5;

public class Triangle {
    public static void main(String[] args) {
        printTriangle(5);
    }
    public static void printTriangle(int cathetusLength) {
        String str="";
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j <= i; j++) {
                if(j==i){
                    str+="8\n";
                }else {
                    str += "8";
                }
            }
        }
        System.out.println(str);
    }
}
