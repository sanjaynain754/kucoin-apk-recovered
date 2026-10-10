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
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/assets/entity/FeeContent;", "Landroid/os/Parcelable;", "feeRate", "", "maxFee", "fixFee", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFeeRate", "()Ljava/lang/String;", "getMaxFee", "getFixFee", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FeeContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FeeContent> CREATOR = new Creator();

    @Nullable
    private final String feeRate;

    @Nullable
    private final String fixFee;

    @Nullable
    private final String maxFee;

    /* JADX INFO: compiled from: DepositFee.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FeeContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeeContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FeeContent(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeeContent[] newArray(int i11) {
            return new FeeContent[i11];
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
        if (!(other instanceof FeeContent)) {
            return false;
        }
        FeeContent feeContent = (FeeContent) other;
        return Intrinsics.areEqual(this.feeRate, feeContent.feeRate) && Intrinsics.areEqual(this.maxFee, feeContent.maxFee) && Intrinsics.areEqual(this.fixFee, feeContent.fixFee);
    }

    public static /* synthetic */ FeeContent copy$default(FeeContent feeContent, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = feeContent.feeRate;
        }
        if ((i11 & 2) != 0) {
            str2 = feeContent.maxFee;
        }
        if ((i11 & 4) != 0) {
            str3 = feeContent.fixFee;
        }
        return feeContent.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFeeRate() {
        return this.feeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMaxFee() {
        return this.maxFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFixFee() {
        return this.fixFee;
    }

    @NotNull
    public final FeeContent copy(@Nullable String feeRate, @Nullable String maxFee, @Nullable String fixFee) {
        return new FeeContent(feeRate, maxFee, fixFee);
    }

    @Nullable
    public final String getFeeRate() {
        return this.feeRate;
    }

    @Nullable
    public final String getFixFee() {
        return this.fixFee;
    }

    @Nullable
    public final String getMaxFee() {
        return this.maxFee;
    }

    public int hashCode() {
        String str = this.feeRate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.maxFee;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fixFee;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FeeContent(feeRate=" + this.feeRate + ", maxFee=" + this.maxFee + ", fixFee=" + this.fixFee + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.feeRate);
        dest.writeString(this.maxFee);
        dest.writeString(this.fixFee);
    }

    public FeeContent(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.feeRate = str;
        this.maxFee = str2;
        this.fixFee = str3;
    }
}
