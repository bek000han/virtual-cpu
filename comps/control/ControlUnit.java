package comps.control;

import comps.arth_logic.ALUnit;
import comps.arth_logic.Bus1;
import comps.memory.GenericRegister;
import comps.memory.RAM128;
import comps.memory.SetOnlyRegister;

public class ControlUnit {
    private RAM128 RAM;
    private ALUnit ALU;

    private GenericRegister R0;
    private GenericRegister R1;
    private GenericRegister R2;
    private GenericRegister R3;

    private GenericRegister ACC;
    private GenericRegister PC;

    private SetOnlyRegister MAR;
    private SetOnlyRegister FLAGS;
    private SetOnlyRegister IR;
    private SetOnlyRegister TMP;
    
    private Bus1 bus1;
}
