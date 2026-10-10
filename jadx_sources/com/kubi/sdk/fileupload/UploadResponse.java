package com.kubi.sdk.fileupload;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UploadBean.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/sdk/fileupload/UploadResponse;", "", "code", "", "data", "msg", "retry", "", "success", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getCode", "()Ljava/lang/String;", "getData", "getMsg", "getRetry", "()Z", "getSuccess", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "fileupload_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class UploadResponse {

    @NotNull
    private final String code;

    @NotNull
    private final String data;

    @NotNull
    private final String msg;
    private final boolean retry;
    private final boolean success;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadResponse)) {
            return false;
        }
        UploadResponse uploadResponse = (UploadResponse) other;
        return Intrinsics.areEqual(this.code, uploadResponse.code) && Intrinsics.areEqual(this.data, uploadResponse.data) && Intrinsics.areEqual(this.msg, uploadResponse.msg) && this.retry == uploadResponse.retry && this.success == uploadResponse.success;
    }

    public UploadResponse(@NotNull String code, @NotNull String data, @NotNull String msg, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.code = code;
        this.data = data;
        this.msg = msg;
        this.retry = z11;
        this.success = z12;
    }

    public static /* synthetic */ UploadResponse copy$default(UploadResponse uploadResponse, String str, String str2, String str3, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = uploadResponse.code;
        }
        if ((i11 & 2) != 0) {
            str2 = uploadResponse.data;
        }
        if ((i11 & 4) != 0) {
            str3 = uploadResponse.msg;
        }
        if ((i11 & 8) != 0) {
            z11 = uploadResponse.retry;
        }
        if ((i11 & 16) != 0) {
            z12 = uploadResponse.success;
        }
        boolean z13 = z12;
        String str4 = str3;
        return uploadResponse.copy(str, str2, str4, z11, z13);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getData() {
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
    public final UploadResponse copy(@NotNull String code, @NotNull String data, @NotNull String msg, boolean retry, boolean success) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new UploadResponse(code, data, msg, retry, success);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getData() {
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
        return "UploadResponse(code=" + this.code + ", data=" + this.data + ", msg=" + this.msg + ", retry=" + this.retry + ", success=" + this.success + ')';
    }
}
