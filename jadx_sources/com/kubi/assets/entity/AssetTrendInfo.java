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
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006 "}, m90084d2 = {"Lcom/kubi/assets/entity/AssetTrendInfo;", "Landroid/os/Parcelable;", "preTotal", "", "hasGetPreTotalAsset", "", "rangeName", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getPreTotal", "()Ljava/lang/String;", "getHasGetPreTotalAsset", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRangeName", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/assets/entity/AssetTrendInfo;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AssetTrendInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AssetTrendInfo> CREATOR = new Creator();

    @Nullable
    private final Boolean hasGetPreTotalAsset;

    @Nullable
    private final String preTotal;

    @Nullable
    private final String rangeName;

    /* JADX INFO: compiled from: AssetData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<AssetTrendInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetTrendInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AssetTrendInfo(string, boolValueOf, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetTrendInfo[] newArray(int i11) {
            return new AssetTrendInfo[i11];
        }
    }

    public AssetTrendInfo() {
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
        if (!(other instanceof AssetTrendInfo)) {
            return false;
        }
        AssetTrendInfo assetTrendInfo = (AssetTrendInfo) other;
        return Intrinsics.areEqual(this.preTotal, assetTrendInfo.preTotal) && Intrinsics.areEqual(this.hasGetPreTotalAsset, assetTrendInfo.hasGetPreTotalAsset) && Intrinsics.areEqual(this.rangeName, assetTrendInfo.rangeName);
    }

    public AssetTrendInfo(@Nullable String str, @Nullable Boolean bool, @Nullable String str2) {
        this.preTotal = str;
        this.hasGetPreTotalAsset = bool;
        this.rangeName = str2;
    }

    public static /* synthetic */ AssetTrendInfo copy$default(AssetTrendInfo assetTrendInfo, String str, Boolean bool, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = assetTrendInfo.preTotal;
        }
        if ((i11 & 2) != 0) {
            bool = assetTrendInfo.hasGetPreTotalAsset;
        }
        if ((i11 & 4) != 0) {
            str2 = assetTrendInfo.rangeName;
        }
        return assetTrendInfo.copy(str, bool, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPreTotal() {
        return this.preTotal;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getHasGetPreTotalAsset() {
        return this.hasGetPreTotalAsset;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRangeName() {
        return this.rangeName;
    }

    @NotNull
    public final AssetTrendInfo copy(@Nullable String preTotal, @Nullable Boolean hasGetPreTotalAsset, @Nullable String rangeName) {
        return new AssetTrendInfo(preTotal, hasGetPreTotalAsset, rangeName);
    }

    @Nullable
    public final Boolean getHasGetPreTotalAsset() {
        return this.hasGetPreTotalAsset;
    }

    @Nullable
    public final String getPreTotal() {
        return this.preTotal;
    }

    @Nullable
    public final String getRangeName() {
        return this.rangeName;
    }

    public int hashCode() {
        String str = this.preTotal;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hasGetPreTotalAsset;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.rangeName;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AssetTrendInfo(preTotal=" + this.preTotal + ", hasGetPreTotalAsset=" + this.hasGetPreTotalAsset + ", rangeName=" + this.rangeName + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.preTotal);
        Boolean bool = this.hasGetPreTotalAsset;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            dest.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        dest.writeInt(BooleanValue);
        dest.writeString(this.rangeName);
    }

    public /* synthetic */ AssetTrendInfo(String str, Boolean bool, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : str2);
    }
}
