package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import java.io.InputStream;

/* JADX INFO: loaded from: classes56.dex */
public final class InputStreamContent extends AbstractInputStreamContent {
    private final InputStream inputStream;
    private long length;
    private boolean retrySupported;

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public InputStream getInputStream() {
        return this.inputStream;
    }

    @Override // com.google.api.client.http.HttpContent
    public long getLength() {
        return this.length;
    }

    @Override // com.google.api.client.http.HttpContent
    public boolean retrySupported() {
        return this.retrySupported;
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public InputStreamContent setCloseInputStream(boolean z11) {
        return (InputStreamContent) super.setCloseInputStream(z11);
    }

    public InputStreamContent setLength(long j11) {
        this.length = j11;
        return this;
    }

    public InputStreamContent setRetrySupported(boolean z11) {
        this.retrySupported = z11;
        return this;
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public InputStreamContent setType(String str) {
        return (InputStreamContent) super.setType(str);
    }

    public InputStreamContent(String str, InputStream inputStream) {
        super(str);
        this.length = -1L;
        this.inputStream = (InputStream) Preconditions.checkNotNull(inputStream);
    }
}
