package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Map;
import p852kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ArrayBasedUnicodeEscaper extends UnicodeEscaper {
    private final char[][] replacements;
    private final int replacementsLength;
    private final int safeMax;
    private final char safeMaxChar;
    private final int safeMin;
    private final char safeMinChar;

    public ArrayBasedUnicodeEscaper(Map<Character, String> map, int i11, int i12, String str) {
        this(ArrayBasedEscaperMap.create(map), i11, i12, str);
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public final String escape(String str) {
        Preconditions.checkNotNull(str);
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if ((cCharAt < this.replacementsLength && this.replacements[cCharAt] != null) || cCharAt > this.safeMaxChar || cCharAt < this.safeMinChar) {
                return escapeSlow(str, i11);
            }
        }
        return str;
    }

    public abstract char[] escapeUnsafe(int i11);

    public ArrayBasedUnicodeEscaper(ArrayBasedEscaperMap arrayBasedEscaperMap, int i11, int i12, String str) {
        Preconditions.checkNotNull(arrayBasedEscaperMap);
        char[][] replacementArray = arrayBasedEscaperMap.getReplacementArray();
        this.replacements = replacementArray;
        this.replacementsLength = replacementArray.length;
        if (i12 < i11) {
            i12 = -1;
            i11 = Integer.MAX_VALUE;
        }
        this.safeMin = i11;
        this.safeMax = i12;
        if (i11 >= 55296) {
            this.safeMinChar = CharCompanionObject.MAX_VALUE;
            this.safeMaxChar = (char) 0;
        } else {
            this.safeMinChar = (char) i11;
            this.safeMaxChar = (char) Math.min(i12, 55295);
        }
    }

    @Override // com.google.common.escape.UnicodeEscaper
    public final int nextEscapeIndex(CharSequence charSequence, int i11, int i12) {
        while (i11 < i12) {
            char cCharAt = charSequence.charAt(i11);
            if ((cCharAt < this.replacementsLength && this.replacements[cCharAt] != null) || cCharAt > this.safeMaxChar || cCharAt < this.safeMinChar) {
                break;
            }
            i11++;
        }
        return i11;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    public final char[] escape(int i11) {
        char[] cArr;
        if (i11 < this.replacementsLength && (cArr = this.replacements[i11]) != null) {
            return cArr;
        }
        if (i11 < this.safeMin || i11 > this.safeMax) {
            return escapeUnsafe(i11);
        }
        return null;
    }
}
