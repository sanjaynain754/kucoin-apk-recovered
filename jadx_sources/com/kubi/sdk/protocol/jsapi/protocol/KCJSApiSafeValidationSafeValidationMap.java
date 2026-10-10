package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiSafeValidationModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0013Jh\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\r\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u000b\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSafeValidationSafeValidationMap;", "", "code", "", "msg", "", "validationToken", "sessionId", "fingerprintId", "warningValidations", "", "isNeedSelfService", "", "isNeedLiveVerify", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getCode", "()J", "getFingerprintId", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMsg", "getSessionId", "getValidationToken", "getWarningValidations", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSafeValidationSafeValidationMap;", "equals", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiSafeValidationSafeValidationMap {
    private final long code;

    @NotNull
    private final String fingerprintId;

    @Nullable
    private final Boolean isNeedLiveVerify;

    @Nullable
    private final Boolean isNeedSelfService;

    @NotNull
    private final String msg;

    @NotNull
    private final String sessionId;

    @NotNull
    private final String validationToken;

    @NotNull
    private final List<String> warningValidations;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiSafeValidationSafeValidationMap)) {
            return false;
        }
        KCJSApiSafeValidationSafeValidationMap kCJSApiSafeValidationSafeValidationMap = (KCJSApiSafeValidationSafeValidationMap) other;
        return this.code == kCJSApiSafeValidationSafeValidationMap.code && Intrinsics.areEqual(this.msg, kCJSApiSafeValidationSafeValidationMap.msg) && Intrinsics.areEqual(this.validationToken, kCJSApiSafeValidationSafeValidationMap.validationToken) && Intrinsics.areEqual(this.sessionId, kCJSApiSafeValidationSafeValidationMap.sessionId) && Intrinsics.areEqual(this.fingerprintId, kCJSApiSafeValidationSafeValidationMap.fingerprintId) && Intrinsics.areEqual(this.warningValidations, kCJSApiSafeValidationSafeValidationMap.warningValidations) && Intrinsics.areEqual(this.isNeedSelfService, kCJSApiSafeValidationSafeValidationMap.isNeedSelfService) && Intrinsics.areEqual(this.isNeedLiveVerify, kCJSApiSafeValidationSafeValidationMap.isNeedLiveVerify);
    }

    public KCJSApiSafeValidationSafeValidationMap(long j11, @NotNull String msg, @NotNull String validationToken, @NotNull String sessionId, @NotNull String fingerprintId, @NotNull List<String> warningValidations, @Nullable Boolean bool, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(validationToken, "validationToken");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(fingerprintId, "fingerprintId");
        Intrinsics.checkNotNullParameter(warningValidations, "warningValidations");
        this.code = j11;
        this.msg = msg;
        this.validationToken = validationToken;
        this.sessionId = sessionId;
        this.fingerprintId = fingerprintId;
        this.warningValidations = warningValidations;
        this.isNeedSelfService = bool;
        this.isNeedLiveVerify = bool2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KCJSApiSafeValidationSafeValidationMap copy$default(KCJSApiSafeValidationSafeValidationMap kCJSApiSafeValidationSafeValidationMap, long j11, String str, String str2, String str3, String str4, List list, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = kCJSApiSafeValidationSafeValidationMap.code;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = kCJSApiSafeValidationSafeValidationMap.msg;
        }
        String str5 = str;
        if ((i11 & 4) != 0) {
            str2 = kCJSApiSafeValidationSafeValidationMap.validationToken;
        }
        String str6 = str2;
        if ((i11 & 8) != 0) {
            str3 = kCJSApiSafeValidationSafeValidationMap.sessionId;
        }
        return kCJSApiSafeValidationSafeValidationMap.copy(j12, str5, str6, str3, (i11 & 16) != 0 ? kCJSApiSafeValidationSafeValidationMap.fingerprintId : str4, (i11 & 32) != 0 ? kCJSApiSafeValidationSafeValidationMap.warningValidations : list, (i11 & 64) != 0 ? kCJSApiSafeValidationSafeValidationMap.isNeedSelfService : bool, (i11 & 128) != 0 ? kCJSApiSafeValidationSafeValidationMap.isNeedLiveVerify : bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValidationToken() {
        return this.validationToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFingerprintId() {
        return this.fingerprintId;
    }

    @NotNull
    public final List<String> component6() {
        return this.warningValidations;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsNeedSelfService() {
        return this.isNeedSelfService;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIsNeedLiveVerify() {
        return this.isNeedLiveVerify;
    }

    @NotNull
    public final KCJSApiSafeValidationSafeValidationMap copy(long code, @NotNull String msg, @NotNull String validationToken, @NotNull String sessionId, @NotNull String fingerprintId, @NotNull List<String> warningValidations, @Nullable Boolean isNeedSelfService, @Nullable Boolean isNeedLiveVerify) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(validationToken, "validationToken");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(fingerprintId, "fingerprintId");
        Intrinsics.checkNotNullParameter(warningValidations, "warningValidations");
        return new KCJSApiSafeValidationSafeValidationMap(code, msg, validationToken, sessionId, fingerprintId, warningValidations, isNeedSelfService, isNeedLiveVerify);
    }

    public final long getCode() {
        return this.code;
    }

    @NotNull
    public final String getFingerprintId() {
        return this.fingerprintId;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final String getValidationToken() {
        return this.validationToken;
    }

    @NotNull
    public final List<String> getWarningValidations() {
        return this.warningValidations;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Long.hashCode(this.code) * 31) + this.msg.hashCode()) * 31) + this.validationToken.hashCode()) * 31) + this.sessionId.hashCode()) * 31) + this.fingerprintId.hashCode()) * 31) + this.warningValidations.hashCode()) * 31;
        Boolean bool = this.isNeedSelfService;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isNeedLiveVerify;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isNeedLiveVerify() {
        return this.isNeedLiveVerify;
    }

    @Nullable
    public final Boolean isNeedSelfService() {
        return this.isNeedSelfService;
    }

    @NotNull
    public String toString() {
        return "KCJSApiSafeValidationSafeValidationMap(code=" + this.code + ", msg=" + this.msg + ", validationToken=" + this.validationToken + ", sessionId=" + this.sessionId + ", fingerprintId=" + this.fingerprintId + ", warningValidations=" + this.warningValidations + ", isNeedSelfService=" + this.isNeedSelfService + ", isNeedLiveVerify=" + this.isNeedLiveVerify + ')';
    }
}
