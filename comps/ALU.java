package comps;

public class ALU {
    private byte inputA;
    private byte inputB;
    private byte opcode;
    private boolean carryIn;

    private byte output;
    private boolean carryOut;
    private boolean aLarger;
    private boolean equal;
    private boolean zero;

    public ALU() {
        this.inputA = 0x00000000;
        this.inputB = 0x00000000;
        this.opcode = 0x00000000;
        this.carryIn = false;

        this.output = 0x00000000;
        this.carryOut = false;
        this.aLarger = false;
        this.equal = false;
        this.zero = false;
    }

    
    
}
