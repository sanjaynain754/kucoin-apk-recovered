package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FastBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/otc/entity/FastRechargePaymentModel;", "Landroid/os/Parcelable;", "channelId", "", "usd2UsdcRate", "usdc2UsdRate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getUsd2UsdcRate", "getUsdc2UsdRate", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FastRechargePaymentModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FastRechargePaymentModel> CREATOR = new Creator();

    @Nullable
    private final String channelId;

    @Nullable
    private final String usd2UsdcRate;

    @Nullable
    private final String usdc2UsdRate;

    /* JADX INFO: compiled from: FastBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FastRechargePaymentModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FastRechargePaymentModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FastRechargePaymentModel(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FastRechargePaymentModel[] newArray(int i11) {
            return new FastRechargePaymentModel[i11];
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
        if (!(other instanceof FastRechargePaymentModel)) {
            return false;
        }
        FastRechargePaymentModel fastRechargePaymentModel = (FastRechargePaymentModel) other;
        return Intrinsics.areEqual(this.channelId, fastRechargePaymentModel.channelId) && Intrinsics.areEqual(this.usd2UsdcRate, fastRechargePaymentModel.usd2UsdcRate) && Intrinsics.areEqual(this.usdc2UsdRate, fastRechargePaymentModel.usdc2UsdRate);
    }

    public static /* synthetic */ FastRechargePaymentModel copy$default(FastRechargePaymentModel fastRechargePaymentModel, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fastRechargePaymentModel.channelId;
        }
        if ((i11 & 2) != 0) {
            str2 = fastRechargePaymentModel.usd2UsdcRate;
        }
        if ((i11 & 4) != 0) {
            str3 = fastRechargePaymentModel.usdc2UsdRate;
        }
        return fastRechargePaymentModel.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUsd2UsdcRate() {
        return this.usd2UsdcRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUsdc2UsdRate() {
        return this.usdc2UsdRate;
    }

    @NotNull
    public final FastRechargePaymentModel copy(@Nullable String channelId, @Nullable String usd2UsdcRate, @Nullable String usdc2UsdRate) {
        return new FastRechargePaymentModel(channelId, usd2UsdcRate, usdc2UsdRate);
    }

    @Nullable
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    public final String getUsd2UsdcRate() {
        return this.usd2UsdcRate;
    }

    @Nullable
    public final String getUsdc2UsdRate() {
        return this.usdc2UsdRate;
    }

    public int hashCode() {
        String str = this.channelId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.usd2UsdcRate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.usdc2UsdRate;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FastRechargePaymentModel(channelId=" + this.channelId + ", usd2UsdcRate=" + this.usd2UsdcRate + ", usdc2UsdRate=" + this.usdc2UsdRate + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.channelId);
        dest.writeString(this.usd2UsdcRate);
        dest.writeString(this.usdc2UsdRate);
    }

    public FastRechargePaymentModel(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.channelId = str;
        this.usd2UsdcRate = str2;
        this.usdc2UsdRate = str3;
    }
}
