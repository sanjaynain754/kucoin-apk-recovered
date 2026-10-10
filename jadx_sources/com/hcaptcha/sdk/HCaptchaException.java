package com.hcaptcha.sdk;

import androidx.annotation.Nullable;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;
import lombok.NonNull;

/* JADX INFO: loaded from: classes56.dex */
public class HCaptchaException extends Exception {

    @NonNull
    private final HCaptchaError hCaptchaError;

    @Nullable
    private final String message;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaException(@NonNull HCaptchaError hCaptchaError, @Nullable String str) {
        if (hCaptchaError == null) {
            throw new NullPointerException("hCaptchaError is marked non-null but is null");
        }
        this.hCaptchaError = hCaptchaError;
        this.message = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(@edu.umd.cs.findbugs.annotations.Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HCaptchaException)) {
            return false;
        }
        HCaptchaException hCaptchaException = (HCaptchaException) obj;
        if (!hCaptchaException.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        HCaptchaError hCaptchaError = getHCaptchaError();
        HCaptchaError hCaptchaError2 = hCaptchaException.getHCaptchaError();
        if (hCaptchaError != null ? !hCaptchaError.equals(hCaptchaError2) : hCaptchaError2 != null) {
            return false;
        }
        String message = getMessage();
        String message2 = hCaptchaException.getMessage();
        return message != null ? message.equals(message2) : message2 == null;
    }

    public HCaptchaException(HCaptchaError hCaptchaError) {
        this(hCaptchaError, null);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(@edu.umd.cs.findbugs.annotations.Nullable Object obj) {
        return obj instanceof HCaptchaException;
    }

    public HCaptchaError getHCaptchaError() {
        return this.hCaptchaError;
    }

    @Override // java.lang.Throwable
    @Nullable
    public String getMessage() {
        String str = this.message;
        return str == null ? this.hCaptchaError.getMessage() : str;
    }

    public int getStatusCode() {
        return this.hCaptchaError.getErrorId();
    }

    @Override // java.lang.Throwable
    @edu.umd.cs.findbugs.annotations.NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "HCaptchaException(hCaptchaError=" + getHCaptchaError() + ", message=" + getMessage() + ")";
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        int iHashCode;
        int iHashCode2 = super.hashCode();
        HCaptchaError hCaptchaError = getHCaptchaError();
        int i11 = iHashCode2 * 59;
        int iHashCode3 = 43;
        if (hCaptchaError == null) {
            iHashCode = 43;
        } else {
            iHashCode = hCaptchaError.hashCode();
        }
        int i12 = i11 + iHashCode;
        String message = getMessage();
        int i13 = i12 * 59;
        if (message != null) {
            iHashCode3 = message.hashCode();
        }
        return i13 + iHashCode3;
    }
}
