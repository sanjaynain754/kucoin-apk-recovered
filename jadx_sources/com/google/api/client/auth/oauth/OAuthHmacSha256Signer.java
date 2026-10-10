package com.google.api.client.auth.oauth;

import com.google.api.client.util.StringUtils;
import com.google.common.p069io.BaseEncoding;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p852kotlin.text.Typography;

/* JADX INFO: loaded from: classes56.dex */
public final class OAuthHmacSha256Signer implements OAuthSigner {
    private final String clientSharedSecret;
    private String tokenSharedSecret;

    @Override // com.google.api.client.auth.oauth.OAuthSigner
    public String computeSignature(String str) throws GeneralSecurityException {
        StringBuilder sb2 = new StringBuilder();
        String str2 = this.clientSharedSecret;
        if (str2 != null) {
            sb2.append(OAuthParameters.escape(str2));
        }
        sb2.append(Typography.amp);
        String str3 = this.tokenSharedSecret;
        if (str3 != null) {
            sb2.append(OAuthParameters.escape(str3));
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(StringUtils.getBytesUtf8(sb2.toString()), "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKeySpec);
        return BaseEncoding.base64().encode(mac.doFinal(StringUtils.getBytesUtf8(str)));
    }

    @Override // com.google.api.client.auth.oauth.OAuthSigner
    public String getSignatureMethod() {
        return "HMAC-SHA256";
    }

    public void setTokenSecret(String str) {
        this.tokenSharedSecret = str;
    }

    public OAuthHmacSha256Signer(String str) {
        this.clientSharedSecret = str;
    }
}
