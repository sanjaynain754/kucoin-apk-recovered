package com.google.api.client.testing.http;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.util.Beta;
import java.io.IOException;

/* JADX INFO: loaded from: classes56.dex */
@Beta
public class MockHttpUnsuccessfulResponseHandler implements HttpUnsuccessfulResponseHandler {
    private boolean isCalled;
    private boolean successfullyHandleResponse;

    @Override // com.google.api.client.http.HttpUnsuccessfulResponseHandler
    public boolean handleResponse(HttpRequest httpRequest, HttpResponse httpResponse, boolean z11) throws IOException {
        this.isCalled = true;
        return this.successfullyHandleResponse;
    }

    public boolean isCalled() {
        return this.isCalled;
    }

    public MockHttpUnsuccessfulResponseHandler(boolean z11) {
        this.successfullyHandleResponse = z11;
    }
}
