package com.sensorsdata.analytics.android.sdk.encrypt;

import com.sensorsdata.analytics.android.sdk.SALog;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;

/* JADX INFO: loaded from: classes59.dex */
class SAECEncrypt implements SAEncryptListener {
    byte[] aesKey;
    String mEncryptKey;

    @Override // com.sensorsdata.analytics.android.sdk.encrypt.SAEncryptListener
    public String asymmetricEncryptType() {
        return "EC";
    }

    @Override // com.sensorsdata.analytics.android.sdk.encrypt.SAEncryptListener
    public String encryptEvent(byte[] bArr) {
        return EncryptUtils.symmetricEncrypt(this.aesKey, bArr, SymmetricEncryptMode.AES);
    }

    @Override // com.sensorsdata.analytics.android.sdk.encrypt.SAEncryptListener
    public String encryptSymmetricKeyWithPublicKey(String str) {
        if (this.mEncryptKey == null) {
            try {
                byte[] bArrGenerateSymmetricKey = EncryptUtils.generateSymmetricKey(SymmetricEncryptMode.AES);
                this.aesKey = bArrGenerateSymmetricKey;
                this.mEncryptKey = EncryptUtils.encryptAESKey(str, bArrGenerateSymmetricKey, "EC");
            } catch (NoSuchAlgorithmException e11) {
                SALog.printStackTrace(e11);
                return null;
            }
        }
        return this.mEncryptKey;
    }

    @Override // com.sensorsdata.analytics.android.sdk.encrypt.SAEncryptListener
    public String symmetricEncryptType() {
        return "AES";
    }

    static {
        try {
            Security.addProvider((Provider) Class.forName("org.spongycastle.jce.provider.BouncyCastleProvider").newInstance());
        } catch (Exception e11) {
            SALog.m68589i("SA.SAECEncrypt", e11.toString());
        }
    }
}
