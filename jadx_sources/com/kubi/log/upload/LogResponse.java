package com.kubi.log.upload;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ILogUpload.kt */
/* JADX INFO: loaded from: classes26.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/log/upload/LogResponse;", "", "code", "", "msg", "retry", "", "success", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getCode", "()Ljava/lang/String;", "getMsg", "getRetry", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSuccess", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/log/upload/LogResponse;", "equals", "other", "hashCode", "", "toString", "Logger-Uploader_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class LogResponse {

    @Nullable
    private final String code;

    @Nullable
    private final String msg;

    @Nullable
    private final Boolean retry;

    @Nullable
    private final Boolean success;

    public LogResponse() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogResponse)) {
            return false;
        }
        LogResponse logResponse = (LogResponse) other;
        return Intrinsics.areEqual(this.code, logResponse.code) && Intrinsics.areEqual(this.msg, logResponse.msg) && Intrinsics.areEqual(this.retry, logResponse.retry) && Intrinsics.areEqual(this.success, logResponse.success);
    }

    public LogResponse(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.code = str;
        this.msg = str2;
        this.retry = bool;
        this.success = bool2;
    }

    public static /* synthetic */ LogResponse copy$default(LogResponse logResponse, String str, String str2, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = logResponse.code;
        }
        if ((i11 & 2) != 0) {
            str2 = logResponse.msg;
        }
        if ((i11 & 4) != 0) {
            bool = logResponse.retry;
        }
        if ((i11 & 8) != 0) {
            bool2 = logResponse.success;
        }
        return logResponse.copy(str, str2, bool, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
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

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final LogResponse copy(@Nullable String code, @Nullable String msg, @Nullable Boolean retry, @Nullable Boolean success) {
        return new LogResponse(code, msg, retry, success);
    }

    @Nullable
    public final String getCode() {
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

    @Nullable
    public final Boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.msg;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.retry;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.success;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LogResponse(code=" + this.code + ", msg=" + this.msg + ", retry=" + this.retry + ", success=" + this.success + ')';
    }

    public /* synthetic */ LogResponse(String str, String str2, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "0" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? Boolean.TRUE : bool, (i11 & 8) != 0 ? Boolean.FALSE : bool2);
    }
}
