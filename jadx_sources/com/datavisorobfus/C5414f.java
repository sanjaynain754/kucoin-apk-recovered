package com.datavisorobfus;

import java.io.ByteArrayOutputStream;
import java.util.zip.DeflaterOutputStream;

/* JADX INFO: renamed from: com.datavisorobfus.f */
/* JADX INFO: loaded from: classes34.dex */
public class C5414f {
    /* JADX INFO: renamed from: a */
    public static byte[] m7135a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return null;
        }
    }
}
