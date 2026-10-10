package com.google.api.client.googleapis.media;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.util.Preconditions;
import com.google.common.base.MoreObjects;
import com.google.common.p069io.ByteStreams;
import com.tencent.bugly.proguard.C33820nf;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes56.dex */
public final class MediaHttpDownloader {
    public static final int MAXIMUM_CHUNK_SIZE = 33554432;
    private long bytesDownloaded;
    private long mediaContentLength;
    private MediaHttpDownloaderProgressListener progressListener;
    private final HttpRequestFactory requestFactory;
    private final HttpTransport transport;
    private boolean directDownloadEnabled = false;
    private int chunkSize = 33554432;
    private DownloadState downloadState = DownloadState.NOT_STARTED;
    private long lastBytePos = -1;

    public enum DownloadState {
        NOT_STARTED,
        MEDIA_IN_PROGRESS,
        MEDIA_COMPLETE
    }

    public void download(GenericUrl genericUrl, OutputStream outputStream) throws IOException {
        download(genericUrl, null, outputStream);
    }

    public MediaHttpDownloader setContentRange(long j11, long j12) {
        Preconditions.checkArgument(j12 >= j11);
        setBytesDownloaded(j11);
        this.lastBytePos = j12;
        return this;
    }

    private HttpResponse executeCurrentRequest(long j11, GenericUrl genericUrl, HttpHeaders httpHeaders, OutputStream outputStream) throws IOException {
        HttpRequest httpRequestBuildGetRequest = this.requestFactory.buildGetRequest(genericUrl);
        if (httpHeaders != null) {
            httpRequestBuildGetRequest.getHeaders().putAll(httpHeaders);
        }
        if (this.bytesDownloaded != 0 || j11 != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bytes=");
            sb2.append(this.bytesDownloaded);
            sb2.append(C33820nf.f71144W);
            if (j11 != -1) {
                sb2.append(j11);
            }
            httpRequestBuildGetRequest.getHeaders().setRange(sb2.toString());
        }
        HttpResponse httpResponseExecute = httpRequestBuildGetRequest.execute();
        try {
            ByteStreams.copy(httpResponseExecute.getContent(), outputStream);
            return httpResponseExecute;
        } finally {
            httpResponseExecute.disconnect();
        }
    }

    private long getNextByteIndex(String str) {
        if (str == null) {
            return 0L;
        }
        return Long.parseLong(str.substring(str.indexOf(45) + 1, str.indexOf(47))) + 1;
    }

    private void setMediaContentLength(String str) {
        if (str != null && this.mediaContentLength == 0) {
            this.mediaContentLength = Long.parseLong(str.substring(str.indexOf(47) + 1));
        }
    }

    private void updateStateAndNotifyListener(DownloadState downloadState) throws IOException {
        this.downloadState = downloadState;
        MediaHttpDownloaderProgressListener mediaHttpDownloaderProgressListener = this.progressListener;
        if (mediaHttpDownloaderProgressListener != null) {
            mediaHttpDownloaderProgressListener.progressChanged(this);
        }
    }

    public void download(GenericUrl genericUrl, HttpHeaders httpHeaders, OutputStream outputStream) throws IOException {
        Preconditions.checkArgument(this.downloadState == DownloadState.NOT_STARTED);
        genericUrl.put("alt", "media");
        if (this.directDownloadEnabled) {
            updateStateAndNotifyListener(DownloadState.MEDIA_IN_PROGRESS);
            long jLongValue = ((Long) MoreObjects.firstNonNull(executeCurrentRequest(this.lastBytePos, genericUrl, httpHeaders, outputStream).getHeaders().getContentLength(), Long.valueOf(this.mediaContentLength))).longValue();
            this.mediaContentLength = jLongValue;
            this.bytesDownloaded = jLongValue;
            updateStateAndNotifyListener(DownloadState.MEDIA_COMPLETE);
            return;
        }
        while (true) {
            long jMin = (this.bytesDownloaded + ((long) this.chunkSize)) - 1;
            long j11 = this.lastBytePos;
            if (j11 != -1) {
                jMin = Math.min(j11, jMin);
            }
            String contentRange = executeCurrentRequest(jMin, genericUrl, httpHeaders, outputStream).getHeaders().getContentRange();
            long nextByteIndex = getNextByteIndex(contentRange);
            setMediaContentLength(contentRange);
            long j12 = this.lastBytePos;
            if (j12 != -1 && j12 <= nextByteIndex) {
                this.bytesDownloaded = j12;
                updateStateAndNotifyListener(DownloadState.MEDIA_COMPLETE);
                return;
            }
            long j13 = this.mediaContentLength;
            if (j13 <= nextByteIndex) {
                this.bytesDownloaded = j13;
                updateStateAndNotifyListener(DownloadState.MEDIA_COMPLETE);
                return;
            } else {
                this.bytesDownloaded = nextByteIndex;
                updateStateAndNotifyListener(DownloadState.MEDIA_IN_PROGRESS);
            }
        }
    }

    public int getChunkSize() {
        return this.chunkSize;
    }

    public DownloadState getDownloadState() {
        return this.downloadState;
    }

    public long getLastBytePosition() {
        return this.lastBytePos;
    }

    public long getNumBytesDownloaded() {
        return this.bytesDownloaded;
    }

    public double getProgress() {
        long j11 = this.mediaContentLength;
        if (j11 == 0) {
            return 0.0d;
        }
        return this.bytesDownloaded / j11;
    }

    public MediaHttpDownloaderProgressListener getProgressListener() {
        return this.progressListener;
    }

    public HttpTransport getTransport() {
        return this.transport;
    }

    public boolean isDirectDownloadEnabled() {
        return this.directDownloadEnabled;
    }

    public MediaHttpDownloader setBytesDownloaded(long j11) {
        Preconditions.checkArgument(j11 >= 0);
        this.bytesDownloaded = j11;
        return this;
    }

    public MediaHttpDownloader setChunkSize(int i11) {
        Preconditions.checkArgument(i11 > 0 && i11 <= 33554432);
        this.chunkSize = i11;
        return this;
    }

    public MediaHttpDownloader setDirectDownloadEnabled(boolean z11) {
        this.directDownloadEnabled = z11;
        return this;
    }

    public MediaHttpDownloader setProgressListener(MediaHttpDownloaderProgressListener mediaHttpDownloaderProgressListener) {
        this.progressListener = mediaHttpDownloaderProgressListener;
        return this;
    }

    public MediaHttpDownloader(HttpTransport httpTransport, HttpRequestInitializer httpRequestInitializer) {
        HttpRequestFactory httpRequestFactoryCreateRequestFactory;
        this.transport = (HttpTransport) Preconditions.checkNotNull(httpTransport);
        if (httpRequestInitializer == null) {
            httpRequestFactoryCreateRequestFactory = httpTransport.createRequestFactory();
        } else {
            httpRequestFactoryCreateRequestFactory = httpTransport.createRequestFactory(httpRequestInitializer);
        }
        this.requestFactory = httpRequestFactoryCreateRequestFactory;
    }

    @Deprecated
    public MediaHttpDownloader setContentRange(long j11, int i11) {
        return setContentRange(j11, i11);
    }
}
