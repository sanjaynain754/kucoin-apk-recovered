package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeSocketJsTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/HttpActionBinding;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "url", "", FirebaseAnalytics.Param.METHOD, "headers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getMethod", "getHeaders", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeSocketJsTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeSocketJsTurboModule.kt\ncom/kubi/rn/core/turbo/HttpActionBinding\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n1#2:150\n*E\n"})
public final /* data */ class HttpActionBinding implements WritableMapSerializable {

    @Nullable
    private final String headers;

    @Nullable
    private final String method;

    @Nullable
    private final String url;

    public HttpActionBinding() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpActionBinding)) {
            return false;
        }
        HttpActionBinding httpActionBinding = (HttpActionBinding) other;
        return Intrinsics.areEqual(this.url, httpActionBinding.url) && Intrinsics.areEqual(this.method, httpActionBinding.method) && Intrinsics.areEqual(this.headers, httpActionBinding.headers);
    }

    public HttpActionBinding(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.url = str;
        this.method = str2;
        this.headers = str3;
    }

    public static /* synthetic */ HttpActionBinding copy$default(HttpActionBinding httpActionBinding, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = httpActionBinding.url;
        }
        if ((i11 & 2) != 0) {
            str2 = httpActionBinding.method;
        }
        if ((i11 & 4) != 0) {
            str3 = httpActionBinding.headers;
        }
        return httpActionBinding.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHeaders() {
        return this.headers;
    }

    @NotNull
    public final HttpActionBinding copy(@Nullable String url, @Nullable String method, @Nullable String headers) {
        return new HttpActionBinding(url, method, headers);
    }

    @Nullable
    public final String getHeaders() {
        return this.headers;
    }

    @Nullable
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.method;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.headers;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HttpActionBinding(url=" + this.url + ", method=" + this.method + ", headers=" + this.headers + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.url;
        if (str != null) {
            writableMapCreateMap.putString("url", str.toString());
        }
        String str2 = this.method;
        if (str2 != null) {
            writableMapCreateMap.putString(FirebaseAnalytics.Param.METHOD, str2.toString());
        }
        String str3 = this.headers;
        if (str3 != null) {
            writableMapCreateMap.putString("headers", str3.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ HttpActionBinding(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
