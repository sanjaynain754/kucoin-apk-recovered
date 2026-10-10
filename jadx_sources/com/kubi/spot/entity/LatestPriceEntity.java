package com.kubi.spot.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
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
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jz\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020'HÖ\u0001J\t\u0010-\u001a\u00020\u0006HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020'R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014¨\u00063"}, m90084d2 = {"Lcom/kubi/spot/entity/LatestPriceEntity;", "Landroid/os/Parcelable;", JPushConstants.Operation.KEY_SEQUENCE, "", "time", "symbol", "", FirebaseAnalytics.Param.PRICE, "size", "bestBid", "bestBidSize", "bestAsk", "bestAskSize", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSequence", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTime", "getSymbol", "()Ljava/lang/String;", "getPrice", "getSize", "getBestBid", "getBestBidSize", "getBestAsk", "getBestAskSize", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/spot/entity/LatestPriceEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LatestPriceEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LatestPriceEntity> CREATOR = new Creator();

    @Nullable
    private final String bestAsk;

    @Nullable
    private final String bestAskSize;

    @Nullable
    private final String bestBid;

    @Nullable
    private final String bestBidSize;

    @Nullable
    private final String price;

    @Nullable
    private final Long sequence;

    @Nullable
    private final String size;

    @Nullable
    private final String symbol;

    @Nullable
    private final Long time;

    /* JADX INFO: compiled from: LatestPriceEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<LatestPriceEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LatestPriceEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LatestPriceEntity(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LatestPriceEntity[] newArray(int i11) {
            return new LatestPriceEntity[i11];
        }
    }

    public LatestPriceEntity() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LatestPriceEntity)) {
            return false;
        }
        LatestPriceEntity latestPriceEntity = (LatestPriceEntity) other;
        return Intrinsics.areEqual(this.sequence, latestPriceEntity.sequence) && Intrinsics.areEqual(this.time, latestPriceEntity.time) && Intrinsics.areEqual(this.symbol, latestPriceEntity.symbol) && Intrinsics.areEqual(this.price, latestPriceEntity.price) && Intrinsics.areEqual(this.size, latestPriceEntity.size) && Intrinsics.areEqual(this.bestBid, latestPriceEntity.bestBid) && Intrinsics.areEqual(this.bestBidSize, latestPriceEntity.bestBidSize) && Intrinsics.areEqual(this.bestAsk, latestPriceEntity.bestAsk) && Intrinsics.areEqual(this.bestAskSize, latestPriceEntity.bestAskSize);
    }

    public LatestPriceEntity(@Nullable Long l11, @Nullable Long l12, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.sequence = l11;
        this.time = l12;
        this.symbol = str;
        this.price = str2;
        this.size = str3;
        this.bestBid = str4;
        this.bestBidSize = str5;
        this.bestAsk = str6;
        this.bestAskSize = str7;
    }

    public static /* synthetic */ LatestPriceEntity copy$default(LatestPriceEntity latestPriceEntity, Long l11, Long l12, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = latestPriceEntity.sequence;
        }
        if ((i11 & 2) != 0) {
            l12 = latestPriceEntity.time;
        }
        if ((i11 & 4) != 0) {
            str = latestPriceEntity.symbol;
        }
        if ((i11 & 8) != 0) {
            str2 = latestPriceEntity.price;
        }
        if ((i11 & 16) != 0) {
            str3 = latestPriceEntity.size;
        }
        if ((i11 & 32) != 0) {
            str4 = latestPriceEntity.bestBid;
        }
        if ((i11 & 64) != 0) {
            str5 = latestPriceEntity.bestBidSize;
        }
        if ((i11 & 128) != 0) {
            str6 = latestPriceEntity.bestAsk;
        }
        if ((i11 & 256) != 0) {
            str7 = latestPriceEntity.bestAskSize;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        String str12 = str3;
        String str13 = str;
        return latestPriceEntity.copy(l11, l12, str13, str2, str12, str10, str11, str8, str9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getSequence() {
        return this.sequence;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBestBid() {
        return this.bestBid;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBestBidSize() {
        return this.bestBidSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBestAsk() {
        return this.bestAsk;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBestAskSize() {
        return this.bestAskSize;
    }

    @NotNull
    public final LatestPriceEntity copy(@Nullable Long sequence, @Nullable Long time, @Nullable String symbol, @Nullable String price, @Nullable String size, @Nullable String bestBid, @Nullable String bestBidSize, @Nullable String bestAsk, @Nullable String bestAskSize) {
        return new LatestPriceEntity(sequence, time, symbol, price, size, bestBid, bestBidSize, bestAsk, bestAskSize);
    }

    @Nullable
    public final String getBestAsk() {
        return this.bestAsk;
    }

    @Nullable
    public final String getBestAskSize() {
        return this.bestAskSize;
    }

    @Nullable
    public final String getBestBid() {
        return this.bestBid;
    }

    @Nullable
    public final String getBestBidSize() {
        return this.bestBidSize;
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
    public final String getSize() {
        return this.size;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    public int hashCode() {
        Long l11 = this.sequence;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Long l12 = this.time;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str = this.symbol;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.price;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.size;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bestBid;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bestBidSize;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bestAsk;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.bestAskSize;
        return iHashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LatestPriceEntity(sequence=" + this.sequence + ", time=" + this.time + ", symbol=" + this.symbol + ", price=" + this.price + ", size=" + this.size + ", bestBid=" + this.bestBid + ", bestBidSize=" + this.bestBidSize + ", bestAsk=" + this.bestAsk + ", bestAskSize=" + this.bestAskSize + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l11 = this.sequence;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.time;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeString(this.symbol);
        dest.writeString(this.price);
        dest.writeString(this.size);
        dest.writeString(this.bestBid);
        dest.writeString(this.bestBidSize);
        dest.writeString(this.bestAsk);
        dest.writeString(this.bestAskSize);
    }

    public /* synthetic */ LatestPriceEntity(Long l11, Long l12, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : l12, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : str7);
    }
}
