package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
final class ParseRequest {
    final int radix;
    final String rawValue;

    private ParseRequest(String str, int i11) {
        this.rawValue = str;
        this.radix = i11;
    }

    public static ParseRequest fromString(String str) {
        if (str.length() != 0) {
            char cCharAt = str.charAt(0);
            int i11 = 16;
            if (!str.startsWith("0x") && !str.startsWith("0X")) {
                if (cCharAt == '#') {
                    str = str.substring(1);
                } else if (cCharAt == '0' && str.length() > 1) {
                    str = str.substring(1);
                    i11 = 8;
                } else {
                    i11 = 10;
                }
            } else {
                str = str.substring(2);
            }
            return new ParseRequest(str, i11);
        }
        throw new NumberFormatException("empty string");
    }
}
