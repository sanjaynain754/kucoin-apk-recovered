package com.google.api.client.http;

import com.google.api.client.util.Beta;
import java.io.IOException;

/* JADX INFO: loaded from: classes56.dex */
@Beta
public interface HttpIOExceptionHandler {
    boolean handleIOException(HttpRequest httpRequest, boolean z11) throws IOException;
}
