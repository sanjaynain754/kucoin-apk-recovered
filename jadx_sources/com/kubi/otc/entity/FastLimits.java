package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FastBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006!"}, m90084d2 = {"Lcom/kubi/otc/entity/FastLimits;", "Landroid/os/Parcelable;", "legalMin", "Ljava/math/BigDecimal;", "legalMax", "coinMin", "coinMax", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getLegalMin", "()Ljava/math/BigDecimal;", "getLegalMax", "getCoinMin", "getCoinMax", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FastLimits implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FastLimits> CREATOR = new Creator();

    @Nullable
    private final BigDecimal coinMax;

    @Nullable
    private final BigDecimal coinMin;

    @Nullable
    private final BigDecimal legalMax;

    @Nullable
    private final BigDecimal legalMin;

    /* JADX INFO: compiled from: FastBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FastLimits> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FastLimits createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FastLimits((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FastLimits[] newArray(int i11) {
            return new FastLimits[i11];
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
        if (!(other instanceof FastLimits)) {
            return false;
        }
        FastLimits fastLimits = (FastLimits) other;
        return Intrinsics.areEqual(this.legalMin, fastLimits.legalMin) && Intrinsics.areEqual(this.legalMax, fastLimits.legalMax) && Intrinsics.areEqual(this.coinMin, fastLimits.coinMin) && Intrinsics.areEqual(this.coinMax, fastLimits.coinMax);
    }

    public static /* synthetic */ FastLimits copy$default(FastLimits fastLimits, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = fastLimits.legalMin;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = fastLimits.legalMax;
        }
        if ((i11 & 4) != 0) {
            bigDecimal3 = fastLimits.coinMin;
        }
        if ((i11 & 8) != 0) {
            bigDecimal4 = fastLimits.coinMax;
        }
        return fastLimits.copy(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getLegalMin() {
        return this.legalMin;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getLegalMax() {
        return this.legalMax;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getCoinMin() {
        return this.coinMin;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getCoinMax() {
        return this.coinMax;
    }

    @NotNull
    public final FastLimits copy(@Nullable BigDecimal legalMin, @Nullable BigDecimal legalMax, @Nullable BigDecimal coinMin, @Nullable BigDecimal coinMax) {
        return new FastLimits(legalMin, legalMax, coinMin, coinMax);
    }

    @Nullable
    public final BigDecimal getCoinMax() {
        return this.coinMax;
    }

    @Nullable
    public final BigDecimal getCoinMin() {
        return this.coinMin;
    }

    @Nullable
    public final BigDecimal getLegalMax() {
        return this.legalMax;
    }

    @Nullable
    public final BigDecimal getLegalMin() {
        return this.legalMin;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.legalMin;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.legalMax;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.coinMin;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.coinMax;
        return iHashCode3 + (bigDecimal4 != null ? bigDecimal4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FastLimits(legalMin=" + this.legalMin + ", legalMax=" + this.legalMax + ", coinMin=" + this.coinMin + ", coinMax=" + this.coinMax + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.legalMin);
        dest.writeSerializable(this.legalMax);
        dest.writeSerializable(this.coinMin);
        dest.writeSerializable(this.coinMax);
    }

    public FastLimits(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4) {
        this.legalMin = bigDecimal;
        this.legalMax = bigDecimal2;
        this.coinMin = bigDecimal3;
        this.coinMax = bigDecimal4;
    }
}
