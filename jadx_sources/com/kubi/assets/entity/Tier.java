package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DepositFee.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, m90084d2 = {"Lcom/kubi/assets/entity/Tier;", "Landroid/os/Parcelable;", "max", "", "min", "tierNo", "tierRate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMax", "()Ljava/lang/String;", "getMin", "getTierNo", "getTierRate", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Tier implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Tier> CREATOR = new Creator();

    @Nullable
    private final String max;

    @Nullable
    private final String min;

    @Nullable
    private final String tierNo;

    @Nullable
    private final String tierRate;

    /* JADX INFO: compiled from: DepositFee.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<Tier> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Tier createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Tier(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Tier[] newArray(int i11) {
            return new Tier[i11];
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
        if (!(other instanceof Tier)) {
            return false;
        }
        Tier tier = (Tier) other;
        return Intrinsics.areEqual(this.max, tier.max) && Intrinsics.areEqual(this.min, tier.min) && Intrinsics.areEqual(this.tierNo, tier.tierNo) && Intrinsics.areEqual(this.tierRate, tier.tierRate);
    }

    public static /* synthetic */ Tier copy$default(Tier tier, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tier.max;
        }
        if ((i11 & 2) != 0) {
            str2 = tier.min;
        }
        if ((i11 & 4) != 0) {
            str3 = tier.tierNo;
        }
        if ((i11 & 8) != 0) {
            str4 = tier.tierRate;
        }
        return tier.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMax() {
        return this.max;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMin() {
        return this.min;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTierNo() {
        return this.tierNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTierRate() {
        return this.tierRate;
    }

    @NotNull
    public final Tier copy(@Nullable String max, @Nullable String min, @Nullable String tierNo, @Nullable String tierRate) {
        return new Tier(max, min, tierNo, tierRate);
    }

    @Nullable
    public final String getMax() {
        return this.max;
    }

    @Nullable
    public final String getMin() {
        return this.min;
    }

    @Nullable
    public final String getTierNo() {
        return this.tierNo;
    }

    @Nullable
    public final String getTierRate() {
        return this.tierRate;
    }

    public int hashCode() {
        String str = this.max;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.min;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tierNo;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tierRate;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Tier(max=" + this.max + ", min=" + this.min + ", tierNo=" + this.tierNo + ", tierRate=" + this.tierRate + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.max);
        dest.writeString(this.min);
        dest.writeString(this.tierNo);
        dest.writeString(this.tierRate);
    }

    public Tier(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.max = str;
        this.min = str2;
        this.tierNo = str3;
        this.tierRate = str4;
    }
}
