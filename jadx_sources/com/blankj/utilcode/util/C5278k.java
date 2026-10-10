package com.blankj.utilcode.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: renamed from: com.blankj.utilcode.util.k */
/* JADX INFO: compiled from: EncodeUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C5278k {
    /* JADX INFO: renamed from: a */
    public static String m6256a(String str) {
        return m6257b(str, "UTF-8");
    }

    /* JADX INFO: renamed from: b */
    public static String m6257b(String str, String str2) {
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            return URLDecoder.decode(str.replaceAll("%(?![0-9a-fA-F]{2})", "%25").replaceAll("\\+", "%2B"), str2);
        } catch (UnsupportedEncodingException e11) {
            throw new AssertionError(e11);
        }
    }
}
