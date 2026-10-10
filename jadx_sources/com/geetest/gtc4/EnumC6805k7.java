package com.geetest.gtc4;

/* JADX INFO: renamed from: com.geetest.gtc4.k7 */
/* JADX INFO: loaded from: classes45.dex */
public enum EnumC6805k7 {
    SIMPLE_VALUE,
    SIMPLE_VALUE_NEXT_BYTE,
    IEEE_754_HALF_PRECISION_FLOAT,
    IEEE_754_SINGLE_PRECISION_FLOAT,
    IEEE_754_DOUBLE_PRECISION_FLOAT,
    BREAK;

    public static EnumC6805k7 ofByte(int i11) throws C6853q1 {
        switch (i11 & 31) {
            case 24:
                return SIMPLE_VALUE_NEXT_BYTE;
            case 25:
                return IEEE_754_HALF_PRECISION_FLOAT;
            case 26:
                return IEEE_754_SINGLE_PRECISION_FLOAT;
            case 27:
                return IEEE_754_DOUBLE_PRECISION_FLOAT;
            case 28:
            case 29:
            case 30:
                throw new C6853q1("Not implemented special type " + i11);
            case 31:
                return BREAK;
            default:
                return SIMPLE_VALUE;
        }
    }
}
