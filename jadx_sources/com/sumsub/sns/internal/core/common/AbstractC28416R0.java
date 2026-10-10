package com.sumsub.sns.internal.core.common;

import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.R0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28416R0 {
    /* JADX INFO: renamed from: a */
    public static final String m69299a(int i11, String str) {
        if (str.length() == 0) {
            return str;
        }
        String strSubstring = str.substring(0, RangesKt.coerceAtMost(i11, str.length()));
        if (strSubstring.length() != str.length()) {
            str = null;
        }
        if (str == null) {
            return strSubstring + " ...";
        }
        return str;
    }
}
