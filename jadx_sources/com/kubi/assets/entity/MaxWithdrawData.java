package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MaxWithdrawData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/assets/entity/MaxWithdrawData;", "Landroid/os/Parcelable;", "maxWithdraw", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getMaxWithdraw", "()Ljava/math/BigDecimal;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MaxWithdrawData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MaxWithdrawData> CREATOR = new Creator();

    @Nullable
    private final BigDecimal maxWithdraw;

    /* JADX INFO: compiled from: MaxWithdrawData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<MaxWithdrawData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MaxWithdrawData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MaxWithdrawData((BigDecimal) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MaxWithdrawData[] newArray(int i11) {
            return new MaxWithdrawData[i11];
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
        return (other instanceof MaxWithdrawData) && Intrinsics.areEqual(this.maxWithdraw, ((MaxWithdrawData) other).maxWithdraw);
    }

    public static /* synthetic */ MaxWithdrawData copy$default(MaxWithdrawData maxWithdrawData, BigDecimal bigDecimal, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = maxWithdrawData.maxWithdraw;
        }
        return maxWithdrawData.copy(bigDecimal);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getMaxWithdraw() {
        return this.maxWithdraw;
    }

    @NotNull
    public final MaxWithdrawData copy(@Nullable BigDecimal maxWithdraw) {
        return new MaxWithdrawData(maxWithdraw);
    }

    @Nullable
    public final BigDecimal getMaxWithdraw() {
        return this.maxWithdraw;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.maxWithdraw;
        if (bigDecimal == null) {
            return 0;
        }
        return bigDecimal.hashCode();
    }

    @NotNull
    public String toString() {
        return "MaxWithdrawData(maxWithdraw=" + this.maxWithdraw + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.maxWithdraw);
    }

    public MaxWithdrawData(@Nullable BigDecimal bigDecimal) {
        this.maxWithdraw = bigDecimal;
    }
}
