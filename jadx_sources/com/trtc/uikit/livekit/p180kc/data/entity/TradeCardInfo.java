package com.trtc.uikit.livekit.p180kc.data.entity;

import android.os.SystemClock;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeCardInfo.kt */
/* JADX INFO: loaded from: classes60.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/TradeCardInfo;", "", "roomOwnerId", "", "cardType", "businessId", "version", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getRoomOwnerId", "()Ljava/lang/String;", "getCardType", "getBusinessId", "getVersion", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TradeCardInfo {

    @SerializedName("businessId")
    @Nullable
    private final String businessId;

    @SerializedName("cardType")
    @Nullable
    private final String cardType;

    @SerializedName("txUserId")
    @Nullable
    private final String roomOwnerId;
    private final transient long version;

    public TradeCardInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, long j11) {
        this.roomOwnerId = str;
        this.cardType = str2;
        this.businessId = str3;
        this.version = j11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradeCardInfo)) {
            return false;
        }
        TradeCardInfo tradeCardInfo = (TradeCardInfo) other;
        return Intrinsics.areEqual(this.roomOwnerId, tradeCardInfo.roomOwnerId) && Intrinsics.areEqual(this.cardType, tradeCardInfo.cardType) && Intrinsics.areEqual(this.businessId, tradeCardInfo.businessId) && this.version == tradeCardInfo.version;
    }

    public static /* synthetic */ TradeCardInfo copy$default(TradeCardInfo tradeCardInfo, String str, String str2, String str3, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tradeCardInfo.roomOwnerId;
        }
        if ((i11 & 2) != 0) {
            str2 = tradeCardInfo.cardType;
        }
        if ((i11 & 4) != 0) {
            str3 = tradeCardInfo.businessId;
        }
        if ((i11 & 8) != 0) {
            j11 = tradeCardInfo.version;
        }
        String str4 = str3;
        return tradeCardInfo.copy(str, str2, str4, j11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRoomOwnerId() {
        return this.roomOwnerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBusinessId() {
        return this.businessId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    @NotNull
    public final TradeCardInfo copy(@Nullable String roomOwnerId, @Nullable String cardType, @Nullable String businessId, long version) {
        return new TradeCardInfo(roomOwnerId, cardType, businessId, version);
    }

    @Nullable
    public final String getBusinessId() {
        return this.businessId;
    }

    @Nullable
    public final String getCardType() {
        return this.cardType;
    }

    @Nullable
    public final String getRoomOwnerId() {
        return this.roomOwnerId;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.roomOwnerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cardType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.businessId;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.hashCode(this.version);
    }

    @NotNull
    public String toString() {
        return "TradeCardInfo(roomOwnerId=" + this.roomOwnerId + ", cardType=" + this.cardType + ", businessId=" + this.businessId + ", version=" + this.version + ')';
    }

    public /* synthetic */ TradeCardInfo(String str, String str2, String str3, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? SystemClock.elapsedRealtime() : j11);
    }
}
