package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/assets/entity/TotalBalanceInfo;", "Landroid/os/Parcelable;", "balanceCurrency", "", "totalBalance", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBalanceCurrency", "()Ljava/lang/String;", "getTotalBalance", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TotalBalanceInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TotalBalanceInfo> CREATOR = new Creator();

    @Nullable
    private final String balanceCurrency;

    @Nullable
    private final String totalBalance;

    /* JADX INFO: compiled from: AssetData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<TotalBalanceInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TotalBalanceInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TotalBalanceInfo(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TotalBalanceInfo[] newArray(int i11) {
            return new TotalBalanceInfo[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TotalBalanceInfo() {
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
        if (!(other instanceof TotalBalanceInfo)) {
            return false;
        }
        TotalBalanceInfo totalBalanceInfo = (TotalBalanceInfo) other;
        return Intrinsics.areEqual(this.balanceCurrency, totalBalanceInfo.balanceCurrency) && Intrinsics.areEqual(this.totalBalance, totalBalanceInfo.totalBalance);
    }

    public TotalBalanceInfo(@Nullable String str, @Nullable String str2) {
        this.balanceCurrency = str;
        this.totalBalance = str2;
    }

    public static /* synthetic */ TotalBalanceInfo copy$default(TotalBalanceInfo totalBalanceInfo, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = totalBalanceInfo.balanceCurrency;
        }
        if ((i11 & 2) != 0) {
            str2 = totalBalanceInfo.totalBalance;
        }
        return totalBalanceInfo.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBalanceCurrency() {
        return this.balanceCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    @NotNull
    public final TotalBalanceInfo copy(@Nullable String balanceCurrency, @Nullable String totalBalance) {
        return new TotalBalanceInfo(balanceCurrency, totalBalance);
    }

    @Nullable
    public final String getBalanceCurrency() {
        return this.balanceCurrency;
    }

    @Nullable
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    public int hashCode() {
        String str = this.balanceCurrency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.totalBalance;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TotalBalanceInfo(balanceCurrency=" + this.balanceCurrency + ", totalBalance=" + this.totalBalance + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.balanceCurrency);
        dest.writeString(this.totalBalance);
    }

    public /* synthetic */ TotalBalanceInfo(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
