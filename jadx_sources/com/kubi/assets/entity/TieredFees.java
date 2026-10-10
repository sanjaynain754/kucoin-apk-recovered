package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DepositFee.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/assets/entity/TieredFees;", "Landroid/os/Parcelable;", "maxFee", "", "tier", "", "Lcom/kubi/assets/entity/Tier;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getMaxFee", "()Ljava/lang/String;", "getTier", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TieredFees implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TieredFees> CREATOR = new Creator();

    @Nullable
    private final String maxFee;

    @Nullable
    private final List<Tier> tier;

    /* JADX INFO: compiled from: DepositFee.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<TieredFees> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TieredFees createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            ArrayList arrayList = null;
            if (parcel.readInt() != 0) {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(parcel.readInt() == 0 ? null : Tier.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new TieredFees(string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TieredFees[] newArray(int i11) {
            return new TieredFees[i11];
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
        if (!(other instanceof TieredFees)) {
            return false;
        }
        TieredFees tieredFees = (TieredFees) other;
        return Intrinsics.areEqual(this.maxFee, tieredFees.maxFee) && Intrinsics.areEqual(this.tier, tieredFees.tier);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TieredFees copy$default(TieredFees tieredFees, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tieredFees.maxFee;
        }
        if ((i11 & 2) != 0) {
            list = tieredFees.tier;
        }
        return tieredFees.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMaxFee() {
        return this.maxFee;
    }

    @Nullable
    public final List<Tier> component2() {
        return this.tier;
    }

    @NotNull
    public final TieredFees copy(@Nullable String maxFee, @Nullable List<Tier> tier) {
        return new TieredFees(maxFee, tier);
    }

    @Nullable
    public final String getMaxFee() {
        return this.maxFee;
    }

    @Nullable
    public final List<Tier> getTier() {
        return this.tier;
    }

    public int hashCode() {
        String str = this.maxFee;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Tier> list = this.tier;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TieredFees(maxFee=" + this.maxFee + ", tier=" + this.tier + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.maxFee);
        List<Tier> list = this.tier;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        for (Tier tier : list) {
            if (tier == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                tier.writeToParcel(dest, flags);
            }
        }
    }

    public TieredFees(@Nullable String str, @Nullable List<Tier> list) {
        this.maxFee = str;
        this.tier = list;
    }
}
