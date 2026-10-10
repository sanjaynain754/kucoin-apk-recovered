package com.swmansion.reanimated.keyboard;

/* JADX INFO: loaded from: classes59.dex */
public enum KeyboardState {
    UNKNOWN(0),
    OPENING(1),
    OPEN(2),
    CLOSING(3),
    CLOSED(4);

    private final int mValue;

    public int asInt() {
        return this.mValue;
    }

    KeyboardState(int i11) {
        this.mValue = i11;
    }
}
