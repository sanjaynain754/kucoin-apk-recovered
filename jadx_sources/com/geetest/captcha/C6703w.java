package com.geetest.captcha;

import android.content.Context;
import com.geetest.captcha.utils.LogUtils;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.geetest.captcha.w */
/* JADX INFO: loaded from: classes45.dex */
public final class C6703w extends AbstractC6686q {

    /* JADX INFO: renamed from: com.geetest.captcha.w$a */
    public static final class a implements InterfaceC6663d0 {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final C6704x f11239a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final AbstractC6686q f11240b;

        @Override // com.geetest.captcha.InterfaceC6663d0
        /* JADX INFO: renamed from: a */
        public final void mo12522a() {
            AbstractC6686q abstractC6686q;
            if (this.f11239a.m12591a()) {
                return;
            }
            LogUtils.f11200a.m12560i("PreLoadHandler", "HandlerObserver.onCallReady");
            this.f11239a.m12587a(EnumC6657a0.a.SUCCESS);
            C6704x c6704x = this.f11239a;
            EnumC6657a0 enumC6657a0 = c6704x.f11244d;
            if (enumC6657a0 == EnumC6657a0.NONE || enumC6657a0 != EnumC6657a0.FLOWING || (abstractC6686q = this.f11240b.f11196a) == null) {
                return;
            }
            abstractC6686q.m12551b(c6704x);
        }

        @Override // com.geetest.captcha.InterfaceC6663d0
        /* JADX INFO: renamed from: b */
        public final void mo12526b() {
            if (this.f11239a.m12591a()) {
                return;
            }
            LogUtils.f11200a.m12560i("PreLoadHandler", "PreLoadHandler.HandlerObserver.onClose");
        }

        public a(@NotNull C6704x request, @NotNull AbstractC6686q handler) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.f11239a = request;
            this.f11240b = handler;
        }

        @Override // com.geetest.captcha.InterfaceC6663d0
        /* JADX INFO: renamed from: a */
        public final void mo12523a(@NotNull String error) {
            AbstractC6686q abstractC6686q;
            Intrinsics.checkNotNullParameter(error, "error");
            if (this.f11239a.m12591a()) {
                return;
            }
            LogUtils logUtils = LogUtils.f11200a;
            logUtils.m12560i("PreLoadHandler", "PreLoadHandler.HandlerObserver.onWebError: " + error);
            this.f11239a.m12587a(EnumC6657a0.a.FAIL);
            logUtils.release(error);
            C6704x c6704x = this.f11239a;
            EnumC6657a0 enumC6657a0 = c6704x.f11244d;
            if (enumC6657a0 == EnumC6657a0.NONE || enumC6657a0 != EnumC6657a0.FLOWING || (abstractC6686q = this.f11240b.f11196a) == null) {
                return;
            }
            abstractC6686q.m12551b(c6704x);
        }

        @Override // com.geetest.captcha.InterfaceC6663d0
        /* JADX INFO: renamed from: a */
        public final void mo12524a(@NotNull String code, @NotNull String msg, @NotNull JSONObject desc) {
            AbstractC6686q abstractC6686q;
            Intrinsics.checkNotNullParameter(code, "errorCode");
            Intrinsics.checkNotNullParameter(msg, "errorMsg");
            Intrinsics.checkNotNullParameter(desc, "errorDesc");
            if (this.f11239a.m12591a()) {
                return;
            }
            this.f11239a.m12587a(EnumC6657a0.a.FAIL);
            String type = this.f11239a.f11243c.getType();
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
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
            LogUtils.f11200a.m12560i("PreLoadHandler", "PreLoadHandler.HandlerObserver.onError: " + string);
            C6704x c6704x = this.f11239a;
            EnumC6657a0 enumC6657a0 = c6704x.f11244d;
            if (enumC6657a0 == EnumC6657a0.NONE || enumC6657a0 != EnumC6657a0.FLOWING || (abstractC6686q = this.f11240b.f11196a) == null) {
                return;
            }
            abstractC6686q.m12551b(c6704x);
        }

        @Override // com.geetest.captcha.InterfaceC6663d0
        /* JADX INFO: renamed from: a */
        public final void mo12525a(boolean z11, @NotNull String result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (this.f11239a.m12591a()) {
                return;
            }
            LogUtils.f11200a.m12560i("PreLoadHandler", "PreLoadHandler.HandlerObserver.onResult: " + result);
            this.f11239a.m12587a(EnumC6657a0.a.FAIL);
        }
    }

    @Override // com.geetest.captcha.InterfaceC6685p
    /* JADX INFO: renamed from: a */
    public final int mo12519a() {
        return 1;
    }

    @Override // com.geetest.captcha.InterfaceC6685p
    /* JADX INFO: renamed from: a */
    public final void mo12520a(@NotNull C6704x request) throws JSONException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.m12591a()) {
            return;
        }
        LogUtils.f11200a.release("Step: PreLoadHandler.handler");
        request.m12587a(EnumC6657a0.a.FLOWING);
        a webViewObserver = new a(request, this);
        Context context = request.f11241a;
        C6662d dataBean = request.f11242b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataBean, "dataBean");
        Intrinsics.checkNotNullParameter(webViewObserver, "webViewObserver");
        C6664e c6664e = request.f11245e;
        if (c6664e != null) {
            c6664e.m12538a(context, dataBean, webViewObserver);
        }
    }
}
