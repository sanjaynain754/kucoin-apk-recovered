package com.blankj.utilcode.util;

import android.content.res.Resources;
import androidx.annotation.StringRes;

/* JADX INFO: renamed from: com.blankj.utilcode.util.j0 */
/* JADX INFO: compiled from: StringUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5277j0 {
    /* JADX INFO: renamed from: a */
    public static boolean m6252a(CharSequence charSequence, CharSequence charSequence2) {
        int length;
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (charSequence.charAt(i11) != charSequence2.charAt(i11)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m6255d(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!Character.isWhitespace(str.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6254c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* JADX INFO: renamed from: b */
    public static String m6253b(@StringRes int i11) {
        try {
            return C5287o0.m6331a().getResources().getString(i11);
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }
}
