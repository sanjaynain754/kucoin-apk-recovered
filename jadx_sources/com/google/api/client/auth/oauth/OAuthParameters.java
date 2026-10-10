package com.google.api.client.auth.oauth;

import androidx.webkit.ProxyConfig;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Data;
import com.google.api.client.util.escape.PercentEscaper;
import com.google.common.collect.Multiset;
import com.google.common.collect.TreeMultiset;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p852kotlin.text.Typography;

/* JADX INFO: loaded from: classes56.dex */
@Beta
public final class OAuthParameters implements HttpExecuteInterceptor, HttpRequestInitializer {
    public String callback;
    public String consumerKey;
    public String nonce;
    public String realm;
    public String signature;
    public String signatureMethod;
    public OAuthSigner signer;
    public String timestamp;
    public String token;
    public String verifier;
    public String version;
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final PercentEscaper ESCAPER = new PercentEscaper("-_.~");

    public static class Parameter implements Comparable<Parameter> {
        private final String key;
        private final String value;

        @Override // java.lang.Comparable
        public int compareTo(Parameter parameter) {
            int iCompareTo = this.key.compareTo(parameter.key);
            return iCompareTo == 0 ? this.value.compareTo(parameter.value) : iCompareTo;
        }

        public String getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }

        public Parameter(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    private void appendParameter(StringBuilder sb2, String str, String str2) {
        if (str2 != null) {
            sb2.append(' ');
            sb2.append(escape(str));
            sb2.append("=\"");
            sb2.append(escape(str2));
            sb2.append("\",");
        }
    }

    public static String escape(String str) {
        return ESCAPER.escape(str);
    }

    private void putParameter(Multiset<Parameter> multiset, String str, Object obj) {
        multiset.add(new Parameter(escape(str), obj == null ? null : escape(obj.toString())));
    }

    private void putParameterIfValueNotNull(Multiset<Parameter> multiset, String str, String str2) {
        if (str2 != null) {
            putParameter(multiset, str, str2);
        }
    }

    public void computeNonce() {
        this.nonce = Long.toHexString(Math.abs(RANDOM.nextLong()));
    }

    public void computeSignature(String str, GenericUrl genericUrl) throws GeneralSecurityException {
        OAuthSigner oAuthSigner = this.signer;
        String signatureMethod = oAuthSigner.getSignatureMethod();
        this.signatureMethod = signatureMethod;
        TreeMultiset treeMultisetCreate = TreeMultiset.create();
        putParameterIfValueNotNull(treeMultisetCreate, "oauth_callback", this.callback);
        putParameterIfValueNotNull(treeMultisetCreate, "oauth_consumer_key", this.consumerKey);
        putParameterIfValueNotNull(treeMultisetCreate, "oauth_nonce", this.nonce);
        putParameterIfValueNotNull(treeMultisetCreate, "oauth_signature_method", signatureMethod);
        putParameterIfValueNotNull(treeMultisetCreate, "oauth_timestamp", this.timestamp);
        putParameterIfValueNotNull(treeMultisetCreate, "oauth_token", this.token);
        putParameterIfValueNotNull(treeMultisetCreate, "oauth_verifier", this.verifier);
        putParameterIfValueNotNull(treeMultisetCreate, "oauth_version", this.version);
        for (Map.Entry<String, Object> entry : genericUrl.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String key = entry.getKey();
                if (value instanceof Collection) {
                    Iterator it = ((Collection) value).iterator();
                    while (it.hasNext()) {
                        putParameter(treeMultisetCreate, key, it.next());
                    }
                } else {
                    putParameter(treeMultisetCreate, key, value);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = true;
        for (Parameter parameter : treeMultisetCreate.elementSet()) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(Typography.amp);
            }
            sb2.append(parameter.getKey());
            String value2 = parameter.getValue();
            if (value2 != null) {
                sb2.append('=');
                sb2.append(value2);
            }
        }
        String string = sb2.toString();
        GenericUrl genericUrl2 = new GenericUrl();
        String scheme = genericUrl.getScheme();
        genericUrl2.setScheme(scheme);
        genericUrl2.setHost(genericUrl.getHost());
        genericUrl2.setPathParts(genericUrl.getPathParts());
        int port = genericUrl.getPort();
        if (("http".equals(scheme) && port == 80) || (ProxyConfig.MATCH_HTTPS.equals(scheme) && port == 443)) {
            port = -1;
        }
        genericUrl2.setPort(port);
        this.signature = oAuthSigner.computeSignature(escape(str) + Typography.amp + escape(genericUrl2.build()) + Typography.amp + escape(string));
    }

    public String getAuthorizationHeader() {
        StringBuilder sb2 = new StringBuilder("OAuth");
        appendParameter(sb2, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, this.realm);
        appendParameter(sb2, "oauth_callback", this.callback);
        appendParameter(sb2, "oauth_consumer_key", this.consumerKey);
        appendParameter(sb2, "oauth_nonce", this.nonce);
        appendParameter(sb2, "oauth_signature", this.signature);
        appendParameter(sb2, "oauth_signature_method", this.signatureMethod);
        appendParameter(sb2, "oauth_timestamp", this.timestamp);
        appendParameter(sb2, "oauth_token", this.token);
        appendParameter(sb2, "oauth_verifier", this.verifier);
        appendParameter(sb2, "oauth_version", this.version);
        return sb2.substring(0, sb2.length() - 1);
    }

    public void computeTimestamp() {
        this.timestamp = Long.toString(System.currentTimeMillis() / 1000);
    }

    @Override // com.google.api.client.http.HttpRequestInitializer
    public void initialize(HttpRequest httpRequest) throws IOException {
        httpRequest.setInterceptor(this);
    }

    @Override // com.google.api.client.http.HttpExecuteInterceptor
    public void intercept(HttpRequest httpRequest) throws IOException {
        Map<String, Object> mapMapOf;
        computeNonce();
        computeTimestamp();
        try {
            GenericUrl url = httpRequest.getUrl();
            HttpContent content = httpRequest.getContent();
            if (content instanceof UrlEncodedContent) {
                mapMapOf = Data.mapOf(((UrlEncodedContent) content).getData());
                url.putAll(mapMapOf);
            } else {
                mapMapOf = null;
            }
            computeSignature(httpRequest.getRequestMethod(), url);
            if (mapMapOf != null) {
                Iterator<Map.Entry<String, Object>> it = mapMapOf.entrySet().iterator();
                while (it.hasNext()) {
                    url.remove(it.next().getKey());
                }
            }
            httpRequest.getHeaders().setAuthorization(getAuthorizationHeader());
        } catch (GeneralSecurityException e11) {
            IOException iOException = new IOException();
            iOException.initCause(e11);
            throw iOException;
        }
    }
}
