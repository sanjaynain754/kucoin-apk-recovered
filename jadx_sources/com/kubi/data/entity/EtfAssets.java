package com.kubi.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EtfEntity.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/data/entity/EtfAssets;", "Landroid/os/Parcelable;", "assetSize", "", "assetType", "assetName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAssetSize", "()Ljava/lang/String;", "getAssetType", "getAssetName", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EtfAssets implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EtfAssets> CREATOR = new Creator();

    @Nullable
    private final String assetName;

    @Nullable
    private final String assetSize;

    @Nullable
    private final String assetType;

    /* JADX INFO: compiled from: EtfEntity.kt */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<EtfAssets> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EtfAssets createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EtfAssets(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EtfAssets[] newArray(int i11) {
            return new EtfAssets[i11];
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
        if (!(other instanceof EtfAssets)) {
            return false;
        }
        EtfAssets etfAssets = (EtfAssets) other;
        return Intrinsics.areEqual(this.assetSize, etfAssets.assetSize) && Intrinsics.areEqual(this.assetType, etfAssets.assetType) && Intrinsics.areEqual(this.assetName, etfAssets.assetName);
    }

    public static /* synthetic */ EtfAssets copy$default(EtfAssets etfAssets, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = etfAssets.assetSize;
        }
        if ((i11 & 2) != 0) {
            str2 = etfAssets.assetType;
        }
        if ((i11 & 4) != 0) {
            str3 = etfAssets.assetName;
        }
        return etfAssets.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAssetSize() {
        return this.assetSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAssetType() {
        return this.assetType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAssetName() {
        return this.assetName;
    }

    @NotNull
    public final EtfAssets copy(@Nullable String assetSize, @Nullable String assetType, @Nullable String assetName) {
        return new EtfAssets(assetSize, assetType, assetName);
    }

    @Nullable
    public final String getAssetName() {
        return this.assetName;
    }

    @Nullable
    public final String getAssetSize() {
        return this.assetSize;
    }

    @Nullable
    public final String getAssetType() {
        return this.assetType;
    }

    public int hashCode() {
        String str = this.assetSize;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.assetType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.assetName;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EtfAssets(assetSize=" + this.assetSize + ", assetType=" + this.assetType + ", assetName=" + this.assetName + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.assetSize);
        dest.writeString(this.assetType);
        dest.writeString(this.assetName);
    }

    public EtfAssets(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.assetSize = str;
        this.assetType = str2;
        this.assetName = str3;
    }
}
