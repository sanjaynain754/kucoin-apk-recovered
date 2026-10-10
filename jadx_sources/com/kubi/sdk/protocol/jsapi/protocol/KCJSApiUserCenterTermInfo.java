package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiUserCenterModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiUserCenterTermInfo;", "", "type", "", "displayName", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getType", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiUserCenterTermInfo {

    @NotNull
    private final String displayName;

    @NotNull
    private final String type;

    @NotNull
    private final String url;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiUserCenterTermInfo)) {
            return false;
        }
        KCJSApiUserCenterTermInfo kCJSApiUserCenterTermInfo = (KCJSApiUserCenterTermInfo) other;
        return Intrinsics.areEqual(this.type, kCJSApiUserCenterTermInfo.type) && Intrinsics.areEqual(this.displayName, kCJSApiUserCenterTermInfo.displayName) && Intrinsics.areEqual(this.url, kCJSApiUserCenterTermInfo.url);
    }

    public KCJSApiUserCenterTermInfo(@NotNull String type, @NotNull String displayName, @NotNull String url) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(url, "url");
        this.type = type;
        this.displayName = displayName;
        this.url = url;
    }

    public static /* synthetic */ KCJSApiUserCenterTermInfo copy$default(KCJSApiUserCenterTermInfo kCJSApiUserCenterTermInfo, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCJSApiUserCenterTermInfo.type;
        }
        if ((i11 & 2) != 0) {
            str2 = kCJSApiUserCenterTermInfo.displayName;
        }
        if ((i11 & 4) != 0) {
            str3 = kCJSApiUserCenterTermInfo.url;
        }
        return kCJSApiUserCenterTermInfo.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final KCJSApiUserCenterTermInfo copy(@NotNull String type, @NotNull String displayName, @NotNull String url) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(url, "url");
        return new KCJSApiUserCenterTermInfo(type, displayName, url);
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.url.hashCode();
    }

    @NotNull
    public String toString() {
        return "KCJSApiUserCenterTermInfo(type=" + this.type + ", displayName=" + this.displayName + ", url=" + this.url + ')';
    }
}
