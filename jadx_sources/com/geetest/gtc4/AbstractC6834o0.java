package com.geetest.gtc4;

/* JADX INFO: renamed from: com.geetest.gtc4.o0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6834o0 {
    /* JADX INFO: renamed from: a */
    public static byte[] m12687a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    /* JADX INFO: renamed from: b */
    public static int m12688b(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i11 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i11;
            }
            i11 = (i11 * 257) ^ bArr[length];
        }
    }
}
