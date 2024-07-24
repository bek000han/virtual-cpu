package main;

import comps.ALU;
import comps.Bus;
import comps.control.ControlUnit;
import comps.memory.Accumulator;
import comps.memory.FRegister;
import comps.memory.GPRegister;
import comps.memory.IARegister;
import comps.memory.IRegister;
import comps.memory.MARegister;
import comps.memory.RAM256;
import comps.memory.TMPRegister;

public class BeckPC {
    private ControlUnit CU;
    private RAM256 RAM;
    private ALU ALU;

    private GPRegister R0;
    private GPRegister R1;
    private GPRegister R2;
    private GPRegister R3;
    
    private MARegister MAR;
    private Accumulator ACC;
    private IARegister IAR;
    private IRegister IR;
    private TMPRegister TMP;
    private FRegister FLAGS;

    private Bus bus;
}
