package com.kubi.sdk.fileupload;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UploadBean.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/sdk/fileupload/TokenResponse;", "", "code", "", "data", "Lcom/kubi/sdk/fileupload/TokenData;", "msg", "retry", "", "success", "(Ljava/lang/String;Lcom/kubi/sdk/fileupload/TokenData;Ljava/lang/String;ZZ)V", "getCode", "()Ljava/lang/String;", "getData", "()Lcom/kubi/sdk/fileupload/TokenData;", "getMsg", "getRetry", "()Z", "getSuccess", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "fileupload_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class TokenResponse {

    @NotNull
    private final String code;

    @NotNull
    private final TokenData data;

    @NotNull
    private final String msg;
    private final boolean retry;
    private final boolean success;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenResponse)) {
            return false;
        }
        TokenResponse tokenResponse = (TokenResponse) other;
        return Intrinsics.areEqual(this.code, tokenResponse.code) && Intrinsics.areEqual(this.data, tokenResponse.data) && Intrinsics.areEqual(this.msg, tokenResponse.msg) && this.retry == tokenResponse.retry && this.success == tokenResponse.success;
    }

    public TokenResponse(@NotNull String code, @NotNull TokenData data, @NotNull String msg, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.code = code;
        this.data = data;
        this.msg = msg;
        this.retry = z11;
        this.success = z12;
    }

    public static /* synthetic */ TokenResponse copy$default(TokenResponse tokenResponse, String str, TokenData tokenData, String str2, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tokenResponse.code;
        }
        if ((i11 & 2) != 0) {
            tokenData = tokenResponse.data;
        }
        if ((i11 & 4) != 0) {
            str2 = tokenResponse.msg;
        }
        if ((i11 & 8) != 0) {
            z11 = tokenResponse.retry;
        }
        if ((i11 & 16) != 0) {
            z12 = tokenResponse.success;
        }
        boolean z13 = z12;
        String str3 = str2;
        return tokenResponse.copy(str, tokenData, str3, z11, z13);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TokenData getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getRetry() {
        return this.retry;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final TokenResponse copy(@NotNull String code, @NotNull TokenData data, @NotNull String msg, boolean retry, boolean success) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new TokenResponse(code, data, msg, retry, success);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final TokenData getData() {
        return this.data;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    public final boolean getRetry() {
        return this.retry;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.code.hashCode() * 31) + this.data.hashCode()) * 31) + this.msg.hashCode()) * 31;
        boolean z11 = this.retry;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode + r11) * 31;
        boolean z12 = this.success;
        return i11 + (z12 ? 1 : z12);
    }

    @NotNull
    public String toString() {
        return "TokenResponse(code=" + this.code + ", data=" + this.data + ", msg=" + this.msg + ", retry=" + this.retry + ", success=" + this.success + ')';
    }
}
