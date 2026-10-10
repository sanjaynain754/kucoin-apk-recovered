package com.hcaptcha.sdk;

import androidx.annotation.NonNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import lombok.Generated;

/* JADX INFO: loaded from: classes56.dex */
public enum HCaptchaError implements Serializable {
    NETWORK_ERROR(7, "No internet connection"),
    INVALID_DATA(8, "Invalid data is not accepted by endpoints"),
    CHALLENGE_ERROR(9, "Challenge encountered error on setup"),
    INTERNAL_ERROR(10, "hCaptcha client encountered an internal error"),
    SESSION_TIMEOUT(15, "Session Timeout"),
    TOKEN_TIMEOUT(16, "Token Timeout"),
    CHALLENGE_CLOSED(30, "Challenge Closed"),
    RATE_LIMITED(31, "Rate Limited"),
    INVALID_CUSTOM_THEME(32, "Invalid custom theme"),
    INSECURE_HTTP_REQUEST_ERROR(33, "Insecure resource requested"),
    VERIFY_PARAMS_ERROR(34, "Error handling verify parameters"),
    ERROR(29, "Unknown error");

    private final int errorId;
    private final String message;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int getErrorId() {
        return this.errorId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getMessage() {
        return this.message;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.message;
    }

    HCaptchaError(int i11, String str) {
        this.errorId = i11;
        this.message = str;
    }

    @NonNull
    public static HCaptchaError fromId(int i11) {
        for (HCaptchaError hCaptchaError : values()) {
            if (hCaptchaError.errorId == i11) {
                return hCaptchaError;
            }
        }
        throw new RuntimeException("Unsupported error id: " + i11);
    }
}
