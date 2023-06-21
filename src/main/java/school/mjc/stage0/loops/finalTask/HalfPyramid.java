package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int y = 1; y <= cathetusLength; y++){
            System.out.print(" ".repeat(cathetusLength-y));
            for(int x = 1; x <= cathetusLength; x++){
                if (y >= x){
                    System.out.print("*");
                }
            }
            System.out.println("");

        }
        if (cathetusLength == 0){
            System.out.print("");
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
