package com.geetest.gtc4;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.geetest.gtc4.l7 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6814l7 {
    /* JADX INFO: renamed from: a */
    public static int m12675a(InputStream inputStream, byte[] bArr, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int i13 = inputStream.read(bArr, i12, i11 - i12);
            if (i13 < 0) {
                break;
            }
            i12 += i13;
        }
        return i12;
    }
}
