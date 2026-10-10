package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: B2CEntity.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/assets/entity/B2CConfig;", "Landroid/os/Parcelable;", "autoPurchaseFromTime", "", "autoPurchaseToTime", "feeRate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAutoPurchaseFromTime", "()Ljava/lang/String;", "getAutoPurchaseToTime", "getFeeRate", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class B2CConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<B2CConfig> CREATOR = new Creator();

    @Nullable
    private final String autoPurchaseFromTime;

    @Nullable
    private final String autoPurchaseToTime;

    @Nullable
    private final String feeRate;

    /* JADX INFO: compiled from: B2CEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<B2CConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final B2CConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new B2CConfig(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final B2CConfig[] newArray(int i11) {
            return new B2CConfig[i11];
        }
    }

    public B2CConfig() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof B2CConfig)) {
            return false;
        }
        B2CConfig b2CConfig = (B2CConfig) other;
        return Intrinsics.areEqual(this.autoPurchaseFromTime, b2CConfig.autoPurchaseFromTime) && Intrinsics.areEqual(this.autoPurchaseToTime, b2CConfig.autoPurchaseToTime) && Intrinsics.areEqual(this.feeRate, b2CConfig.feeRate);
    }

    public B2CConfig(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.autoPurchaseFromTime = str;
        this.autoPurchaseToTime = str2;
        this.feeRate = str3;
    }

    public static /* synthetic */ B2CConfig copy$default(B2CConfig b2CConfig, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = b2CConfig.autoPurchaseFromTime;
        }
        if ((i11 & 2) != 0) {
            str2 = b2CConfig.autoPurchaseToTime;
        }
        if ((i11 & 4) != 0) {
            str3 = b2CConfig.feeRate;
        }
        return b2CConfig.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAutoPurchaseFromTime() {
        return this.autoPurchaseFromTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAutoPurchaseToTime() {
        return this.autoPurchaseToTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFeeRate() {
        return this.feeRate;
    }

    @NotNull
    public final B2CConfig copy(@Nullable String autoPurchaseFromTime, @Nullable String autoPurchaseToTime, @Nullable String feeRate) {
        return new B2CConfig(autoPurchaseFromTime, autoPurchaseToTime, feeRate);
    }

    @Nullable
    public final String getAutoPurchaseFromTime() {
        return this.autoPurchaseFromTime;
    }

    @Nullable
    public final String getAutoPurchaseToTime() {
        return this.autoPurchaseToTime;
    }

    @Nullable
    public final String getFeeRate() {
        return this.feeRate;
    }

    public int hashCode() {
        String str = this.autoPurchaseFromTime;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.autoPurchaseToTime;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.feeRate;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "B2CConfig(autoPurchaseFromTime=" + this.autoPurchaseFromTime + ", autoPurchaseToTime=" + this.autoPurchaseToTime + ", feeRate=" + this.feeRate + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.autoPurchaseFromTime);
        dest.writeString(this.autoPurchaseToTime);
        dest.writeString(this.feeRate);
    }

    public /* synthetic */ B2CConfig(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
