package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.p062io.C6313g;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.e */
/* JADX INFO: compiled from: JsonPointer.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6301e {

    /* JADX INFO: renamed from: e */
    public static final C6301e f10045e = new C6301e();

    /* JADX INFO: renamed from: a */
    public final C6301e f10046a;

    /* JADX INFO: renamed from: b */
    public final String f10047b;

    /* JADX INFO: renamed from: c */
    public final String f10048c;

    /* JADX INFO: renamed from: d */
    public final int f10049d;

    public C6301e() {
        this.f10046a = null;
        this.f10048c = "";
        this.f10049d = -1;
        this.f10047b = "";
    }

    /* JADX INFO: renamed from: a */
    public static void m10921a(StringBuilder sb2, char c11) {
        if (c11 == '0') {
            c11 = '~';
        } else if (c11 == '1') {
            c11 = '/';
        } else {
            sb2.append('~');
        }
        sb2.append(c11);
    }

    /* JADX INFO: renamed from: e */
    public static C6301e m10925e(String str) throws IllegalArgumentException {
        if (str == null || str.length() == 0) {
            return f10045e;
        }
        if (str.charAt(0) == '/') {
            return m10924d(str);
        }
        throw new IllegalArgumentException("Invalid input: JSON Pointer expression must start with '/': \"" + str + "\"");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof C6301e)) {
            return this.f10047b.equals(((C6301e) obj).f10047b);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int m10926f() {
        return this.f10049d;
    }

    /* JADX INFO: renamed from: g */
    public String m10927g() {
        return this.f10048c;
    }

    /* JADX INFO: renamed from: h */
    public C6301e m10928h(int i11) {
        if (i11 != this.f10049d || i11 < 0) {
            return null;
        }
        return this.f10046a;
    }

    public int hashCode() {
        return this.f10047b.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public C6301e m10929i(String str) {
        if (this.f10046a == null || !this.f10048c.equals(str)) {
            return null;
        }
        return this.f10046a;
    }

    /* JADX INFO: renamed from: j */
    public boolean m10930j() {
        return this.f10046a == null;
    }

    /* JADX INFO: renamed from: k */
    public C6301e m10931k() {
        return this.f10046a;
    }

    public String toString() {
        return this.f10047b;
    }

    /* JADX INFO: renamed from: b */
    public static final int m10922b(String str) {
        int length = str.length();
        if (length == 0 || length > 10) {
            return -1;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt <= '0') {
            if (length != 1 || cCharAt != '0') {
                return -1;
            }
            return 0;
        }
        if (cCharAt > '9') {
            return -1;
        }
        for (int i11 = 1; i11 < length; i11++) {
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                return -1;
            }
        }
        if (length == 10 && C6313g.m11020l(str) > 2147483647L) {
            return -1;
        }
        return C6313g.m11018j(str);
    }

    /* JADX INFO: renamed from: c */
    public static C6301e m10923c(String str, int i11) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(Math.max(16, length));
        if (i11 > 2) {
            sb2.append((CharSequence) str, 1, i11 - 1);
        }
        int i12 = i11 + 1;
        m10921a(sb2, str.charAt(i11));
        while (i12 < length) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '/') {
                return new C6301e(str, sb2.toString(), m10924d(str.substring(i12)));
            }
            int i13 = i12 + 1;
            if (cCharAt == '~' && i13 < length) {
                i12 += 2;
                m10921a(sb2, str.charAt(i13));
            } else {
                sb2.append(cCharAt);
                i12 = i13;
            }
        }
        return new C6301e(str, sb2.toString(), f10045e);
    }

    /* JADX INFO: renamed from: d */
    public static C6301e m10924d(String str) {
        int length = str.length();
        int i11 = 1;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '/') {
                return new C6301e(str, str.substring(1, i11), m10924d(str.substring(i11)));
            }
            i11++;
            if (cCharAt == '~' && i11 < length) {
                return m10923c(str, i11);
            }
        }
        return new C6301e(str, str.substring(1), f10045e);
    }

    public C6301e(String str, String str2, C6301e c6301e) {
        this.f10047b = str;
        this.f10046a = c6301e;
        this.f10048c = str2;
        this.f10049d = m10922b(str2);
    }
}
