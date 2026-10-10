package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AlphaChainInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\""}, m90084d2 = {"Lcom/kubi/assets/entity/AlphaChainInfo;", "Landroid/os/Parcelable;", "externalChain", "", "displayChain", "chainIcon", "isSelected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getExternalChain", "()Ljava/lang/String;", "getDisplayChain", "getChainIcon", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AlphaChainInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AlphaChainInfo> CREATOR = new Creator();

    @Nullable
    private final String chainIcon;

    @Nullable
    private final String displayChain;

    @Nullable
    private final String externalChain;
    private boolean isSelected;

    /* JADX INFO: compiled from: AlphaChainInfo.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<AlphaChainInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlphaChainInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AlphaChainInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlphaChainInfo[] newArray(int i11) {
            return new AlphaChainInfo[i11];
        }
    }

    public AlphaChainInfo() {
        this(null, null, null, false, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlphaChainInfo)) {
            return false;
        }
        AlphaChainInfo alphaChainInfo = (AlphaChainInfo) other;
        return Intrinsics.areEqual(this.externalChain, alphaChainInfo.externalChain) && Intrinsics.areEqual(this.displayChain, alphaChainInfo.displayChain) && Intrinsics.areEqual(this.chainIcon, alphaChainInfo.chainIcon) && this.isSelected == alphaChainInfo.isSelected;
    }

    public AlphaChainInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z11) {
        this.externalChain = str;
        this.displayChain = str2;
        this.chainIcon = str3;
        this.isSelected = z11;
    }

    public static /* synthetic */ AlphaChainInfo copy$default(AlphaChainInfo alphaChainInfo, String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = alphaChainInfo.externalChain;
        }
        if ((i11 & 2) != 0) {
            str2 = alphaChainInfo.displayChain;
        }
        if ((i11 & 4) != 0) {
            str3 = alphaChainInfo.chainIcon;
        }
        if ((i11 & 8) != 0) {
            z11 = alphaChainInfo.isSelected;
        }
        return alphaChainInfo.copy(str, str2, str3, z11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExternalChain() {
        return this.externalChain;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayChain() {
        return this.displayChain;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChainIcon() {
        return this.chainIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public final AlphaChainInfo copy(@Nullable String externalChain, @Nullable String displayChain, @Nullable String chainIcon, boolean isSelected) {
        return new AlphaChainInfo(externalChain, displayChain, chainIcon, isSelected);
    }

    @Nullable
    public final String getChainIcon() {
        return this.chainIcon;
    }

    @Nullable
    public final String getDisplayChain() {
        return this.displayChain;
    }

    @Nullable
    public final String getExternalChain() {
        return this.externalChain;
    }

    public int hashCode() {
        String str = this.externalChain;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayChain;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chainIcon;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSelected);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z11) {
        this.isSelected = z11;
    }

    @NotNull
    public String toString() {
        return "AlphaChainInfo(externalChain=" + this.externalChain + ", displayChain=" + this.displayChain + ", chainIcon=" + this.chainIcon + ", isSelected=" + this.isSelected + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.externalChain);
        dest.writeString(this.displayChain);
        dest.writeString(this.chainIcon);
        dest.writeInt(this.isSelected ? 1 : 0);
    }

    public /* synthetic */ AlphaChainInfo(String str, String str2, String str3, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? false : z11);
    }
}
