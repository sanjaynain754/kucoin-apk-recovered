package cn.jiguang.privates.core.utils;

import android.content.Context;
import androidx.media3.common.PlaybackException;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.https.HostVerifier;
import cn.jiguang.privates.common.log.JCommonLog;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.jumio.core.constants.ConstantsKt;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

/* JADX INFO: loaded from: classes34.dex */
public class HttpUtil {
    private static final String TAG = "HttpClient";

    public static int post(Context context, String str, String str2, byte[] bArr) {
        int responseCode = -1;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setConnectTimeout(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED);
            httpURLConnection.setReadTimeout(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED);
            httpURLConnection.setRequestProperty("Authorization", str2);
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            httpURLConnection.setRequestProperty("Accept", "application/jason");
            httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
            httpURLConnection.setRequestProperty("content-type", ConstantsKt.MIME_TYPE_OCTET_STREAM);
            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bArr.length));
            httpURLConnection.setRequestProperty("X-App-Key", JGlobal.getAppKey(context));
            httpURLConnection.setRequestProperty("Encrypt-Type", JGlobal.getEncryptType() == 2 ? "SM4" : "");
            if (httpURLConnection instanceof HttpsURLConnection) {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, null);
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLContext.getSocketFactory());
                ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(new HostVerifier(httpURLConnection.getURL().getHost()));
            }
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setUseCaches(false);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.flush();
            outputStream.close();
            httpURLConnection.connect();
            responseCode = httpURLConnection.getResponseCode();
            httpURLConnection.disconnect();
            return responseCode;
        } catch (SocketTimeoutException e11) {
            JCommonLog.m5433w("HttpClient", "post socketTimeoutException:" + e11.getMessage());
            return responseCode;
        } catch (Throwable th2) {
            JCommonLog.m5433w("HttpClient", "post failed " + th2.getMessage());
            return responseCode;
        }
    }
}
