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
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011JB\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006&"}, m90084d2 = {"Lcom/kubi/kumex/constant/KlineQuickOrder;", "Landroid/os/Parcelable;", "bizType", "", "symbol", "side", "quickOrderPrice", "showPriceLine", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getBizType", "()Ljava/lang/String;", "getSymbol", "getSide", "getQuickOrderPrice", "getShowPriceLine", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/kumex/constant/KlineQuickOrder;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KlineQuickOrder implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<KlineQuickOrder> CREATOR = new C15766a();

    @NotNull
    private final String bizType;

    @NotNull
    private final String quickOrderPrice;

    @Nullable
    private final Boolean showPriceLine;

    @NotNull
    private final String side;

    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: com.kubi.kumex.constant.KlineQuickOrder$a */
    /* JADX INFO: compiled from: KlineConstant.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15766a implements Parcelable.Creator<KlineQuickOrder> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KlineQuickOrder createFromParcel(Parcel parcel) {
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
            return new KlineQuickOrder(string, string2, string3, string4, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KlineQuickOrder[] newArray(int i11) {
            return new KlineQuickOrder[i11];
        }
    }

    public KlineQuickOrder(@NotNull String bizType, @NotNull String symbol, @NotNull String side, @NotNull String quickOrderPrice, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(quickOrderPrice, "quickOrderPrice");
        this.bizType = bizType;
        this.symbol = symbol;
        this.side = side;
        this.quickOrderPrice = quickOrderPrice;
        this.showPriceLine = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KlineQuickOrder)) {
            return false;
        }
        KlineQuickOrder klineQuickOrder = (KlineQuickOrder) other;
        return Intrinsics.areEqual(this.bizType, klineQuickOrder.bizType) && Intrinsics.areEqual(this.symbol, klineQuickOrder.symbol) && Intrinsics.areEqual(this.side, klineQuickOrder.side) && Intrinsics.areEqual(this.quickOrderPrice, klineQuickOrder.quickOrderPrice) && Intrinsics.areEqual(this.showPriceLine, klineQuickOrder.showPriceLine);
    }

    public static /* synthetic */ KlineQuickOrder copy$default(KlineQuickOrder klineQuickOrder, String str, String str2, String str3, String str4, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = klineQuickOrder.bizType;
        }
        if ((i11 & 2) != 0) {
            str2 = klineQuickOrder.symbol;
        }
        if ((i11 & 4) != 0) {
            str3 = klineQuickOrder.side;
        }
        if ((i11 & 8) != 0) {
            str4 = klineQuickOrder.quickOrderPrice;
        }
        if ((i11 & 16) != 0) {
            bool = klineQuickOrder.showPriceLine;
        }
        Boolean bool2 = bool;
        String str5 = str3;
        return klineQuickOrder.copy(str, str2, str5, str4, bool2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBizType() {
        return this.bizType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getQuickOrderPrice() {
        return this.quickOrderPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getShowPriceLine() {
        return this.showPriceLine;
    }

    @NotNull
    public final KlineQuickOrder copy(@NotNull String bizType, @NotNull String symbol, @NotNull String side, @NotNull String quickOrderPrice, @Nullable Boolean showPriceLine) {
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(quickOrderPrice, "quickOrderPrice");
        return new KlineQuickOrder(bizType, symbol, side, quickOrderPrice, showPriceLine);
    }

    @NotNull
    public final String getBizType() {
        return this.bizType;
    }

    @NotNull
    public final String getQuickOrderPrice() {
        return this.quickOrderPrice;
    }

    @Nullable
    public final Boolean getShowPriceLine() {
        return this.showPriceLine;
    }

    @NotNull
    public final String getSide() {
        return this.side;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        int iHashCode = ((((((this.bizType.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.side.hashCode()) * 31) + this.quickOrderPrice.hashCode()) * 31;
        Boolean bool = this.showPriceLine;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public String toString() {
        return "KlineQuickOrder(bizType=" + this.bizType + ", symbol=" + this.symbol + ", side=" + this.side + ", quickOrderPrice=" + this.quickOrderPrice + ", showPriceLine=" + this.showPriceLine + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.bizType);
        dest.writeString(this.symbol);
        dest.writeString(this.side);
        dest.writeString(this.quickOrderPrice);
        Boolean bool = this.showPriceLine;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ KlineQuickOrder(String str, String str2, String str3, String str4, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i11 & 16) != 0 ? null : bool);
    }
}
