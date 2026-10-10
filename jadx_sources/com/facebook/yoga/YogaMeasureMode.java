package com.facebook.yoga;

/* JADX INFO: loaded from: classes45.dex */
public enum YogaMeasureMode {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private final int mIntValue;

    public static YogaMeasureMode fromInt(int i11) {
        if (i11 == 0) {
            return UNDEFINED;
        }
        if (i11 == 1) {
            return EXACTLY;
        }
        if (i11 == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i11);
    }

    public int intValue() {
        return this.mIntValue;
    }

    YogaMeasureMode(int i11) {
        this.mIntValue = i11;
    }
}
