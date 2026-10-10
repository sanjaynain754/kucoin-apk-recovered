package com.google.api.client.http.apache.p068v2;

import com.google.api.client.util.Preconditions;
import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

/* JADX INFO: loaded from: classes56.dex */
final class HttpExtensionMethod extends HttpEntityEnclosingRequestBase {
    private final String methodName;

    @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        return this.methodName;
    }

    public HttpExtensionMethod(String str, String str2) {
        this.methodName = (String) Preconditions.checkNotNull(str);
        setURI(URI.create(str2));
    }
}
