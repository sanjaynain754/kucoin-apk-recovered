package com.kubi.margin.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LeverBean.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, m90084d2 = {"Lcom/kubi/margin/entity/LeverSymbol;", "Landroid/os/Parcelable;", "symbolCode", "", "symbolName", "quoteCurrencyCode", "baseCurrencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSymbolCode", "()Ljava/lang/String;", "getSymbolName", "getQuoteCurrencyCode", "getBaseCurrencyCode", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LeverSymbol implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LeverSymbol> CREATOR = new C17620a();

    @Nullable
    private final String baseCurrencyCode;

    @Nullable
    private final String quoteCurrencyCode;

    @Nullable
    private final String symbolCode;

    @Nullable
    private final String symbolName;

    /* JADX INFO: renamed from: com.kubi.margin.entity.LeverSymbol$a */
    /* JADX INFO: compiled from: LeverBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17620a implements Parcelable.Creator<LeverSymbol> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LeverSymbol createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LeverSymbol(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LeverSymbol[] newArray(int i11) {
            return new LeverSymbol[i11];
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
        if (!(other instanceof LeverSymbol)) {
            return false;
        }
        LeverSymbol leverSymbol = (LeverSymbol) other;
        return Intrinsics.areEqual(this.symbolCode, leverSymbol.symbolCode) && Intrinsics.areEqual(this.symbolName, leverSymbol.symbolName) && Intrinsics.areEqual(this.quoteCurrencyCode, leverSymbol.quoteCurrencyCode) && Intrinsics.areEqual(this.baseCurrencyCode, leverSymbol.baseCurrencyCode);
    }

    public static /* synthetic */ LeverSymbol copy$default(LeverSymbol leverSymbol, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = leverSymbol.symbolCode;
        }
        if ((i11 & 2) != 0) {
            str2 = leverSymbol.symbolName;
        }
        if ((i11 & 4) != 0) {
            str3 = leverSymbol.quoteCurrencyCode;
        }
        if ((i11 & 8) != 0) {
            str4 = leverSymbol.baseCurrencyCode;
        }
        return leverSymbol.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbolName() {
        return this.symbolName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getQuoteCurrencyCode() {
        return this.quoteCurrencyCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBaseCurrencyCode() {
        return this.baseCurrencyCode;
    }

    @NotNull
    public final LeverSymbol copy(@Nullable String symbolCode, @Nullable String symbolName, @Nullable String quoteCurrencyCode, @Nullable String baseCurrencyCode) {
        return new LeverSymbol(symbolCode, symbolName, quoteCurrencyCode, baseCurrencyCode);
    }

    @Nullable
    public final String getBaseCurrencyCode() {
        return this.baseCurrencyCode;
    }

    @Nullable
    public final String getQuoteCurrencyCode() {
        return this.quoteCurrencyCode;
    }

    @Nullable
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    public final String getSymbolName() {
        return this.symbolName;
    }

    public int hashCode() {
        String str = this.symbolCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbolName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.quoteCurrencyCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.baseCurrencyCode;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LeverSymbol(symbolCode=" + this.symbolCode + ", symbolName=" + this.symbolName + ", quoteCurrencyCode=" + this.quoteCurrencyCode + ", baseCurrencyCode=" + this.baseCurrencyCode + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbolCode);
        dest.writeString(this.symbolName);
        dest.writeString(this.quoteCurrencyCode);
        dest.writeString(this.baseCurrencyCode);
    }

    public LeverSymbol(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.symbolCode = str;
        this.symbolName = str2;
        this.quoteCurrencyCode = str3;
        this.baseCurrencyCode = str4;
    }
}
