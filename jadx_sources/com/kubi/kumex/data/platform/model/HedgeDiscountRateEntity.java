package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HedgeDiscountRateEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/HedgeDiscountRateEntity;", "Landroid/os/Parcelable;", "mmhedgeRate", "Ljava/math/BigDecimal;", "imhedgeRate", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getMmhedgeRate", "()Ljava/math/BigDecimal;", "getImhedgeRate", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class HedgeDiscountRateEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HedgeDiscountRateEntity> CREATOR = new C15810a();

    @Nullable
    private final BigDecimal imhedgeRate;

    @Nullable
    private final BigDecimal mmhedgeRate;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.HedgeDiscountRateEntity$a */
    /* JADX INFO: compiled from: HedgeDiscountRateEntity.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15810a implements Parcelable.Creator<HedgeDiscountRateEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HedgeDiscountRateEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HedgeDiscountRateEntity((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HedgeDiscountRateEntity[] newArray(int i11) {
            return new HedgeDiscountRateEntity[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HedgeDiscountRateEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HedgeDiscountRateEntity)) {
            return false;
        }
        HedgeDiscountRateEntity hedgeDiscountRateEntity = (HedgeDiscountRateEntity) other;
        return Intrinsics.areEqual(this.mmhedgeRate, hedgeDiscountRateEntity.mmhedgeRate) && Intrinsics.areEqual(this.imhedgeRate, hedgeDiscountRateEntity.imhedgeRate);
    }

    public HedgeDiscountRateEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        this.mmhedgeRate = bigDecimal;
        this.imhedgeRate = bigDecimal2;
    }

    public static /* synthetic */ HedgeDiscountRateEntity copy$default(HedgeDiscountRateEntity hedgeDiscountRateEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = hedgeDiscountRateEntity.mmhedgeRate;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = hedgeDiscountRateEntity.imhedgeRate;
        }
        return hedgeDiscountRateEntity.copy(bigDecimal, bigDecimal2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getMmhedgeRate() {
        return this.mmhedgeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getImhedgeRate() {
        return this.imhedgeRate;
    }

    @NotNull
    public final HedgeDiscountRateEntity copy(@Nullable BigDecimal mmhedgeRate, @Nullable BigDecimal imhedgeRate) {
        return new HedgeDiscountRateEntity(mmhedgeRate, imhedgeRate);
    }

    @Nullable
    public final BigDecimal getImhedgeRate() {
        return this.imhedgeRate;
    }

    @Nullable
    public final BigDecimal getMmhedgeRate() {
        return this.mmhedgeRate;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.mmhedgeRate;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.imhedgeRate;
        return iHashCode + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HedgeDiscountRateEntity(mmhedgeRate=" + this.mmhedgeRate + ", imhedgeRate=" + this.imhedgeRate + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.mmhedgeRate);
        dest.writeSerializable(this.imhedgeRate);
    }

    public /* synthetic */ HedgeDiscountRateEntity(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2);
    }
}
