package com.facebook.yoga;

/* JADX INFO: loaded from: classes45.dex */
public enum YogaUnit {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);

    private final int mIntValue;

    public static YogaUnit fromInt(int i11) {
        if (i11 == 0) {
            return UNDEFINED;
        }
        if (i11 == 1) {
            return POINT;
        }
        if (i11 == 2) {
            return PERCENT;
        }
        if (i11 == 3) {
            return AUTO;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i11);
    }

    public int intValue() {
        return this.mIntValue;
    }

    YogaUnit(int i11) {
        this.mIntValue = i11;
    }
}
