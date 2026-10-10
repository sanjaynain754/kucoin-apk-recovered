package com.facebook.react.modules.network;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.Okio;
import okio.Sink;

/* JADX INFO: loaded from: classes45.dex */
class ProgressRequestBody extends RequestBody {
    private long mContentLength = 0;
    private final ProgressListener mProgressListener;
    private final RequestBody mRequestBody;

    private Sink outputStreamSink(BufferedSink bufferedSink) {
        return Okio.sink(new CountingOutputStream(bufferedSink.outputStream()) { // from class: com.facebook.react.modules.network.ProgressRequestBody.1
            @Override // com.facebook.react.modules.network.CountingOutputStream, java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i11, int i12) throws IOException {
                super.write(bArr, i11, i12);
                sendProgressUpdate();
            }

            private void sendProgressUpdate() throws IOException {
                boolean z11;
                long count = getCount();
                long jContentLength = ProgressRequestBody.this.contentLength();
                ProgressListener progressListener = ProgressRequestBody.this.mProgressListener;
                if (count == jContentLength) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                progressListener.onProgress(count, jContentLength, z11);
            }

            @Override // com.facebook.react.modules.network.CountingOutputStream, java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i11) throws IOException {
                super.write(i11);
                sendProgressUpdate();
            }
        });
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        if (this.mContentLength == 0) {
            this.mContentLength = this.mRequestBody.contentLength();
        }
        return this.mContentLength;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public MediaType get$contentType() {
        return this.mRequestBody.get$contentType();
    }

    public ProgressRequestBody(RequestBody requestBody, ProgressListener progressListener) {
        this.mRequestBody = requestBody;
        this.mProgressListener = progressListener;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        BufferedSink bufferedSinkBuffer = Okio.buffer(outputStreamSink(bufferedSink));
        contentLength();
        this.mRequestBody.writeTo(bufferedSinkBuffer);
        bufferedSinkBuffer.flush();
    }
}
