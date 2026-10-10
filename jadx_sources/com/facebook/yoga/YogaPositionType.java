package com.facebook.yoga;

/* JADX INFO: loaded from: classes45.dex */
public enum YogaPositionType {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);

    private final int mIntValue;

    public static YogaPositionType fromInt(int i11) {
        if (i11 == 0) {
            return STATIC;
        }
        if (i11 == 1) {
            return RELATIVE;
        }
        if (i11 == 2) {
            return ABSOLUTE;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i11);
    }

    public int intValue() {
        return this.mIntValue;
    }

    YogaPositionType(int i11) {
        this.mIntValue = i11;
    }
}
