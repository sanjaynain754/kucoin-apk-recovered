package com.google.firebase.perf.util;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes56.dex */
public class URLWrapper {
    private final URL url;

    public URLConnection openConnection() throws IOException {
        return this.url.openConnection();
    }

    public String toString() {
        return this.url.toString();
    }

    public URLWrapper(URL url) {
        this.url = url;
    }
}
