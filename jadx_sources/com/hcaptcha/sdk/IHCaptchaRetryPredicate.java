package com.hcaptcha.sdk;

import java.io.Serializable;

/* JADX INFO: loaded from: classes56.dex */
@FunctionalInterface
public interface IHCaptchaRetryPredicate extends Serializable {
    boolean shouldRetry(HCaptchaConfig hCaptchaConfig, HCaptchaException hCaptchaException);
}
