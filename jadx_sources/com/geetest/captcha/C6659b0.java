package com.geetest.captcha;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.geetest.captcha.utils.LogUtils;
import com.kubi.otc.entity.OtcAd;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.geetest.captcha.b0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6659b0 extends AbstractC6686q {

    /* JADX INFO: renamed from: com.geetest.captcha.b0$a */
    public static final class a implements InterfaceC6663d0 {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final C6704x f11143a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final AbstractC6686q f11144b;

        @Override // com.geetest.captcha.InterfaceC6663d0
        /* JADX INFO: renamed from: a */
        public final void mo12522a() {
            if (this.f11143a.m12591a()) {
                return;
            }
            LogUtils.f11200a.m12556d("WebViewHandler", "WebViewHandler.HandlerObserver.onCallReady");
            this.f11143a.m12588a(EnumC6657a0.SUCCESS);
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                ((Activity) this.f11143a.f11241a).runOnUiThread(new Runnable() { // from class: com.geetest.captcha.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6659b0.a.m12521a(this.f11163b);
                    }
                });
                return;
            }
            C6704x c6704x = this.f11143a;
            C6664e c6664e = c6704x.f11245e;
            if (c6664e != null) {
                c6664e.m12539b();
            }
            c6704x.m12592b();
        }

        @Override // com.geetest.captcha.InterfaceC6663d0
        /* JADX INFO: renamed from: b */
        public final void mo12526b() throws JSONException {
            if (this.f11143a.m12591a()) {
                return;
            }
            LogUtils logUtils = LogUtils.f11200a;
            logUtils.m12556d("WebViewHandler", "WebViewHandler.HandlerObserver.onClose");
            this.f11143a.m12588a(EnumC6657a0.FAIL);
            String type = EnumC6657a0.CANCEL.getType();
            String code = EnumC6672i.USER_ERROR.getType() + OtcAd.TRADE_TIME_SIXTY;
            Intrinsics.checkNotNullParameter(code, "code");
            String code2 = type + code;
            String msg = C6674j.f11174f;
            JSONObject desc = new JSONObject();
            desc.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "User cancelled 'Captcha'");
            Unit unit = Unit.INSTANCE;
            Intrinsics.checkNotNullParameter(code2, "code");
            Intrinsics.checkNotNullParameter(msg, "msg");
            Intrinsics.checkNotNullParameter(desc, "desc");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", code2);
                jSONObject.put("msg", msg);
                jSONObject.put("desc", desc);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
            logUtils.release("WebViewHandler: " + string);
            C6704x c6704x = this.f11143a;
            C6664e c6664e = c6704x.f11245e;
            if (c6664e != null) {
                c6664e.m12536a();
            }
            c6704x.f11245e = null;
            this.f11143a.m12589a(string);
        }

        public a(@NotNull C6704x request, @NotNull AbstractC6686q handler) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.f11143a = request;
            this.f11144b = handler;
        }

        /* JADX INFO: renamed from: a */
        public static final void m12521a(a this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            C6704x c6704x = this$0.f11143a;
            C6664e c6664e = c6704x.f11245e;
            if (c6664e != null) {
                c6664e.m12539b();
            }
            c6704x.m12592b();
        }

        @Override // com.geetest.captcha.InterfaceC6663d0
        /* JADX INFO: renamed from: a */
        public final void mo12523a(@NotNull String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            if (this.f11143a.m12591a()) {
                return;
            }
            LogUtils logUtils = LogUtils.f11200a;
            logUtils.m12560i("WebViewHandler", "WebViewHandler.HandlerObserver.onWebError: " + error);
            C6704x c6704x = this.f11143a;
            EnumC6657a0 enumC6657a0 = EnumC6657a0.FAIL;
            c6704x.m12588a(enumC6657a0);
            AbstractC6686q abstractC6686q = this.f11144b;
            C6704x request = this.f11143a;
            abstractC6686q.getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            if (request.m12591a()) {
                return;
            }
            logUtils.release("HandlerImpl.onFailure: " + error);
            if (request.f11244d == enumC6657a0) {
                C6664e c6664e = request.f11245e;
                if (c6664e != null) {
                    c6664e.m12536a();
                }
                request.f11245e = null;
                request.m12589a(error);
            }
        }

        @Override // com.geetest.captcha.InterfaceC6663d0
        /* JADX INFO: renamed from: a */
        public final void mo12524a(@NotNull String code, @NotNull String msg, @NotNull JSONObject desc) {
            Intrinsics.checkNotNullParameter(code, "errorCode");
            Intrinsics.checkNotNullParameter(msg, "errorMsg");
            Intrinsics.checkNotNullParameter(desc, "errorDesc");
            if (this.f11143a.m12591a()) {
                return;
            }
            C6704x c6704x = this.f11143a;
            EnumC6657a0 enumC6657a0 = EnumC6657a0.FAIL;
            c6704x.m12588a(enumC6657a0);
            String type = this.f11143a.f11244d.getType();
            Intrinsics.checkNotNullParameter(code, "code");
            String code2 = type + code;
            Intrinsics.checkNotNullParameter(code2, "code");
            Intrinsics.checkNotNullParameter(msg, "msg");
            Intrinsics.checkNotNullParameter(desc, "desc");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", code2);
                jSONObject.put("msg", msg);
                jSONObject.put("desc", desc);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            String error = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(error, "jsonObject.toString()");
            LogUtils logUtils = LogUtils.f11200a;
            logUtils.m12560i("WebViewHandler", "WebViewHandler.HandlerObserver.onError: " + error);
            AbstractC6686q abstractC6686q = this.f11144b;
            C6704x request = this.f11143a;
            abstractC6686q.getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(error, "error");
            if (request.m12591a()) {
                return;
            }
            logUtils.release("HandlerImpl.onFailure: " + error);
            if (request.f11244d == enumC6657a0) {
                C6664e c6664e = request.f11245e;
                if (c6664e != null) {
                    c6664e.m12536a();
                }
                request.f11245e = null;
                request.m12589a(error);
            }
        }

        @Override // com.geetest.captcha.InterfaceC6663d0
        /* JADX INFO: renamed from: a */
        public final void mo12525a(boolean z11, @NotNull String result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (this.f11143a.m12591a()) {
                return;
            }
            LogUtils.f11200a.m12560i("WebViewHandler", "HandlerObserver.onResult: " + result);
            if (z11) {
                this.f11143a.m12588a(EnumC6657a0.END);
                AbstractC6686q abstractC6686q = this.f11144b;
                C6704x request = this.f11143a;
                abstractC6686q.getClass();
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(result, "result");
                if (request.m12591a()) {
                    return;
                }
                C6664e c6664e = request.f11245e;
                if (c6664e != null) {
                    c6664e.m12536a();
                }
                request.f11245e = null;
                request.m12590a(true, result);
                return;
            }
            this.f11143a.m12588a(EnumC6657a0.FLOWING);
            AbstractC6686q abstractC6686q2 = this.f11144b;
            C6704x request2 = this.f11143a;
            abstractC6686q2.getClass();
            Intrinsics.checkNotNullParameter(request2, "request");
            Intrinsics.checkNotNullParameter(result, "result");
            if (request2.m12591a()) {
                return;
            }
            request2.m12590a(false, result);
        }
    }

    @Override // com.geetest.captcha.InterfaceC6685p
    /* JADX INFO: renamed from: a */
    public final int mo12519a() {
        return 5;
    }

    @Override // com.geetest.captcha.InterfaceC6685p
    /* JADX INFO: renamed from: a */
    public final void mo12520a(@NotNull C6704x request) throws JSONException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.m12591a()) {
            return;
        }
        LogUtils logUtils = LogUtils.f11200a;
        logUtils.release("Step: WebViewHandler.handler");
        a webViewObserver = new a(request, this);
        request.m12588a(EnumC6657a0.FLOWING);
        logUtils.m12556d("Request", "currentStatus preLoadStatus: " + request.f11243c.name() + ", status: " + request.f11244d.name());
        EnumC6657a0.a aVar = request.f11243c;
        if (aVar == EnumC6657a0.a.FLOWING) {
            Context context = request.f11241a;
            C6662d dataBean = request.f11242b;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dataBean, "dataBean");
            Intrinsics.checkNotNullParameter(webViewObserver, "webViewObserver");
            C6664e c6664e = request.f11245e;
            if (c6664e != null) {
                c6664e.m12537a(context, dataBean, webViewObserver);
                return;
            }
            return;
        }
        if (aVar == EnumC6657a0.a.SUCCESS) {
            C6664e c6664e2 = request.f11245e;
            if (c6664e2 != null) {
                c6664e2.m12539b();
            }
            request.m12592b();
            Context context2 = request.f11241a;
            C6662d dataBean2 = request.f11242b;
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(dataBean2, "dataBean");
            Intrinsics.checkNotNullParameter(webViewObserver, "webViewObserver");
            C6664e c6664e3 = request.f11245e;
            if (c6664e3 != null) {
                c6664e3.m12537a(context2, dataBean2, webViewObserver);
                return;
            }
            return;
        }
        if (aVar == EnumC6657a0.a.FAIL) {
            Context context3 = request.f11241a;
            C6662d dataBean3 = request.f11242b;
            Intrinsics.checkNotNullParameter(context3, "context");
            Intrinsics.checkNotNullParameter(dataBean3, "dataBean");
            Intrinsics.checkNotNullParameter(webViewObserver, "webViewObserver");
            C6664e c6664e4 = request.f11245e;
            if (c6664e4 != null) {
                c6664e4.m12538a(context3, dataBean3, (InterfaceC6663d0) webViewObserver);
            }
            if (request.f11244d != EnumC6657a0.FAIL) {
                Context context4 = request.f11241a;
                C6662d dataBean4 = request.f11242b;
                Intrinsics.checkNotNullParameter(context4, "context");
                Intrinsics.checkNotNullParameter(dataBean4, "dataBean");
                Intrinsics.checkNotNullParameter(webViewObserver, "webViewObserver");
                C6664e c6664e5 = request.f11245e;
                if (c6664e5 != null) {
                    c6664e5.m12537a(context4, dataBean4, webViewObserver);
                    return;
                }
                return;
            }
            return;
        }
        if (aVar == EnumC6657a0.a.NONE) {
            Context context5 = request.f11241a;
            C6662d dataBean5 = request.f11242b;
            Intrinsics.checkNotNullParameter(context5, "context");
            Intrinsics.checkNotNullParameter(dataBean5, "dataBean");
            Intrinsics.checkNotNullParameter(webViewObserver, "webViewObserver");
            C6664e c6664e6 = request.f11245e;
            if (c6664e6 != null) {
                c6664e6.m12538a(context5, dataBean5, (InterfaceC6663d0) webViewObserver);
            }
            if (request.f11244d != EnumC6657a0.FAIL) {
                Context context6 = request.f11241a;
                C6662d dataBean6 = request.f11242b;
                Intrinsics.checkNotNullParameter(context6, "context");
                Intrinsics.checkNotNullParameter(dataBean6, "dataBean");
                Intrinsics.checkNotNullParameter(webViewObserver, "webViewObserver");
                C6664e c6664e7 = request.f11245e;
                if (c6664e7 != null) {
                    c6664e7.m12537a(context6, dataBean6, webViewObserver);
                }
            }
        }
    }
}
