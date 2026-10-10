package com.kubi.sdk.log.realtime.network;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealTimeLogApi.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J:\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/sdk/log/realtime/network/LogResponse;", "", "code", "", "msg", "", "retry", "", "success", "(ILjava/lang/String;Ljava/lang/Boolean;Z)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "getRetry", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSuccess", "()Z", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/Boolean;Z)Lcom/kubi/sdk/log/realtime/network/LogResponse;", "equals", "other", "hashCode", "toString", "Logger-realtime_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class LogResponse {
    private final int code;

    @Nullable
    private final String msg;

    @Nullable
    private final Boolean retry;
    private final boolean success;

    public LogResponse() {
        this(0, null, null, false, 15, null);
    }

    public static /* synthetic */ LogResponse copy$default(LogResponse logResponse, int i11, String str, Boolean bool, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = logResponse.code;
        }
        if ((i12 & 2) != 0) {
            str = logResponse.msg;
        }
        if ((i12 & 4) != 0) {
            bool = logResponse.retry;
        }
        if ((i12 & 8) != 0) {
            z11 = logResponse.success;
        }
        return logResponse.copy(i11, str, bool, z11);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogResponse)) {
            return false;
        }
        LogResponse logResponse = (LogResponse) other;
        return this.code == logResponse.code && Intrinsics.areEqual(this.msg, logResponse.msg) && Intrinsics.areEqual(this.retry, logResponse.retry) && this.success == logResponse.success;
    }

    public LogResponse(int i11, @Nullable String str, @Nullable Boolean bool, boolean z11) {
        this.code = i11;
        this.msg = str;
        this.retry = bool;
        this.success = z11;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getRetry() {
        return this.retry;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final LogResponse copy(int code, @Nullable String msg, @Nullable Boolean retry, boolean success) {
        return new LogResponse(code, msg, retry, success);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    public final Boolean getRetry() {
        return this.retry;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        String str = this.msg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.retry;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        boolean z11 = this.success;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return iHashCode3 + r11;
    }

    @NotNull
    public String toString() {
        return "LogResponse(code=" + this.code + ", msg=" + this.msg + ", retry=" + this.retry + ", success=" + this.success + ')';
    }

    public /* synthetic */ LogResponse(int i11, String str, Boolean bool, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 200 : i11, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? Boolean.TRUE : bool, (i12 & 8) != 0 ? true : z11);
    }
}
