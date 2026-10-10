package com.blankj.utilcode.util;

import androidx.collection.SimpleArrayMap;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.blankj.utilcode.util.a0 */
/* JADX INFO: compiled from: RegexUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C5259a0 {

    /* JADX INFO: renamed from: a */
    public static final SimpleArrayMap<String, String> f6485a = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: a */
    public static boolean m6131a(CharSequence charSequence) {
        return m6132b("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$", charSequence);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6132b(String str, CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 0 && Pattern.matches(str, charSequence);
    }
}
