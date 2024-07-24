package comps.memory;

import java.util.HashMap;

public class RAM256 {
    private byte[][] matrix;
    private byte input;
    private MARegister reference;

    public RAM256(MARegister reference) {
        this.matrix = new byte[16][16];
        this.reference = reference;
    }

    public void set() {

    } 

    public void enable() {

    }

    // takes the byte input, splits it and returns 2 ints as indices for access to the matrix
    private int[] decode() {
        String byteString = String.valueOf(this.input);
        int nibble1 = Integer.valueOf(byteString.substring(0, 3));
        int nibble2 = Integer.valueOf(byteString.substring(4));
        return new int[]{nibble1, nibble2};
    }
}
