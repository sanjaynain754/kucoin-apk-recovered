package com.geetest.gtc4;

/* JADX INFO: renamed from: com.geetest.gtc4.n7 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6832n7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f11444a = 0;

    static {
        try {
            try {
            } catch (Exception unused) {
                String.format("%n", new Object[0]);
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m12686a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i11 = 0; i11 != length; i11++) {
            cArr[i11] = (char) (bArr[i11] & 255);
        }
        return new String(cArr);
    }
}
