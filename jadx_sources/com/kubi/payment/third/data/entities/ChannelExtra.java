package com.kubi.payment.third.data.entities;

import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThirdOrder.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, m90084d2 = {"Lcom/kubi/payment/third/data/entities/ChannelExtra;", "", "timestamp", "", TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE, RemoteConfigConstants.RequestFieldKey.APP_ID, "appUid", "appUrl", "appKey", "appEmail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTimestamp", "()Ljava/lang/String;", "getSignature", "getAppId", "getAppUid", "getAppUrl", "getAppKey", "getAppEmail", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChannelExtra {

    @SerializedName("appEmail")
    @Nullable
    private final String appEmail;

    @SerializedName(RemoteConfigConstants.RequestFieldKey.APP_ID)
    @Nullable
    private final String appId;

    @SerializedName("appKey")
    @Nullable
    private final String appKey;

    @SerializedName("appUid")
    @Nullable
    private final String appUid;

    @SerializedName("appUrl")
    @Nullable
    private final String appUrl;

    @SerializedName(TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE)
    @Nullable
    private final String signature;

    @SerializedName("timestamp")
    @Nullable
    private final String timestamp;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelExtra)) {
            return false;
        }
        ChannelExtra channelExtra = (ChannelExtra) other;
        return Intrinsics.areEqual(this.timestamp, channelExtra.timestamp) && Intrinsics.areEqual(this.signature, channelExtra.signature) && Intrinsics.areEqual(this.appId, channelExtra.appId) && Intrinsics.areEqual(this.appUid, channelExtra.appUid) && Intrinsics.areEqual(this.appUrl, channelExtra.appUrl) && Intrinsics.areEqual(this.appKey, channelExtra.appKey) && Intrinsics.areEqual(this.appEmail, channelExtra.appEmail);
    }

    public static /* synthetic */ ChannelExtra copy$default(ChannelExtra channelExtra, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = channelExtra.timestamp;
        }
        if ((i11 & 2) != 0) {
            str2 = channelExtra.signature;
        }
        if ((i11 & 4) != 0) {
            str3 = channelExtra.appId;
        }
        if ((i11 & 8) != 0) {
            str4 = channelExtra.appUid;
        }
        if ((i11 & 16) != 0) {
            str5 = channelExtra.appUrl;
        }
        if ((i11 & 32) != 0) {
            str6 = channelExtra.appKey;
        }
        if ((i11 & 64) != 0) {
            str7 = channelExtra.appEmail;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return channelExtra.copy(str, str2, str11, str4, str10, str8, str9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppUid() {
        return this.appUid;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAppUrl() {
        return this.appUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAppKey() {
        return this.appKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAppEmail() {
        return this.appEmail;
    }

    @NotNull
    public final ChannelExtra copy(@Nullable String timestamp, @Nullable String signature, @Nullable String appId, @Nullable String appUid, @Nullable String appUrl, @Nullable String appKey, @Nullable String appEmail) {
        return new ChannelExtra(timestamp, signature, appId, appUid, appUrl, appKey, appEmail);
    }

    @Nullable
    public final String getAppEmail() {
        return this.appEmail;
    }

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    @Nullable
    public final String getAppKey() {
        return this.appKey;
    }

    @Nullable
    public final String getAppUid() {
        return this.appUid;
    }

    @Nullable
    public final String getAppUrl() {
        return this.appUrl;
    }

    @Nullable
    public final String getSignature() {
        return this.signature;
    }

    @Nullable
    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        String str = this.timestamp;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.signature;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appUid;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.appUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.appKey;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.appEmail;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ChannelExtra(timestamp=" + this.timestamp + ", signature=" + this.signature + ", appId=" + this.appId + ", appUid=" + this.appUid + ", appUrl=" + this.appUrl + ", appKey=" + this.appKey + ", appEmail=" + this.appEmail + ')';
    }

    public ChannelExtra(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.timestamp = str;
        this.signature = str2;
        this.appId = str3;
        this.appUid = str4;
        this.appUrl = str5;
        this.appKey = str6;
        this.appEmail = str7;
    }
}
