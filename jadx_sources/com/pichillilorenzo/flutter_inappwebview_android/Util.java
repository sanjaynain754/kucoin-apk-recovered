package com.pichillilorenzo.flutter_inappwebview_android;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.pichillilorenzo.flutter_inappwebview_android.types.Size2D;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.thumbplayer.tcmedia.api.TPErrorCode;
import io.flutter.plugin.common.MethodChannel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class Util {
    public static final String ANDROID_ASSET_URL = "file:///android_asset/";
    static final String LOG_TAG = "Util";

    public static PrivateKeyAndCertificates loadPrivateKeyAndCertificate(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str, String str2, String str3) {
        InputStream fileInputStream;
        PrivateKeyAndCertificates privateKeyAndCertificates = null;
        try {
            fileInputStream = getFileAsset(inAppWebViewFlutterPlugin, str);
        } catch (IOException unused) {
            fileInputStream = null;
        }
        try {
            try {
                if (fileInputStream == null) {
                    try {
                        fileInputStream = new FileInputStream(str);
                    } catch (Exception e11) {
                        Log.e(LOG_TAG, "", e11);
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return privateKeyAndCertificates;
                    }
                }
                KeyStore keyStore = KeyStore.getInstance(str3);
                keyStore.load(fileInputStream, (str2 != null ? str2 : "").toCharArray());
                String strNextElement = keyStore.aliases().nextElement();
                if (str2 == null) {
                    str2 = "";
                }
                Key key = keyStore.getKey(strNextElement, str2.toCharArray());
                privateKeyAndCertificates = key instanceof PrivateKey ? new PrivateKeyAndCertificates((PrivateKey) key, new X509Certificate[]{(X509Certificate) keyStore.getCertificate(strNextElement)}) : null;
                fileInputStream.close();
                fileInputStream.close();
            } catch (Throwable th2) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e12) {
                        Log.e(LOG_TAG, "", e12);
                    }
                }
                throw th2;
            }
        } catch (IOException e13) {
            Log.e(LOG_TAG, "", e13);
        }
        return privateKeyAndCertificates;
    }

    public static HttpURLConnection makeHttpRequest(String str, String str2, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            try {
                httpURLConnection.setRequestMethod(str2);
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(true);
                if ("GET".equalsIgnoreCase(str2)) {
                    httpURLConnection.setDoOutput(false);
                }
                httpURLConnection.connect();
                return httpURLConnection;
            } catch (Exception e11) {
                e = e11;
                if (!(e instanceof SSLHandshakeException)) {
                    Log.e(LOG_TAG, "", e);
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return null;
            }
        } catch (Exception e12) {
            e = e12;
            httpURLConnection = null;
        }
    }

    public static byte[] readAllBytes(InputStream inputStream) {
        byte[] byteArray = null;
        if (inputStream == null) {
            return null;
        }
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int i11 = inputStream.read(bArr, 0, 4096);
                if (i11 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            } catch (IOException e11) {
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    e11.addSuppressed(e12);
                }
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e13) {
                    e11.addSuppressed(e13);
                }
            } catch (Throwable th2) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                try {
                    byteArrayOutputStream.close();
                    throw th2;
                } catch (IOException unused2) {
                    throw th2;
                }
            }
        }
        byteArray = byteArrayOutputStream.toByteArray();
        try {
            inputStream.close();
        } catch (IOException unused3) {
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused4) {
        }
        return byteArray;
    }

    public static class PrivateKeyAndCertificates {
        public X509Certificate[] certificates;
        public PrivateKey privateKey;

        public PrivateKeyAndCertificates(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
            this.privateKey = privateKey;
            this.certificates = x509CertificateArr;
        }
    }

    public static String JSONStringify(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Map) {
            return new JSONObject((Map) obj).toString();
        }
        if (obj instanceof List) {
            return new JSONArray((Collection) obj).toString();
        }
        return obj instanceof String ? JSONObject.quote((String) obj) : JSONObject.wrap(obj).toString();
    }

    public static Drawable drawableFromBytes(Context context, byte[] bArr) {
        return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    public static InputStream getFileAsset(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str) {
        return inAppWebViewFlutterPlugin.applicationContext.getResources().getAssets().open(inAppWebViewFlutterPlugin.flutterAssets.getAssetFilePathByName(str));
    }

    public static Size2D getFullscreenSize(Context context) {
        Size2D size2D = new Size2D(-1.0d, -1.0d);
        WindowManager windowManager = (WindowManager) context.getSystemService(InterfaceC33953u5.f72199F);
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
                int i11 = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
                int i12 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
                Rect bounds = currentWindowMetrics.getBounds();
                size2D.setWidth(bounds.width() - i11);
                size2D.setHeight(bounds.height() - i12);
                return size2D;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            size2D.setWidth(displayMetrics.widthPixels);
            size2D.setHeight(displayMetrics.heightPixels);
        }
        return size2D;
    }

    public static String getUrlAsset(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str) throws IOException {
        String assetFilePathByName = inAppWebViewFlutterPlugin.flutterAssets.getAssetFilePathByName(str);
        try {
            InputStream fileAsset = getFileAsset(inAppWebViewFlutterPlugin, str);
            if (fileAsset != null) {
                fileAsset.close();
            }
            e = null;
        } catch (IOException e11) {
            e = e11;
        }
        if (e != null) {
            throw e;
        }
        return ANDROID_ASSET_URL + assetFilePathByName;
    }

    public static <T> T invokeMethodAndWaitResult(final MethodChannel methodChannel, final String str, final Object obj, final SyncBaseCallbackResultImpl<T> syncBaseCallbackResultImpl) throws InterruptedException {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.Util.1
            @Override // java.lang.Runnable
            public void run() {
                methodChannel.invokeMethod(str, obj, syncBaseCallbackResultImpl);
            }
        });
        syncBaseCallbackResultImpl.latch.await();
        return syncBaseCallbackResultImpl.result;
    }

    private Util() {
    }

    public static <T> T getOrDefault(Map<String, Object> map, String str, T t11) {
        if (map.containsKey(str)) {
            return (T) map.get(str);
        }
        return t11;
    }

    public static float getPixelDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static X509Certificate getX509CertFromSslCertHack(SslCertificate sslCertificate) {
        byte[] byteArray = SslCertificate.saveState(sslCertificate).getByteArray("x509-certificate");
        if (byteArray != null) {
            try {
                return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(byteArray));
            } catch (CertificateException unused) {
                return null;
            }
        }
        return null;
    }

    public static <O> Object invokeMethodIfExists(O o11, String str, Object... objArr) {
        for (Method method : o11.getClass().getMethods()) {
            if (method.getName().equals(str)) {
                try {
                    return method.invoke(o11, objArr);
                } catch (IllegalAccessException | InvocationTargetException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public static boolean isClass(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean isIPv6(String str) {
        try {
            InetAddress.getByName(str);
            return true;
        } catch (UnknownHostException unused) {
            return false;
        }
    }

    public static void log(String str, String str2) {
        int iMin;
        int length = str2.length();
        int i11 = 0;
        while (i11 < length) {
            int iIndexOf = str2.indexOf(10, i11);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i11 + TPErrorCode.TP_ERROR_TYPE_DOWNLOAD_PROXY);
                Log.d(str, str2.substring(i11, iMin));
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i11 = iMin;
                }
            }
            i11 = iMin + 1;
        }
    }

    public static String normalizeIPv6(String str) throws Exception {
        if (isIPv6(str)) {
            return InetAddress.getByName(str).getCanonicalHostName();
        }
        throw new Exception("Invalid address: " + str);
    }

    public static boolean objEquals(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static String replaceAll(String str, String str2, String str3) {
        return TextUtils.join(str3, str.split(Pattern.quote(str2)));
    }
}
