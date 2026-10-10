package com.tencent.bugly.proguard;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.c4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33578c4 implements InterfaceC33558b5 {

    /* JADX INFO: renamed from: a */
    public String f69370a = null;

    @Override // com.tencent.bugly.proguard.InterfaceC33558b5
    /* JADX INFO: renamed from: a */
    public byte[] mo72278a(byte[] bArr) throws Exception {
        if (this.f69370a == null || bArr == null) {
            return null;
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(this.f69370a.getBytes("UTF-8"))), new IvParameterSpec(this.f69370a.getBytes("UTF-8")));
        return cipher.doFinal(bArr);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33558b5
    /* JADX INFO: renamed from: b */
    public byte[] mo72279b(byte[] bArr) throws Exception {
        if (this.f69370a == null || bArr == null) {
            return null;
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(1, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(this.f69370a.getBytes("UTF-8"))), new IvParameterSpec(this.f69370a.getBytes("UTF-8")));
        return cipher.doFinal(bArr);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33558b5
    /* JADX INFO: renamed from: a */
    public String mo72276a() {
        return this.f69370a;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33558b5
    /* JADX INFO: renamed from: a */
    public void mo72277a(String str) {
        if (str != null) {
            this.f69370a = str;
        }
    }
}
