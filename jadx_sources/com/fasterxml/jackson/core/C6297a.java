package com.fasterxml.jackson.core;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.a */
/* JADX INFO: compiled from: Base64Variants.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6297a {

    /* JADX INFO: renamed from: a */
    public static final Base64Variant f10037a;

    /* JADX INFO: renamed from: b */
    public static final Base64Variant f10038b;

    /* JADX INFO: renamed from: c */
    public static final Base64Variant f10039c;

    /* JADX INFO: renamed from: d */
    public static final Base64Variant f10040d;

    static {
        Base64Variant base64Variant = new Base64Variant("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        f10037a = base64Variant;
        f10038b = new Base64Variant(base64Variant, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
        f10039c = new Base64Variant(base64Variant, "PEM", true, '=', 64);
        StringBuilder sb2 = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb2.setCharAt(sb2.indexOf("+"), '-');
        sb2.setCharAt(sb2.indexOf("/"), '_');
        f10040d = new Base64Variant("MODIFIED-FOR-URL", sb2.toString(), false, (char) 0, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: a */
    public static Base64Variant m10918a() {
        return f10038b;
    }

    /* JADX INFO: renamed from: b */
    public static Base64Variant m10919b(String str) throws IllegalArgumentException {
        String str2;
        Base64Variant base64Variant = f10037a;
        if (base64Variant._name.equals(str)) {
            return base64Variant;
        }
        Base64Variant base64Variant2 = f10038b;
        if (base64Variant2._name.equals(str)) {
            return base64Variant2;
        }
        Base64Variant base64Variant3 = f10039c;
        if (base64Variant3._name.equals(str)) {
            return base64Variant3;
        }
        Base64Variant base64Variant4 = f10040d;
        if (base64Variant4._name.equals(str)) {
            return base64Variant4;
        }
        if (str == null) {
            str2 = "<null>";
        } else {
            str2 = "'" + str + "'";
        }
        throw new IllegalArgumentException("No Base64Variant with name " + str2);
    }
}
