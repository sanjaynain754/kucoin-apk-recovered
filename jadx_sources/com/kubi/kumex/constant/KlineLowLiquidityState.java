package com.kubi.kumex.constant;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KlineConstant.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/kumex/constant/KlineLowLiquidityState;", "Landroid/os/Parcelable;", "symbol", "", "isLowLiquidityPeriod", "", "marketSession", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "()Z", "getMarketSession", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KlineLowLiquidityState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<KlineLowLiquidityState> CREATOR = new C15765a();
    private final boolean isLowLiquidityPeriod;

    @Nullable
    private final String marketSession;

    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: com.kubi.kumex.constant.KlineLowLiquidityState$a */
    /* JADX INFO: compiled from: KlineConstant.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15765a implements Parcelable.Creator<KlineLowLiquidityState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KlineLowLiquidityState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KlineLowLiquidityState(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KlineLowLiquidityState[] newArray(int i11) {
            return new KlineLowLiquidityState[i11];
        }
    }

    public KlineLowLiquidityState(@NotNull String symbol, boolean z11, @Nullable String str) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.symbol = symbol;
        this.isLowLiquidityPeriod = z11;
        this.marketSession = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KlineLowLiquidityState)) {
            return false;
        }
        KlineLowLiquidityState klineLowLiquidityState = (KlineLowLiquidityState) other;
        return Intrinsics.areEqual(this.symbol, klineLowLiquidityState.symbol) && this.isLowLiquidityPeriod == klineLowLiquidityState.isLowLiquidityPeriod && Intrinsics.areEqual(this.marketSession, klineLowLiquidityState.marketSession);
    }

    public static /* synthetic */ KlineLowLiquidityState copy$default(KlineLowLiquidityState klineLowLiquidityState, String str, boolean z11, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = klineLowLiquidityState.symbol;
        }
        if ((i11 & 2) != 0) {
            z11 = klineLowLiquidityState.isLowLiquidityPeriod;
        }
        if ((i11 & 4) != 0) {
            str2 = klineLowLiquidityState.marketSession;
        }
        return klineLowLiquidityState.copy(str, z11, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsLowLiquidityPeriod() {
        return this.isLowLiquidityPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMarketSession() {
        return this.marketSession;
    }

    @NotNull
    public final KlineLowLiquidityState copy(@NotNull String symbol, boolean isLowLiquidityPeriod, @Nullable String marketSession) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new KlineLowLiquidityState(symbol, isLowLiquidityPeriod, marketSession);
    }

    @Nullable
    public final String getMarketSession() {
        return this.marketSession;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        int iHashCode = ((this.symbol.hashCode() * 31) + Boolean.hashCode(this.isLowLiquidityPeriod)) * 31;
        String str = this.marketSession;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isLowLiquidityPeriod() {
        return this.isLowLiquidityPeriod;
    }

    @NotNull
    public String toString() {
        return "KlineLowLiquidityState(symbol=" + this.symbol + ", isLowLiquidityPeriod=" + this.isLowLiquidityPeriod + ", marketSession=" + this.marketSession + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        dest.writeInt(this.isLowLiquidityPeriod ? 1 : 0);
        dest.writeString(this.marketSession);
    }

    public /* synthetic */ KlineLowLiquidityState(String str, boolean z11, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z11, (i11 & 4) != 0 ? null : str2);
    }
}
