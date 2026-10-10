package com.hcaptcha.sdk;

import java.io.Serializable;

/* JADX INFO: renamed from: com.hcaptcha.sdk.c */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes56.dex */
public final /* synthetic */ class C9175c implements IHCaptchaRetryPredicate, Serializable {
    @Override // com.hcaptcha.sdk.IHCaptchaRetryPredicate
    public final boolean shouldRetry(HCaptchaConfig hCaptchaConfig, HCaptchaException hCaptchaException) {
        return HCaptchaConfig.m13910a(hCaptchaConfig, hCaptchaException);
    }
}
