package com.kubi.kumex.data.market.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RecentDealEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jq\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u00102\u001a\u000203J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000203HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001J\u0016\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u000203R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001e\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013¨\u0006?"}, m90084d2 = {"Lcom/kubi/kumex/data/market/model/RecentDealEntity;", "Landroid/os/Parcelable;", "tradeId", "", "makerOrderId", "takerOrderId", JPushConstants.Operation.KEY_SEQUENCE, "", "side", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "size", "timestamp", "currentSymbol", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;JLjava/lang/String;)V", "getTradeId", "()Ljava/lang/String;", "setTradeId", "(Ljava/lang/String;)V", "getMakerOrderId", "setMakerOrderId", "getTakerOrderId", "setTakerOrderId", "getSequence", "()J", "setSequence", "(J)V", "getSide", "setSide", "getPrice", "()Ljava/math/BigDecimal;", "setPrice", "(Ljava/math/BigDecimal;)V", "getSize", "setSize", "getTimestamp", "setTimestamp", "getCurrentSymbol", "setCurrentSymbol", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RecentDealEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RecentDealEntity> CREATOR = new C15786a();

    @Nullable
    private String currentSymbol;

    @Nullable
    private String makerOrderId;

    @Nullable
    private BigDecimal price;
    private long sequence;

    @Nullable
    private String side;

    @Nullable
    private BigDecimal size;

    @Nullable
    private String takerOrderId;

    @SerializedName("ts")
    private long timestamp;

    @Nullable
    private String tradeId;

    /* JADX INFO: renamed from: com.kubi.kumex.data.market.model.RecentDealEntity$a */
    /* JADX INFO: compiled from: RecentDealEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15786a implements Parcelable.Creator<RecentDealEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecentDealEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecentDealEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RecentDealEntity[] newArray(int i11) {
            return new RecentDealEntity[i11];
        }
    }

    public RecentDealEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, long j11, @Nullable String str4, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, long j12, @Nullable String str5) {
        this.tradeId = str;
        this.makerOrderId = str2;
        this.takerOrderId = str3;
        this.sequence = j11;
        this.side = str4;
        this.price = bigDecimal;
        this.size = bigDecimal2;
        this.timestamp = j12;
        this.currentSymbol = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentDealEntity)) {
            return false;
        }
        RecentDealEntity recentDealEntity = (RecentDealEntity) other;
        return Intrinsics.areEqual(this.tradeId, recentDealEntity.tradeId) && Intrinsics.areEqual(this.makerOrderId, recentDealEntity.makerOrderId) && Intrinsics.areEqual(this.takerOrderId, recentDealEntity.takerOrderId) && this.sequence == recentDealEntity.sequence && Intrinsics.areEqual(this.side, recentDealEntity.side) && Intrinsics.areEqual(this.price, recentDealEntity.price) && Intrinsics.areEqual(this.size, recentDealEntity.size) && this.timestamp == recentDealEntity.timestamp && Intrinsics.areEqual(this.currentSymbol, recentDealEntity.currentSymbol);
    }

    public static /* synthetic */ RecentDealEntity copy$default(RecentDealEntity recentDealEntity, String str, String str2, String str3, long j11, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, long j12, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = recentDealEntity.tradeId;
        }
        if ((i11 & 2) != 0) {
            str2 = recentDealEntity.makerOrderId;
        }
        if ((i11 & 4) != 0) {
            str3 = recentDealEntity.takerOrderId;
        }
        if ((i11 & 8) != 0) {
            j11 = recentDealEntity.sequence;
        }
        if ((i11 & 16) != 0) {
            str4 = recentDealEntity.side;
        }
        if ((i11 & 32) != 0) {
            bigDecimal = recentDealEntity.price;
        }
        if ((i11 & 64) != 0) {
            bigDecimal2 = recentDealEntity.size;
        }
        if ((i11 & 128) != 0) {
            j12 = recentDealEntity.timestamp;
        }
        if ((i11 & 256) != 0) {
            str5 = recentDealEntity.currentSymbol;
        }
        String str6 = str5;
        BigDecimal bigDecimal3 = bigDecimal2;
        String str7 = str4;
        long j13 = j11;
        String str8 = str3;
        return recentDealEntity.copy(str, str2, str8, j13, str7, bigDecimal, bigDecimal3, j12, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTradeId() {
        return this.tradeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMakerOrderId() {
        return this.makerOrderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTakerOrderId() {
        return this.takerOrderId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getSequence() {
        return this.sequence;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCurrentSymbol() {
        return this.currentSymbol;
    }

    @NotNull
    public final RecentDealEntity copy(@Nullable String tradeId, @Nullable String makerOrderId, @Nullable String takerOrderId, long sequence, @Nullable String side, @Nullable BigDecimal price, @Nullable BigDecimal size, long timestamp, @Nullable String currentSymbol) {
        return new RecentDealEntity(tradeId, makerOrderId, takerOrderId, sequence, side, price, size, timestamp, currentSymbol);
    }

    @Nullable
    public final String getCurrentSymbol() {
        return this.currentSymbol;
    }

    @Nullable
    public final String getMakerOrderId() {
        return this.makerOrderId;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    public final long getSequence() {
        return this.sequence;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    public final String getTakerOrderId() {
        return this.takerOrderId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getTradeId() {
        return this.tradeId;
    }

    public int hashCode() {
        String str = this.tradeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.makerOrderId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.takerOrderId;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Long.hashCode(this.sequence)) * 31;
        String str4 = this.side;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal = this.price;
        int iHashCode5 = (iHashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.size;
        int iHashCode6 = (((iHashCode5 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + Long.hashCode(this.timestamp)) * 31;
        String str5 = this.currentSymbol;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setCurrentSymbol(@Nullable String str) {
        this.currentSymbol = str;
    }

    public final void setMakerOrderId(@Nullable String str) {
        this.makerOrderId = str;
    }

    public final void setPrice(@Nullable BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    public final void setSequence(long j11) {
        this.sequence = j11;
    }

    public final void setSide(@Nullable String str) {
        this.side = str;
    }

    public final void setSize(@Nullable BigDecimal bigDecimal) {
        this.size = bigDecimal;
    }

    public final void setTakerOrderId(@Nullable String str) {
        this.takerOrderId = str;
    }

    public final void setTimestamp(long j11) {
        this.timestamp = j11;
    }

    public final void setTradeId(@Nullable String str) {
        this.tradeId = str;
    }

    @NotNull
    public String toString() {
        return "RecentDealEntity(tradeId=" + this.tradeId + ", makerOrderId=" + this.makerOrderId + ", takerOrderId=" + this.takerOrderId + ", sequence=" + this.sequence + ", side=" + this.side + ", price=" + this.price + ", size=" + this.size + ", timestamp=" + this.timestamp + ", currentSymbol=" + this.currentSymbol + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.tradeId);
        dest.writeString(this.makerOrderId);
        dest.writeString(this.takerOrderId);
        dest.writeLong(this.sequence);
        dest.writeString(this.side);
        dest.writeSerializable(this.price);
        dest.writeSerializable(this.size);
        dest.writeLong(this.timestamp);
        dest.writeString(this.currentSymbol);
    }

    public /* synthetic */ RecentDealEntity(String str, String str2, String str3, long j11, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, long j12, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j11, str4, (i11 & 32) != 0 ? null : bigDecimal, (i11 & 64) != 0 ? null : bigDecimal2, j12, (i11 & 256) != 0 ? null : str5);
    }
}
