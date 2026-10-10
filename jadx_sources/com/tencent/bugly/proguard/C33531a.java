package com.tencent.bugly.proguard;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.a */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33531a implements InterfaceC33558b5 {

    /* JADX INFO: renamed from: b */
    public static final int f68784b = 16;

    /* JADX INFO: renamed from: a */
    public String f68785a = null;

    @Override // com.tencent.bugly.proguard.InterfaceC33558b5
    /* JADX INFO: renamed from: a */
    public byte[] mo72278a(byte[] bArr) throws Exception {
        if (this.f68785a == null || bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b11 : bArr) {
            stringBuffer.append(((int) b11) + C33627eb.f69716f);
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f68785a.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(this.f68785a.getBytes()));
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        StringBuffer stringBuffer2 = new StringBuffer();
        for (byte b12 : bArrDoFinal) {
            stringBuffer2.append(((int) b12) + C33627eb.f69716f);
        }
        return bArrDoFinal;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33558b5
    /* JADX INFO: renamed from: b */
    public byte[] mo72279b(byte[] bArr) throws Exception {
        if (this.f68785a == null || bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b11 : bArr) {
            stringBuffer.append(((int) b11) + C33627eb.f69716f);
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f68785a.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(this.f68785a.getBytes()));
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        StringBuffer stringBuffer2 = new StringBuffer();
        for (byte b12 : bArrDoFinal) {
            stringBuffer2.append(((int) b12) + C33627eb.f69716f);
        }
        return bArrDoFinal;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33558b5
    /* JADX INFO: renamed from: a */
    public String mo72276a() {
        return this.f68785a;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33558b5
    /* JADX INFO: renamed from: a */
    public void mo72277a(String str) {
        if (str != null) {
            for (int length = str.length(); length < 16; length++) {
                str = str + "0";
            }
            this.f68785a = str.substring(0, 16);
        }
    }
}
