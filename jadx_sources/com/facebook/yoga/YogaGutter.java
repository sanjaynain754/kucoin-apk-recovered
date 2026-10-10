package com.facebook.yoga;

/* JADX INFO: loaded from: classes45.dex */
public enum YogaGutter {
    COLUMN(0),
    ROW(1),
    ALL(2);

    private final int mIntValue;

    public static YogaGutter fromInt(int i11) {
        if (i11 == 0) {
            return COLUMN;
        }
        if (i11 == 1) {
            return ROW;
        }
        if (i11 == 2) {
            return ALL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i11);
    }

    public int intValue() {
        return this.mIntValue;
    }

    YogaGutter(int i11) {
        this.mIntValue = i11;
    }
}
