package com.geetest.captcha;

import android.content.Context;
import android.util.Pair;
import com.geetest.captcha.utils.LogUtils;
import com.geetest.captcha.views.GTC4WebView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Unit;
import p852kotlin.concurrent.ThreadsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.geetest.captcha.m */
/* JADX INFO: loaded from: classes45.dex */
public final class C6680m {

    /* JADX INFO: renamed from: e */
    public static long f11187e;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final C6658b f11188a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public GTCaptcha4Client.OnSuccessListener f11189b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public GTCaptcha4Client.OnFailureListener f11190c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public GTCaptcha4Client.OnWebViewShowListener f11191d;

    /* JADX INFO: renamed from: com.geetest.captcha.m$a */
    public static final class a extends Lambda implements Function0<Unit> {
        final /* synthetic */ Context $context;

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            File externalFilesDir = this.$context.getApplicationContext().getExternalFilesDir(null);
            C6706z.f11251a = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
        }
    }

    /* JADX INFO: renamed from: com.geetest.captcha.m$b */
    public static final class b {
        @NotNull
        /* JADX INFO: renamed from: a */
        public static Pair m12547a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                new GTC4WebView(context).destroy();
                return new Pair(Boolean.TRUE, null);
            } catch (Exception e11) {
                e11.printStackTrace();
                LogUtils.f11200a.release("The device does not support WebViews, error message: " + e11.getMessage());
                return new Pair(Boolean.FALSE, e11.getMessage());
            }
        }
    }

    public C6680m(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f11188a = new C6658b(context);
        try {
            ThreadsKt.thread$default(false, false, null, null, 0, new a(context), 31, null);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        C6674j.m12542a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m12546a(@NotNull String appId, @Nullable GTCaptcha4Config gTCaptcha4Config) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        C6658b c6658b = this.f11188a;
        c6658b.getClass();
        Intrinsics.checkNotNullParameter(appId, "appId");
        c6658b.f11135b = appId;
        C6658b c6658b2 = this.f11188a;
        c6658b2.f11139f = gTCaptcha4Config;
        c6658b2.f11141h = new C6703w();
        c6658b2.f11142i = new C6659b0();
        C6703w c6703w = c6658b2.f11141h;
        C6704x c6704x = null;
        if (c6703w == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preLoadHandler");
            c6703w = null;
        }
        C6659b0 c6659b0 = c6658b2.f11142i;
        if (c6659b0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewHandler");
            c6659b0 = null;
        }
        c6703w.f11196a = c6659b0;
        Context context = c6658b2.f11134a;
        String captchaId = c6658b2.f11135b;
        if (captchaId == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RemoteConfigConstants.RequestFieldKey.APP_ID);
            captchaId = null;
        }
        GTCaptcha4Config gTCaptcha4Config2 = c6658b2.f11139f;
        Intrinsics.checkNotNullParameter(captchaId, "captchaId");
        C6662d c6662d = new C6662d();
        c6662d.f11147a = captchaId;
        if (gTCaptcha4Config2 != null) {
            c6662d.f11149c = gTCaptcha4Config2.isDebug();
            String html = gTCaptcha4Config2.getHtml();
            Intrinsics.checkNotNullExpressionValue(html, "it.html");
            c6662d.f11148b = html;
            c6662d.f11150d = gTCaptcha4Config2.getLanguage();
            c6662d.f11151e = gTCaptcha4Config2.getApiServers();
            c6662d.f11152f = gTCaptcha4Config2.getStaticServers();
            c6662d.f11154h = gTCaptcha4Config2.isCanceledOnTouchOutside();
            c6662d.f11155i = gTCaptcha4Config2.isGTC4ViewHidden();
            c6662d.f11153g = gTCaptcha4Config2.getParams();
            c6662d.f11156j = gTCaptcha4Config2.getTimeOut();
            c6662d.f11157k = gTCaptcha4Config2.getBackgroundColor();
            c6662d.f11158l = gTCaptcha4Config2.getDialogStyle();
        }
        if (StringsKt.isBlank(c6662d.f11148b)) {
            c6662d.f11148b = "file:///android_asset/gt4-index.html";
        }
        C6704x c6704x2 = new C6704x(context, c6662d);
        c6658b2.f11140g = c6704x2;
        c6704x2.m12587a(EnumC6657a0.a.FLOWING);
        C6704x c6704x3 = c6658b2.f11140g;
        if (c6704x3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("request");
            c6704x3 = null;
        }
        c6704x3.m12588a(EnumC6657a0.NONE);
        C6704x c6704x4 = c6658b2.f11140g;
        if (c6704x4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("request");
            c6704x4 = null;
        }
        GTCaptcha4Config gTCaptcha4Config3 = c6658b2.f11139f;
        c6704x4.f11245e = new C6664e(gTCaptcha4Config3 != null ? gTCaptcha4Config3.getDialogShowListener() : null);
        C6703w c6703w2 = c6658b2.f11141h;
        if (c6703w2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preLoadHandler");
            c6703w2 = null;
        }
        C6704x c6704x5 = c6658b2.f11140g;
        if (c6704x5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("request");
        } else {
            c6704x = c6704x5;
        }
        c6703w2.m12551b(c6704x);
    }
}
