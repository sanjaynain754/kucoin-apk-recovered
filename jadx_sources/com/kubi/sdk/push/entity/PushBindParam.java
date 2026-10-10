package com.kubi.sdk.push.entity;

import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PushBindParam.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\""}, m90084d2 = {"Lcom/kubi/sdk/push/entity/PushBindParam;", "", "platform", "", "clientId", "channelToken", "channelType", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPlatform", "()Ljava/lang/String;", "setPlatform", "(Ljava/lang/String;)V", "getClientId", "setClientId", "getChannelToken", "setChannelToken", "getChannelType", "setChannelType", "getTimeZone", "setTimeZone", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "LJiGuang_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PushBindParam {

    @NotNull
    private String channelToken;

    @NotNull
    private String channelType;

    @NotNull
    private String clientId;

    @NotNull
    private String platform;

    @NotNull
    private String timeZone;

    public PushBindParam(@NotNull String platform, @NotNull String clientId, @NotNull String channelToken, @NotNull String channelType, @NotNull String timeZone) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(channelToken, "channelToken");
        Intrinsics.checkNotNullParameter(channelType, "channelType");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        this.platform = platform;
        this.clientId = clientId;
        this.channelToken = channelToken;
        this.channelType = channelType;
        this.timeZone = timeZone;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushBindParam)) {
            return false;
        }
        PushBindParam pushBindParam = (PushBindParam) other;
        return Intrinsics.areEqual(this.platform, pushBindParam.platform) && Intrinsics.areEqual(this.clientId, pushBindParam.clientId) && Intrinsics.areEqual(this.channelToken, pushBindParam.channelToken) && Intrinsics.areEqual(this.channelType, pushBindParam.channelType) && Intrinsics.areEqual(this.timeZone, pushBindParam.timeZone);
    }

    public static /* synthetic */ PushBindParam copy$default(PushBindParam pushBindParam, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pushBindParam.platform;
        }
        if ((i11 & 2) != 0) {
            str2 = pushBindParam.clientId;
        }
        if ((i11 & 4) != 0) {
            str3 = pushBindParam.channelToken;
        }
        if ((i11 & 8) != 0) {
            str4 = pushBindParam.channelType;
        }
        if ((i11 & 16) != 0) {
            str5 = pushBindParam.timeZone;
        }
        String str6 = str5;
        String str7 = str3;
        return pushBindParam.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChannelToken() {
        return this.channelToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    @NotNull
    public final PushBindParam copy(@NotNull String platform, @NotNull String clientId, @NotNull String channelToken, @NotNull String channelType, @NotNull String timeZone) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(channelToken, "channelToken");
        Intrinsics.checkNotNullParameter(channelType, "channelType");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        return new PushBindParam(platform, clientId, channelToken, channelType, timeZone);
    }

    @NotNull
    public final String getChannelToken() {
        return this.channelToken;
    }

    @NotNull
    public final String getChannelType() {
        return this.channelType;
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    @NotNull
    public final String getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        return (((((((this.platform.hashCode() * 31) + this.clientId.hashCode()) * 31) + this.channelToken.hashCode()) * 31) + this.channelType.hashCode()) * 31) + this.timeZone.hashCode();
    }

    public final void setChannelToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.channelToken = str;
    }

    public final void setChannelType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.channelType = str;
    }

    public final void setClientId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientId = str;
    }

    public final void setPlatform(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.platform = str;
    }

    public final void setTimeZone(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timeZone = str;
    }

    @NotNull
    public String toString() {
        return "PushBindParam(platform=" + this.platform + ", clientId=" + this.clientId + ", channelToken=" + this.channelToken + ", channelType=" + this.channelType + ", timeZone=" + this.timeZone + ')';
    }

    public /* synthetic */ PushBindParam(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i11 & 16) != 0 ? "" : str5);
    }
}
