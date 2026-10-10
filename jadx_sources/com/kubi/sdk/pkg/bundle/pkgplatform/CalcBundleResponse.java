package com.kubi.sdk.pkg.bundle.pkgplatform;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PkgPlatformApi.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;", "", "success", "", "code", "", "data", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleData;", "(ZLjava/lang/String;Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleData;)V", "getCode", "()Ljava/lang/String;", "getData", "()Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleData;", "getSuccess", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class CalcBundleResponse {

    @Nullable
    private final String code;

    @Nullable
    private final CalcBundleData data;
    private final boolean success;

    public CalcBundleResponse() {
        this(false, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalcBundleResponse)) {
            return false;
        }
        CalcBundleResponse calcBundleResponse = (CalcBundleResponse) other;
        return this.success == calcBundleResponse.success && Intrinsics.areEqual(this.code, calcBundleResponse.code) && Intrinsics.areEqual(this.data, calcBundleResponse.data);
    }

    public CalcBundleResponse(boolean z11, @Nullable String str, @Nullable CalcBundleData calcBundleData) {
        this.success = z11;
        this.code = str;
        this.data = calcBundleData;
    }

    public static /* synthetic */ CalcBundleResponse copy$default(CalcBundleResponse calcBundleResponse, boolean z11, String str, CalcBundleData calcBundleData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = calcBundleResponse.success;
        }
        if ((i11 & 2) != 0) {
            str = calcBundleResponse.code;
        }
        if ((i11 & 4) != 0) {
            calcBundleData = calcBundleResponse.data;
        }
        return calcBundleResponse.copy(z11, str, calcBundleData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CalcBundleData getData() {
        return this.data;
    }

    @NotNull
    public final CalcBundleResponse copy(boolean success, @Nullable String code, @Nullable CalcBundleData data) {
        return new CalcBundleResponse(success, code, data);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final CalcBundleData getData() {
        return this.data;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z11 = this.success;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = r11 * 31;
        String str = this.code;
        int iHashCode = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        CalcBundleData calcBundleData = this.data;
        return iHashCode + (calcBundleData != null ? calcBundleData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CalcBundleResponse(success=" + this.success + ", code=" + this.code + ", data=" + this.data + ')';
    }

    public /* synthetic */ CalcBundleResponse(boolean z11, String str, CalcBundleData calcBundleData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : calcBundleData);
    }
}
