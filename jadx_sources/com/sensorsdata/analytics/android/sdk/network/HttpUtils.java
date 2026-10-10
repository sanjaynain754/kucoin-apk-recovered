package com.sensorsdata.analytics.android.sdk.network;

import android.text.TextUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sensorsdata.analytics.android.sdk.SALog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes23.dex */
class HttpUtils {
    private static final int HTTP_307 = 307;

    public static String getLocation(HttpURLConnection httpURLConnection, String str) throws MalformedURLException {
        if (httpURLConnection == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String headerField = httpURLConnection.getHeaderField("Location");
        if (TextUtils.isEmpty(headerField)) {
            headerField = httpURLConnection.getHeaderField(FirebaseAnalytics.Param.LOCATION);
        }
        if (TextUtils.isEmpty(headerField)) {
            return null;
        }
        if (headerField.startsWith("http://") || headerField.startsWith("https://")) {
            return headerField;
        }
        URL url = new URL(str);
        return url.getProtocol() + "://" + url.getHost() + headerField;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[SYNTHETIC] */
    public static String getRetString(InputStream inputStream) throws Throwable {
        Throwable th2;
        BufferedReader bufferedReader;
        Exception e11;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                try {
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line);
                        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    }
                    inputStream.close();
                    String string = sb2.toString();
                    try {
                        bufferedReader.close();
                    } catch (IOException e12) {
                        SALog.printStackTrace(e12);
                    }
                    try {
                        inputStream.close();
                    } catch (IOException e13) {
                        SALog.printStackTrace(e13);
                    }
                    return string;
                } catch (Exception e14) {
                    e11 = e14;
                    SALog.printStackTrace(e11);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e15) {
                            SALog.printStackTrace(e15);
                        }
                    }
                    if (inputStream == null) {
                        return "";
                    }
                    try {
                        inputStream.close();
                        return "";
                    } catch (IOException e16) {
                        SALog.printStackTrace(e16);
                        return "";
                    }
                }
            } catch (Throwable th3) {
                th2 = th3;
                if (0 != 0) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e17) {
                        SALog.printStackTrace(e17);
                    }
                }
                if (inputStream != null) {
                    throw th2;
                }
                try {
                    inputStream.close();
                    throw th2;
                } catch (IOException e18) {
                    SALog.printStackTrace(e18);
                    throw th2;
                }
            }
        } catch (Exception e19) {
            bufferedReader = null;
            e11 = e19;
        } catch (Throwable th4) {
            th2 = th4;
            if (0 != 0) {
                bufferedReader2.close();
            }
            if (inputStream != null) {
                throw th2;
            }
            inputStream.close();
            throw th2;
        }
    }

    public static boolean needRedirects(int i11) {
        return i11 == 301 || i11 == 302 || i11 == 307;
    }
}
