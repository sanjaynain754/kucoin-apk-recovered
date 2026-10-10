package cn.jiguang.privates.push.utils;

import android.content.Context;
import androidx.media3.common.PlaybackException;
import cn.jiguang.privates.common.https.HostVerifier;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.common.utils.SystemUtil;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

/* JADX INFO: loaded from: classes34.dex */
public class HttpUtils {
    private static final String TAG = "HttpClient";

    /* JADX WARN: Code duplicated, block: B:42:0x00dd A[Catch: all -> 0x00d9, TRY_LEAVE, TryCatch #13 {all -> 0x00d9, blocks: (B:38:0x00d5, B:42:0x00dd), top: B:99:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0183 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x0184  */
    /* JADX WARN: Code duplicated, block: B:84:0x0193 A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #6 {all -> 0x018f, blocks: (B:80:0x018b, B:84:0x0193), top: B:93:0x018b }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.io.InputStream] */
    public byte[] get(Context context, String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        StringBuilder sb2;
        InputStream inputStream;
        try {
            if (!SystemUtil.isNetworkConnecting(context)) {
                JCommonLog.m5430d("HttpClient", "can't get, network is disConnected");
                return null;
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED);
                httpURLConnection.setReadTimeout(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED);
                httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
                httpURLConnection.addRequestProperty("Connection", "Close");
                httpURLConnection.setRequestProperty("Charset", "UTF-8");
                if (httpURLConnection instanceof HttpsURLConnection) {
                    SSLContext sSLContext = SSLContext.getInstance("TLS");
                    sSLContext.init(null, null, null);
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLContext.getSocketFactory());
                    ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(new HostVerifier(httpURLConnection.getURL().getHost()));
                }
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.connect();
                int contentLength = httpURLConnection.getContentLength();
                if (httpURLConnection.getResponseCode() == 200) {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[contentLength];
                            while (true) {
                                int i11 = inputStream.read(bArr);
                                if (i11 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i11);
                                sb2.append("close failed ");
                                sb2.append(th.getMessage());
                                JCommonLog.m5433w("HttpClient", sb2.toString());
                                if (byteArrayOutputStream == null) {
                                    return null;
                                }
                                return byteArrayOutputStream.toByteArray();
                            }
                        } catch (MalformedURLException e11) {
                            str = inputStream;
                            e = e11;
                            JCommonLog.m5433w("HttpClient", "get malformedURLException:" + e.getMessage());
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Throwable th2) {
                                    th = th2;
                                    sb2 = new StringBuilder();
                                    sb2.append("close failed ");
                                    sb2.append(th.getMessage());
                                    JCommonLog.m5433w("HttpClient", sb2.toString());
                                }
                            }
                            if (str != 0) {
                                str.close();
                            }
                            if (byteArrayOutputStream == null) {
                                return null;
                            }
                            return byteArrayOutputStream.toByteArray();
                        } catch (IOException e12) {
                            str = inputStream;
                            e = e12;
                            JCommonLog.m5433w("HttpClient", "get ioException:" + e.getMessage());
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Throwable th3) {
                                    th = th3;
                                    sb2 = new StringBuilder();
                                    sb2.append("close failed ");
                                    sb2.append(th.getMessage());
                                    JCommonLog.m5433w("HttpClient", sb2.toString());
                                }
                            }
                            if (str != 0) {
                                str.close();
                            }
                            if (byteArrayOutputStream == null) {
                                return null;
                            }
                            return byteArrayOutputStream.toByteArray();
                        } catch (Throwable th4) {
                            str = inputStream;
                            th = th4;
                            JCommonLog.m5433w("HttpClient", "get failed " + th.getMessage());
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Throwable th5) {
                                    th = th5;
                                    sb2 = new StringBuilder();
                                    sb2.append("close failed ");
                                    sb2.append(th.getMessage());
                                    JCommonLog.m5433w("HttpClient", sb2.toString());
                                }
                            }
                            if (str != 0) {
                                str.close();
                            }
                            if (byteArrayOutputStream == null) {
                                return null;
                            }
                            return byteArrayOutputStream.toByteArray();
                        }
                    } catch (MalformedURLException e13) {
                        str = inputStream;
                        e = e13;
                        byteArrayOutputStream = null;
                    } catch (IOException e14) {
                        str = inputStream;
                        e = e14;
                        byteArrayOutputStream = null;
                    } catch (Throwable th6) {
                        str = inputStream;
                        th = th6;
                        byteArrayOutputStream = null;
                    }
                } else {
                    inputStream = null;
                    byteArrayOutputStream = null;
                }
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        sb2 = new StringBuilder();
                        sb2.append("close failed ");
                        sb2.append(th.getMessage());
                        JCommonLog.m5433w("HttpClient", sb2.toString());
                    }
                } else if (inputStream != null) {
                    inputStream.close();
                }
            } catch (MalformedURLException e15) {
                e = e15;
                str = 0;
                byteArrayOutputStream = null;
            } catch (IOException e16) {
                e = e16;
                str = 0;
                byteArrayOutputStream = null;
            } catch (Throwable th8) {
                th = th8;
                str = 0;
                byteArrayOutputStream = null;
            }
            if (byteArrayOutputStream == null) {
                return null;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th9) {
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                    if (str != 0) {
                        str.close();
                    }
                } catch (Throwable th10) {
                    JCommonLog.m5433w("HttpClient", "close failed " + th10.getMessage());
                    throw th9;
                }
            } else if (str != 0) {
                str.close();
            }
            throw th9;
        }
    }
}
