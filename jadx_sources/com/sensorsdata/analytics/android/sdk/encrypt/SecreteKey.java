package com.sensorsdata.analytics.android.sdk.encrypt;

/* JADX INFO: loaded from: classes59.dex */
public class SecreteKey {
    public String asymmetricEncryptType;
    public String key;
    public String symmetricEncryptType;
    public int version;

    public String toString() {
        return "{\"key\":\"" + this.key + "\",\"version\":\"" + this.version + "\",\"symmetricEncryptType\":\"" + this.symmetricEncryptType + "\",\"asymmetricEncryptType\":\"" + this.asymmetricEncryptType + "\"}";
    }

    public SecreteKey(String str, int i11, String str2, String str3) {
        this.key = str;
        this.version = i11;
        this.symmetricEncryptType = str2;
        this.asymmetricEncryptType = str3;
    }
}
