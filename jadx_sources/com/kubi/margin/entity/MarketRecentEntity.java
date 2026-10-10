package com.kubi.margin.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketRecentEntity.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, m90084d2 = {"Lcom/kubi/margin/entity/MarketRecentEntity;", "Landroid/os/Parcelable;", JPushConstants.Operation.KEY_SEQUENCE, "", "time", "size", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.PRICE, "side", "", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getSequence", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTime", "getSize", "()Ljava/math/BigDecimal;", "getPrice", "getSide", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;)Lcom/kubi/margin/entity/MarketRecentEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketRecentEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarketRecentEntity> CREATOR = new C17627a();

    @Nullable
    private final BigDecimal price;

    @Nullable
    private final Long sequence;

    @Nullable
    private final String side;

    @Nullable
    private final BigDecimal size;

    @Nullable
    private final Long time;

    /* JADX INFO: renamed from: com.kubi.margin.entity.MarketRecentEntity$a */
    /* JADX INFO: compiled from: MarketRecentEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17627a implements Parcelable.Creator<MarketRecentEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarketRecentEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarketRecentEntity(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarketRecentEntity[] newArray(int i11) {
            return new MarketRecentEntity[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketRecentEntity)) {
            return false;
        }
        MarketRecentEntity marketRecentEntity = (MarketRecentEntity) other;
        return Intrinsics.areEqual(this.sequence, marketRecentEntity.sequence) && Intrinsics.areEqual(this.time, marketRecentEntity.time) && Intrinsics.areEqual(this.size, marketRecentEntity.size) && Intrinsics.areEqual(this.price, marketRecentEntity.price) && Intrinsics.areEqual(this.side, marketRecentEntity.side);
    }

    public static /* synthetic */ MarketRecentEntity copy$default(MarketRecentEntity marketRecentEntity, Long l11, Long l12, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = marketRecentEntity.sequence;
        }
        if ((i11 & 2) != 0) {
            l12 = marketRecentEntity.time;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = marketRecentEntity.size;
        }
        if ((i11 & 8) != 0) {
            bigDecimal2 = marketRecentEntity.price;
        }
        if ((i11 & 16) != 0) {
            str = marketRecentEntity.side;
        }
        String str2 = str;
        BigDecimal bigDecimal3 = bigDecimal;
        return marketRecentEntity.copy(l11, l12, bigDecimal3, bigDecimal2, str2);
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
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @NotNull
    public final MarketRecentEntity copy(@Nullable Long sequence, @Nullable Long time, @Nullable BigDecimal size, @Nullable BigDecimal price, @Nullable String side) {
        return new MarketRecentEntity(sequence, time, size, price, side);
    }

    @Nullable
    public final BigDecimal getPrice() {
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
    public final BigDecimal getSize() {
        return this.size;
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
        BigDecimal bigDecimal = this.size;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.price;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.side;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarketRecentEntity(sequence=" + this.sequence + ", time=" + this.time + ", size=" + this.size + ", price=" + this.price + ", side=" + this.side + ')';
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
        dest.writeSerializable(this.size);
        dest.writeSerializable(this.price);
        dest.writeString(this.side);
    }

    public MarketRecentEntity(@Nullable Long l11, @Nullable Long l12, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str) {
        this.sequence = l11;
        this.time = l12;
        this.size = bigDecimal;
        this.price = bigDecimal2;
        this.side = str;
    }
}
