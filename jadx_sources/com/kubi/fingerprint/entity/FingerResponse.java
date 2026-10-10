package com.kubi.fingerprint.entity;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FingerToken.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/fingerprint/entity/FingerResponse;", ExifInterface.GPS_DIRECTION_TRUE, "", "code", "", "data", "(Ljava/lang/String;Ljava/lang/Object;)V", "getCode", "()Ljava/lang/String;", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/kubi/fingerprint/entity/FingerResponse;", "equals", "", "other", "hashCode", "", "toString", "Fingerprint_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class FingerResponse<T> {

    @NotNull
    private final String code;
    private final T data;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FingerResponse)) {
            return false;
        }
        FingerResponse fingerResponse = (FingerResponse) other;
        return Intrinsics.areEqual(this.code, fingerResponse.code) && Intrinsics.areEqual(this.data, fingerResponse.data);
    }

    public FingerResponse(@NotNull String code, T t11) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.code = code;
        this.data = t11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FingerResponse copy$default(FingerResponse fingerResponse, String str, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = fingerResponse.code;
        }
        if ((i11 & 2) != 0) {
            obj = fingerResponse.data;
        }
        return fingerResponse.copy(str, obj);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public final T component2() {
        return this.data;
    }

    @NotNull
    public final FingerResponse<T> copy(@NotNull String code, T data) {
        Intrinsics.checkNotNullParameter(code, "code");
        return new FingerResponse<>(code, data);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final T getData() {
        return this.data;
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        T t11 = this.data;
        return iHashCode + (t11 == null ? 0 : t11.hashCode());
    }

    @NotNull
    public String toString() {
        return "FingerResponse(code=" + this.code + ", data=" + this.data + ')';
    }
}
