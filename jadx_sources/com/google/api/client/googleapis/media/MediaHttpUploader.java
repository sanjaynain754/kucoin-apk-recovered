package com.google.api.client.googleapis.media;

import androidx.webkit.ProxyConfig;
import com.google.api.client.googleapis.MethodOverride;
import com.google.api.client.http.AbstractInputStreamContent;
import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.GZipEncoding;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.http.MultipartContent;
import com.google.api.client.util.Beta;
import com.google.api.client.util.ByteStreams;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sleeper;
import com.tencent.bugly.proguard.C33820nf;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes56.dex */
public final class MediaHttpUploader {
    public static final String CONTENT_LENGTH_HEADER = "X-Upload-Content-Length";
    public static final String CONTENT_TYPE_HEADER = "X-Upload-Content-Type";
    public static final int DEFAULT_CHUNK_SIZE = 10485760;

    /* JADX INFO: renamed from: KB */
    private static final int f12177KB = 1024;

    /* JADX INFO: renamed from: MB */
    static final int f12178MB = 1048576;
    public static final int MINIMUM_CHUNK_SIZE = 262144;
    private Byte cachedByte;
    private InputStream contentInputStream;
    private int currentChunkLength;
    private HttpRequest currentRequest;
    private byte[] currentRequestContentBuffer;
    private boolean directUploadEnabled;
    private boolean disableGZipContent;
    private boolean isMediaContentLengthCalculated;
    private final AbstractInputStreamContent mediaContent;
    private long mediaContentLength;
    private HttpContent metadata;
    private MediaHttpUploaderProgressListener progressListener;
    private final HttpRequestFactory requestFactory;
    private long totalBytesClientSent;
    private long totalBytesServerReceived;
    private final HttpTransport transport;
    private UploadState uploadState = UploadState.NOT_STARTED;
    private String initiationRequestMethod = "POST";
    private HttpHeaders initiationHeaders = new HttpHeaders();
    String mediaContentLengthStr = ProxyConfig.MATCH_ALL_SCHEMES;
    private int chunkSize = DEFAULT_CHUNK_SIZE;
    Sleeper sleeper = Sleeper.DEFAULT;

    public static class ContentChunk {
        private final AbstractInputStreamContent content;
        private final String contentRange;

        public AbstractInputStreamContent getContent() {
            return this.content;
        }

        public String getContentRange() {
            return this.contentRange;
        }

        public ContentChunk(AbstractInputStreamContent abstractInputStreamContent, String str) {
            this.content = abstractInputStreamContent;
            this.contentRange = str;
        }
    }

    public enum UploadState {
        NOT_STARTED,
        INITIATION_STARTED,
        INITIATION_COMPLETE,
        MEDIA_IN_PROGRESS,
        MEDIA_COMPLETE
    }

    private HttpResponse directUpload(GenericUrl genericUrl) throws IOException {
        updateStateAndNotifyListener(UploadState.MEDIA_IN_PROGRESS);
        HttpContent contentParts = this.mediaContent;
        if (this.metadata != null) {
            contentParts = new MultipartContent().setContentParts(Arrays.asList(this.metadata, this.mediaContent));
            genericUrl.put("uploadType", "multipart");
        } else {
            genericUrl.put("uploadType", "media");
        }
        HttpRequest httpRequestBuildRequest = this.requestFactory.buildRequest(this.initiationRequestMethod, genericUrl, contentParts);
        httpRequestBuildRequest.getHeaders().putAll(this.initiationHeaders);
        HttpResponse httpResponseExecuteCurrentRequest = executeCurrentRequest(httpRequestBuildRequest);
        try {
            if (isMediaLengthKnown()) {
                this.totalBytesServerReceived = getMediaContentLength();
            }
            updateStateAndNotifyListener(UploadState.MEDIA_COMPLETE);
            return httpResponseExecuteCurrentRequest;
        } catch (Throwable th2) {
            httpResponseExecuteCurrentRequest.disconnect();
            throw th2;
        }
    }

    private HttpResponse executeCurrentRequest(HttpRequest httpRequest) throws IOException {
        if (!this.disableGZipContent && !(httpRequest.getContent() instanceof EmptyContent)) {
            httpRequest.setEncoding(new GZipEncoding());
        }
        return executeCurrentRequestWithoutGZip(httpRequest);
    }

