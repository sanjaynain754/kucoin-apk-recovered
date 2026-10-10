package com.geetest.gtc4;

import java.util.Comparator;

/* JADX INFO: renamed from: com.geetest.gtc4.u0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6888u0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int iCompare = Integer.compare(bArr.length, bArr2.length);
        if (iCompare != 0) {
            return iCompare;
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            iCompare = Byte.compare(bArr[i11], bArr2[i11]);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return iCompare;
    }
}
