import astra.core.Module;

public class arrayModule extends Module {

    int[][] array = new int[16][8];

    @TERM
    public int check(int xcord, int ycord) {
        int x = array[xcord][ycord];
        return x;
    }

    @ACTION
    public boolean add(int xcord, int ycord){
        array[xcord][ycord] += 1;
        return true;
    }
}