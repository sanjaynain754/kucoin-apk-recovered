package com.datavisor.vangogh.storage.local;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.datavisor.vangogh.bridge.crypto;
import com.datavisor.vangogh.face.DVTokenClient;
import com.datavisorobfus.C5411e;
import com.datavisorobfus.C5415f0;
import com.datavisorobfus.C5422i;
import com.datavisorobfus.C5454y;
import com.datavisorobfus.C5455y0;
import com.datavisorobfus.C5457z0;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class DVJS2Native {
    private Context mContext;
    private WebView mWebView;

    /* JADX INFO: renamed from: com.datavisor.vangogh.storage.local.DVJS2Native$a */
    public class RunnableC5395a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f7220a;

        public RunnableC5395a(String str) {
            this.f7220a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            DVJS2Native.this.mWebView.evaluateJavascript(this.f7220a, null);
        }
    }

    /* JADX INFO: renamed from: com.datavisor.vangogh.storage.local.DVJS2Native$b */
    public class C5396b implements DVTokenClient.InitResultListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f7222a;

        /* JADX INFO: renamed from: com.datavisor.vangogh.storage.local.DVJS2Native$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f7224a;

            public a(String str) {
                this.f7224a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                DVJS2Native.this.mWebView.evaluateJavascript(this.f7224a, null);
            }
        }

        public C5396b(String str) {
            this.f7222a = str;
        }

        @Override // com.datavisor.vangogh.face.DVTokenClient.InitResultListener
        public void onResult(String str, int i11) {
            String strM7475a = C5455y0.m7470a(DVJS2Native.this.mContext).m7475a(crypto.convert("H6i37Q=="));
            String str2 = "";
            if (C5457z0.m7480a(strM7475a)) {
                strM7475a = "";
            }
            if (C5457z0.m7480a(str)) {
                str = "";
            }
            if (i11 != 0) {
                str2 = "Native Error Code: " + i11;
            }
            String str3 = String.format("window.dvEdgeRapahel_GetNativeToken('%s', '%s', '%s', %s);", str, strM7475a, str2, this.f7222a);
            C5415f0.m7136a("strJSCommand initToken Case: " + str3);
            DVJS2Native.this.mWebView.post(new a(str3));
        }
    }

    /* JADX INFO: renamed from: com.datavisor.vangogh.storage.local.DVJS2Native$c */
    public class RunnableC5397c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f7226a;

        public RunnableC5397c(String str) {
            this.f7226a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            DVJS2Native.this.mWebView.evaluateJavascript(this.f7226a, null);
        }
    }

    /* JADX INFO: renamed from: com.datavisor.vangogh.storage.local.DVJS2Native$d */
    public class C5398d implements DVTokenClient.InitResultListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f7228a;

        /* JADX INFO: renamed from: com.datavisor.vangogh.storage.local.DVJS2Native$d$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f7230a;

            public a(String str) {
                this.f7230a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                DVJS2Native.this.mWebView.evaluateJavascript(this.f7230a, null);
            }
        }

        public C5398d(String str) {
            this.f7228a = str;
        }

        @Override // com.datavisor.vangogh.face.DVTokenClient.InitResultListener
        public void onResult(String str, int i11) {
            String strM7475a = C5455y0.m7470a(DVJS2Native.this.mContext).m7475a(crypto.convert("H6i37Q=="));
            String str2 = "";
            if (C5457z0.m7480a(strM7475a)) {
                strM7475a = "";
            }
            if (C5457z0.m7480a(str)) {
                str = "";
            }
            if (i11 != 0) {
                str2 = "Native Error Code: " + i11;
            }
            String str3 = String.format("window.dvEdgeRapahel_GetNativeToken('%s', '%s', '%s', %s);", str, strM7475a, str2, this.f7228a);
            C5415f0.m7136a("strJSCommand initLongToken Case: " + str3);
            DVJS2Native.this.mWebView.post(new a(str3));
        }
    }

    public DVJS2Native(Context context, WebView webView) {
        this.mContext = context;
        this.mWebView = webView;
    }

    @JavascriptInterface
    public void initLongToken(String str, String str2, String str3) {
        String str4;
        boolean z11;
        JSONObject jSONObject;
        try {
            String strM7162a = C5422i.m7160b().m7162a();
            String strM7169c = C5422i.m7160b().m7169c();
            boolean z12 = false;
            if (!C5457z0.m7480a(strM7162a) && !C5457z0.m7480a(strM7169c)) {
                z11 = true;
                str4 = "";
            } else {
                str4 = "Native code has no access or secret";
                z11 = false;
            }
            if (C5457z0.m7480a(str2)) {
                str4 = "JS Env is empty";
                z11 = false;
            }
            String strM7465c = C5454y.m7454a(this.mContext).m7465c();
            if (C5457z0.m7480a(strM7465c)) {
                str4 = "Native env is empty";
                z11 = false;
            }
            if (!C5457z0.m7481a(strM7465c, str2)) {
                str4 = "JS env is not equal to Native env";
            } else {
                z12 = z11;
            }
            if (!z12) {
                String str5 = String.format("window.dvEdgeRapahel_GetNativeToken('%s', '%s', '%s', %s);", "", "", str4, str);
                C5415f0.m7136a("strJSCommand ErrorCase: " + str5);
                this.mWebView.post(new RunnableC5397c(str5));
            }
            Map<String, String> mapM7127a = null;
            try {
                if (C5457z0.m7482b(str3)) {
                    jSONObject = new JSONObject(str3);
                } else {
                    jSONObject = null;
                }
                mapM7127a = C5411e.m7127a(jSONObject);
            } catch (Throwable th2) {
                C5415f0.m7136a("initLongToken userParam JSON exception: " + th2);
            }
            DVTokenClient.getInstance(this.mContext).initDeviceToken(strM7162a, strM7169c, mapM7127a, new C5398d(str));
        } catch (Throwable th3) {
            C5415f0.m7136a("JS2Native initLongToken Exception: " + th3);
        }
    }

    @JavascriptInterface
    public void initToken(String str, String str2, String str3) {
        String str4;
        boolean z11;
        JSONObject jSONObject;
        try {
            String strM7162a = C5422i.m7160b().m7162a();
            String strM7169c = C5422i.m7160b().m7169c();
            boolean z12 = false;
            if (!C5457z0.m7480a(strM7162a) && !C5457z0.m7480a(strM7169c)) {
                z11 = true;
                str4 = "";
            } else {
                str4 = "Native code has no access or secret";
                z11 = false;
            }
            if (C5457z0.m7480a(str2)) {
                str4 = "JS Env is empty";
                z11 = false;
            }
            String strM7465c = C5454y.m7454a(this.mContext).m7465c();
            if (C5457z0.m7480a(strM7465c)) {
                str4 = "Native env is empty";
                z11 = false;
            }
            if (!C5457z0.m7481a(strM7465c, str2)) {
                str4 = "JS env is not equal to Native env";
            } else {
                z12 = z11;
            }
            if (!z12) {
                String str5 = String.format("window.dvEdgeRapahel_GetNativeToken('%s', '%s', '%s', %s);", "", "", str4, str);
                C5415f0.m7136a("strJSCommand ErrorCase: " + str5);
                this.mWebView.post(new RunnableC5395a(str5));
            }
            Map<String, String> mapM7127a = null;
            try {
                if (C5457z0.m7482b(str3)) {
                    jSONObject = new JSONObject(str3);
                } else {
                    jSONObject = null;
                }
                mapM7127a = C5411e.m7127a(jSONObject);
            } catch (Throwable th2) {
                C5415f0.m7136a("initToken userParam JSON exception: " + th2);
            }
            DVTokenClient.getInstance(this.mContext).initToken(strM7162a, strM7169c, mapM7127a, new C5396b(str));
        } catch (Throwable th3) {
            C5415f0.m7136a("JS2Native initToken Exception: " + th3);
        }
    }
}
