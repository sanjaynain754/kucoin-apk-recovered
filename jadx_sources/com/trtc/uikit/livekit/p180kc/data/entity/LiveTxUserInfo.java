package com.trtc.uikit.livekit.p180kc.data.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiveTxUserInfo.kt */
/* JADX INFO: loaded from: classes60.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/LiveTxUserInfo;", "", "txUserSig", "", "txUserId", "sdkAppId", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getTxUserSig", "()Ljava/lang/String;", "getTxUserId", "getSdkAppId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/trtc/uikit/livekit/kc/data/entity/LiveTxUserInfo;", "equals", "", "other", "hashCode", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LiveTxUserInfo {

    @SerializedName("sdkAppId")
    @Nullable
    private final Integer sdkAppId;

    @SerializedName("txUserId")
    @Nullable
    private final String txUserId;

    @SerializedName("txUserSig")
    @Nullable
    private final String txUserSig;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveTxUserInfo)) {
            return false;
        }
        LiveTxUserInfo liveTxUserInfo = (LiveTxUserInfo) other;
        return Intrinsics.areEqual(this.txUserSig, liveTxUserInfo.txUserSig) && Intrinsics.areEqual(this.txUserId, liveTxUserInfo.txUserId) && Intrinsics.areEqual(this.sdkAppId, liveTxUserInfo.sdkAppId);
    }

    public static /* synthetic */ LiveTxUserInfo copy$default(LiveTxUserInfo liveTxUserInfo, String str, String str2, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = liveTxUserInfo.txUserSig;
        }
        if ((i11 & 2) != 0) {
            str2 = liveTxUserInfo.txUserId;
        }
        if ((i11 & 4) != 0) {
            num = liveTxUserInfo.sdkAppId;
        }
        return liveTxUserInfo.copy(str, str2, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTxUserSig() {
        return this.txUserSig;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTxUserId() {
        return this.txUserId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getSdkAppId() {
        return this.sdkAppId;
    }

    @NotNull
    public final LiveTxUserInfo copy(@Nullable String txUserSig, @Nullable String txUserId, @Nullable Integer sdkAppId) {
        return new LiveTxUserInfo(txUserSig, txUserId, sdkAppId);
    }

    @Nullable
    public final Integer getSdkAppId() {
        return this.sdkAppId;
    }

    @Nullable
    public final String getTxUserId() {
        return this.txUserId;
    }

    @Nullable
    public final String getTxUserSig() {
        return this.txUserSig;
    }

    public int hashCode() {
        String str = this.txUserSig;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.txUserId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.sdkAppId;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LiveTxUserInfo(txUserSig=" + this.txUserSig + ", txUserId=" + this.txUserId + ", sdkAppId=" + this.sdkAppId + ')';
    }

    public LiveTxUserInfo(@Nullable String str, @Nullable String str2, @Nullable Integer num) {
        this.txUserSig = str;
        this.txUserId = str2;
        this.sdkAppId = num;
    }
}
