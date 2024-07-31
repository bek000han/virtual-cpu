package comps.arth_logic;

import comps.memory.Bus;
import comps.memory.GenericRegister;
import comps.memory.SetOnlyRegister;

public class ALUnit {
    private byte opcode;
    private boolean carryIn;
    private byte inputA;
    private byte inputB;
    private byte output;

    private SetOnlyRegister FLAGS;
    private GenericRegister ACC;
    private Bus1 bus1;
    private Bus bus;

    public ALUnit(SetOnlyRegister flags, GenericRegister acc, Bus1 bus1, Bus bus) {
        this.opcode = 0x00000000;
        this.carryIn = false;
        this.output = 0x00000000;
        this.inputA = 0x00000000;
        this.inputB = 0x00000000;

        this.FLAGS = flags;
        this.ACC = acc;
        this.bus1 = bus1;
        this.bus = bus;
    }
    
    
    
}
