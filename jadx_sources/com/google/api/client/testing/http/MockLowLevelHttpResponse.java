package com.google.api.client.testing.http;

import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.testing.util.TestableByteArrayInputStream;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
@Beta
public class MockLowLevelHttpResponse extends LowLevelHttpResponse {
    private InputStream content;
    private String contentEncoding;
    private String contentType;
    private boolean isDisconnected;
    private String reasonPhrase;
    private int statusCode = 200;
    private List<String> headerNames = new ArrayList();
    private List<String> headerValues = new ArrayList();
    private long contentLength = -1;

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public void disconnect() throws IOException {
        this.isDisconnected = true;
        super.disconnect();
    }

    public MockLowLevelHttpResponse setContent(String str) {
        return str == null ? setZeroContent() : setContent(StringUtils.getBytesUtf8(str));
    }

    public MockLowLevelHttpResponse setZeroContent() {
        this.content = null;
        setContentLength(0L);
        return this;
    }

    public MockLowLevelHttpResponse addHeader(String str, String str2) {
        this.headerNames.add((String) Preconditions.checkNotNull(str));
        this.headerValues.add((String) Preconditions.checkNotNull(str2));
        return this;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public InputStream getContent() throws IOException {
        return this.content;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public final String getContentType() {
        return this.contentType;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public int getHeaderCount() {
        return this.headerNames.size();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getHeaderName(int i11) {
        return this.headerNames.get(i11);
    }

    public final List<String> getHeaderNames() {
        return this.headerNames;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getHeaderValue(int i11) {
        return this.headerValues.get(i11);
    }

    public final List<String> getHeaderValues() {
        return this.headerValues;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getReasonPhrase() {
        return this.reasonPhrase;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public int getStatusCode() {
        return this.statusCode;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getStatusLine() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.statusCode);
        String str = this.reasonPhrase;
        if (str != null) {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public boolean isDisconnected() {
        return this.isDisconnected;
    }

    public MockLowLevelHttpResponse setContentEncoding(String str) {
        this.contentEncoding = str;
        return this;
    }

    public MockLowLevelHttpResponse setContentLength(long j11) {
        this.contentLength = j11;
        Preconditions.checkArgument(j11 >= -1);
        return this;
    }

    public MockLowLevelHttpResponse setContentType(String str) {
        this.contentType = str;
        return this;
    }

    public MockLowLevelHttpResponse setReasonPhrase(String str) {
        this.reasonPhrase = str;
        return this;
    }

    public MockLowLevelHttpResponse setStatusCode(int i11) {
        this.statusCode = i11;
        return this;
    }

    public MockLowLevelHttpResponse setContent(byte[] bArr) {
        if (bArr == null) {
            return setZeroContent();
        }
        this.content = new TestableByteArrayInputStream(bArr);
        setContentLength(bArr.length);
        return this;
    }

    public MockLowLevelHttpResponse setHeaderNames(List<String> list) {
        this.headerNames = (List) Preconditions.checkNotNull(list);
        return this;
    }

    public MockLowLevelHttpResponse setHeaderValues(List<String> list) {
        this.headerValues = (List) Preconditions.checkNotNull(list);
        return this;
    }

    public MockLowLevelHttpResponse setContent(InputStream inputStream) {
        this.content = inputStream;
        return this;
    }
}
