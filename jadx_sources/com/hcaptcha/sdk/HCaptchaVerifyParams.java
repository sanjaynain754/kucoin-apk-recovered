package com.hcaptcha.sdk;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.NonNull;
import edu.umd.cs.findbugs.annotations.Nullable;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import lombok.Generated;

/* JADX INFO: loaded from: classes56.dex */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HCaptchaVerifyParams implements Serializable {

    @JsonProperty("mfa_phone")
    private String phoneNumber;

    @JsonProperty("mfa_phoneprefix")
    private String phonePrefix;

    @JsonProperty("rqdata")
    private String rqdata;

    /* JADX INFO: renamed from: com.hcaptcha.sdk.HCaptchaVerifyParams$a */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class C9172a {

        /* JADX INFO: renamed from: a */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f12876a;

        /* JADX INFO: renamed from: b */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f12877b;

        /* JADX INFO: renamed from: c */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f12878c;

        @NonNull
        @JsonProperty("mfa_phone")
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: a */
        public C9172a m13955a(String str) {
            this.f12877b = str;
            return this;
        }

        @NonNull
        @JsonProperty("mfa_phoneprefix")
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: b */
        public C9172a m13956b(String str) {
            this.f12876a = str;
            return this;
        }

        @NonNull
        @JsonProperty("rqdata")
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        /* JADX INFO: renamed from: c */
        public C9172a m13957c(String str) {
            this.f12878c = str;
            return this;
        }

        @NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return "HCaptchaVerifyParams.HCaptchaVerifyParamsBuilder(phonePrefix=" + this.f12876a + ", phoneNumber=" + this.f12877b + ", rqdata=" + this.f12878c + ")";
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public C9172a() {
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaVerifyParams() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HCaptchaVerifyParams)) {
            return false;
        }
        HCaptchaVerifyParams hCaptchaVerifyParams = (HCaptchaVerifyParams) obj;
        if (!hCaptchaVerifyParams.canEqual(this)) {
            return false;
        }
        String phonePrefix = getPhonePrefix();
        String phonePrefix2 = hCaptchaVerifyParams.getPhonePrefix();
        if (phonePrefix != null ? !phonePrefix.equals(phonePrefix2) : phonePrefix2 != null) {
            return false;
        }
        String phoneNumber = getPhoneNumber();
        String phoneNumber2 = hCaptchaVerifyParams.getPhoneNumber();
        if (phoneNumber != null ? !phoneNumber.equals(phoneNumber2) : phoneNumber2 != null) {
            return false;
        }
        String rqdata = getRqdata();
        String rqdata2 = hCaptchaVerifyParams.getRqdata();
        return rqdata != null ? rqdata.equals(rqdata2) : rqdata2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaVerifyParams(String str, String str2, String str3) {
        this.phonePrefix = str;
        this.phoneNumber = str2;
        this.rqdata = str3;
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static C9172a builder() {
        return new C9172a();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(@Nullable Object obj) {
        return obj instanceof HCaptchaVerifyParams;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getPhonePrefix() {
        return this.phonePrefix;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getRqdata() {
        return this.rqdata;
    }

    @JsonProperty("mfa_phone")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    @JsonProperty("mfa_phoneprefix")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setPhonePrefix(String str) {
        this.phonePrefix = str;
    }

    @JsonProperty("rqdata")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setRqdata(String str) {
        this.rqdata = str;
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public C9172a toBuilder() {
        return new C9172a().m13956b(this.phonePrefix).m13955a(this.phoneNumber).m13957c(this.rqdata);
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "HCaptchaVerifyParams(phonePrefix=" + getPhonePrefix() + ", phoneNumber=" + getPhoneNumber() + ", rqdata=" + getRqdata() + ")";
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        String phonePrefix = getPhonePrefix();
        int iHashCode3 = 43;
        if (phonePrefix == null) {
            iHashCode = 43;
        } else {
            iHashCode = phonePrefix.hashCode();
        }
        String phoneNumber = getPhoneNumber();
        int i11 = (iHashCode + 59) * 59;
        if (phoneNumber == null) {
            iHashCode2 = 43;
        } else {
            iHashCode2 = phoneNumber.hashCode();
        }
        int i12 = i11 + iHashCode2;
        String rqdata = getRqdata();
        int i13 = i12 * 59;
        if (rqdata != null) {
            iHashCode3 = rqdata.hashCode();
        }
        return i13 + iHashCode3;
    }
}
