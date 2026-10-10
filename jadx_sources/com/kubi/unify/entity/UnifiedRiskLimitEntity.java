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
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003JV\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020\u0003J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014¨\u00062"}, m90084d2 = {"Lcom/kubi/unify/entity/UnifiedRiskLimitEntity;", "Landroid/os/Parcelable;", "tier", "", "max", "Ljava/math/BigDecimal;", "min", "maxLeverage", "imr", "mmr", "<init>", "(Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getTier", "()Ljava/lang/Integer;", "setTier", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMax", "()Ljava/math/BigDecimal;", "setMax", "(Ljava/math/BigDecimal;)V", "getMin", "setMin", "getMaxLeverage", "setMaxLeverage", "getImr", "setImr", "getMmr", "setMmr", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/unify/entity/UnifiedRiskLimitEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifiedRiskLimitEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UnifiedRiskLimitEntity> CREATOR = new C26515a();

    @Nullable
    private BigDecimal imr;

    @Nullable
    private BigDecimal max;

    @Nullable
    private BigDecimal maxLeverage;

    @Nullable
    private BigDecimal min;

    @Nullable
    private BigDecimal mmr;

    @Nullable
    private Integer tier;

    /* JADX INFO: renamed from: com.kubi.unify.entity.UnifiedRiskLimitEntity$a */
    /* JADX INFO: compiled from: UnifyEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26515a implements Parcelable.Creator<UnifiedRiskLimitEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UnifiedRiskLimitEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UnifiedRiskLimitEntity(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UnifiedRiskLimitEntity[] newArray(int i11) {
            return new UnifiedRiskLimitEntity[i11];
        }
    }

    public UnifiedRiskLimitEntity() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ UnifiedRiskLimitEntity copy$default(UnifiedRiskLimitEntity unifiedRiskLimitEntity, Integer num, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = unifiedRiskLimitEntity.tier;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = unifiedRiskLimitEntity.max;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = unifiedRiskLimitEntity.min;
        }
        if ((i11 & 8) != 0) {
            bigDecimal3 = unifiedRiskLimitEntity.maxLeverage;
        }
        if ((i11 & 16) != 0) {
            bigDecimal4 = unifiedRiskLimitEntity.imr;
        }
        if ((i11 & 32) != 0) {
            bigDecimal5 = unifiedRiskLimitEntity.mmr;
        }
        BigDecimal bigDecimal6 = bigDecimal4;
        BigDecimal bigDecimal7 = bigDecimal5;
        return unifiedRiskLimitEntity.copy(num, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal6, bigDecimal7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedRiskLimitEntity)) {
            return false;
        }
        UnifiedRiskLimitEntity unifiedRiskLimitEntity = (UnifiedRiskLimitEntity) other;
        return Intrinsics.areEqual(this.tier, unifiedRiskLimitEntity.tier) && Intrinsics.areEqual(this.max, unifiedRiskLimitEntity.max) && Intrinsics.areEqual(this.min, unifiedRiskLimitEntity.min) && Intrinsics.areEqual(this.maxLeverage, unifiedRiskLimitEntity.maxLeverage) && Intrinsics.areEqual(this.imr, unifiedRiskLimitEntity.imr) && Intrinsics.areEqual(this.mmr, unifiedRiskLimitEntity.mmr);
    }

    public UnifiedRiskLimitEntity(@Nullable Integer num, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5) {
        this.tier = num;
        this.max = bigDecimal;
        this.min = bigDecimal2;
        this.maxLeverage = bigDecimal3;
        this.imr = bigDecimal4;
        this.mmr = bigDecimal5;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getTier() {
        return this.tier;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getMax() {
        return this.max;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getMin() {
        return this.min;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getImr() {
        return this.imr;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getMmr() {
        return this.mmr;
    }

    @NotNull
    public final UnifiedRiskLimitEntity copy(@Nullable Integer tier, @Nullable BigDecimal max, @Nullable BigDecimal min, @Nullable BigDecimal maxLeverage, @Nullable BigDecimal imr, @Nullable BigDecimal mmr) {
        return new UnifiedRiskLimitEntity(tier, max, min, maxLeverage, imr, mmr);
    }

    @Nullable
    public final BigDecimal getImr() {
        return this.imr;
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
        Integer num = this.tier;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        BigDecimal bigDecimal = this.max;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.min;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.maxLeverage;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.imr;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.mmr;
        return iHashCode5 + (bigDecimal5 != null ? bigDecimal5.hashCode() : 0);
    }

    public final void setImr(@Nullable BigDecimal bigDecimal) {
        this.imr = bigDecimal;
    }

    public final void setMax(@Nullable BigDecimal bigDecimal) {
        this.max = bigDecimal;
    }

    public final void setMaxLeverage(@Nullable BigDecimal bigDecimal) {
        this.maxLeverage = bigDecimal;
    }

    public final void setMin(@Nullable BigDecimal bigDecimal) {
        this.min = bigDecimal;
    }

    public final void setMmr(@Nullable BigDecimal bigDecimal) {
        this.mmr = bigDecimal;
    }

    public final void setTier(@Nullable Integer num) {
        this.tier = num;
    }

    @NotNull
    public String toString() {
        return "UnifiedRiskLimitEntity(tier=" + this.tier + ", max=" + this.max + ", min=" + this.min + ", maxLeverage=" + this.maxLeverage + ", imr=" + this.imr + ", mmr=" + this.mmr + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.tier;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeSerializable(this.max);
        dest.writeSerializable(this.min);
        dest.writeSerializable(this.maxLeverage);
        dest.writeSerializable(this.imr);
        dest.writeSerializable(this.mmr);
    }

    public /* synthetic */ UnifiedRiskLimitEntity(Integer num, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : bigDecimal3, (i11 & 16) != 0 ? null : bigDecimal4, (i11 & 32) != 0 ? null : bigDecimal5);
    }
}
