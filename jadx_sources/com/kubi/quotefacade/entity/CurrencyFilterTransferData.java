package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CurrencyFilterConfig.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/CurrencyFilterTransferData;", "", "level1", "", "level2", "level3", "data", "Lcom/kubi/quotefacade/entity/SymbolData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/quotefacade/entity/SymbolData;)V", "getLevel1", "()Ljava/lang/String;", "getLevel2", "getLevel3", "getData", "()Lcom/kubi/quotefacade/entity/SymbolData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "QuoteFacadeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CurrencyFilterTransferData {

    @Nullable
    private final SymbolData data;

    @Nullable
    private final String level1;

    @Nullable
    private final String level2;

    @Nullable
    private final String level3;

    public CurrencyFilterTransferData() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrencyFilterTransferData)) {
            return false;
        }
        CurrencyFilterTransferData currencyFilterTransferData = (CurrencyFilterTransferData) other;
        return Intrinsics.areEqual(this.level1, currencyFilterTransferData.level1) && Intrinsics.areEqual(this.level2, currencyFilterTransferData.level2) && Intrinsics.areEqual(this.level3, currencyFilterTransferData.level3) && Intrinsics.areEqual(this.data, currencyFilterTransferData.data);
    }

    public CurrencyFilterTransferData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable SymbolData symbolData) {
        this.level1 = str;
        this.level2 = str2;
        this.level3 = str3;
        this.data = symbolData;
    }

    public static /* synthetic */ CurrencyFilterTransferData copy$default(CurrencyFilterTransferData currencyFilterTransferData, String str, String str2, String str3, SymbolData symbolData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = currencyFilterTransferData.level1;
        }
        if ((i11 & 2) != 0) {
            str2 = currencyFilterTransferData.level2;
        }
        if ((i11 & 4) != 0) {
            str3 = currencyFilterTransferData.level3;
        }
        if ((i11 & 8) != 0) {
            symbolData = currencyFilterTransferData.data;
        }
        return currencyFilterTransferData.copy(str, str2, str3, symbolData);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLevel1() {
        return this.level1;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLevel2() {
        return this.level2;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLevel3() {
        return this.level3;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SymbolData getData() {
        return this.data;
    }

    @NotNull
    public final CurrencyFilterTransferData copy(@Nullable String level1, @Nullable String level2, @Nullable String level3, @Nullable SymbolData data) {
        return new CurrencyFilterTransferData(level1, level2, level3, data);
    }

    @Nullable
    public final SymbolData getData() {
        return this.data;
    }

    @Nullable
    public final String getLevel1() {
        return this.level1;
    }

    @Nullable
    public final String getLevel2() {
        return this.level2;
    }

    @Nullable
    public final String getLevel3() {
        return this.level3;
    }

    public int hashCode() {
        String str = this.level1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.level2;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.level3;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SymbolData symbolData = this.data;
        return iHashCode3 + (symbolData != null ? symbolData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CurrencyFilterTransferData(level1=" + this.level1 + ", level2=" + this.level2 + ", level3=" + this.level3 + ", data=" + this.data + ')';
    }

    public /* synthetic */ CurrencyFilterTransferData(String str, String str2, String str3, SymbolData symbolData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : symbolData);
    }
}
