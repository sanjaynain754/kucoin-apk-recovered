package com.geetest.captcha;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.ValueCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.geetest.captcha.utils.LogUtils;
import com.geetest.captcha.views.C6697a;
import com.geetest.captcha.views.GTC4WebView;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: com.geetest.captcha.e */
/* JADX INFO: loaded from: classes45.dex */
public final class C6664e {

    /* JADX INFO: renamed from: a */
    @Nullable
    public DialogC6678l f11159a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public GTC4WebView f11160b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public C6697a f11161c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final GTCaptcha4Client.OnDialogShowListener f11162d;

    /* JADX INFO: renamed from: a */
    public final void m12538a(@NotNull Context context, @NotNull C6662d dataBean, @NotNull InterfaceC6663d0 webViewObserver) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataBean, "dataBean");
        Intrinsics.checkNotNullParameter(webViewObserver, "webViewObserver");
        C6661c0 c6661c0 = new C6661c0();
        c6661c0.m12528a(webViewObserver);
        C6688t c6688tM12552a = C6688t.a.m12552a(dataBean.f11148b);
        if (c6688tM12552a == null) {
            String str = EnumC6672i.PARAM.getType() + "75";
            String str2 = C6674j.f11173e;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "Address configuration error");
            Unit unit = Unit.INSTANCE;
            webViewObserver.mo12524a(str, str2, jSONObject3);
            return;
        }
        String url = c6688tM12552a.f11198a;
        Map<String, String> map = c6688tM12552a.f11199b;
        Intrinsics.checkNotNullParameter(url, "baseUrl");
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("displayArea", EnumC6666f.CENTER.getValue());
        jSONObject4.put("protocol", "https://");
        jSONObject4.put("loading", "./gt4-loading.gif");
        Map<String, ? extends Object> map2 = dataBean.f11153g;
        LogUtils.f11200a.m12555d("Config Params: " + map2);
        if (map2 == null || map2.isEmpty()) {
            jSONObject = null;
        } else {
            Iterator<Map.Entry<String, ? extends Object>> it = map2.entrySet().iterator();
            jSONObject = null;
            while (it.hasNext()) {
                Map.Entry<String, ? extends Object> next = it.next();
                String key = next.getKey();
                Object value = next.getValue();
                it = it;
                if (Intrinsics.areEqual("xid", key)) {
                    HashMap map3 = new HashMap();
                    jSONObject2 = jSONObject;
                    if (value != null && (value instanceof JSONObject)) {
                        map3.put("xid", value);
                    }
                    C6660c.f11145a = map3;
                } else {
                    jSONObject2 = jSONObject;
                    if (!Intrinsics.areEqual("_gee_info", key)) {
                        jSONObject4.put(key, value);
                    } else if (value != null && (value instanceof JSONObject)) {
                        jSONObject = (JSONObject) value;
                        String[] strArr = {"geeid", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "displayName", C33556b3.f69062k2, "build", "clientVersion"};
                        for (int i11 = 0; i11 < 6; i11++) {
                            String str3 = strArr[i11];
                            if (jSONObject.has(str3)) {
                                jSONObject.remove(str3);
                            }
                        }
                    }
                }
                jSONObject = jSONObject2;
            }
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject4.put(entry.getKey(), entry.getValue());
            }
            map.clear();
        }
        String str4 = dataBean.f11147a;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("captchaId");
            str4 = null;
        }
        jSONObject4.put("captchaId", str4);
        jSONObject4.put(ClientData.KEY_CHALLENGE, UUID.randomUUID().toString());
        jSONObject4.put("debug", dataBean.f11149c);
        String str5 = dataBean.f11150d;
        if (str5 == null || StringsKt.isBlank(str5)) {
            Locale locale = context.getApplicationContext().getResources().getConfiguration().getLocales().get(0);
            Intrinsics.checkNotNullExpressionValue(locale, "{\n                contex….locales[0]\n            }");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(locale.getLanguage());
            sb2.append('-');
            String country = locale.getCountry();
            Intrinsics.checkNotNullExpressionValue(country, "locale.country");
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = country.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            sb2.append(lowerCase);
            jSONObject4.put("language", sb2.toString());
        } else {
            jSONObject4.put("language", dataBean.f11150d);
        }
        String[] strArr2 = dataBean.f11151e;
        if (strArr2 != null && strArr2.length != 0) {
            JSONArray jSONArray = new JSONArray();
            String[] strArr3 = dataBean.f11151e;
            Intrinsics.checkNotNull(strArr3);
            for (String str6 : strArr3) {
                jSONArray.put(str6);
            }
            jSONObject4.put("apiServers", jSONArray);
        }
        String[] strArr4 = dataBean.f11152f;
        if (strArr4 != null && strArr4.length != 0) {
            JSONArray jSONArray2 = new JSONArray();
            String[] strArr5 = dataBean.f11152f;
            Intrinsics.checkNotNull(strArr5);
            for (String str7 : strArr5) {
                jSONArray2.put(str7);
            }
            jSONObject4.put("staticServers", jSONArray2);
        }
        jSONObject4.put("timeout", dataBean.f11156j);
        jSONObject4.put("clientVersion", "1.8.9");
        jSONObject4.put("clientType", "android");
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put(TtmlNode.ANNOTATION_POSITION_OUTSIDE, dataBean.f11154h);
        jSONObject4.put("mask", jSONObject5);
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("geeid", new JSONObject(C6682n.m12548a(context)));
            jSONObject6.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, context.getPackageName());
            CharSequence charSequenceLoadLabel = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).loadLabel(context.getPackageManager());
            Intrinsics.checkNotNullExpressionValue(charSequenceLoadLabel, "context.packageManager.g…l(context.packageManager)");
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            jSONObject6.put("displayName", Uri.encode(charSequenceLoadLabel.toString()));
            jSONObject6.put(C33556b3.f69062k2, packageInfo.versionName);
            jSONObject6.put("build", String.valueOf(packageInfo.versionCode));
            jSONObject6.put("clientVersion", "1.8.9");
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> keys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "keys");
                while (keys.hasNext()) {
                    String next2 = keys.next();
                    jSONObject6.put(next2, jSONObject.opt(next2));
                }
            }
            jSONObject4.put("mi", jSONObject6);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            if (!jSONObject4.has("displayMode") || ((jSONObject4.get("displayMode") instanceof Integer) && Intrinsics.areEqual(jSONObject4.get("displayMode"), Integer.valueOf(EnumC6668g.AUTO.getValue())))) {
                Intrinsics.checkNotNullParameter(context, "context");
                jSONObject4.put("displayMode", ((context.getResources().getConfiguration().uiMode & 48) == 32 ? EnumC6668g.DARK : EnumC6668g.NORMAL).getValue());
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        LogUtils logUtils = LogUtils.f11200a;
        logUtils.m12555d("BaseURL: " + dataBean.f11148b + ", Parameter: " + jSONObject4);
        JSONObject jSONObject7 = new JSONObject(jSONObject4.toString());
        if (jSONObject7.has("mi")) {
            jSONObject7.remove("mi");
        }
        logUtils.release("BaseURL: " + dataBean.f11148b + ", Parameter: " + jSONObject7);
        String strEncode = Uri.encode(jSONObject4.toString());
        Intrinsics.checkNotNullParameter("data", "name");
        if (map != null) {
            map.put("data", strEncode);
        }
        try {
            C6697a.a aVar = new C6697a.a();
            if (map != null && !map.isEmpty()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(url);
                stringBuffer.append('?');
                for (Map.Entry<String, String> entry2 : map.entrySet()) {
                    String key2 = entry2.getKey();
                    String value2 = entry2.getValue();
                    stringBuffer.append(key2);
                    stringBuffer.append('=');
                    stringBuffer.append(value2);
                    stringBuffer.append(Typography.amp);
                }
                url = stringBuffer.deleteCharAt(stringBuffer.length() - 1).toString();
                Intrinsics.checkNotNullExpressionValue(url, "{\n            val sb = S…- 1).toString()\n        }");
            }
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(url, "<set-?>");
            aVar.f11228a = url;
            C6697a c6697aM12575a = new C6697a(aVar.m12579a(context, c6661c0, dataBean)).m12575a();
            try {
                this.f11161c = c6697aM12575a;
                this.f11160b = c6697aM12575a.f11226c;
            } catch (Exception e13) {
                e = e13;
                e.printStackTrace();
                if (e.getMessage() != null) {
                    String str8 = EnumC6672i.WEB_VIEW_NEW.getType() + "99";
                    String str9 = C6674j.f11175g;
                    JSONObject jSONObject8 = new JSONObject();
                    jSONObject8.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "Device not supported");
                    jSONObject8.put("exception", e.getMessage());
                    Unit unit2 = Unit.INSTANCE;
                    webViewObserver.mo12524a(str8, str9, jSONObject8);
                }
            }
        } catch (Exception e14) {
            e = e14;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12539b() {
        GTC4WebView gTC4WebView = this.f11160b;
        if (gTC4WebView != null) {
            gTC4WebView.evaluateJavascript("javascript:jsBridge.callback('showBox')", new ValueCallback() { // from class: com.geetest.captcha.i0
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    C6664e.m12534a((String) obj);
                }
            });
        }
    }

    public C6664e(@Nullable GTCaptcha4Client.OnDialogShowListener onDialogShowListener) {
        this.f11162d = onDialogShowListener;
    }

    /* JADX INFO: renamed from: a */
    public final void m12537a(@NotNull final Context context, @NotNull final C6662d dataBean, @NotNull final C6659b0.a webViewObserver) {
        DialogC6678l dialogC6678l;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataBean, "dataBean");
        Intrinsics.checkNotNullParameter(webViewObserver, "webViewObserver");
        try {
            C6661c0 c6661c0 = new C6661c0();
            c6661c0.m12528a(webViewObserver);
            GTC4WebView gTC4WebView = this.f11160b;
            if (gTC4WebView != null) {
                gTC4WebView.setWebViewObservable(c6661c0);
            }
            C6697a c6697a = this.f11161c;
            if (c6697a != null) {
                c6697a.m12576a(c6661c0);
            }
            if (dataBean.f11155i) {
                return;
            }
            if (!Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
                ((Activity) context).runOnUiThread(new Runnable() { // from class: com.geetest.captcha.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6664e.m12531a(this.f11176b, context, dataBean, webViewObserver);
                    }
                });
                return;
            }
            if (TextUtils.isEmpty(dataBean.f11158l)) {
                dialogC6678l = new DialogC6678l(context);
            } else {
                String str = dataBean.f11158l;
                dialogC6678l = str != null ? new DialogC6678l(context, str) : null;
            }
            this.f11159a = dialogC6678l;
            if (dialogC6678l != null) {
                dialogC6678l.f11183b = this.f11162d;
            }
            if (dialogC6678l != null) {
                dialogC6678l.f11182a = this.f11160b;
            }
            m12533a(dialogC6678l, webViewObserver);
            DialogC6678l dialogC6678l2 = this.f11159a;
            if (dialogC6678l2 != null) {
                dialogC6678l2.show();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m12531a(C6664e this$0, Context context, C6662d dataBean, InterfaceC6663d0 webViewObserver) {
        DialogC6678l dialogC6678l;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(dataBean, "$dataBean");
        Intrinsics.checkNotNullParameter(webViewObserver, "$webViewObserver");
        try {
            this$0.getClass();
            if (TextUtils.isEmpty(dataBean.f11158l)) {
                dialogC6678l = new DialogC6678l(context);
            } else {
                String str = dataBean.f11158l;
                dialogC6678l = str != null ? new DialogC6678l(context, str) : null;
            }
            this$0.f11159a = dialogC6678l;
            if (dialogC6678l != null) {
                dialogC6678l.f11183b = this$0.f11162d;
            }
            if (dialogC6678l != null) {
                dialogC6678l.f11182a = this$0.f11160b;
            }
            m12533a(dialogC6678l, webViewObserver);
            DialogC6678l dialogC6678l2 = this$0.f11159a;
            if (dialogC6678l2 != null) {
                dialogC6678l2.show();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12533a(DialogC6678l dialogC6678l, final InterfaceC6663d0 interfaceC6663d0) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (dialogC6678l != null) {
            dialogC6678l.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.geetest.captcha.g0
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
                    return C6664e.m12535a(interfaceC6663d0, dialogInterface, i11, keyEvent);
                }
            });
        }
        if (Build.VERSION.SDK_INT < 33 || dialogC6678l == null || (onBackInvokedDispatcher = dialogC6678l.getOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, new OnBackInvokedCallback() { // from class: com.geetest.captcha.h0
            public final void onBackInvoked() {
                C6664e.m12530a(interfaceC6663d0);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m12535a(InterfaceC6663d0 webViewObserver, DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(webViewObserver, "$webViewObserver");
        if (i11 != 4 || keyEvent == null || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1) {
            return false;
        }
        webViewObserver.mo12526b();
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static final void m12530a(InterfaceC6663d0 webViewObserver) {
        Intrinsics.checkNotNullParameter(webViewObserver, "$webViewObserver");
        webViewObserver.mo12526b();
    }

    /* JADX INFO: renamed from: a */
    public static final void m12534a(String str) {
        LogUtils.f11200a.release("DialogController javascript:jsBridge.callback('showBox') return: " + str);
    }

    /* JADX INFO: renamed from: a */
    public final void m12536a() {
        try {
            final DialogC6678l dialogC6678l = this.f11159a;
            if (dialogC6678l == null || !dialogC6678l.isShowing()) {
                return;
            }
            GTC4WebView gTC4WebView = this.f11160b;
            Context context = gTC4WebView != null ? gTC4WebView.getContext() : null;
            if (context != null) {
                Activity activity = (Activity) context;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                if (!Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
                    activity.runOnUiThread(new Runnable() { // from class: com.geetest.captcha.k0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6664e.m12532a(this.f11180b, dialogC6678l);
                        }
                    });
                    return;
                }
                GTC4WebView gTC4WebView2 = this.f11160b;
                if (gTC4WebView2 != null) {
                    gTC4WebView2.destroy();
                }
                dialogC6678l.dismiss();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m12532a(C6664e this$0, DialogC6678l this_apply) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        GTC4WebView gTC4WebView = this$0.f11160b;
        if (gTC4WebView != null) {
            gTC4WebView.destroy();
        }
        this_apply.dismiss();
    }
}
