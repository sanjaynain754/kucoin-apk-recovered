package com.kubi.tradebase.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CurrencyBalance.kt */
/* JADX INFO: loaded from: classes48.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/tradebase/entity/AssetsCollateralRatio;", "Landroid/os/Parcelable;", "minVal", "Ljava/math/BigDecimal;", "maxVal", "ratio", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getMinVal", "()Ljava/math/BigDecimal;", "getMaxVal", "getRatio", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeBaseApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AssetsCollateralRatio implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AssetsCollateralRatio> CREATOR = new C25886a();

    @Nullable
    private final BigDecimal maxVal;

    @Nullable
    private final BigDecimal minVal;

    @Nullable
    private final BigDecimal ratio;

    /* JADX INFO: renamed from: com.kubi.tradebase.entity.AssetsCollateralRatio$a */
    /* JADX INFO: compiled from: CurrencyBalance.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25886a implements Parcelable.Creator<AssetsCollateralRatio> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AssetsCollateralRatio createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AssetsCollateralRatio((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AssetsCollateralRatio[] newArray(int i11) {
            return new AssetsCollateralRatio[i11];
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
        if (!(other instanceof AssetsCollateralRatio)) {
            return false;
        }
        AssetsCollateralRatio assetsCollateralRatio = (AssetsCollateralRatio) other;
        return Intrinsics.areEqual(this.minVal, assetsCollateralRatio.minVal) && Intrinsics.areEqual(this.maxVal, assetsCollateralRatio.maxVal) && Intrinsics.areEqual(this.ratio, assetsCollateralRatio.ratio);
    }

    public static /* synthetic */ AssetsCollateralRatio copy$default(AssetsCollateralRatio assetsCollateralRatio, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = assetsCollateralRatio.minVal;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = assetsCollateralRatio.maxVal;
        }
        if ((i11 & 4) != 0) {
            bigDecimal3 = assetsCollateralRatio.ratio;
        }
        return assetsCollateralRatio.copy(bigDecimal, bigDecimal2, bigDecimal3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getMinVal() {
        return this.minVal;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getMaxVal() {
        return this.maxVal;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getRatio() {
        return this.ratio;
    }

    @NotNull
    public final AssetsCollateralRatio copy(@Nullable BigDecimal minVal, @Nullable BigDecimal maxVal, @Nullable BigDecimal ratio) {
        return new AssetsCollateralRatio(minVal, maxVal, ratio);
    }

    @Nullable
    public final BigDecimal getMaxVal() {
        return this.maxVal;
    }

    @Nullable
    public final BigDecimal getMinVal() {
        return this.minVal;
    }

    @Nullable
    public final BigDecimal getRatio() {
        return this.ratio;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.minVal;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.maxVal;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.ratio;
        return iHashCode2 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AssetsCollateralRatio(minVal=" + this.minVal + ", maxVal=" + this.maxVal + ", ratio=" + this.ratio + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.minVal);
        dest.writeSerializable(this.maxVal);
        dest.writeSerializable(this.ratio);
    }

    public AssetsCollateralRatio(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3) {
        this.minVal = bigDecimal;
        this.maxVal = bigDecimal2;
        this.ratio = bigDecimal3;
    }
}
