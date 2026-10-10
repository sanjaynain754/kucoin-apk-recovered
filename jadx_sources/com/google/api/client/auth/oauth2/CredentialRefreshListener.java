package com.google.api.client.auth.oauth2;

import java.io.IOException;

/* JADX INFO: loaded from: classes56.dex */
public interface CredentialRefreshListener {
    void onTokenErrorResponse(Credential credential, TokenErrorResponse tokenErrorResponse) throws IOException;

    void onTokenResponse(Credential credential, TokenResponse tokenResponse) throws IOException;
}
