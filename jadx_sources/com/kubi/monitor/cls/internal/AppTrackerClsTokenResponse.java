package com.kubi.monitor.cls.internal;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppTrackerCredentialManager.kt */
/* JADX INFO: loaded from: classes29.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/monitor/cls/internal/AppTrackerClsTokenResponse;", "", "success", "", "code", "", "message", "data", "Lcom/kubi/monitor/cls/internal/AppTrackerClsToken;", "(ZLjava/lang/String;Ljava/lang/String;Lcom/kubi/monitor/cls/internal/AppTrackerClsToken;)V", "getCode", "()Ljava/lang/String;", "getData", "()Lcom/kubi/monitor/cls/internal/AppTrackerClsToken;", "getMessage", "getSuccess", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Monitor-cls_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
final /* data */ class AppTrackerClsTokenResponse {

    @SerializedName("code")
    @Nullable
    private final String code;

    @SerializedName("data")
    @Nullable
    private final AppTrackerClsToken data;

    @SerializedName("msg")
    @Nullable
    private final String message;

    @SerializedName("success")
    private final boolean success;

    public AppTrackerClsTokenResponse() {
        this(false, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppTrackerClsTokenResponse)) {
            return false;
        }
        AppTrackerClsTokenResponse appTrackerClsTokenResponse = (AppTrackerClsTokenResponse) other;
        return this.success == appTrackerClsTokenResponse.success && Intrinsics.areEqual(this.code, appTrackerClsTokenResponse.code) && Intrinsics.areEqual(this.message, appTrackerClsTokenResponse.message) && Intrinsics.areEqual(this.data, appTrackerClsTokenResponse.data);
    }

    public AppTrackerClsTokenResponse(boolean z11, @Nullable String str, @Nullable String str2, @Nullable AppTrackerClsToken appTrackerClsToken) {
        this.success = z11;
        this.code = str;
        this.message = str2;
        this.data = appTrackerClsToken;
    }

    public static /* synthetic */ AppTrackerClsTokenResponse copy$default(AppTrackerClsTokenResponse appTrackerClsTokenResponse, boolean z11, String str, String str2, AppTrackerClsToken appTrackerClsToken, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = appTrackerClsTokenResponse.success;
        }
        if ((i11 & 2) != 0) {
            str = appTrackerClsTokenResponse.code;
        }
        if ((i11 & 4) != 0) {
            str2 = appTrackerClsTokenResponse.message;
        }
        if ((i11 & 8) != 0) {
            appTrackerClsToken = appTrackerClsTokenResponse.data;
        }
        return appTrackerClsTokenResponse.copy(z11, str, str2, appTrackerClsToken);
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
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AppTrackerClsToken getData() {
        return this.data;
    }

    @NotNull
    public final AppTrackerClsTokenResponse copy(boolean success, @Nullable String code, @Nullable String message, @Nullable AppTrackerClsToken data) {
        return new AppTrackerClsTokenResponse(success, code, message, data);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final AppTrackerClsToken getData() {
        return this.data;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z11 = this.success;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = r11 * 31;
        String str = this.code;
        int iHashCode = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AppTrackerClsToken appTrackerClsToken = this.data;
        return iHashCode2 + (appTrackerClsToken != null ? appTrackerClsToken.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AppTrackerClsTokenResponse(success=" + this.success + ", code=" + ((Object) this.code) + ", message=" + ((Object) this.message) + ", data=" + this.data + ')';
    }

    public /* synthetic */ AppTrackerClsTokenResponse(boolean z11, String str, String str2, AppTrackerClsToken appTrackerClsToken, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : appTrackerClsToken);
    }
}
