package comps.memory;

public class RAM128 {
    private byte[][] map;
    private byte input;
    private SetOnlyRegister MAR;
    private Bus bus;

    public RAM128(SetOnlyRegister MAR, Bus bus) {
        this.map = new byte[8][8];
        this.MAR = MAR;
        this.bus = bus;
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
