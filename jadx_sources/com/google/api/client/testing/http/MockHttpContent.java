package com.google.api.client.testing.http;

import com.google.api.client.http.HttpContent;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes56.dex */
@Beta
public class MockHttpContent implements HttpContent {
    private String type;
    private long length = -1;
    private byte[] content = new byte[0];

    @Override // com.google.api.client.http.HttpContent
    public boolean retrySupported() {
        return true;
    }

    public final byte[] getContent() {
        return this.content;
    }

    @Override // com.google.api.client.http.HttpContent
    public long getLength() throws IOException {
        return this.length;
    }

    @Override // com.google.api.client.http.HttpContent
    public String getType() {
        return this.type;
    }

    public MockHttpContent setLength(long j11) {
        Preconditions.checkArgument(j11 >= -1);
        this.length = j11;
        return this;
    }

    public MockHttpContent setType(String str) {
        this.type = str;
        return this;
    }

    @Override // com.google.api.client.http.HttpContent, com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.content);
        outputStream.flush();
    }

    public MockHttpContent setContent(byte[] bArr) {
        this.content = (byte[]) Preconditions.checkNotNull(bArr);
        return this;
    }
}
