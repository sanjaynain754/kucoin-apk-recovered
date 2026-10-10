package com.kubi.sdk.protocol.p118rn.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCBridgeSafeValidationCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeSafeValidationSafeValidationMap;", "", "code", "", "msg", "", "validationToken", "sessionId", "fingerprintId", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()J", "getFingerprintId", "()Ljava/lang/String;", "getMsg", "getSessionId", "getValidationToken", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCBridgeSafeValidationSafeValidationMap {
    private final long code;

    @NotNull
    private final String fingerprintId;

    @NotNull
    private final String msg;

    @NotNull
    private final String sessionId;

    @NotNull
    private final String validationToken;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCBridgeSafeValidationSafeValidationMap)) {
            return false;
        }
        KCBridgeSafeValidationSafeValidationMap kCBridgeSafeValidationSafeValidationMap = (KCBridgeSafeValidationSafeValidationMap) other;
        return this.code == kCBridgeSafeValidationSafeValidationMap.code && Intrinsics.areEqual(this.msg, kCBridgeSafeValidationSafeValidationMap.msg) && Intrinsics.areEqual(this.validationToken, kCBridgeSafeValidationSafeValidationMap.validationToken) && Intrinsics.areEqual(this.sessionId, kCBridgeSafeValidationSafeValidationMap.sessionId) && Intrinsics.areEqual(this.fingerprintId, kCBridgeSafeValidationSafeValidationMap.fingerprintId);
    }

    public KCBridgeSafeValidationSafeValidationMap(long j11, @NotNull String msg, @NotNull String validationToken, @NotNull String sessionId, @NotNull String fingerprintId) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(validationToken, "validationToken");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(fingerprintId, "fingerprintId");
        this.code = j11;
        this.msg = msg;
        this.validationToken = validationToken;
        this.sessionId = sessionId;
        this.fingerprintId = fingerprintId;
    }

    public static /* synthetic */ KCBridgeSafeValidationSafeValidationMap copy$default(KCBridgeSafeValidationSafeValidationMap kCBridgeSafeValidationSafeValidationMap, long j11, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = kCBridgeSafeValidationSafeValidationMap.code;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = kCBridgeSafeValidationSafeValidationMap.msg;
        }
        String str5 = str;
        if ((i11 & 4) != 0) {
            str2 = kCBridgeSafeValidationSafeValidationMap.validationToken;
        }
        String str6 = str2;
        if ((i11 & 8) != 0) {
            str3 = kCBridgeSafeValidationSafeValidationMap.sessionId;
        }
        String str7 = str3;
        if ((i11 & 16) != 0) {
            str4 = kCBridgeSafeValidationSafeValidationMap.fingerprintId;
        }
        return kCBridgeSafeValidationSafeValidationMap.copy(j12, str5, str6, str7, str4);
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
    public final KCBridgeSafeValidationSafeValidationMap copy(long code, @NotNull String msg, @NotNull String validationToken, @NotNull String sessionId, @NotNull String fingerprintId) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(validationToken, "validationToken");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(fingerprintId, "fingerprintId");
        return new KCBridgeSafeValidationSafeValidationMap(code, msg, validationToken, sessionId, fingerprintId);
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

    public int hashCode() {
        return (((((((Long.hashCode(this.code) * 31) + this.msg.hashCode()) * 31) + this.validationToken.hashCode()) * 31) + this.sessionId.hashCode()) * 31) + this.fingerprintId.hashCode();
    }

    @NotNull
    public String toString() {
        return "KCBridgeSafeValidationSafeValidationMap(code=" + this.code + ", msg=" + this.msg + ", validationToken=" + this.validationToken + ", sessionId=" + this.sessionId + ", fingerprintId=" + this.fingerprintId + ')';
    }
}
