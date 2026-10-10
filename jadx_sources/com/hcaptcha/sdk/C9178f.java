package com.hcaptcha.sdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import lombok.NonNull;

/* JADX INFO: renamed from: com.hcaptcha.sdk.f */
/* JADX INFO: loaded from: classes56.dex */
public final class C9178f implements InterfaceC9187o {

    /* JADX INFO: renamed from: b */
    @NonNull
    public final HCaptchaConfig f12882b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final HCaptchaStateListener f12883c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final C9185m f12884d;

    /* JADX INFO: renamed from: e */
    public boolean f12885e;

    /* JADX INFO: renamed from: f */
    public boolean f12886f;

    /* JADX INFO: renamed from: g */
    public boolean f12887g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public HCaptchaVerifyParams f12888h;

    @Override // p687v8.InterfaceC45465b
    /* JADX INFO: renamed from: B1 */
    public void mo13938B1() {
        this.f12885e = true;
        if (this.f12887g) {
            this.f12887g = false;
            m13962b();
        } else if (this.f12886f) {
            this.f12886f = false;
            this.f12884d.m13971h(this.f12888h);
        }
    }

    @Override // p687v8.InterfaceC45467d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onSuccess(String str) {
        this.f12883c.onSuccess(str);
    }

    /* JADX INFO: renamed from: b */
    public void m13962b() {
        if (!this.f12885e) {
            this.f12887g = true;
            return;
        }
        this.f12884d.m13970g();
        HCaptchaWebView hCaptchaWebViewM13969f = this.f12884d.m13969f();
        if (hCaptchaWebViewM13969f.getParent() != null) {
            ((ViewGroup) hCaptchaWebViewM13969f.getParent()).removeView(hCaptchaWebViewM13969f);
        }
    }

    @Override // com.hcaptcha.sdk.InterfaceC9187o
    /* JADX INFO: renamed from: h */
    public void mo13940h(@NonNull Activity activity, @Nullable HCaptchaVerifyParams hCaptchaVerifyParams) {
        if (activity == null) {
            throw new NullPointerException("activity is marked non-null but is null");
        }
        this.f12888h = hCaptchaVerifyParams;
        if (this.f12885e) {
            this.f12884d.m13971h(hCaptchaVerifyParams);
        } else {
            this.f12886f = true;
        }
    }

    @Override // p687v8.InterfaceC45466c
    /* JADX INFO: renamed from: u2 */
    public void mo13944u2() {
        this.f12883c.onOpen();
    }

    @Override // p687v8.InterfaceC45464a
    /* JADX INFO: renamed from: w */
    public void mo13945w(@NonNull HCaptchaException hCaptchaException) {
        if (hCaptchaException == null) {
            throw new NullPointerException("exception is marked non-null but is null");
        }
        if (this.f12884d.m13974k(hCaptchaException)) {
            this.f12884d.m13971h(this.f12888h);
        } else {
            this.f12883c.onFailure(hCaptchaException);
        }
    }

    public C9178f(@NonNull Activity activity, @NonNull HCaptchaConfig hCaptchaConfig, @NonNull HCaptchaInternalConfig hCaptchaInternalConfig, @NonNull HCaptchaStateListener hCaptchaStateListener) {
        if (activity != null) {
            if (hCaptchaConfig != null) {
                if (hCaptchaInternalConfig != null) {
                    if (hCaptchaStateListener != null) {
                        this.f12882b = hCaptchaConfig;
                        this.f12883c = hCaptchaStateListener;
                        HCaptchaWebView hCaptchaWebView = new HCaptchaWebView(activity);
                        hCaptchaWebView.setId(R$id.webView);
                        hCaptchaWebView.setVisibility(8);
                        if (hCaptchaWebView.getParent() == null) {
                            ((ViewGroup) activity.getWindow().getDecorView().getRootView()).addView(hCaptchaWebView);
                        }
                        this.f12884d = new C9185m(new Handler(Looper.getMainLooper()), activity, hCaptchaConfig, hCaptchaInternalConfig, this, hCaptchaWebView);
                        return;
                    }
                    throw new NullPointerException("listener is marked non-null but is null");
                }
                throw new NullPointerException("internalConfig is marked non-null but is null");
            }
            throw new NullPointerException("config is marked non-null but is null");
        }
        throw new NullPointerException("activity is marked non-null but is null");
    }
}
