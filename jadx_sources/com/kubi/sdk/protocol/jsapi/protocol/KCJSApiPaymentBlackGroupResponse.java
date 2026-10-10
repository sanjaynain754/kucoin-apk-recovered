package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiPaymentModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentBlackGroupResponse;", "", "expireAt", "", AppsFlyerProperties.CHANNEL, "", "groupCode", "freezeContent", "freezeHelpUrl", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "getExpireAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFreezeContent", "getFreezeHelpUrl", "getGroupCode", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentBlackGroupResponse;", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiPaymentBlackGroupResponse {

    @Nullable
    private final String channel;

    @Nullable
    private final Long expireAt;

    @Nullable
    private final String freezeContent;

    @Nullable
    private final String freezeHelpUrl;

    @Nullable
    private final String groupCode;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiPaymentBlackGroupResponse)) {
            return false;
        }
        KCJSApiPaymentBlackGroupResponse kCJSApiPaymentBlackGroupResponse = (KCJSApiPaymentBlackGroupResponse) other;
        return Intrinsics.areEqual(this.expireAt, kCJSApiPaymentBlackGroupResponse.expireAt) && Intrinsics.areEqual(this.channel, kCJSApiPaymentBlackGroupResponse.channel) && Intrinsics.areEqual(this.groupCode, kCJSApiPaymentBlackGroupResponse.groupCode) && Intrinsics.areEqual(this.freezeContent, kCJSApiPaymentBlackGroupResponse.freezeContent) && Intrinsics.areEqual(this.freezeHelpUrl, kCJSApiPaymentBlackGroupResponse.freezeHelpUrl);
    }

    public static /* synthetic */ KCJSApiPaymentBlackGroupResponse copy$default(KCJSApiPaymentBlackGroupResponse kCJSApiPaymentBlackGroupResponse, Long l11, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = kCJSApiPaymentBlackGroupResponse.expireAt;
        }
        if ((i11 & 2) != 0) {
            str = kCJSApiPaymentBlackGroupResponse.channel;
        }
        if ((i11 & 4) != 0) {
            str2 = kCJSApiPaymentBlackGroupResponse.groupCode;
        }
        if ((i11 & 8) != 0) {
            str3 = kCJSApiPaymentBlackGroupResponse.freezeContent;
        }
        if ((i11 & 16) != 0) {
            str4 = kCJSApiPaymentBlackGroupResponse.freezeHelpUrl;
        }
        String str5 = str4;
        String str6 = str2;
        return kCJSApiPaymentBlackGroupResponse.copy(l11, str, str6, str3, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getExpireAt() {
        return this.expireAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGroupCode() {
        return this.groupCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFreezeContent() {
        return this.freezeContent;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFreezeHelpUrl() {
        return this.freezeHelpUrl;
    }

    @NotNull
    public final KCJSApiPaymentBlackGroupResponse copy(@Nullable Long expireAt, @Nullable String channel, @Nullable String groupCode, @Nullable String freezeContent, @Nullable String freezeHelpUrl) {
        return new KCJSApiPaymentBlackGroupResponse(expireAt, channel, groupCode, freezeContent, freezeHelpUrl);
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final Long getExpireAt() {
        return this.expireAt;
    }

    @Nullable
    public final String getFreezeContent() {
        return this.freezeContent;
    }

    @Nullable
    public final String getFreezeHelpUrl() {
        return this.freezeHelpUrl;
    }

    @Nullable
    public final String getGroupCode() {
        return this.groupCode;
    }

    public int hashCode() {
        Long l11 = this.expireAt;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.channel;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.groupCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.freezeContent;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.freezeHelpUrl;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KCJSApiPaymentBlackGroupResponse(expireAt=" + this.expireAt + ", channel=" + this.channel + ", groupCode=" + this.groupCode + ", freezeContent=" + this.freezeContent + ", freezeHelpUrl=" + this.freezeHelpUrl + ')';
    }

    public KCJSApiPaymentBlackGroupResponse(@Nullable Long l11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.expireAt = l11;
        this.channel = str;
        this.groupCode = str2;
        this.freezeContent = str3;
        this.freezeHelpUrl = str4;
    }
}
