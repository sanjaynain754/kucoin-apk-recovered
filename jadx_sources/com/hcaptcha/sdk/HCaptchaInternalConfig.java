package com.hcaptcha.sdk;

import edu.umd.cs.findbugs.annotations.NonNull;
import edu.umd.cs.findbugs.annotations.Nullable;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import lombok.Generated;

/* JADX INFO: loaded from: classes56.dex */
class HCaptchaInternalConfig implements Serializable {
    private IHCaptchaHtmlProvider htmlProvider;

    /* JADX INFO: renamed from: com.hcaptcha.sdk.HCaptchaInternalConfig$a */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class C9171a {

        /* JADX INFO: renamed from: a */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f12869a;

        /* JADX INFO: renamed from: b */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public IHCaptchaHtmlProvider f12870b;

        @NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: a */
        public HCaptchaInternalConfig m13948a() {
            IHCaptchaHtmlProvider iHCaptchaHtmlProviderM13947a = this.f12870b;
            if (!this.f12869a) {
                iHCaptchaHtmlProviderM13947a = HCaptchaInternalConfig.m13947a();
            }
            return new HCaptchaInternalConfig(iHCaptchaHtmlProviderM13947a);
        }

        @NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: b */
        public C9171a m13949b(IHCaptchaHtmlProvider iHCaptchaHtmlProvider) {
            this.f12870b = iHCaptchaHtmlProvider;
            this.f12869a = true;
            return this;
        }

        @NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return "HCaptchaInternalConfig.HCaptchaInternalConfigBuilder(htmlProvider$value=" + this.f12870b + ")";
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public C9171a() {
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HCaptchaInternalConfig)) {
            return false;
        }
        HCaptchaInternalConfig hCaptchaInternalConfig = (HCaptchaInternalConfig) obj;
        if (!hCaptchaInternalConfig.canEqual(this)) {
            return false;
        }
        IHCaptchaHtmlProvider htmlProvider = getHtmlProvider();
        IHCaptchaHtmlProvider htmlProvider2 = hCaptchaInternalConfig.getHtmlProvider();
        return htmlProvider != null ? htmlProvider.equals(htmlProvider2) : htmlProvider2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    /* JADX INFO: renamed from: a */
    public static IHCaptchaHtmlProvider m13947a() {
        return new HCaptchaHtml();
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static C9171a builder() {
        return new C9171a();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(@Nullable Object obj) {
        return obj instanceof HCaptchaInternalConfig;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public IHCaptchaHtmlProvider getHtmlProvider() {
        return this.htmlProvider;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setHtmlProvider(IHCaptchaHtmlProvider iHCaptchaHtmlProvider) {
        this.htmlProvider = iHCaptchaHtmlProvider;
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public C9171a toBuilder() {
        return new C9171a().m13949b(this.htmlProvider);
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "HCaptchaInternalConfig(htmlProvider=" + getHtmlProvider() + ")";
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaInternalConfig(IHCaptchaHtmlProvider iHCaptchaHtmlProvider) {
        this.htmlProvider = iHCaptchaHtmlProvider;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        int iHashCode;
        IHCaptchaHtmlProvider htmlProvider = getHtmlProvider();
        if (htmlProvider == null) {
            iHashCode = 43;
        } else {
            iHashCode = htmlProvider.hashCode();
        }
        return iHashCode + 59;
    }
}
