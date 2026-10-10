package com.kubi.margin.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LeverBean.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006%"}, m90084d2 = {"Lcom/kubi/margin/entity/LeverSymbolMarket;", "Landroid/os/Parcelable;", "symbols", "", "Lcom/kubi/margin/entity/LeverSymbol;", "marketCode", "", "marketName", "positionType", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSymbols", "()Ljava/util/List;", "getMarketCode", "()Ljava/lang/String;", "getMarketName", "getPositionType", "isWholeMargin", "", "isSingleMargin", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LeverSymbolMarket implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LeverSymbolMarket> CREATOR = new C17621a();

    @Nullable
    private final String marketCode;

    @Nullable
    private final String marketName;

    @Nullable
    private final String positionType;

    @Nullable
    private final List<LeverSymbol> symbols;

    /* JADX INFO: renamed from: com.kubi.margin.entity.LeverSymbolMarket$a */
    /* JADX INFO: compiled from: LeverBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17621a implements Parcelable.Creator<LeverSymbolMarket> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LeverSymbolMarket createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(LeverSymbol.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new LeverSymbolMarket(arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LeverSymbolMarket[] newArray(int i11) {
            return new LeverSymbolMarket[i11];
        }
    }

    public LeverSymbolMarket(@Nullable List<LeverSymbol> list, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.symbols = list;
        this.marketCode = str;
        this.marketName = str2;
        this.positionType = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeverSymbolMarket)) {
            return false;
        }
        LeverSymbolMarket leverSymbolMarket = (LeverSymbolMarket) other;
        return Intrinsics.areEqual(this.symbols, leverSymbolMarket.symbols) && Intrinsics.areEqual(this.marketCode, leverSymbolMarket.marketCode) && Intrinsics.areEqual(this.marketName, leverSymbolMarket.marketName) && Intrinsics.areEqual(this.positionType, leverSymbolMarket.positionType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeverSymbolMarket copy$default(LeverSymbolMarket leverSymbolMarket, List list, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = leverSymbolMarket.symbols;
        }
        if ((i11 & 2) != 0) {
            str = leverSymbolMarket.marketCode;
        }
        if ((i11 & 4) != 0) {
            str2 = leverSymbolMarket.marketName;
        }
        if ((i11 & 8) != 0) {
            str3 = leverSymbolMarket.positionType;
        }
        return leverSymbolMarket.copy(list, str, str2, str3);
    }

    @Nullable
    public final List<LeverSymbol> component1() {
        return this.symbols;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMarketCode() {
        return this.marketCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMarketName() {
        return this.marketName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPositionType() {
        return this.positionType;
    }

    @NotNull
    public final LeverSymbolMarket copy(@Nullable List<LeverSymbol> symbols, @Nullable String marketCode, @Nullable String marketName, @Nullable String positionType) {
        return new LeverSymbolMarket(symbols, marketCode, marketName, positionType);
    }

    @Nullable
    public final String getMarketCode() {
        return this.marketCode;
    }

    @Nullable
    public final String getMarketName() {
        return this.marketName;
    }

    @Nullable
    public final String getPositionType() {
        return this.positionType;
    }

    @Nullable
    public final List<LeverSymbol> getSymbols() {
        return this.symbols;
    }

    public int hashCode() {
        List<LeverSymbol> list = this.symbols;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.marketCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.marketName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.positionType;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isSingleMargin() {
        return !Intrinsics.areEqual(this.positionType, "MARGIN");
    }

    public final boolean isWholeMargin() {
        return !Intrinsics.areEqual(this.positionType, SharedPositionInfo.MARGIN_MODE_ISOLATED);
    }

    @NotNull
    public String toString() {
        return "LeverSymbolMarket(symbols=" + this.symbols + ", marketCode=" + this.marketCode + ", marketName=" + this.marketName + ", positionType=" + this.positionType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<LeverSymbol> list = this.symbols;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<LeverSymbol> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.marketCode);
        dest.writeString(this.marketName);
        dest.writeString(this.positionType);
    }

    public /* synthetic */ LeverSymbolMarket(List list, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ArrayList() : list, str, str2, str3);
    }
}
