package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Map;
import p852kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ArrayBasedCharEscaper extends CharEscaper {
    private final char[][] replacements;
    private final int replacementsLength;
    private final char safeMax;
    private final char safeMin;

    public ArrayBasedCharEscaper(Map<Character, String> map, char c11, char c12) {
        this(ArrayBasedEscaperMap.create(map), c11, c12);
    }

    @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
    public final String escape(String str) {
        Preconditions.checkNotNull(str);
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if ((cCharAt < this.replacementsLength && this.replacements[cCharAt] != null) || cCharAt > this.safeMax || cCharAt < this.safeMin) {
                return escapeSlow(str, i11);
            }
        }
        return str;
    }

    public abstract char[] escapeUnsafe(char c11);

    public ArrayBasedCharEscaper(ArrayBasedEscaperMap arrayBasedEscaperMap, char c11, char c12) {
        Preconditions.checkNotNull(arrayBasedEscaperMap);
        char[][] replacementArray = arrayBasedEscaperMap.getReplacementArray();
        this.replacements = replacementArray;
        this.replacementsLength = replacementArray.length;
        if (c12 < c11) {
            c12 = 0;
            c11 = CharCompanionObject.MAX_VALUE;
        }
        this.safeMin = c11;
        this.safeMax = c12;
    }

    @Override // com.google.common.escape.CharEscaper
    public final char[] escape(char c11) {
        char[] cArr;
        if (c11 < this.replacementsLength && (cArr = this.replacements[c11]) != null) {
            return cArr;
        }
        if (c11 < this.safeMin || c11 > this.safeMax) {
            return escapeUnsafe(c11);
        }
        return null;
    }
}
