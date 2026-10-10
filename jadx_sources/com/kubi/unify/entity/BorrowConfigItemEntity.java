package com.kubi.unify.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifyEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\bJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006'"}, m90084d2 = {"Lcom/kubi/unify/entity/BorrowConfigItemEntity;", "Landroid/os/Parcelable;", "maxLeverage", "Ljava/math/BigDecimal;", "min", "max", "mmr", "tier", "", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)V", "getMaxLeverage", "()Ljava/math/BigDecimal;", "getMin", "getMax", "getMmr", "getTier", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)Lcom/kubi/unify/entity/BorrowConfigItemEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BorrowConfigItemEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BorrowConfigItemEntity> CREATOR = new C26507a();

    @Nullable
    private final BigDecimal max;

    @Nullable
    private final BigDecimal maxLeverage;

    @Nullable
    private final BigDecimal min;

    @Nullable
    private final BigDecimal mmr;

    @Nullable
    private final Integer tier;

    /* JADX INFO: renamed from: com.kubi.unify.entity.BorrowConfigItemEntity$a */
    /* JADX INFO: compiled from: UnifyEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26507a implements Parcelable.Creator<BorrowConfigItemEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BorrowConfigItemEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BorrowConfigItemEntity((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BorrowConfigItemEntity[] newArray(int i11) {
            return new BorrowConfigItemEntity[i11];
        }
    }

    public BorrowConfigItemEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable Integer num) {
        this.maxLeverage = bigDecimal;
        this.min = bigDecimal2;
        this.max = bigDecimal3;
        this.mmr = bigDecimal4;
        this.tier = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorrowConfigItemEntity)) {
            return false;
        }
        BorrowConfigItemEntity borrowConfigItemEntity = (BorrowConfigItemEntity) other;
        return Intrinsics.areEqual(this.maxLeverage, borrowConfigItemEntity.maxLeverage) && Intrinsics.areEqual(this.min, borrowConfigItemEntity.min) && Intrinsics.areEqual(this.max, borrowConfigItemEntity.max) && Intrinsics.areEqual(this.mmr, borrowConfigItemEntity.mmr) && Intrinsics.areEqual(this.tier, borrowConfigItemEntity.tier);
    }

    public static /* synthetic */ BorrowConfigItemEntity copy$default(BorrowConfigItemEntity borrowConfigItemEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = borrowConfigItemEntity.maxLeverage;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = borrowConfigItemEntity.min;
        }
        if ((i11 & 4) != 0) {
            bigDecimal3 = borrowConfigItemEntity.max;
        }
        if ((i11 & 8) != 0) {
            bigDecimal4 = borrowConfigItemEntity.mmr;
        }
        if ((i11 & 16) != 0) {
            num = borrowConfigItemEntity.tier;
        }
        Integer num2 = num;
        BigDecimal bigDecimal5 = bigDecimal3;
        return borrowConfigItemEntity.copy(bigDecimal, bigDecimal2, bigDecimal5, bigDecimal4, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getMin() {
        return this.min;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getMax() {
        return this.max;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getMmr() {
        return this.mmr;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getTier() {
        return this.tier;
    }

    @NotNull
    public final BorrowConfigItemEntity copy(@Nullable BigDecimal maxLeverage, @Nullable BigDecimal min, @Nullable BigDecimal max, @Nullable BigDecimal mmr, @Nullable Integer tier) {
        return new BorrowConfigItemEntity(maxLeverage, min, max, mmr, tier);
    }

    @Nullable
    public final BigDecimal getMax() {
        return this.max;
    }

    @Nullable
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    public final BigDecimal getMin() {
        return this.min;
    }

    @Nullable
    public final BigDecimal getMmr() {
        return this.mmr;
    }

    @Nullable
    public final Integer getTier() {
        return this.tier;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.maxLeverage;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.min;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.max;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.mmr;
        int iHashCode4 = (iHashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        Integer num = this.tier;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BorrowConfigItemEntity(maxLeverage=" + this.maxLeverage + ", min=" + this.min + ", max=" + this.max + ", mmr=" + this.mmr + ", tier=" + this.tier + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.maxLeverage);
        dest.writeSerializable(this.min);
        dest.writeSerializable(this.max);
        dest.writeSerializable(this.mmr);
        Integer num = this.tier;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public /* synthetic */ BorrowConfigItemEntity(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, (i11 & 16) != 0 ? 1 : num);
    }
}
