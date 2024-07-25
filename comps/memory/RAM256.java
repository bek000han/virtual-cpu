package comps.memory;

public class RAM256 {
    private byte[][] matrix;
    private byte input;
    private SetOnlyRegister MAR;

    public RAM256(SetOnlyRegister MAR) {
        this.matrix = new byte[16][16];
        this.MAR = MAR;
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
