package com.datavisor.vangogh.face;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.webkit.WebView;
import com.datavisor.vangogh.util.DVClient;
import com.datavisorobfus.C5432n;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class DVTokenClient extends DVClient {
    private static DVTokenClient DVTokenClientInstance;
    private Context mContext;

    public interface GetDVTokenListener {
        void onResult(String str);
    }

    public interface InitResultListener {
        void onResult(String str, int i11);
    }

    public interface InitResultWithExceptionListener {
        void onResult(String str, int i11, Throwable th2);
    }

    public interface RaphaelListener {
        void onResult(String str, int i11);
    }

    public static DVTokenClient getInstance(Context context) {
        if (DVTokenClientInstance == null) {
            synchronized (DVTokenClient.class) {
                try {
                    if (DVTokenClientInstance == null) {
                        DVTokenClientInstance = new DVTokenClient(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return DVTokenClientInstance;
    }

    public String getDVToken() {
        return C5432n.m7227b(this.mContext).m7228a();
    }

    public void getDVTokenAsync(GetDVTokenListener getDVTokenListener) {
        C5432n.m7227b(this.mContext).m7229a(getDVTokenListener);
    }

    public boolean initDeviceToken(String str, String str2, Map<String, String> map, InitResultListener initResultListener) {
        return C5432n.m7227b(this.mContext).m7232a(str, str2, map, initResultListener);
    }

    public boolean initToken(String str, String str2, Map<String, String> map, InitResultListener initResultListener) {
        return C5432n.m7227b(this.mContext).m7233b(str, str2, map, initResultListener);
    }

    public void setDVCustomDomain(String str) {
        C5432n.m7227b(this.mContext).m7230a(str);
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    public boolean startJSSDK(WebView webView) {
        return C5432n.m7227b(this.mContext).m7231a(webView);
    }

    private DVTokenClient(Context context) {
        this.mContext = null;
        if (context instanceof Application) {
            this.mContext = context;
            return;
        }
        throw new IllegalArgumentException("DVTokenClient initialization error: mContext is null or not ApplicationContext.");
    }
}
