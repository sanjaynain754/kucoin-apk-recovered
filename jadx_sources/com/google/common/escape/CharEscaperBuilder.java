package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class CharEscaperBuilder {
    private int max = -1;
    private final Map<Character, String> map = new HashMap();

    public static class CharArrayDecorator extends CharEscaper {
        private final int replaceLength;
        private final char[][] replacements;

        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public String escape(String str) {
            int length = str.length();
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = str.charAt(i11);
                char[][] cArr = this.replacements;
                if (cCharAt < cArr.length && cArr[cCharAt] != null) {
                    return escapeSlow(str, i11);
                }
            }
            return str;
        }

        public CharArrayDecorator(char[][] cArr) {
            this.replacements = cArr;
            this.replaceLength = cArr.length;
        }

        @Override // com.google.common.escape.CharEscaper
        public char[] escape(char c11) {
            if (c11 < this.replaceLength) {
                return this.replacements[c11];
            }
            return null;
        }
    }

    @CanIgnoreReturnValue
    public CharEscaperBuilder addEscape(char c11, String str) {
        this.map.put(Character.valueOf(c11), (String) Preconditions.checkNotNull(str));
        if (c11 > this.max) {
            this.max = c11;
        }
        return this;
    }

    public char[][] toArray() {
        char[][] cArr = new char[this.max + 1][];
        for (Map.Entry<Character, String> entry : this.map.entrySet()) {
            cArr[entry.getKey().charValue()] = entry.getValue().toCharArray();
        }
        return cArr;
    }

    public Escaper toEscaper() {
        return new CharArrayDecorator(toArray());
    }

    @CanIgnoreReturnValue
    public CharEscaperBuilder addEscapes(char[] cArr, String str) {
        Preconditions.checkNotNull(str);
        for (char c11 : cArr) {
            addEscape(c11, str);
        }
        return this;
    }
}
