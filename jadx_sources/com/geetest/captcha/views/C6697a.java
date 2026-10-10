package com.geetest.captcha.views;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import com.geetest.captcha.C6660c;
import com.geetest.captcha.C6661c0;
import com.geetest.captcha.C6662d;
import com.geetest.captcha.C6674j;
import com.geetest.captcha.C6688t;
import com.geetest.captcha.EnumC6672i;
import com.geetest.captcha.InterfaceC6663d0;
import com.geetest.captcha.utils.LogUtils;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.firebase.messaging.Constants;
import com.hcaptcha.sdk.HCaptchaJSInterface;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.C33864ph;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Unit;
import p852kotlin.concurrent.ThreadsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.geetest.captcha.views.a */
/* JADX INFO: loaded from: classes45.dex */
public final class C6697a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f11224a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public C6661c0 f11225b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final GTC4WebView f11226c;

    /* JADX INFO: renamed from: d */
    public b f11227d;

    /* JADX INFO: renamed from: com.geetest.captcha.views.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public String f11228a;

        /* JADX INFO: renamed from: b */
        public C6661c0 f11229b;

        /* JADX INFO: renamed from: c */
        public GTC4WebView f11230c;

        /* JADX INFO: renamed from: com.geetest.captcha.views.a$a$a, reason: collision with other inner class name */
        public static final class C46969a extends Lambda implements Function0<Unit> {
            final /* synthetic */ Context $context;
            final /* synthetic */ C6662d $dataBean;
            final /* synthetic */ C6661c0 $observable;

            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46969a(Context context, C6661c0 c6661c0, C6662d c6662d) {
                super(0);
                this.$context = context;
                this.$observable = c6661c0;
                this.$dataBean = c6662d;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                a aVar = a.this;
                GTC4WebView gTC4WebView = new GTC4WebView(this.$context);
                aVar.getClass();
                Intrinsics.checkNotNullParameter(gTC4WebView, "<set-?>");
                aVar.f11230c = gTC4WebView;
                a.this.m12581c().m12571a(this.$observable, this.$dataBean, a.this.m12580b());
                a aVar2 = a.this;
                C6661c0 c6661c0 = this.$observable;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(c6661c0, "<set-?>");
                aVar2.f11229b = c6661c0;
            }
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C6661c0 m12578a() {
            C6661c0 c6661c0 = this.f11229b;
            if (c6661c0 != null) {
                return c6661c0;
            }
            Intrinsics.throwUninitializedPropertyAccessException("observable");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final a m12579a(@NotNull Context context, @NotNull C6661c0 observable, @NotNull C6662d dataBean) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(observable, "observable");
            Intrinsics.checkNotNullParameter(dataBean, "dataBean");
            final C46969a c46969a = new C46969a(context, observable, dataBean);
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                c46969a.invoke();
                return this;
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.geetest.captcha.views.d
                @Override // java.lang.Runnable
                public final void run() {
                    C6697a.a.m12577a(c46969a);
                }
            });
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final String m12580b() {
            String str = this.f11228a;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("url");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final GTC4WebView m12581c() {
            GTC4WebView gTC4WebView = this.f11230c;
            if (gTC4WebView != null) {
                return gTC4WebView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            return null;
        }

        /* JADX INFO: renamed from: a */
        public static final void m12577a(Function0 impl) {
            Intrinsics.checkNotNullParameter(impl, "$impl");
            impl.invoke();
        }
    }

    /* JADX INFO: renamed from: com.geetest.captcha.views.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public String f11231a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public GTC4WebView f11232b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public C6661c0 f11233c;

        /* JADX INFO: renamed from: com.geetest.captcha.views.a$b$a */
        public static final class a extends Lambda implements Function0<Unit> {
            /* JADX INFO: renamed from: a */
            public static final void m12582a(b this$0, String str) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f11232b.evaluateJavascript("javascript:jsBridge.callback('postNativeMessage', '" + str + "')", new ValueCallback() { // from class: com.geetest.captcha.views.e
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        C6697a.b.a.m12583a((String) obj);
                    }
                });
            }

            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            public a() {
                super(0);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0038  */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String str;
                Context context = b.this.f11232b.getContext();
                String url = b.this.f11231a;
                Intrinsics.checkNotNullParameter(url, "url");
                final String strM12527a = null;
                if (context != null) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        C6688t c6688tM12552a = C6688t.a.m12552a(url);
                        if (c6688tM12552a != null) {
                            String baseUrl = c6688tM12552a.f11198a;
                            Map<String, String> map = c6688tM12552a.f11199b;
                            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
                            if (map != null) {
                                str = map.get("data");
                            } else {
                                str = null;
                            }
                        } else {
                            str = null;
                        }
                        JSONObject jSONObject = new JSONObject(URLDecoder.decode(str, "utf-8"));
                        String string = jSONObject.getString(ClientData.KEY_CHALLENGE);
                        sb2.append(jSONObject.getString("captchaId"));
                        sb2.append(string);
                        sb2.append(context.getPackageName());
                        sb2.append("1.8.9");
                        LogUtils.f11200a.m12555d("Sign content: " + ((Object) sb2));
                        strM12527a = C6660c.m12527a(context, sb2.toString());
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                if (strM12527a == null || StringsKt.isBlank(strM12527a)) {
                    return;
                }
                Context context2 = b.this.f11232b.getContext();
                if (context2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                }
                final b bVar = b.this;
                ((Activity) context2).runOnUiThread(new Runnable() { // from class: com.geetest.captcha.views.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6697a.b.a.m12582a(bVar, strM12527a);
                    }
                });
            }

            /* JADX INFO: renamed from: a */
            public static final void m12583a(String str) {
                LogUtils.f11200a.m12555d("WebViewBuilder javascript:jsBridge.callback('postNativeMessage') return: " + str);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JavascriptInterface
        public final void gt4Notify(@Nullable String str) throws JSONException {
            LogUtils.f11200a.release("JSInterface.gt4Notify: " + str + ", main: " + Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper()));
            if (str == null || StringsKt.isBlank(str)) {
                C6661c0 c6661c0 = this.f11233c;
                String str2 = EnumC6672i.WEB_CALLBACK_ERROR.getType() + "80";
                String str3 = C6674j.f11169a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "The Web callback data is empty");
                Unit unit = Unit.INSTANCE;
                c6661c0.m12529a(str2, str3, jSONObject);
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String string = jSONObject2.getString("type");
                if (string != null) {
                    switch (string.hashCode()) {
                        case -934426595:
                            if (string.equals(DbParams.KEY_CHANNEL_RESULT)) {
                                String result = jSONObject2.getJSONObject("data").toString();
                                Intrinsics.checkNotNullExpressionValue(result, "jsonObject.getJSONObject(\"data\").toString()");
                                C6661c0 c6661c1 = this.f11233c;
                                c6661c1.getClass();
                                Intrinsics.checkNotNullParameter(result, "result");
                                Iterator<InterfaceC6663d0> it = c6661c1.f11146a.iterator();
                                while (it.hasNext()) {
                                    it.next().mo12525a(true, result);
                                }
                            }
                            break;
                        case 102230:
                            if (string.equals("get")) {
                                try {
                                    if (Build.VERSION.SDK_INT >= 28 && !Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper()) && (this.f11232b.getContext() instanceof Activity)) {
                                        ThreadsKt.thread$default(false, false, null, null, 0, new a(), 31, null);
                                        break;
                                    }
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                    return;
                                }
                            }
                            break;
                        case 3135262:
                            if (string.equals(C33864ph.f71456b)) {
                                String result2 = jSONObject2.getJSONObject("data").toString();
                                Intrinsics.checkNotNullExpressionValue(result2, "jsonObject.getJSONObject(\"data\").toString()");
                                C6661c0 c6661c2 = this.f11233c;
                                c6661c2.getClass();
                                Intrinsics.checkNotNullParameter(result2, "result");
                                Iterator<InterfaceC6663d0> it2 = c6661c2.f11146a.iterator();
                                while (it2.hasNext()) {
                                    it2.next().mo12525a(false, result2);
                                }
                            }
                            break;
                        case 94756344:
                            if (string.equals("close")) {
                                Iterator<InterfaceC6663d0> it3 = this.f11233c.f11146a.iterator();
                                while (it3.hasNext()) {
                                    it3.next().mo12526b();
                                }
                            }
                            break;
                        case 96784904:
                            if (string.equals(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                                String error = jSONObject2.getJSONObject("data").toString();
                                Intrinsics.checkNotNullExpressionValue(error, "jsonObject.getJSONObject(\"data\").toString()");
                                C6661c0 c6661c3 = this.f11233c;
                                c6661c3.getClass();
                                Intrinsics.checkNotNullParameter(error, "error");
                                Iterator<InterfaceC6663d0> it4 = c6661c3.f11146a.iterator();
                                while (it4.hasNext()) {
                                    it4.next().mo12523a(error);
                                }
                            }
                            break;
                        case 108386723:
                            if (string.equals("ready")) {
                                Iterator<InterfaceC6663d0> it5 = this.f11233c.f11146a.iterator();
                                while (it5.hasNext()) {
                                    it5.next().mo12522a();
                                }
                            }
                            break;
                    }
                }
                C6661c0 c6661c4 = this.f11233c;
                String str4 = EnumC6672i.WEB_CALLBACK_ERROR.getType() + "82";
                String str5 = C6674j.f11169a;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, jSONObject2);
                Unit unit2 = Unit.INSTANCE;
                c6661c4.m12529a(str4, str5, jSONObject3);
            } catch (Exception e12) {
                e12.printStackTrace();
                C6661c0 c6661c5 = this.f11233c;
                String str6 = EnumC6672i.WEB_CALLBACK_ERROR.getType() + "81";
                String str7 = C6674j.f11169a;
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("exception", e12.getMessage());
                jSONObject4.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, str);
                Unit unit3 = Unit.INSTANCE;
                c6661c5.m12529a(str6, str7, jSONObject4);
            }
        }

        public b(@NotNull String url, @NotNull GTC4WebView webView, @NotNull C6661c0 observable) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(webView, "webView");
            Intrinsics.checkNotNullParameter(observable, "observable");
            this.f11231a = url;
            this.f11232b = webView;
            this.f11233c = observable;
        }
    }

    /* JADX INFO: renamed from: com.geetest.captcha.views.a$c */
    public static final class c extends Lambda implements Function0<Unit> {
        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        public c() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C6697a c6697a = C6697a.this;
            c6697a.f11227d = new b(c6697a.f11224a, c6697a.f11226c, c6697a.f11225b);
            C6697a c6697a2 = C6697a.this;
            GTC4WebView gTC4WebView = c6697a2.f11226c;
            b bVar = c6697a2.f11227d;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("jsInterface");
                bVar = null;
            }
            gTC4WebView.addJavascriptInterface(bVar, HCaptchaJSInterface.JS_INTERFACE_TAG);
            C6697a.this.f11226c.buildLayer();
            C6697a c6697a3 = C6697a.this;
            c6697a3.f11226c.loadUrl(c6697a3.f11224a);
            C6697a.this.f11226c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12576a(@NotNull C6661c0 observable) {
        Intrinsics.checkNotNullParameter(observable, "observable");
        this.f11225b = observable;
        b bVar = this.f11227d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("jsInterface");
            bVar = null;
        }
        String url = this.f11224a;
        GTC4WebView webView = this.f11226c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(observable, "observable");
        bVar.f11233c = observable;
        bVar.f11232b = webView;
        bVar.f11231a = url;
    }

    public C6697a(a aVar) {
        this.f11224a = aVar.m12580b();
        this.f11225b = aVar.m12578a();
        this.f11226c = aVar.m12581c();
    }

    @SuppressLint({"AddJavascriptInterface", "JavascriptInterface"})
    @NotNull
    /* JADX INFO: renamed from: a */
    public final C6697a m12575a() {
        final c cVar = new c();
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            cVar.invoke();
            return this;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.geetest.captcha.views.c
            @Override // java.lang.Runnable
            public final void run() {
                C6697a.m12574a(cVar);
            }
        });
        return this;
    }

    /* JADX INFO: renamed from: a */
    public static final void m12574a(Function0 impl) {
        Intrinsics.checkNotNullParameter(impl, "$impl");
        impl.invoke();
    }
}
