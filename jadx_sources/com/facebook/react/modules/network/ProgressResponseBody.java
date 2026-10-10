package com.facebook.react.modules.network;

import androidx.annotation.Nullable;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

/* JADX INFO: loaded from: classes45.dex */
public class ProgressResponseBody extends ResponseBody {

    @Nullable
    private BufferedSource mBufferedSource;
    private final ProgressListener mProgressListener;
    private final ResponseBody mResponseBody;
    private long mTotalBytesRead = 0;

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: source */
    public BufferedSource getBodySource() {
        if (this.mBufferedSource == null) {
            this.mBufferedSource = Okio.buffer(source(this.mResponseBody.getBodySource()));
        }
        return this.mBufferedSource;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentLength */
    public long getContentLength() {
        return this.mResponseBody.getContentLength();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentType */
    public MediaType get$contentType() {
        return this.mResponseBody.get$contentType();
    }

    public long totalBytesRead() {
        return this.mTotalBytesRead;
    }

    public ProgressResponseBody(ResponseBody responseBody, ProgressListener progressListener) {
        this.mResponseBody = responseBody;
        this.mProgressListener = progressListener;
    }

    private Source source(Source source) {
        return new ForwardingSource(source) { // from class: com.facebook.react.modules.network.ProgressResponseBody.1
            @Override // okio.ForwardingSource, okio.Source
            public long read(Buffer buffer, long j11) throws IOException {
                long j12;
                boolean z11;
                long j13 = super.read(buffer, j11);
                ProgressResponseBody progressResponseBody = ProgressResponseBody.this;
                long j14 = progressResponseBody.mTotalBytesRead;
                if (j13 != -1) {
                    j12 = j13;
                } else {
                    j12 = 0;
                }
                progressResponseBody.mTotalBytesRead = j14 + j12;
                ProgressListener progressListener = ProgressResponseBody.this.mProgressListener;
                long j15 = ProgressResponseBody.this.mTotalBytesRead;
                long contentLength = ProgressResponseBody.this.mResponseBody.getContentLength();
                if (j13 == -1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                progressListener.onProgress(j15, contentLength, z11);
                return j13;
            }
        };
    }
}
