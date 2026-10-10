package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015JJ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020!HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020!R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0007\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006,"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatCapitualChannelMode;", "Landroid/os/Parcelable;", "channelId", "", "fiatCurrency", "minFiatAmount", "maxFiatAmount", "isWithdraw", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getChannelId", "()Ljava/lang/String;", "setChannelId", "(Ljava/lang/String;)V", "getFiatCurrency", "setFiatCurrency", "getMinFiatAmount", "setMinFiatAmount", "getMaxFiatAmount", "setMaxFiatAmount", "()Ljava/lang/Boolean;", "setWithdraw", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/otc/entity/FiatCapitualChannelMode;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatCapitualChannelMode implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FiatCapitualChannelMode> CREATOR = new Creator();

    @Nullable
    private String channelId;

    @Nullable
    private String fiatCurrency;

    @Nullable
    private Boolean isWithdraw;

    @Nullable
    private String maxFiatAmount;

    @Nullable
    private String minFiatAmount;

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FiatCapitualChannelMode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatCapitualChannelMode createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FiatCapitualChannelMode(string, string2, string3, string4, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatCapitualChannelMode[] newArray(int i11) {
            return new FiatCapitualChannelMode[i11];
        }
    }

    public FiatCapitualChannelMode() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiatCapitualChannelMode)) {
            return false;
        }
        FiatCapitualChannelMode fiatCapitualChannelMode = (FiatCapitualChannelMode) other;
        return Intrinsics.areEqual(this.channelId, fiatCapitualChannelMode.channelId) && Intrinsics.areEqual(this.fiatCurrency, fiatCapitualChannelMode.fiatCurrency) && Intrinsics.areEqual(this.minFiatAmount, fiatCapitualChannelMode.minFiatAmount) && Intrinsics.areEqual(this.maxFiatAmount, fiatCapitualChannelMode.maxFiatAmount) && Intrinsics.areEqual(this.isWithdraw, fiatCapitualChannelMode.isWithdraw);
    }

    public FiatCapitualChannelMode(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool) {
        this.channelId = str;
        this.fiatCurrency = str2;
        this.minFiatAmount = str3;
        this.maxFiatAmount = str4;
        this.isWithdraw = bool;
    }

    public static /* synthetic */ FiatCapitualChannelMode copy$default(FiatCapitualChannelMode fiatCapitualChannelMode, String str, String str2, String str3, String str4, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatCapitualChannelMode.channelId;
        }
        if ((i11 & 2) != 0) {
            str2 = fiatCapitualChannelMode.fiatCurrency;
        }
        if ((i11 & 4) != 0) {
            str3 = fiatCapitualChannelMode.minFiatAmount;
        }
        if ((i11 & 8) != 0) {
            str4 = fiatCapitualChannelMode.maxFiatAmount;
        }
        if ((i11 & 16) != 0) {
            bool = fiatCapitualChannelMode.isWithdraw;
        }
        Boolean bool2 = bool;
        String str5 = str3;
        return fiatCapitualChannelMode.copy(str, str2, str5, str4, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMinFiatAmount() {
        return this.minFiatAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMaxFiatAmount() {
        return this.maxFiatAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsWithdraw() {
        return this.isWithdraw;
    }

    @NotNull
    public final FiatCapitualChannelMode copy(@Nullable String channelId, @Nullable String fiatCurrency, @Nullable String minFiatAmount, @Nullable String maxFiatAmount, @Nullable Boolean isWithdraw) {
        return new FiatCapitualChannelMode(channelId, fiatCurrency, minFiatAmount, maxFiatAmount, isWithdraw);
    }

    @Nullable
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    public final String getMaxFiatAmount() {
        return this.maxFiatAmount;
    }

    @Nullable
    public final String getMinFiatAmount() {
        return this.minFiatAmount;
    }

    public int hashCode() {
        String str = this.channelId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fiatCurrency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.minFiatAmount;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.maxFiatAmount;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isWithdraw;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isWithdraw() {
        return this.isWithdraw;
    }

    public final void setChannelId(@Nullable String str) {
        this.channelId = str;
    }

    public final void setFiatCurrency(@Nullable String str) {
        this.fiatCurrency = str;
    }

    public final void setMaxFiatAmount(@Nullable String str) {
        this.maxFiatAmount = str;
    }

    public final void setMinFiatAmount(@Nullable String str) {
        this.minFiatAmount = str;
    }

    public final void setWithdraw(@Nullable Boolean bool) {
        this.isWithdraw = bool;
    }

    @NotNull
    public String toString() {
        return "FiatCapitualChannelMode(channelId=" + this.channelId + ", fiatCurrency=" + this.fiatCurrency + ", minFiatAmount=" + this.minFiatAmount + ", maxFiatAmount=" + this.maxFiatAmount + ", isWithdraw=" + this.isWithdraw + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.channelId);
        dest.writeString(this.fiatCurrency);
        dest.writeString(this.minFiatAmount);
        dest.writeString(this.maxFiatAmount);
        Boolean bool = this.isWithdraw;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ FiatCapitualChannelMode(String str, String str2, String str3, String str4, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? Boolean.FALSE : bool);
    }
}
