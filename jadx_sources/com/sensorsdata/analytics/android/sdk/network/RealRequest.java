package com.sensorsdata.analytics.android.sdk.network;

import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.kubi.sdk.aspect.SensorsdataAspect;
import com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SAConfigOptions;
import com.sensorsdata.analytics.android.sdk.SALog;
import dh0.C36686b;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.runtime.internal.AbstractC43178a;

/* JADX INFO: loaded from: classes23.dex */
class RealRequest {
    private static final int CONNECT_TIMEOUT = 30000;
    private static final int READ_TIMEOUT = 30000;
    private static final String TAG = "SA.HttpRequest";
    private static /* synthetic */ InterfaceC43175a.a ajc$tjp_0;
    private static String sRequestURL;

    public class AjcClosure1 extends AbstractC43178a {
        @Override // org.aspectj.runtime.internal.AbstractC43178a
        public Object run(Object[] objArr) {
            Object[] objArr2 = this.state;
            return RealRequest.getRealResponse_aroundBody0((RealRequest) objArr2[0], (HttpURLConnection) objArr2[1], (InterfaceC43175a) objArr2[2]);
        }

        public AjcClosure1(Object[] objArr) {
            super(objArr);
        }
    }

    public RealResponse postData(String str, String str2, String str3, Map<String, String> map) {
        BufferedWriter bufferedWriter = null;
        try {
            try {
                sRequestURL = str;
                SALog.m68589i(TAG, String.format("url:%s\nparams:%s\nmethod:POST", str, str2));
                HttpURLConnection httpURLConnection = getHttpURLConnection(str, "POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                if (!TextUtils.isEmpty(str3)) {
                    httpURLConnection.setRequestProperty("Content-Type", str3);
                }
                if (map != null) {
                    setHeader(httpURLConnection, map);
                }
                httpURLConnection.connect();
                if (!TextUtils.isEmpty(str2)) {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8"));
                    try {
                        bufferedWriter2.write(str2);
                        bufferedWriter2.flush();
                        bufferedWriter = bufferedWriter2;
                    } catch (Exception e11) {
                        e = e11;
                        bufferedWriter = bufferedWriter2;
                        RealResponse exceptionResponse = getExceptionResponse(e);
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException e12) {
                                SALog.printStackTrace(e12);
                            }
                        }
                        return exceptionResponse;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedWriter = bufferedWriter2;
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException e13) {
                                SALog.printStackTrace(e13);
                            }
                        }
                        throw th;
                    }
                }
                RealResponse realResponse = getRealResponse(httpURLConnection);
                if (bufferedWriter != null) {
                    try {
                        bufferedWriter.close();
                        return realResponse;
                    } catch (IOException e14) {
                        SALog.printStackTrace(e14);
                    }
                }
                return realResponse;
            } catch (Exception e15) {
                e = e15;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("RealRequest.java", RealRequest.class);
        ajc$tjp_0 = c36686b.m82128h("method-execution", c36686b.m82127g("2", "getRealResponse", "com.sensorsdata.analytics.android.sdk.network.RealRequest", "java.net.HttpURLConnection", "conn", "", "com.sensorsdata.analytics.android.sdk.network.RealResponse"), 163);
    }

    private RealResponse getExceptionResponse(Exception exc) {
        RealResponse realResponse = new RealResponse();
        realResponse.exception = exc;
        realResponse.errorMsg = exc.getMessage();
        SALog.m68589i(TAG, realResponse.toString());
        return realResponse;
    }

    private HttpURLConnection getHttpURLConnection(String str, String str2) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(30000);
        if (str2.equals("POST")) {
            httpURLConnection.setDoOutput(true);
        }
        SAConfigOptions configOptions = AbstractSensorsDataAPI.getConfigOptions();
        if (configOptions != null && (sSLSocketFactory = configOptions.mSSLSocketFactory) != null && (httpURLConnection instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnection;
    }

    private RealResponse getRealResponse(HttpURLConnection httpURLConnection) {
        return (RealResponse) SensorsdataAspect.m56540c().m56542e(new AjcClosure1(new Object[]{this, httpURLConnection, C36686b.m82123c(ajc$tjp_0, this, this, httpURLConnection)}).linkClosureAndJoinPoint(69648));
    }

    public static final /* synthetic */ RealResponse getRealResponse_aroundBody0(RealRequest realRequest, HttpURLConnection httpURLConnection, InterfaceC43175a interfaceC43175a) {
        RealResponse realResponse = new RealResponse();
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                realResponse.code = responseCode;
                if (HttpUtils.needRedirects(responseCode)) {
                    realResponse.location = HttpUtils.getLocation(httpURLConnection, sRequestURL);
                }
                realResponse.contentLength = httpURLConnection.getContentLength();
                if (realResponse.code < 400) {
                    realResponse.result = HttpUtils.getRetString(httpURLConnection.getInputStream());
                } else {
                    realResponse.errorMsg = HttpUtils.getRetString(httpURLConnection.getErrorStream());
                }
                httpURLConnection.disconnect();
                SALog.m68589i(TAG, realResponse.toString());
                return realResponse;
            } catch (IOException e11) {
                RealResponse exceptionResponse = realRequest.getExceptionResponse(e11);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return exceptionResponse;
            }
        } catch (Throwable th2) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th2;
        }
    }

    private void setHeader(HttpURLConnection httpURLConnection, Map<String, String> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                httpURLConnection.setRequestProperty(str, map.get(str));
            }
        }
    }

    public RealResponse getData(String str, Map<String, String> map) {
        try {
            SALog.m68589i(TAG, String.format("url:%s,\nmethod:GET", str));
            sRequestURL = str;
            HttpURLConnection httpURLConnection = getHttpURLConnection(str, "GET");
            if (map != null) {
                setHeader(httpURLConnection, map);
            }
            httpURLConnection.connect();
            return getRealResponse(httpURLConnection);
        } catch (Exception e11) {
            return getExceptionResponse(e11);
        }
    }

    static {
        ajc$preClinit();
    }
}
