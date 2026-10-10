package com.kubi.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginOfflineInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0005\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0007\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\b\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006'"}, m90084d2 = {"Lcom/kubi/data/entity/MarginSymbolInfo;", "Landroid/os/Parcelable;", "symbol", "", "symbolName", "isMarginEnabled", "", "isEnableMarginTrade", "isIsolatedEnabled", "priceDeviateRemindRate", "offlineInfo", "Lcom/kubi/data/entity/MarginOfflineInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/data/entity/MarginOfflineInfo;)V", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getSymbolName", "setSymbolName", "()Ljava/lang/Boolean;", "setMarginEnabled", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setEnableMarginTrade", "setIsolatedEnabled", "getPriceDeviateRemindRate", "setPriceDeviateRemindRate", "getOfflineInfo", "()Lcom/kubi/data/entity/MarginOfflineInfo;", "setOfflineInfo", "(Lcom/kubi/data/entity/MarginOfflineInfo;)V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarginSymbolInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarginSymbolInfo> CREATOR = new Creator();

    @Nullable
    private Boolean isEnableMarginTrade;

    @Nullable
    private Boolean isIsolatedEnabled;

    @Nullable
    private Boolean isMarginEnabled;

    @Nullable
    private MarginOfflineInfo offlineInfo;

    @Nullable
    private String priceDeviateRemindRate;

    @Nullable
    private String symbol;

    @Nullable
    private String symbolName;

    /* JADX INFO: compiled from: MarginOfflineInfo.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<MarginSymbolInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginSymbolInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarginSymbolInfo(string, string2, boolValueOf, boolValueOf2, boolValueOf3, parcel.readString(), parcel.readInt() != 0 ? MarginOfflineInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginSymbolInfo[] newArray(int i11) {
            return new MarginSymbolInfo[i11];
        }
    }

    public MarginSymbolInfo() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public MarginSymbolInfo(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str3, @Nullable MarginOfflineInfo marginOfflineInfo) {
        this.symbol = str;
        this.symbolName = str2;
        this.isMarginEnabled = bool;
        this.isEnableMarginTrade = bool2;
        this.isIsolatedEnabled = bool3;
        this.priceDeviateRemindRate = str3;
        this.offlineInfo = marginOfflineInfo;
    }

    @Nullable
    public final MarginOfflineInfo getOfflineInfo() {
        return this.offlineInfo;
    }

    @Nullable
    public final String getPriceDeviateRemindRate() {
        return this.priceDeviateRemindRate;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getSymbolName() {
        return this.symbolName;
    }

    @Nullable
    /* JADX INFO: renamed from: isEnableMarginTrade, reason: from getter */
    public final Boolean getIsEnableMarginTrade() {
        return this.isEnableMarginTrade;
    }

    @Nullable
    /* JADX INFO: renamed from: isIsolatedEnabled, reason: from getter */
    public final Boolean getIsIsolatedEnabled() {
        return this.isIsolatedEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: isMarginEnabled, reason: from getter */
    public final Boolean getIsMarginEnabled() {
        return this.isMarginEnabled;
    }

    public final void setEnableMarginTrade(@Nullable Boolean bool) {
        this.isEnableMarginTrade = bool;
    }

    public final void setIsolatedEnabled(@Nullable Boolean bool) {
        this.isIsolatedEnabled = bool;
    }

    public final void setMarginEnabled(@Nullable Boolean bool) {
        this.isMarginEnabled = bool;
    }

    public final void setOfflineInfo(@Nullable MarginOfflineInfo marginOfflineInfo) {
        this.offlineInfo = marginOfflineInfo;
    }

    public final void setPriceDeviateRemindRate(@Nullable String str) {
        this.priceDeviateRemindRate = str;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setSymbolName(@Nullable String str) {
        this.symbolName = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        dest.writeString(this.symbolName);
        Boolean bool = this.isMarginEnabled;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isEnableMarginTrade;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isIsolatedEnabled;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.priceDeviateRemindRate);
        MarginOfflineInfo marginOfflineInfo = this.offlineInfo;
        if (marginOfflineInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            marginOfflineInfo.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ MarginSymbolInfo(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, MarginOfflineInfo marginOfflineInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bool, (i11 & 8) != 0 ? null : bool2, (i11 & 16) != 0 ? null : bool3, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : marginOfflineInfo);
    }
}
