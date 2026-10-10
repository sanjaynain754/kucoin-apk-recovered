package com.kubi.spot.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LatestPriceEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b#\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0086\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020*HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020*R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u00066"}, m90084d2 = {"Lcom/kubi/spot/entity/LatestPriceWsEntity;", "Landroid/os/Parcelable;", "makerOrderId", "", FirebaseAnalytics.Param.PRICE, JPushConstants.Operation.KEY_SEQUENCE, "", "side", "size", "symbol", "takerOrderId", "time", "tradeId", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMakerOrderId", "()Ljava/lang/String;", "getPrice", "getSequence", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSide", "getSize", "getSymbol", "getTakerOrderId", "getTime", "getTradeId", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/spot/entity/LatestPriceWsEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LatestPriceWsEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LatestPriceWsEntity> CREATOR = new Creator();

    @Nullable
    private final String makerOrderId;

    @Nullable
    private final String price;

    @Nullable
    private final Long sequence;

    @Nullable
    private final String side;

    @Nullable
    private final String size;

    @Nullable
    private final String symbol;

    @Nullable
    private final String takerOrderId;

    @Nullable
    private final String time;

    @Nullable
    private final String tradeId;

    @Nullable
    private final String type;

    /* JADX INFO: compiled from: LatestPriceEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<LatestPriceWsEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LatestPriceWsEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LatestPriceWsEntity(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LatestPriceWsEntity[] newArray(int i11) {
            return new LatestPriceWsEntity[i11];
        }
    }

    public LatestPriceWsEntity() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LatestPriceWsEntity)) {
            return false;
        }
        LatestPriceWsEntity latestPriceWsEntity = (LatestPriceWsEntity) other;
        return Intrinsics.areEqual(this.makerOrderId, latestPriceWsEntity.makerOrderId) && Intrinsics.areEqual(this.price, latestPriceWsEntity.price) && Intrinsics.areEqual(this.sequence, latestPriceWsEntity.sequence) && Intrinsics.areEqual(this.side, latestPriceWsEntity.side) && Intrinsics.areEqual(this.size, latestPriceWsEntity.size) && Intrinsics.areEqual(this.symbol, latestPriceWsEntity.symbol) && Intrinsics.areEqual(this.takerOrderId, latestPriceWsEntity.takerOrderId) && Intrinsics.areEqual(this.time, latestPriceWsEntity.time) && Intrinsics.areEqual(this.tradeId, latestPriceWsEntity.tradeId) && Intrinsics.areEqual(this.type, latestPriceWsEntity.type);
    }

    public LatestPriceWsEntity(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.makerOrderId = str;
        this.price = str2;
        this.sequence = l11;
        this.side = str3;
        this.size = str4;
        this.symbol = str5;
        this.takerOrderId = str6;
        this.time = str7;
        this.tradeId = str8;
        this.type = str9;
    }

    public static /* synthetic */ LatestPriceWsEntity copy$default(LatestPriceWsEntity latestPriceWsEntity, String str, String str2, Long l11, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = latestPriceWsEntity.makerOrderId;
        }
        if ((i11 & 2) != 0) {
            str2 = latestPriceWsEntity.price;
        }
        if ((i11 & 4) != 0) {
            l11 = latestPriceWsEntity.sequence;
        }
        if ((i11 & 8) != 0) {
            str3 = latestPriceWsEntity.side;
        }
        if ((i11 & 16) != 0) {
            str4 = latestPriceWsEntity.size;
        }
        if ((i11 & 32) != 0) {
            str5 = latestPriceWsEntity.symbol;
        }
        if ((i11 & 64) != 0) {
            str6 = latestPriceWsEntity.takerOrderId;
        }
        if ((i11 & 128) != 0) {
            str7 = latestPriceWsEntity.time;
        }
        if ((i11 & 256) != 0) {
            str8 = latestPriceWsEntity.tradeId;
        }
        if ((i11 & 512) != 0) {
            str9 = latestPriceWsEntity.type;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str4;
        String str15 = str5;
        return latestPriceWsEntity.copy(str, str2, l11, str3, str14, str15, str12, str13, str10, str11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMakerOrderId() {
        return this.makerOrderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getSequence() {
        return this.sequence;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTakerOrderId() {
        return this.takerOrderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTradeId() {
        return this.tradeId;
    }

    @NotNull
    public final LatestPriceWsEntity copy(@Nullable String makerOrderId, @Nullable String price, @Nullable Long sequence, @Nullable String side, @Nullable String size, @Nullable String symbol, @Nullable String takerOrderId, @Nullable String time, @Nullable String tradeId, @Nullable String type) {
        return new LatestPriceWsEntity(makerOrderId, price, sequence, side, size, symbol, takerOrderId, time, tradeId, type);
    }

    @Nullable
    public final String getMakerOrderId() {
        return this.makerOrderId;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final Long getSequence() {
        return this.sequence;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final String getSize() {
        return this.size;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getTakerOrderId() {
        return this.takerOrderId;
    }

    @Nullable
    public final String getTime() {
        return this.time;
    }

    @Nullable
    public final String getTradeId() {
        return this.tradeId;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.makerOrderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.price;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.sequence;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.side;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.size;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.symbol;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.takerOrderId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.time;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.tradeId;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.type;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LatestPriceWsEntity(makerOrderId=" + this.makerOrderId + ", price=" + this.price + ", sequence=" + this.sequence + ", side=" + this.side + ", size=" + this.size + ", symbol=" + this.symbol + ", takerOrderId=" + this.takerOrderId + ", time=" + this.time + ", tradeId=" + this.tradeId + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.makerOrderId);
        dest.writeString(this.price);
        Long l11 = this.sequence;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.side);
        dest.writeString(this.size);
        dest.writeString(this.symbol);
        dest.writeString(this.takerOrderId);
        dest.writeString(this.time);
        dest.writeString(this.tradeId);
        dest.writeString(this.type);
    }

    public /* synthetic */ LatestPriceWsEntity(String str, String str2, Long l11, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : str8, (i11 & 512) != 0 ? null : str9);
    }
}
