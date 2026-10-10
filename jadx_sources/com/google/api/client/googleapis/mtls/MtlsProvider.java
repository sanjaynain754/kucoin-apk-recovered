package com.google.api.client.googleapis.mtls;

import com.google.api.client.util.Beta;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

/* JADX INFO: loaded from: classes56.dex */
@Beta
public interface MtlsProvider {
    KeyStore getKeyStore() throws GeneralSecurityException, IOException;

    String getKeyStorePassword();

    boolean useMtlsClientCertificate();
}
