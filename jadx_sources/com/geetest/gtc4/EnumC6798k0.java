package com.geetest.gtc4;

/* JADX INFO: renamed from: com.geetest.gtc4.k0 */
/* JADX INFO: loaded from: classes45.dex */
public enum EnumC6798k0 {
    DIRECT(0),
    ONE_BYTE(24),
    TWO_BYTES(25),
    FOUR_BYTES(26),
    EIGHT_BYTES(27),
    RESERVED(28),
    INDEFINITE(31);

    private final int value;

    public static EnumC6798k0 ofByte(int i11) {
        switch (i11 & 31) {
            case 24:
                return ONE_BYTE;
            case 25:
                return TWO_BYTES;
            case 26:
                return FOUR_BYTES;
            case 27:
                return EIGHT_BYTES;
            case 28:
            case 29:
            case 30:
                return RESERVED;
            case 31:
                return INDEFINITE;
            default:
                return DIRECT;
        }
    }

    public int getValue() {
        return this.value;
    }

    EnumC6798k0(int i11) {
        this.value = i11;
    }
}
