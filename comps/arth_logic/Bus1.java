package comps.arth_logic;

import comps.memory.SetOnlyRegister;

public class Bus1 {
    private SetOnlyRegister TMP;
    private boolean set;

    public Bus1(SetOnlyRegister tmp) {
        this.TMP = tmp;
    }

    public byte contents() {
        return TMP.contents();
    }

    private 
}
