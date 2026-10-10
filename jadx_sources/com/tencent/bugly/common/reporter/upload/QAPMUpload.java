package com.tencent.bugly.common.reporter.upload;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tencent.bugly.common.network.ssl.NameVerifierFactory;
import com.tencent.bugly.common.network.ssl.SslFactory;
import com.tencent.rmonitor.common.logger.Logger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J@\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\"\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012`\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004¨\u0006\u0017"}, m90084d2 = {"Lcom/tencent/bugly/common/reporter/upload/QAPMUpload;", "Lcom/tencent/bugly/common/reporter/upload/BaseUpload;", "url", "Ljava/net/URL;", "(Ljava/net/URL;)V", "protocol", "", "getProtocol", "()I", "setProtocol", "(I)V", "getUrl", "()Ljava/net/URL;", "setUrl", "connectionBuilder", "Ljava/net/HttpURLConnection;", "headers", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "connectTimeout", "readTimeout", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public abstract class QAPMUpload extends BaseUpload {
    public static final int CHUNK_SIZE = 1048576;
    public static final int ERROR_CLIENT = 400;
    public static final int ERROR_FILE_NOT_EXIT = 601;
    public static final int ERROR_MAX_LIMIT = 800;
    public static final int ERROR_NET_NOT_AVAILABLE = 602;
    public static final int ERROR_NOT_FATAL = 603;
    public static final int ERROR_OOM = 600;
    public static final int ERROR_OTHER = 700;
    public static final int ERROR_SERVICE = 500;
    public static final int HTTP_OK = 200;
    public static final int SOCKET_TIMEOUT_MILLI = 30000;

    @NotNull
    private static final String TAG = "RMonitor_upload";
    private int protocol;

    @NotNull
    private URL url;

    public static /* synthetic */ HttpURLConnection connectionBuilder$default(QAPMUpload qAPMUpload, HashMap map, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: connectionBuilder");
        }
        if ((i13 & 2) != 0) {
            i11 = 30000;
        }
        if ((i13 & 4) != 0) {
            i12 = 30000;
        }
        return qAPMUpload.connectionBuilder(map, i11, i12);
    }

    @Nullable
    public final HttpURLConnection connectionBuilder(@NotNull HashMap<String, String> headers, int connectTimeout, int readTimeout) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(this.url.openConnection());
            HttpURLConnection httpURLConnection = uRLConnection instanceof HttpURLConnection ? (HttpURLConnection) uRLConnection : null;
            if (httpURLConnection != null) {
                httpURLConnection.setConnectTimeout(connectTimeout);
                httpURLConnection.setReadTimeout(readTimeout);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setChunkedStreamingMode(1048576);
                httpURLConnection.setRequestProperty("Connection", "close");
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
                if (this.protocol == 1) {
                    HttpsURLConnection httpsURLConnection = httpURLConnection instanceof HttpsURLConnection ? (HttpsURLConnection) httpURLConnection : null;
                    if (httpsURLConnection != null) {
                        httpsURLConnection.setSSLSocketFactory(SslFactory.INSTANCE.getSslSocketFactory());
                        httpsURLConnection.setHostnameVerifier(NameVerifierFactory.INSTANCE.getNameVerifier());
                        httpsURLConnection.connect();
                    }
                }
            }
            return httpURLConnection;
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(TAG, th2);
            return null;
        }
    }

    public final int getProtocol() {
        return this.protocol;
    }

    @NotNull
    public final URL getUrl() {
        return this.url;
    }

    public final void setProtocol(int i11) {
        this.protocol = i11;
    }

    public final void setUrl(@NotNull URL url) {
        Intrinsics.checkNotNullParameter(url, "<set-?>");
        this.url = url;
    }

    public QAPMUpload(@NotNull URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.protocol = getProtocol(url);
    }
}
