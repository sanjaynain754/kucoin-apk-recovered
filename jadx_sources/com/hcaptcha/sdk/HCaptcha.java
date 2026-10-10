package com.hcaptcha.sdk;

import android.app.Activity;
import android.util.AndroidRuntimeException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import p687v8.AbstractC45469f;

/* JADX INFO: loaded from: classes56.dex */
public final class HCaptcha extends AbstractC45469f<C9184l> {

    /* JADX INFO: renamed from: i */
    @NonNull
    public final Activity f12814i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public InterfaceC9187o f12815j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public HCaptchaConfig f12816k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final HCaptchaInternalConfig f12817l;

    /* JADX INFO: renamed from: s */
    public final HCaptcha m13907s() {
        return m13908t(null);
    }

    /* JADX INFO: renamed from: q */
    public static HCaptcha m13905q(@NonNull Activity activity) {
        return new HCaptcha(activity, HCaptchaInternalConfig.builder().m13948a());
    }

    /* JADX INFO: renamed from: t */
    public final HCaptcha m13908t(@Nullable HCaptchaVerifyParams hCaptchaVerifyParams) {
        "HCaptcha.startVerification".concat(hCaptchaVerifyParams != null ? " with params" : "");
        this.f102490h.removeCallbacksAndMessages(null);
        InterfaceC9187o interfaceC9187o = this.f12815j;
        if (interfaceC9187o == null) {
            m100420i(new HCaptchaException(HCaptchaError.ERROR));
            return this;
        }
        interfaceC9187o.mo13940h(this.f12814i, hCaptchaVerifyParams);
        return this;
    }

    /* JADX INFO: renamed from: u */
    public HCaptcha m13909u(@NonNull HCaptchaConfig hCaptchaConfig) {
        if (this.f12815j == null || !hCaptchaConfig.equals(this.f12816k)) {
            m13906r(hCaptchaConfig);
        }
        return m13907s();
    }

    public HCaptcha(@NonNull Activity activity, @NonNull HCaptchaInternalConfig hCaptchaInternalConfig) {
        this.f12814i = activity;
        this.f12817l = hCaptchaInternalConfig;
    }

    /* JADX INFO: renamed from: r */
    public HCaptcha m13906r(@NonNull final HCaptchaConfig hCaptchaConfig) {
        C9183k.f12895a = hCaptchaConfig.getDiagnosticLog().booleanValue();
        HCaptchaStateListener hCaptchaStateListener = new HCaptchaStateListener() { // from class: com.hcaptcha.sdk.HCaptcha.1
            @Override // com.hcaptcha.sdk.HCaptchaStateListener
            public void onFailure(HCaptchaException hCaptchaException) {
                HCaptcha.this.m100420i(hCaptchaException);
            }

            @Override // com.hcaptcha.sdk.HCaptchaStateListener
            public void onOpen() {
                HCaptcha.this.m100415d();
            }

            @Override // com.hcaptcha.sdk.HCaptchaStateListener
            public void onSuccess(String str) {
                HCaptcha.this.m100419h(hCaptchaConfig.getTokenExpiration());
                HCaptcha hCaptcha = HCaptcha.this;
                hCaptcha.m100421j(new C9184l(str, hCaptcha.f102490h));
            }
        };
        try {
            if (Boolean.TRUE.equals(hCaptchaConfig.getHideDialog())) {
                HCaptchaConfig hCaptchaConfigM13913c = hCaptchaConfig.toBuilder().m13931u(HCaptchaSize.INVISIBLE).m13922l(Boolean.FALSE).m13913c();
                this.f12816k = hCaptchaConfigM13913c;
                this.f12815j = new C9178f(this.f12814i, hCaptchaConfigM13913c, this.f12817l, hCaptchaStateListener);
                return this;
            }
            Activity activity = this.f12814i;
            if (activity instanceof FragmentActivity) {
                this.f12815j = HCaptchaDialogFragment.m13937h3(activity, hCaptchaConfig, this.f12817l, hCaptchaStateListener);
                this.f12816k = hCaptchaConfig;
                return this;
            }
            throw new IllegalStateException("Visual hCaptcha challenge verification requires FragmentActivity.");
        } catch (AndroidRuntimeException unused) {
            hCaptchaStateListener.onFailure(new HCaptchaException(HCaptchaError.ERROR));
            return this;
        }
    }
}