    private HttpResponse executeCurrentRequestWithoutGZip(HttpRequest httpRequest) throws IOException {
        new MethodOverride().intercept(httpRequest);
        httpRequest.setThrowExceptionOnExecuteError(false);
        return httpRequest.execute();
    }

    private HttpResponse executeUploadInitiation(GenericUrl genericUrl) throws IOException {
        updateStateAndNotifyListener(UploadState.INITIATION_STARTED);
        genericUrl.put("uploadType", "resumable");
        HttpContent emptyContent = this.metadata;
        if (emptyContent == null) {
            emptyContent = new EmptyContent();
        }
        HttpRequest httpRequestBuildRequest = this.requestFactory.buildRequest(this.initiationRequestMethod, genericUrl, emptyContent);
        this.initiationHeaders.set(CONTENT_TYPE_HEADER, (Object) this.mediaContent.getType());
        if (isMediaLengthKnown()) {
            this.initiationHeaders.set(CONTENT_LENGTH_HEADER, (Object) Long.valueOf(getMediaContentLength()));
        }
        httpRequestBuildRequest.getHeaders().putAll(this.initiationHeaders);
        HttpResponse httpResponseExecuteCurrentRequest = executeCurrentRequest(httpRequestBuildRequest);
        try {
            updateStateAndNotifyListener(UploadState.INITIATION_COMPLETE);
            return httpResponseExecuteCurrentRequest;
        } catch (Throwable th2) {
            httpResponseExecuteCurrentRequest.disconnect();
            throw th2;
        }
    }

    private long getMediaContentLength() throws IOException {
        if (!this.isMediaContentLengthCalculated) {
            this.mediaContentLength = this.mediaContent.getLength();
            this.isMediaContentLengthCalculated = true;
        }
        return this.mediaContentLength;
    }

    private long getNextByteIndex(String str) {
        if (str == null) {
            return 0L;
        }
        return Long.parseLong(str.substring(str.indexOf(45) + 1)) + 1;
    }

    private void updateStateAndNotifyListener(UploadState uploadState) throws IOException {
        this.uploadState = uploadState;
        MediaHttpUploaderProgressListener mediaHttpUploaderProgressListener = this.progressListener;
        if (mediaHttpUploaderProgressListener != null) {
            mediaHttpUploaderProgressListener.progressChanged(this);
        }
    }

    public int getChunkSize() {
        return this.chunkSize;
    }

    public boolean getDisableGZipContent() {
        return this.disableGZipContent;
    }

    public HttpHeaders getInitiationHeaders() {
        return this.initiationHeaders;
    }

    public String getInitiationRequestMethod() {
        return this.initiationRequestMethod;
    }

    public HttpContent getMediaContent() {
        return this.mediaContent;
    }

    public HttpContent getMetadata() {
        return this.metadata;
    }

    public long getNumBytesUploaded() {
        return this.totalBytesServerReceived;
    }

    public MediaHttpUploaderProgressListener getProgressListener() {
        return this.progressListener;
    }

    public Sleeper getSleeper() {
        return this.sleeper;
    }

    public HttpTransport getTransport() {
        return this.transport;
    }

    public UploadState getUploadState() {
        return this.uploadState;
    }

    public boolean isDirectUploadEnabled() {
        return this.directUploadEnabled;
    }

    @Beta
    public void serverErrorCallback() throws IOException {
        Preconditions.checkNotNull(this.currentRequest, "The current request should not be null");
        this.currentRequest.setContent(new EmptyContent());
        this.currentRequest.getHeaders().setContentRange("bytes */" + this.mediaContentLengthStr);
    }

    public MediaHttpUploader setChunkSize(int i11) {
        Preconditions.checkArgument(i11 > 0 && i11 % 262144 == 0, "chunkSize must be a positive multiple of 262144.");
        this.chunkSize = i11;
        return this;
    }

    public MediaHttpUploader setDirectUploadEnabled(boolean z11) {
        this.directUploadEnabled = z11;
        return this;
    }

    public MediaHttpUploader setDisableGZipContent(boolean z11) {
        this.disableGZipContent = z11;
        return this;
    }

    public MediaHttpUploader setInitiationHeaders(HttpHeaders httpHeaders) {
        this.initiationHeaders = httpHeaders;
        return this;
    }

    public MediaHttpUploader setInitiationRequestMethod(String str) {
        Preconditions.checkArgument(str.equals("POST") || str.equals("PUT") || str.equals("PATCH"));
        this.initiationRequestMethod = str;
        return this;
    }

