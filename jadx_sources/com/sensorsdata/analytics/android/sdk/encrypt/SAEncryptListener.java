package com.sensorsdata.analytics.android.sdk.encrypt;

/* JADX INFO: loaded from: classes59.dex */
public interface SAEncryptListener {
    String asymmetricEncryptType();

    String encryptEvent(byte[] bArr);

    String encryptSymmetricKeyWithPublicKey(String str);

    String symmetricEncryptType();
}
