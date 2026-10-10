package com.fasterxml.jackson.core.p062io;

import com.fasterxml.jackson.core.InterfaceC6306i;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes45.dex */
public abstract class CharacterEscapes implements Serializable {
    public static final int ESCAPE_CUSTOM = -2;
    public static final int ESCAPE_NONE = 0;
    public static final int ESCAPE_STANDARD = -1;

    public abstract int[] getEscapeCodesForAscii();

    public abstract InterfaceC6306i getEscapeSequence(int i11);

    public static int[] standardAsciiEscapesForJSON() {
        int[] iArrM10965e = C6308b.m10965e();
        return Arrays.copyOf(iArrM10965e, iArrM10965e.length);
    }
}
