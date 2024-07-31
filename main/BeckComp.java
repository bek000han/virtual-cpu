package main;

import comps.arth_logic.ALUnit;
import comps.arth_logic.Bus1;
import comps.control.ControlUnit;
import comps.memory.Bus;
import comps.memory.GenericRegister;
import comps.memory.RAM256;
import comps.memory.SetOnlyRegister;

public class BeckComp {
    private ControlUnit CU;
    private RAM256 RAM;
    private ALUnit ALU;
    private Bus bus;

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
