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
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0017R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, m90084d2 = {"Lcom/kubi/assets/entity/AssetData;", "Landroid/os/Parcelable;", "timestamp", "", "totalBalanceInfo", "Lcom/kubi/assets/entity/TotalBalanceInfo;", "assetTrendInfo", "Lcom/kubi/assets/entity/AssetTrendInfo;", "<init>", "(Ljava/lang/Long;Lcom/kubi/assets/entity/TotalBalanceInfo;Lcom/kubi/assets/entity/AssetTrendInfo;)V", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTotalBalanceInfo", "()Lcom/kubi/assets/entity/TotalBalanceInfo;", "getAssetTrendInfo", "()Lcom/kubi/assets/entity/AssetTrendInfo;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Lcom/kubi/assets/entity/TotalBalanceInfo;Lcom/kubi/assets/entity/AssetTrendInfo;)Lcom/kubi/assets/entity/AssetData;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AssetData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AssetData> CREATOR = new Creator();

    @Nullable
    private final AssetTrendInfo assetTrendInfo;

    @Nullable
    private final Long timestamp;

    @Nullable
    private final TotalBalanceInfo totalBalanceInfo;

    /* JADX INFO: compiled from: AssetData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<AssetData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AssetData(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : TotalBalanceInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AssetTrendInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetData[] newArray(int i11) {
            return new AssetData[i11];
        }
    }

    public AssetData() {
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
        if (!(other instanceof AssetData)) {
            return false;
        }
        AssetData assetData = (AssetData) other;
        return Intrinsics.areEqual(this.timestamp, assetData.timestamp) && Intrinsics.areEqual(this.totalBalanceInfo, assetData.totalBalanceInfo) && Intrinsics.areEqual(this.assetTrendInfo, assetData.assetTrendInfo);
    }

    public AssetData(@Nullable Long l11, @Nullable TotalBalanceInfo totalBalanceInfo, @Nullable AssetTrendInfo assetTrendInfo) {
        this.timestamp = l11;
        this.totalBalanceInfo = totalBalanceInfo;
        this.assetTrendInfo = assetTrendInfo;
    }

    public static /* synthetic */ AssetData copy$default(AssetData assetData, Long l11, TotalBalanceInfo totalBalanceInfo, AssetTrendInfo assetTrendInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = assetData.timestamp;
        }
        if ((i11 & 2) != 0) {
            totalBalanceInfo = assetData.totalBalanceInfo;
        }
        if ((i11 & 4) != 0) {
            assetTrendInfo = assetData.assetTrendInfo;
        }
        return assetData.copy(l11, totalBalanceInfo, assetTrendInfo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TotalBalanceInfo getTotalBalanceInfo() {
        return this.totalBalanceInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AssetTrendInfo getAssetTrendInfo() {
        return this.assetTrendInfo;
    }

    @NotNull
    public final AssetData copy(@Nullable Long timestamp, @Nullable TotalBalanceInfo totalBalanceInfo, @Nullable AssetTrendInfo assetTrendInfo) {
        return new AssetData(timestamp, totalBalanceInfo, assetTrendInfo);
    }

    @Nullable
    public final AssetTrendInfo getAssetTrendInfo() {
        return this.assetTrendInfo;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final TotalBalanceInfo getTotalBalanceInfo() {
        return this.totalBalanceInfo;
    }

    public int hashCode() {
        Long l11 = this.timestamp;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        TotalBalanceInfo totalBalanceInfo = this.totalBalanceInfo;
        int iHashCode2 = (iHashCode + (totalBalanceInfo == null ? 0 : totalBalanceInfo.hashCode())) * 31;
        AssetTrendInfo assetTrendInfo = this.assetTrendInfo;
        return iHashCode2 + (assetTrendInfo != null ? assetTrendInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AssetData(timestamp=" + this.timestamp + ", totalBalanceInfo=" + this.totalBalanceInfo + ", assetTrendInfo=" + this.assetTrendInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l11 = this.timestamp;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        TotalBalanceInfo totalBalanceInfo = this.totalBalanceInfo;
        if (totalBalanceInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            totalBalanceInfo.writeToParcel(dest, flags);
        }
        AssetTrendInfo assetTrendInfo = this.assetTrendInfo;
        if (assetTrendInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            assetTrendInfo.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ AssetData(Long l11, TotalBalanceInfo totalBalanceInfo, AssetTrendInfo assetTrendInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : totalBalanceInfo, (i11 & 4) != 0 ? null : assetTrendInfo);
    }
}
