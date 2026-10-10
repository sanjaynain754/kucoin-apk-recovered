package com.geetest.captcha;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.geetest.captcha.utils.LogUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.geetest.captcha.x */
/* JADX INFO: loaded from: classes45.dex */
public final class C6704x {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f11241a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final C6662d f11242b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public EnumC6657a0.a f11243c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public EnumC6657a0 f11244d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public C6664e f11245e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public GTCaptcha4Client.OnSuccessListener f11246f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public GTCaptcha4Client.OnFailureListener f11247g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public GTCaptcha4Client.OnWebViewShowListener f11248h;

    /* JADX INFO: renamed from: a */
    public final void m12587a(@NotNull EnumC6657a0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f11243c = aVar;
    }

    public C6704x(@NotNull Context context, @NotNull C6662d dataBean) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataBean, "dataBean");
        this.f11241a = context;
        this.f11242b = dataBean;
        this.f11243c = EnumC6657a0.a.NONE;
        this.f11244d = EnumC6657a0.FLOWING;
    }

    /* JADX INFO: renamed from: a */
    public final void m12588a(@NotNull EnumC6657a0 enumC6657a0) {
        Intrinsics.checkNotNullParameter(enumC6657a0, "<set-?>");
        this.f11244d = enumC6657a0;
    }

    /* JADX INFO: renamed from: b */
    public final void m12592b() {
        try {
            LogUtils.f11200a.m12555d("Request.onWebViewShow");
            if (m12591a()) {
                return;
            }
            if (!Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
                ((Activity) this.f11241a).runOnUiThread(new Runnable() { // from class: com.geetest.captcha.m0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6704x.m12584a(this.f11192b);
                    }
                });
                return;
            }
            GTCaptcha4Client.OnWebViewShowListener onWebViewShowListener = this.f11248h;
            if (onWebViewShowListener != null) {
                onWebViewShowListener.onWebViewShow();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12591a() {
        return this.f11244d == EnumC6657a0.CANCEL;
    }

    /* JADX INFO: renamed from: a */
    public static final void m12584a(C6704x this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        GTCaptcha4Client.OnWebViewShowListener onWebViewShowListener = this$0.f11248h;
        if (onWebViewShowListener != null) {
            onWebViewShowListener.onWebViewShow();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12589a(@NotNull final String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            LogUtils.f11200a.m12555d("Request.onFailure: " + error);
            if (m12591a()) {
                return;
            }
            if (!Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
                ((Activity) this.f11241a).runOnUiThread(new Runnable() { // from class: com.geetest.captcha.n0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6704x.m12585a(this.f11193b, error);
                    }
                });
            } else {
                GTCaptcha4Client.OnFailureListener onFailureListener = this.f11247g;
                if (onFailureListener != null) {
                    onFailureListener.onFailure(error);
                }
            }
            this.f11244d = EnumC6657a0.CANCEL;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m12585a(C6704x this$0, String error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        GTCaptcha4Client.OnFailureListener onFailureListener = this$0.f11247g;
        if (onFailureListener != null) {
            onFailureListener.onFailure(error);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12590a(final boolean z11, @NotNull final String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            if (!Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
                ((Activity) this.f11241a).runOnUiThread(new Runnable() { // from class: com.geetest.captcha.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6704x.m12586a(this.f11184b, z11, result);
                    }
                });
                return;
            }
            GTCaptcha4Client.OnSuccessListener onSuccessListener = this.f11246f;
            if (onSuccessListener != null) {
                onSuccessListener.onSuccess(z11, result);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m12586a(C6704x this$0, boolean z11, String result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "$result");
        GTCaptcha4Client.OnSuccessListener onSuccessListener = this$0.f11246f;
        if (onSuccessListener != null) {
            onSuccessListener.onSuccess(z11, result);
        }
    }
}
