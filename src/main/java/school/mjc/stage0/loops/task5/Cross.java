package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
                String str="";
                for (int j = 0; j <sideLength; j++) {
                    if (sideLength/2==i) {
                        str+="8";
                    }else if (sideLength/2==j) {
                        str+="8";
                    }else {
                        str+=" ";
                    }
                }
            System.out.println(str);
            }
        }
    }
