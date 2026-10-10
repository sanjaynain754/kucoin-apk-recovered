package com.google.api.client.http.javanet;

import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StreamingContent;
import com.google.common.annotations.VisibleForTesting;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes56.dex */
final class NetHttpRequest extends LowLevelHttpRequest {
    private static final OutputWriter DEFAULT_CONNECTION_WRITER = new DefaultOutputWriter();
    private final HttpURLConnection connection;
    private int writeTimeout = 0;

    public interface OutputWriter {
        void write(OutputStream outputStream, StreamingContent streamingContent) throws IOException;
    }

    private boolean hasResponse(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode() > 0;
        } catch (IOException unused) {
        }
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public LowLevelHttpResponse execute() throws IOException {
        return execute(DEFAULT_CONNECTION_WRITER);
    }

    public static class DefaultOutputWriter implements OutputWriter {
        @Override // com.google.api.client.http.javanet.NetHttpRequest.OutputWriter
        public void write(OutputStream outputStream, StreamingContent streamingContent) throws IOException {
            streamingContent.writeTo(outputStream);
        }
    }

    private void writeContentToOutputStream(final OutputWriter outputWriter, final OutputStream outputStream) throws IOException {
        if (this.writeTimeout == 0) {
            outputWriter.write(outputStream, getStreamingContent());
            return;
        }
        final StreamingContent streamingContent = getStreamingContent();
        Callable<Boolean> callable = new Callable<Boolean>() { // from class: com.google.api.client.http.javanet.NetHttpRequest.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() throws IOException {
                outputWriter.write(outputStream, streamingContent);
                return Boolean.TRUE;
            }
        };
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Future futureSubmit = executorServiceNewSingleThreadExecutor.submit(new FutureTask(callable), null);
        executorServiceNewSingleThreadExecutor.shutdown();
        try {
            futureSubmit.get(this.writeTimeout, TimeUnit.MILLISECONDS);
            if (executorServiceNewSingleThreadExecutor.isTerminated()) {
                return;
            }
            executorServiceNewSingleThreadExecutor.shutdown();
        } catch (InterruptedException e11) {
            throw new IOException("Socket write interrupted", e11);
        } catch (ExecutionException e12) {
            throw new IOException("Exception in socket write", e12);
        } catch (TimeoutException e13) {
            throw new IOException("Socket write timed out", e13);
        }
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public void addHeader(String str, String str2) {
        this.connection.addRequestProperty(str, str2);
    }

    @VisibleForTesting
    public LowLevelHttpResponse execute(OutputWriter outputWriter) throws IOException {
        HttpURLConnection httpURLConnection = this.connection;
        if (getStreamingContent() != null) {
            String contentType = getContentType();
            if (contentType != null) {
                addHeader("Content-Type", contentType);
            }
            String contentEncoding = getContentEncoding();
            if (contentEncoding != null) {
                addHeader("Content-Encoding", contentEncoding);
            }
            long contentLength = getContentLength();
            if (contentLength >= 0) {
                httpURLConnection.setRequestProperty("Content-Length", Long.toString(contentLength));
            }
            String requestMethod = httpURLConnection.getRequestMethod();
            if ("POST".equals(requestMethod) || "PUT".equals(requestMethod)) {
                httpURLConnection.setDoOutput(true);
                if (contentLength < 0 || contentLength > 2147483647L) {
                    httpURLConnection.setChunkedStreamingMode(0);
                } else {
                    httpURLConnection.setFixedLengthStreamingMode((int) contentLength);
                }
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    try {
                        writeContentToOutputStream(outputWriter, outputStream);
                        outputStream.close();
                    } catch (IOException e11) {
                        if (!hasResponse(httpURLConnection)) {
                            throw e11;
                        }
                        try {
                            outputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        outputStream.close();
                    } catch (IOException unused2) {
                    }
                    throw th2;
                }
            } else {
                Preconditions.checkArgument(contentLength == 0, "%s with non-zero content length is not supported", requestMethod);
            }
        } else if ("DELETE".equals(httpURLConnection.getRequestMethod())) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(0L);
        }
        try {
            httpURLConnection.connect();
            return new NetHttpResponse(httpURLConnection);
        } catch (Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }

    @VisibleForTesting
    public String getRequestProperty(String str) {
        return this.connection.getRequestProperty(str);
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public void setTimeout(int i11, int i12) {
        this.connection.setReadTimeout(i12);
        this.connection.setConnectTimeout(i11);
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public void setWriteTimeout(int i11) throws IOException {
        this.writeTimeout = i11;
    }

    public NetHttpRequest(HttpURLConnection httpURLConnection) {
        this.connection = httpURLConnection;
        httpURLConnection.setInstanceFollowRedirects(false);
    }
}
