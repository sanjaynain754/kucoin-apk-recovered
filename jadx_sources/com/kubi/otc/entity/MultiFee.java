package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FastBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/otc/entity/MultiFee;", "Landroid/os/Parcelable;", "tips", "", "feeMsg", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTips", "()Ljava/lang/String;", "setTips", "(Ljava/lang/String;)V", "getFeeMsg", "setFeeMsg", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MultiFee implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MultiFee> CREATOR = new Creator();

    @SerializedName("feeMsg")
    @Nullable
    private String feeMsg;

    @SerializedName("tips")
    @Nullable
    private String tips;

    /* JADX INFO: compiled from: FastBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<MultiFee> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MultiFee createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MultiFee(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MultiFee[] newArray(int i11) {
            return new MultiFee[i11];
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
        if (!(other instanceof MultiFee)) {
            return false;
        }
        MultiFee multiFee = (MultiFee) other;
        return Intrinsics.areEqual(this.tips, multiFee.tips) && Intrinsics.areEqual(this.feeMsg, multiFee.feeMsg);
    }

    public static /* synthetic */ MultiFee copy$default(MultiFee multiFee, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = multiFee.tips;
        }
        if ((i11 & 2) != 0) {
            str2 = multiFee.feeMsg;
        }
        return multiFee.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFeeMsg() {
        return this.feeMsg;
    }

    @NotNull
    public final MultiFee copy(@Nullable String tips, @Nullable String feeMsg) {
        return new MultiFee(tips, feeMsg);
    }

    @Nullable
    public final String getFeeMsg() {
        return this.feeMsg;
    }

    @Nullable
    public final String getTips() {
        return this.tips;
    }

    public int hashCode() {
        String str = this.tips;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.feeMsg;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setFeeMsg(@Nullable String str) {
        this.feeMsg = str;
    }

    public final void setTips(@Nullable String str) {
        this.tips = str;
    }

    @NotNull
    public String toString() {
        return "MultiFee(tips=" + this.tips + ", feeMsg=" + this.feeMsg + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.tips);
        dest.writeString(this.feeMsg);
    }

    public MultiFee(@Nullable String str, @Nullable String str2) {
        this.tips = str;
        this.feeMsg = str2;
    }
}
