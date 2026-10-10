package com.kubi.margin.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.data.entity.SymbolInfoEntity;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IsolateMarginPositionTag.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006#"}, m90084d2 = {"Lcom/kubi/margin/api/entity/IsolateMarginPositionTag;", "Landroid/os/Parcelable;", "currencyTotalBalance", "Ljava/math/BigDecimal;", "symbol", "", "symbolInfoEntity", "Lcom/kubi/data/entity/SymbolInfoEntity;", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;)V", "getCurrencyTotalBalance", "()Ljava/math/BigDecimal;", "getSymbol", "()Ljava/lang/String;", "getSymbolInfoEntity", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "setSymbolInfoEntity", "(Lcom/kubi/data/entity/SymbolInfoEntity;)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class IsolateMarginPositionTag implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IsolateMarginPositionTag> CREATOR = new C17482a();

    @Nullable
    private final BigDecimal currencyTotalBalance;

    @Nullable
    private final String symbol;

    @Nullable
    private SymbolInfoEntity symbolInfoEntity;

    /* JADX INFO: renamed from: com.kubi.margin.api.entity.IsolateMarginPositionTag$a */
    /* JADX INFO: compiled from: IsolateMarginPositionTag.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17482a implements Parcelable.Creator<IsolateMarginPositionTag> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IsolateMarginPositionTag createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IsolateMarginPositionTag((BigDecimal) parcel.readSerializable(), parcel.readString(), (SymbolInfoEntity) parcel.readParcelable(IsolateMarginPositionTag.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final IsolateMarginPositionTag[] newArray(int i11) {
            return new IsolateMarginPositionTag[i11];
        }
    }

    public IsolateMarginPositionTag(@Nullable BigDecimal bigDecimal, @Nullable String str, @Nullable SymbolInfoEntity symbolInfoEntity) {
        this.currencyTotalBalance = bigDecimal;
        this.symbol = str;
        this.symbolInfoEntity = symbolInfoEntity;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IsolateMarginPositionTag)) {
            return false;
        }
        IsolateMarginPositionTag isolateMarginPositionTag = (IsolateMarginPositionTag) other;
        return Intrinsics.areEqual(this.currencyTotalBalance, isolateMarginPositionTag.currencyTotalBalance) && Intrinsics.areEqual(this.symbol, isolateMarginPositionTag.symbol) && Intrinsics.areEqual(this.symbolInfoEntity, isolateMarginPositionTag.symbolInfoEntity);
    }

    public static /* synthetic */ IsolateMarginPositionTag copy$default(IsolateMarginPositionTag isolateMarginPositionTag, BigDecimal bigDecimal, String str, SymbolInfoEntity symbolInfoEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = isolateMarginPositionTag.currencyTotalBalance;
        }
        if ((i11 & 2) != 0) {
            str = isolateMarginPositionTag.symbol;
        }
        if ((i11 & 4) != 0) {
            symbolInfoEntity = isolateMarginPositionTag.symbolInfoEntity;
        }
        return isolateMarginPositionTag.copy(bigDecimal, str, symbolInfoEntity);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getCurrencyTotalBalance() {
        return this.currencyTotalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SymbolInfoEntity getSymbolInfoEntity() {
        return this.symbolInfoEntity;
    }

    @NotNull
    public final IsolateMarginPositionTag copy(@Nullable BigDecimal currencyTotalBalance, @Nullable String symbol, @Nullable SymbolInfoEntity symbolInfoEntity) {
        return new IsolateMarginPositionTag(currencyTotalBalance, symbol, symbolInfoEntity);
    }

    @Nullable
    public final BigDecimal getCurrencyTotalBalance() {
        return this.currencyTotalBalance;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final SymbolInfoEntity getSymbolInfoEntity() {
        return this.symbolInfoEntity;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.currencyTotalBalance;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.symbol;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SymbolInfoEntity symbolInfoEntity = this.symbolInfoEntity;
        return iHashCode2 + (symbolInfoEntity != null ? symbolInfoEntity.hashCode() : 0);
    }

    public final void setSymbolInfoEntity(@Nullable SymbolInfoEntity symbolInfoEntity) {
        this.symbolInfoEntity = symbolInfoEntity;
    }

    @NotNull
    public String toString() {
        return "IsolateMarginPositionTag(currencyTotalBalance=" + this.currencyTotalBalance + ", symbol=" + this.symbol + ", symbolInfoEntity=" + this.symbolInfoEntity + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.currencyTotalBalance);
        dest.writeString(this.symbol);
        dest.writeParcelable(this.symbolInfoEntity, flags);
    }

    public /* synthetic */ IsolateMarginPositionTag(BigDecimal bigDecimal, String str, SymbolInfoEntity symbolInfoEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, str, (i11 & 4) != 0 ? null : symbolInfoEntity);
    }
}
