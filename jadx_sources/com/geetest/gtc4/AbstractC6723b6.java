package com.geetest.gtc4;

import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: renamed from: com.geetest.gtc4.b6 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6723b6 {
    /* JADX INFO: renamed from: a */
    public static Pair m12614a(C6714a6 c6714a6, int i11) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(c6714a6.f11308b).openConnection()));
            httpURLConnection.setConnectTimeout(i11 > 0 ? i11 : 5000);
            if (i11 <= 0) {
                i11 = 3000;
            }
            httpURLConnection.setReadTimeout(i11);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setUseCaches(false);
            if (c6714a6.f11307a.size() > 0) {
                for (Map.Entry entry : c6714a6.f11307a.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (!TextUtils.isEmpty(c6714a6.f11309c)) {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(c6714a6.f11309c.getBytes(StandardCharsets.UTF_8));
                outputStream.flush();
                outputStream.close();
            }
            int responseCode = httpURLConnection.getResponseCode();
            Pair pairM12615a = m12615a(httpURLConnection.getInputStream());
            return ((Boolean) pairM12615a.first).booleanValue() ? new Pair(Integer.valueOf(responseCode), (String) pairM12615a.second) : new Pair(Integer.valueOf(-responseCode), (String) pairM12615a.second);
        } catch (MalformedURLException e11) {
            AbstractC6846p3.m12691a(String.valueOf(-11), e11);
            return new Pair(-11, e11.toString());
        } catch (ProtocolException e12) {
            AbstractC6846p3.m12691a(String.valueOf(-12), e12);
            return new Pair(-12, e12.toString());
        } catch (IOException e13) {
            AbstractC6846p3.m12691a(String.valueOf(-13), e13);
            return new Pair(-13, e13.toString());
        } catch (Exception e14) {
            AbstractC6846p3.m12691a(String.valueOf(-14), e14);
            return new Pair(-14, e14.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static Pair m12615a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i11 = inputStream.read(bArr);
                    if (i11 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i11);
                }
                Pair pair = new Pair(Boolean.TRUE, byteArrayOutputStream.toString());
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e11) {
                    AbstractC6846p3.m12691a(String.valueOf(-13), e11);
                }
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    AbstractC6846p3.m12691a(String.valueOf(-13), e12);
                }
                return pair;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e13) {
                    AbstractC6846p3.m12691a(String.valueOf(-13), e13);
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        throw th2;
                    } catch (IOException e14) {
                        AbstractC6846p3.m12691a(String.valueOf(-13), e14);
                        throw th2;
                    }
                }
                throw th2;
            }
        } catch (IOException e15) {
            AbstractC6846p3.m12691a(String.valueOf(-13), e15);
            Pair pair2 = new Pair(Boolean.FALSE, e15.toString());
            try {
                byteArrayOutputStream.close();
            } catch (IOException e16) {
                AbstractC6846p3.m12691a(String.valueOf(-13), e16);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e17) {
                    AbstractC6846p3.m12691a(String.valueOf(-13), e17);
                }
            }
            return pair2;
        } catch (Exception e18) {
            AbstractC6846p3.m12691a(String.valueOf(-14), e18);
            Pair pair3 = new Pair(Boolean.FALSE, e18.toString());
            try {
                byteArrayOutputStream.close();
            } catch (IOException e19) {
                AbstractC6846p3.m12691a(String.valueOf(-13), e19);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e21) {
                    AbstractC6846p3.m12691a(String.valueOf(-13), e21);
                }
            }
            return pair3;
        }
    }
}
