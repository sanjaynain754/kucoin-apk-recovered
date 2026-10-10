package com.facebook.yoga;

/* JADX INFO: loaded from: classes45.dex */
public enum YogaWrap {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);

    private final int mIntValue;

    public static YogaWrap fromInt(int i11) {
        if (i11 == 0) {
            return NO_WRAP;
        }
        if (i11 == 1) {
            return WRAP;
        }
        if (i11 == 2) {
            return WRAP_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i11);
    }

    public int intValue() {
        return this.mIntValue;
    }

    YogaWrap(int i11) {
        this.mIntValue = i11;
    }
}
