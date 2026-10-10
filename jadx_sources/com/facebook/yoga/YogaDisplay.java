package com.facebook.yoga;

/* JADX INFO: loaded from: classes45.dex */
public enum YogaDisplay {
    FLEX(0),
    NONE(1),
    CONTENTS(2);

    private final int mIntValue;

    public static YogaDisplay fromInt(int i11) {
        if (i11 == 0) {
            return FLEX;
        }
        if (i11 == 1) {
            return NONE;
        }
        if (i11 == 2) {
            return CONTENTS;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i11);
    }

    public int intValue() {
        return this.mIntValue;
    }

    YogaDisplay(int i11) {
        this.mIntValue = i11;
    }
}
