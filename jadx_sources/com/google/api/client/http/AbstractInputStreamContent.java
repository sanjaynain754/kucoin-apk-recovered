package com.google.api.client.http;

import com.google.api.client.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes56.dex */
public abstract class AbstractInputStreamContent implements HttpContent {
    private boolean closeInputStream = true;
    private String type;

    public abstract InputStream getInputStream() throws IOException;

    public final boolean getCloseInputStream() {
        return this.closeInputStream;
    }

    @Override // com.google.api.client.http.HttpContent
    public String getType() {
        return this.type;
    }

    public AbstractInputStreamContent setCloseInputStream(boolean z11) {
        this.closeInputStream = z11;
        return this;
    }

    public AbstractInputStreamContent setType(String str) {
        this.type = str;
        return this;
    }

    public AbstractInputStreamContent(String str) {
        setType(str);
    }

    @Override // com.google.api.client.http.HttpContent, com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        IOUtils.copy(getInputStream(), outputStream, this.closeInputStream);
        outputStream.flush();
    }
}
