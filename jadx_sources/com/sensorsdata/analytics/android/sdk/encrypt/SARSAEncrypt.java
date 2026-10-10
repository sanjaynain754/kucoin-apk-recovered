package com.sensorsdata.analytics.android.sdk.encrypt;

import com.sensorsdata.analytics.android.sdk.SALog;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes59.dex */
class SARSAEncrypt implements SAEncryptListener {
    byte[] aesKey;
    String mEncryptKey;

    @Override // com.sensorsdata.analytics.android.sdk.encrypt.SAEncryptListener
    public String asymmetricEncryptType() {
        return "RSA";
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
                this.mEncryptKey = EncryptUtils.encryptAESKey(str, bArrGenerateSymmetricKey, "RSA");
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
}
