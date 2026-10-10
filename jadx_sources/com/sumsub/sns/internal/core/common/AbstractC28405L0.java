package com.sumsub.sns.internal.core.common;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.L0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28405L0 {
    /* JADX INFO: renamed from: a */
    public static final boolean m69293a(InputStream inputStream, OutputStream outputStream) {
        try {
            byte[] bArr = new byte[RangesKt.coerceAtMost(inputStream.available(), 1048576)];
            while (true) {
                int i11 = inputStream.read(bArr);
                if (i11 == -1) {
                    inputStream.close();
                    outputStream.close();
                    return true;
                }
                outputStream.write(bArr, 0, i11);
            }
        } catch (IOException unused) {
            return false;
        }
    }
}
