package com.google.api.client.googleapis.media;

import com.google.api.client.http.HttpIOExceptionHandler;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes56.dex */
@Beta
class MediaUploadErrorHandler implements HttpUnsuccessfulResponseHandler, HttpIOExceptionHandler {
    static final Logger LOGGER = Logger.getLogger(MediaUploadErrorHandler.class.getName());
    private final HttpIOExceptionHandler originalIOExceptionHandler;
    private final HttpUnsuccessfulResponseHandler originalUnsuccessfulHandler;
    private final MediaHttpUploader uploader;

    @Override // com.google.api.client.http.HttpIOExceptionHandler
    public boolean handleIOException(HttpRequest httpRequest, boolean z11) throws IOException {
        HttpIOExceptionHandler httpIOExceptionHandler = this.originalIOExceptionHandler;
        boolean z12 = httpIOExceptionHandler != null && httpIOExceptionHandler.handleIOException(httpRequest, z11);
        if (z12) {
            try {
                this.uploader.serverErrorCallback();
                return z12;
            } catch (IOException e11) {
                LOGGER.log(Level.WARNING, "exception thrown while calling server callback", (Throwable) e11);
            }
        }
        return z12;
    }

    @Override // com.google.api.client.http.HttpUnsuccessfulResponseHandler
    public boolean handleResponse(HttpRequest httpRequest, HttpResponse httpResponse, boolean z11) throws IOException {
        HttpUnsuccessfulResponseHandler httpUnsuccessfulResponseHandler = this.originalUnsuccessfulHandler;
        boolean z12 = httpUnsuccessfulResponseHandler != null && httpUnsuccessfulResponseHandler.handleResponse(httpRequest, httpResponse, z11);
        if (z12 && z11 && httpResponse.getStatusCode() / 100 == 5) {
            try {
                this.uploader.serverErrorCallback();
                return z12;
            } catch (IOException e11) {
                LOGGER.log(Level.WARNING, "exception thrown while calling server callback", (Throwable) e11);
            }
        }
        return z12;
    }

    public MediaUploadErrorHandler(MediaHttpUploader mediaHttpUploader, HttpRequest httpRequest) {
        this.uploader = (MediaHttpUploader) Preconditions.checkNotNull(mediaHttpUploader);
        this.originalIOExceptionHandler = httpRequest.getIOExceptionHandler();
        this.originalUnsuccessfulHandler = httpRequest.getUnsuccessfulResponseHandler();
        httpRequest.setIOExceptionHandler(this);
        httpRequest.setUnsuccessfulResponseHandler(this);
    }
}
