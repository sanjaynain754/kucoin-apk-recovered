package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccountDetailFreezeEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001a\u001a\u00020\tHÆ\u0003JH\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006)"}, m90084d2 = {"Lcom/kubi/assets/entity/FreezeData;", "Landroid/os/Parcelable;", "amount", "", "symbol", FirebaseAnalytics.Param.CURRENCY, "operateTime", "", "isHideLine", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Z)V", "getAmount", "()Ljava/lang/String;", "getSymbol", "getCurrency", "getOperateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Z", "setHideLine", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Z)Lcom/kubi/assets/entity/FreezeData;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FreezeData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreezeData> CREATOR = new Creator();

    @Nullable
    private final String amount;

    @Nullable
    private final String currency;
    private boolean isHideLine;

    @Nullable
    private final Long operateTime;

    @Nullable
    private final String symbol;

    /* JADX INFO: compiled from: AccountDetailFreezeEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FreezeData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FreezeData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreezeData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FreezeData[] newArray(int i11) {
            return new FreezeData[i11];
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
        if (!(other instanceof FreezeData)) {
            return false;
        }
        FreezeData freezeData = (FreezeData) other;
        return Intrinsics.areEqual(this.amount, freezeData.amount) && Intrinsics.areEqual(this.symbol, freezeData.symbol) && Intrinsics.areEqual(this.currency, freezeData.currency) && Intrinsics.areEqual(this.operateTime, freezeData.operateTime) && this.isHideLine == freezeData.isHideLine;
    }

    public static /* synthetic */ FreezeData copy$default(FreezeData freezeData, String str, String str2, String str3, Long l11, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = freezeData.amount;
        }
        if ((i11 & 2) != 0) {
            str2 = freezeData.symbol;
        }
        if ((i11 & 4) != 0) {
            str3 = freezeData.currency;
        }
        if ((i11 & 8) != 0) {
            l11 = freezeData.operateTime;
        }
        if ((i11 & 16) != 0) {
            z11 = freezeData.isHideLine;
        }
        boolean z12 = z11;
        String str4 = str3;
        return freezeData.copy(str, str2, str4, l11, z12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getOperateTime() {
        return this.operateTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsHideLine() {
        return this.isHideLine;
    }

    @NotNull
    public final FreezeData copy(@Nullable String amount, @Nullable String symbol, @Nullable String currency, @Nullable Long operateTime, boolean isHideLine) {
        return new FreezeData(amount, symbol, currency, operateTime, isHideLine);
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Long getOperateTime() {
        return this.operateTime;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.amount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.operateTime;
        return ((iHashCode3 + (l11 != null ? l11.hashCode() : 0)) * 31) + Boolean.hashCode(this.isHideLine);
    }

    public final boolean isHideLine() {
        return this.isHideLine;
    }

    public final void setHideLine(boolean z11) {
        this.isHideLine = z11;
    }

    @NotNull
    public String toString() {
        return "FreezeData(amount=" + this.amount + ", symbol=" + this.symbol + ", currency=" + this.currency + ", operateTime=" + this.operateTime + ", isHideLine=" + this.isHideLine + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.amount);
        dest.writeString(this.symbol);
        dest.writeString(this.currency);
        Long l11 = this.operateTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeInt(this.isHideLine ? 1 : 0);
    }

    public FreezeData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l11, boolean z11) {
        this.amount = str;
        this.symbol = str2;
        this.currency = str3;
        this.operateTime = l11;
        this.isHideLine = z11;
    }
}
