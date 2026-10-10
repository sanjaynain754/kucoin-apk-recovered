package com.google.api.client.auth.oauth2;

import com.facebook.AccessToken;
import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import com.google.api.client.util.Preconditions;

/* JADX INFO: loaded from: classes56.dex */
public class TokenResponse extends GenericJson {

    @Key(AccessToken.ACCESS_TOKEN_KEY)
    private String accessToken;

    @Key(AccessToken.EXPIRES_IN_KEY)
    private Long expiresInSeconds;

    @Key("refresh_token")
    private String refreshToken;

    @Key
    private String scope;

    @Key("token_type")
    private String tokenType;

    public String getAccessToken() {
        return this.accessToken;
    }

    public Long getExpiresInSeconds() {
        return this.expiresInSeconds;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public String getScope() {
        return this.scope;
    }

    public String getTokenType() {
        return this.tokenType;
    }

    public TokenResponse setExpiresInSeconds(Long l11) {
        this.expiresInSeconds = l11;
        return this;
    }

    public TokenResponse setRefreshToken(String str) {
        this.refreshToken = str;
        return this;
    }

    public TokenResponse setScope(String str) {
        this.scope = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public TokenResponse set(String str, Object obj) {
        return (TokenResponse) super.set(str, obj);
    }

    public TokenResponse setAccessToken(String str) {
        this.accessToken = (String) Preconditions.checkNotNull(str);
        return this;
    }

    public TokenResponse setTokenType(String str) {
        this.tokenType = (String) Preconditions.checkNotNull(str);
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public TokenResponse clone() {
        return (TokenResponse) super.clone();
    }
}
