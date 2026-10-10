package com.facebook.yoga;

/* JADX INFO: loaded from: classes45.dex */
public enum YogaDirection {
    INHERIT(0),
    LTR(1),
    RTL(2);

    private final int mIntValue;

    public static YogaDirection fromInt(int i11) {
        if (i11 == 0) {
            return INHERIT;
        }
        if (i11 == 1) {
            return LTR;
        }
        if (i11 == 2) {
            return RTL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i11);
    }

    public int intValue() {
        return this.mIntValue;
    }

    YogaDirection(int i11) {
        this.mIntValue = i11;
    }
}
