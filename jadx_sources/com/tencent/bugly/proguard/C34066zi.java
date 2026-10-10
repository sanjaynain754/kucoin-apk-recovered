package com.tencent.bugly.proguard;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.zi */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34066zi implements InterfaceC33870q2 {
    /* JADX INFO: renamed from: a */
    public static void m75605a(String[] strArr) {
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33870q2
    /* JADX INFO: renamed from: a */
    public byte[] mo73253a(byte[] bArr) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
        ZipEntry zipEntry = new ZipEntry("zip");
        zipEntry.setSize(bArr.length);
        zipOutputStream.putNextEntry(zipEntry);
        zipOutputStream.write(bArr);
        zipOutputStream.closeEntry();
        zipOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33870q2
    /* JADX INFO: renamed from: b */
    public byte[] mo73254b(byte[] bArr) throws Exception {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ZipInputStream zipInputStream = new ZipInputStream(byteArrayInputStream);
        byte[] byteArray = null;
        while (zipInputStream.getNextEntry() != null) {
            byte[] bArr2 = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i11 = zipInputStream.read(bArr2, 0, 1024);
                if (i11 != -1) {
                    byteArrayOutputStream.write(bArr2, 0, i11);
                }
            }
            byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
        }
        zipInputStream.close();
        byteArrayInputStream.close();
        return byteArray;
    }
}