    public MediaHttpUploader setMetadata(HttpContent httpContent) {
        this.metadata = httpContent;
        return this;
    }

    public MediaHttpUploader setProgressListener(MediaHttpUploaderProgressListener mediaHttpUploaderProgressListener) {
        this.progressListener = mediaHttpUploaderProgressListener;
        return this;
    }

    public MediaHttpUploader setSleeper(Sleeper sleeper) {
        this.sleeper = sleeper;
        return this;
    }

    public HttpResponse upload(GenericUrl genericUrl) throws IOException {
        Preconditions.checkArgument(this.uploadState == UploadState.NOT_STARTED);
        return this.directUploadEnabled ? directUpload(genericUrl) : resumableUpload(genericUrl);
    }

    public MediaHttpUploader(AbstractInputStreamContent abstractInputStreamContent, HttpTransport httpTransport, HttpRequestInitializer httpRequestInitializer) {
        HttpRequestFactory httpRequestFactoryCreateRequestFactory;
        this.mediaContent = (AbstractInputStreamContent) Preconditions.checkNotNull(abstractInputStreamContent);
        this.transport = (HttpTransport) Preconditions.checkNotNull(httpTransport);
        if (httpRequestInitializer == null) {
            httpRequestFactoryCreateRequestFactory = httpTransport.createRequestFactory();
        } else {
            httpRequestFactoryCreateRequestFactory = httpTransport.createRequestFactory(httpRequestInitializer);
        }
        this.requestFactory = httpRequestFactoryCreateRequestFactory;
    }

    private ContentChunk buildContentChunk() throws IOException {
        int iMin;
        int i11;
        int i12;
        AbstractInputStreamContent byteArrayContent;
        String str;
        if (isMediaLengthKnown()) {
            iMin = (int) Math.min(this.chunkSize, getMediaContentLength() - this.totalBytesServerReceived);
        } else {
            iMin = this.chunkSize;
        }
        if (isMediaLengthKnown()) {
            this.contentInputStream.mark(iMin);
            long j11 = iMin;
            byteArrayContent = new InputStreamContent(this.mediaContent.getType(), ByteStreams.limit(this.contentInputStream, j11)).setRetrySupported(true).setLength(j11).setCloseInputStream(false);
            this.mediaContentLengthStr = String.valueOf(getMediaContentLength());
        } else {
            byte[] bArr = this.currentRequestContentBuffer;
            if (bArr == null) {
                Byte b11 = this.cachedByte;
                if (b11 == null) {
                    i11 = iMin + 1;
                } else {
                    i11 = iMin;
                }
                byte[] bArr2 = new byte[iMin + 1];
                this.currentRequestContentBuffer = bArr2;
                if (b11 != null) {
                    bArr2[0] = b11.byteValue();
                }
                i12 = 0;
            } else {
                int i13 = (int) (this.totalBytesClientSent - this.totalBytesServerReceived);
                System.arraycopy(bArr, this.currentChunkLength - i13, bArr, 0, i13);
                Byte b12 = this.cachedByte;
                if (b12 != null) {
                    this.currentRequestContentBuffer[i13] = b12.byteValue();
                }
                i11 = iMin - i13;
                i12 = i13;
            }
            int i14 = ByteStreams.read(this.contentInputStream, this.currentRequestContentBuffer, (iMin + 1) - i11, i11);
            if (i14 < i11) {
                int iMax = i12 + Math.max(0, i14);
                if (this.cachedByte != null) {
                    iMax++;
                    this.cachedByte = null;
                }
                iMin = iMax;
                if (this.mediaContentLengthStr.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                    this.mediaContentLengthStr = String.valueOf(this.totalBytesServerReceived + ((long) iMin));
                }
            } else {
                this.cachedByte = Byte.valueOf(this.currentRequestContentBuffer[iMin]);
            }
            byteArrayContent = new ByteArrayContent(this.mediaContent.getType(), this.currentRequestContentBuffer, 0, iMin);
            this.totalBytesClientSent = this.totalBytesServerReceived + ((long) iMin);
        }
        this.currentChunkLength = iMin;
        if (iMin == 0) {
            str = "bytes */" + this.mediaContentLengthStr;
        } else {
            str = "bytes " + this.totalBytesServerReceived + C33820nf.f71144W + ((this.totalBytesServerReceived + ((long) iMin)) - 1) + "/" + this.mediaContentLengthStr;
        }
        return new ContentChunk(byteArrayContent, str);
    }

