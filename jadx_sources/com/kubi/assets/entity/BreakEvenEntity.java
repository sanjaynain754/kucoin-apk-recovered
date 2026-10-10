package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/assets/entity/BreakEvenEntity;", "Landroid/os/Parcelable;", "earning", "Ljava/math/BigDecimal;", "rate", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getEarning", "()Ljava/math/BigDecimal;", "setEarning", "(Ljava/math/BigDecimal;)V", "getRate", "setRate", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BreakEvenEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BreakEvenEntity> CREATOR = new Creator();

    @Nullable
    private BigDecimal earning;

    @Nullable
    private BigDecimal rate;

    /* JADX INFO: compiled from: AssetEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<BreakEvenEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BreakEvenEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BreakEvenEntity((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BreakEvenEntity[] newArray(int i11) {
            return new BreakEvenEntity[i11];
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
        if (!(other instanceof BreakEvenEntity)) {
            return false;
        }
        BreakEvenEntity breakEvenEntity = (BreakEvenEntity) other;
        return Intrinsics.areEqual(this.earning, breakEvenEntity.earning) && Intrinsics.areEqual(this.rate, breakEvenEntity.rate);
    }

    public static /* synthetic */ BreakEvenEntity copy$default(BreakEvenEntity breakEvenEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = breakEvenEntity.earning;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = breakEvenEntity.rate;
        }
        return breakEvenEntity.copy(bigDecimal, bigDecimal2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getEarning() {
        return this.earning;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getRate() {
        return this.rate;
    }

    @NotNull
    public final BreakEvenEntity copy(@Nullable BigDecimal earning, @Nullable BigDecimal rate) {
        return new BreakEvenEntity(earning, rate);
    }

    @Nullable
    public final BigDecimal getEarning() {
        return this.earning;
    }

    @Nullable
    public final BigDecimal getRate() {
        return this.rate;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.earning;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.rate;
        return iHashCode + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    public final void setEarning(@Nullable BigDecimal bigDecimal) {
        this.earning = bigDecimal;
    }

    public final void setRate(@Nullable BigDecimal bigDecimal) {
        this.rate = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "BreakEvenEntity(earning=" + this.earning + ", rate=" + this.rate + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.earning);
        dest.writeSerializable(this.rate);
    }

    public BreakEvenEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        this.earning = bigDecimal;
        this.rate = bigDecimal2;
    }
}
