package com.kubi.p110rn.p111ui;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCBridgeRejecterError.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0003J7\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/rn/ui/KCBridgeRejecterError;", "", "code", "", "message", "userInfo", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCode", "()Ljava/lang/String;", "getMessage", "getUserInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "BReactNativeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KCBridgeRejecterError {

    @NotNull
    private final String code;

    @Nullable
    private final String message;

    @Nullable
    private final Map<String, Object> userInfo;

    public KCBridgeRejecterError(@NotNull String code, @Nullable String str, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.code = code;
        this.message = str;
        this.userInfo = map;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCBridgeRejecterError)) {
            return false;
        }
        KCBridgeRejecterError kCBridgeRejecterError = (KCBridgeRejecterError) other;
        return Intrinsics.areEqual(this.code, kCBridgeRejecterError.code) && Intrinsics.areEqual(this.message, kCBridgeRejecterError.message) && Intrinsics.areEqual(this.userInfo, kCBridgeRejecterError.userInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KCBridgeRejecterError copy$default(KCBridgeRejecterError kCBridgeRejecterError, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCBridgeRejecterError.code;
        }
        if ((i11 & 2) != 0) {
            str2 = kCBridgeRejecterError.message;
        }
        if ((i11 & 4) != 0) {
            map = kCBridgeRejecterError.userInfo;
        }
        return kCBridgeRejecterError.copy(str, str2, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final Map<String, Object> component3() {
        return this.userInfo;
    }

    @NotNull
    public final KCBridgeRejecterError copy(@NotNull String code, @Nullable String message, @Nullable Map<String, ? extends Object> userInfo) {
        Intrinsics.checkNotNullParameter(code, "code");
        return new KCBridgeRejecterError(code, message, userInfo);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final Map<String, Object> getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.userInfo;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KCBridgeRejecterError(code=" + this.code + ", message=" + this.message + ", userInfo=" + this.userInfo + ')';
    }

    public /* synthetic */ KCBridgeRejecterError(String str, String str2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : map);
    }
}
