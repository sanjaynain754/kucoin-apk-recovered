package com.google.api.client.http;

import java.io.IOException;

/* JADX INFO: loaded from: classes56.dex */
public interface HttpUnsuccessfulResponseHandler {
    boolean handleResponse(HttpRequest httpRequest, HttpResponse httpResponse, boolean z11) throws IOException;
}