    private boolean isMediaLengthKnown() throws IOException {
        if (getMediaContentLength() >= 0) {
            return true;
        }
        return false;
    }

    private HttpResponse resumableUpload(GenericUrl genericUrl) throws IOException {
        HttpResponse httpResponseExecuteCurrentRequest;
        boolean z11;
        HttpResponse httpResponseExecuteUploadInitiation = executeUploadInitiation(genericUrl);
        if (!httpResponseExecuteUploadInitiation.isSuccessStatusCode()) {
            return httpResponseExecuteUploadInitiation;
        }
        try {
            GenericUrl genericUrl2 = new GenericUrl(httpResponseExecuteUploadInitiation.getHeaders().getLocation());
            httpResponseExecuteUploadInitiation.disconnect();
            InputStream inputStream = this.mediaContent.getInputStream();
            this.contentInputStream = inputStream;
            if (!inputStream.markSupported() && isMediaLengthKnown()) {
                this.contentInputStream = new BufferedInputStream(this.contentInputStream);
            }
            while (true) {
                ContentChunk contentChunkBuildContentChunk = buildContentChunk();
                HttpRequest httpRequestBuildPutRequest = this.requestFactory.buildPutRequest(genericUrl2, null);
                this.currentRequest = httpRequestBuildPutRequest;
                httpRequestBuildPutRequest.setContent(contentChunkBuildContentChunk.getContent());
                this.currentRequest.getHeaders().setContentRange(contentChunkBuildContentChunk.getContentRange());
                new MediaUploadErrorHandler(this, this.currentRequest);
                if (isMediaLengthKnown()) {
                    httpResponseExecuteCurrentRequest = executeCurrentRequestWithoutGZip(this.currentRequest);
                } else {
                    httpResponseExecuteCurrentRequest = executeCurrentRequest(this.currentRequest);
                }
                try {
                    if (httpResponseExecuteCurrentRequest.isSuccessStatusCode()) {
                        this.totalBytesServerReceived = getMediaContentLength();
                        if (this.mediaContent.getCloseInputStream()) {
                            this.contentInputStream.close();
                        }
                        updateStateAndNotifyListener(UploadState.MEDIA_COMPLETE);
                        return httpResponseExecuteCurrentRequest;
                    }
                    if (httpResponseExecuteCurrentRequest.getStatusCode() != 308) {
                        if (this.mediaContent.getCloseInputStream()) {
                            this.contentInputStream.close();
                        }
                        return httpResponseExecuteCurrentRequest;
                    }
                    String location = httpResponseExecuteCurrentRequest.getHeaders().getLocation();
                    if (location != null) {
                        genericUrl2 = new GenericUrl(location);
                    }
                    long nextByteIndex = getNextByteIndex(httpResponseExecuteCurrentRequest.getHeaders().getRange());
                    long j11 = nextByteIndex - this.totalBytesServerReceived;
                    boolean z12 = false;
                    if (j11 >= 0 && j11 <= this.currentChunkLength) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Preconditions.checkState(z11);
                    long j12 = ((long) this.currentChunkLength) - j11;
                    if (isMediaLengthKnown()) {
                        if (j12 > 0) {
                            this.contentInputStream.reset();
                            if (j11 == this.contentInputStream.skip(j11)) {
                                z12 = true;
                            }
                            Preconditions.checkState(z12);
                        }
                    } else if (j12 == 0) {
                        this.currentRequestContentBuffer = null;
                    }
                    this.totalBytesServerReceived = nextByteIndex;
                    updateStateAndNotifyListener(UploadState.MEDIA_IN_PROGRESS);
                    httpResponseExecuteCurrentRequest.disconnect();
                } catch (Throwable th2) {
                    httpResponseExecuteCurrentRequest.disconnect();
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            httpResponseExecuteUploadInitiation.disconnect();
            throw th3;
        }
    }

    public double getProgress() throws IOException {
        Preconditions.checkArgument(isMediaLengthKnown(), "Cannot call getProgress() if the specified AbstractInputStreamContent has no content length. Use  getNumBytesUploaded() to denote progress instead.");
        if (getMediaContentLength() == 0) {
            return 0.0d;
        }
        return this.totalBytesServerReceived / getMediaContentLength();
    }
}
