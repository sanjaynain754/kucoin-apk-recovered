package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiSocketJsModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSocketJsHttpActionBinding;", "", "url", "", FirebaseAnalytics.Param.METHOD, "headers", ReportDataTable.COLUMN_PARAMS, "parameType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHeaders", "()Ljava/lang/String;", "getMethod", "getParameType", "getParams", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiSocketJsHttpActionBinding {

    @Nullable
    private final String headers;

    @NotNull
    private final String method;

    @Nullable
    private final String parameType;

    @Nullable
    private final String params;

    @NotNull
    private final String url;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiSocketJsHttpActionBinding)) {
            return false;
        }
        KCJSApiSocketJsHttpActionBinding kCJSApiSocketJsHttpActionBinding = (KCJSApiSocketJsHttpActionBinding) other;
        return Intrinsics.areEqual(this.url, kCJSApiSocketJsHttpActionBinding.url) && Intrinsics.areEqual(this.method, kCJSApiSocketJsHttpActionBinding.method) && Intrinsics.areEqual(this.headers, kCJSApiSocketJsHttpActionBinding.headers) && Intrinsics.areEqual(this.params, kCJSApiSocketJsHttpActionBinding.params) && Intrinsics.areEqual(this.parameType, kCJSApiSocketJsHttpActionBinding.parameType);
    }

    public KCJSApiSocketJsHttpActionBinding(@NotNull String url, @NotNull String method, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        this.url = url;
        this.method = method;
        this.headers = str;
        this.params = str2;
        this.parameType = str3;
    }

    public static /* synthetic */ KCJSApiSocketJsHttpActionBinding copy$default(KCJSApiSocketJsHttpActionBinding kCJSApiSocketJsHttpActionBinding, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCJSApiSocketJsHttpActionBinding.url;
        }
        if ((i11 & 2) != 0) {
            str2 = kCJSApiSocketJsHttpActionBinding.method;
        }
        if ((i11 & 4) != 0) {
            str3 = kCJSApiSocketJsHttpActionBinding.headers;
        }
        if ((i11 & 8) != 0) {
            str4 = kCJSApiSocketJsHttpActionBinding.params;
        }
        if ((i11 & 16) != 0) {
            str5 = kCJSApiSocketJsHttpActionBinding.parameType;
        }
        String str6 = str5;
        String str7 = str3;
        return kCJSApiSocketJsHttpActionBinding.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHeaders() {
        return this.headers;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getParams() {
        return this.params;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getParameType() {
        return this.parameType;
    }

    @NotNull
    public final KCJSApiSocketJsHttpActionBinding copy(@NotNull String url, @NotNull String method, @Nullable String headers, @Nullable String params, @Nullable String parameType) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        return new KCJSApiSocketJsHttpActionBinding(url, method, headers, params, parameType);
    }

    @Nullable
    public final String getHeaders() {
        return this.headers;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    public final String getParameType() {
        return this.parameType;
    }

    @Nullable
    public final String getParams() {
        return this.params;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = ((this.url.hashCode() * 31) + this.method.hashCode()) * 31;
        String str = this.headers;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.params;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.parameType;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KCJSApiSocketJsHttpActionBinding(url=" + this.url + ", method=" + this.method + ", headers=" + this.headers + ", params=" + this.params + ", parameType=" + this.parameType + ')';
    }
}
