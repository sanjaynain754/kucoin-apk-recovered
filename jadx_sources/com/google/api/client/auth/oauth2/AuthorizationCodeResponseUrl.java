package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.Key;
import com.google.api.client.util.Preconditions;

/* JADX INFO: loaded from: classes56.dex */
public class AuthorizationCodeResponseUrl extends GenericUrl {

    @Key
    private String code;

    @Key
    private String error;

    @Key("error_description")
    private String errorDescription;

    @Key("error_uri")
    private String errorUri;

    @Key
    private String state;

    public final String getCode() {
        return this.code;
    }

    public final String getError() {
        return this.error;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final String getErrorUri() {
        return this.errorUri;
    }

    public final String getState() {
        return this.state;
    }

    public AuthorizationCodeResponseUrl setCode(String str) {
        this.code = str;
        return this;
    }

    public AuthorizationCodeResponseUrl setError(String str) {
        this.error = str;
        return this;
    }

    public AuthorizationCodeResponseUrl setErrorDescription(String str) {
        this.errorDescription = str;
        return this;
    }

    public AuthorizationCodeResponseUrl setErrorUri(String str) {
        this.errorUri = str;
        return this;
    }

    public AuthorizationCodeResponseUrl setState(String str) {
        this.state = str;
        return this;
    }

    public AuthorizationCodeResponseUrl(String str) {
        boolean z11;
        boolean z12;
        super(str);
        if (this.code == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.error == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        Preconditions.checkArgument(z11 != z12);
    }

    @Override // com.google.api.client.http.GenericUrl, com.google.api.client.util.GenericData
    public AuthorizationCodeResponseUrl set(String str, Object obj) {
        return (AuthorizationCodeResponseUrl) super.set(str, obj);
    }

    @Override // com.google.api.client.http.GenericUrl, com.google.api.client.util.GenericData, java.util.AbstractMap
    public AuthorizationCodeResponseUrl clone() {
        return (AuthorizationCodeResponseUrl) super.clone();
    }
}
