package com.google.api.client.http.apache.p068v2;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.util.Beta;
import java.io.IOException;
import java.net.ProxySelector;
import java.util.concurrent.TimeUnit;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.SystemDefaultRoutePlanner;

/* JADX INFO: loaded from: classes56.dex */
public final class ApacheHttpTransport extends HttpTransport {
    private final HttpClient httpClient;
    private final boolean isMtls;

    public ApacheHttpTransport() {
        this(newDefaultHttpClient(), false);
    }

    @Override // com.google.api.client.http.HttpTransport
    public boolean supportsMethod(String str) {
        return true;
    }

    public ApacheHttpTransport(HttpClient httpClient) {
        this.httpClient = httpClient;
        this.isMtls = false;
    }

    @Override // com.google.api.client.http.HttpTransport
    public ApacheHttpRequest buildRequest(String str, String str2) {
        HttpRequestBase httpOptions;
        if (str.equals("DELETE")) {
            httpOptions = new HttpDelete(str2);
        } else if (str.equals("GET")) {
            httpOptions = new HttpGet(str2);
        } else if (str.equals("HEAD")) {
            httpOptions = new HttpHead(str2);
        } else if (str.equals("PATCH")) {
            httpOptions = new HttpPatch(str2);
        } else if (str.equals("POST")) {
            httpOptions = new HttpPost(str2);
        } else if (str.equals("PUT")) {
            httpOptions = new HttpPut(str2);
        } else if (str.equals("TRACE")) {
            httpOptions = new HttpTrace(str2);
        } else {
            httpOptions = str.equals("OPTIONS") ? new HttpOptions(str2) : new HttpExtensionMethod(str, str2);
        }
        return new ApacheHttpRequest(this.httpClient, httpOptions);
    }

    public HttpClient getHttpClient() {
        return this.httpClient;
    }

    @Override // com.google.api.client.http.HttpTransport
    public boolean isMtls() {
        return this.isMtls;
    }

    @Override // com.google.api.client.http.HttpTransport
    public void shutdown() throws IOException {
        CloseableHttpClient closeableHttpClient = this.httpClient;
        if (closeableHttpClient instanceof CloseableHttpClient) {
            closeableHttpClient.close();
        }
    }

    public static HttpClient newDefaultHttpClient() {
        return newDefaultHttpClientBuilder().build();
    }

    public static HttpClientBuilder newDefaultHttpClientBuilder() {
        return HttpClientBuilder.create().useSystemProperties().setSSLSocketFactory(SSLConnectionSocketFactory.getSocketFactory()).setMaxConnTotal(200).setMaxConnPerRoute(20).setConnectionTimeToLive(-1L, TimeUnit.MILLISECONDS).setRoutePlanner(new SystemDefaultRoutePlanner(ProxySelector.getDefault())).disableRedirectHandling().disableAutomaticRetries();
    }

    @Beta
    public ApacheHttpTransport(HttpClient httpClient, boolean z11) {
        this.httpClient = httpClient;
        this.isMtls = z11;
    }
}
