package com.facebook.yoga;

import p224e7.InterfaceC37085a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC37085a
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);

    private final int mIntValue;

    @InterfaceC37085a
    public static YogaLogLevel fromInt(int i11) {
        if (i11 == 0) {
            return ERROR;
        }
        if (i11 == 1) {
            return WARN;
        }
        if (i11 == 2) {
            return INFO;
        }
        if (i11 == 3) {
            return DEBUG;
        }
        if (i11 == 4) {
            return VERBOSE;
        }
        if (i11 == 5) {
            return FATAL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i11);
    }

    public int intValue() {
        return this.mIntValue;
    }

    YogaLogLevel(int i11) {
        this.mIntValue = i11;
    }
}
