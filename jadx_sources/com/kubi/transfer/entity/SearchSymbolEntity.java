package com.kubi.transfer.entity;

import androidx.annotation.Keep;
import androidx.media3.extractor.text.ttml.TtmlNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchSymbolEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/transfer/entity/SearchSymbolEntity;", "", "symbol", "", "symbolName", TtmlNode.RUBY_BASE, "Lcom/kubi/transfer/entity/Base;", "quote", "Lcom/kubi/transfer/entity/Quote;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/transfer/entity/Base;Lcom/kubi/transfer/entity/Quote;)V", "getSymbol", "()Ljava/lang/String;", "getSymbolName", "getBase", "()Lcom/kubi/transfer/entity/Base;", "getQuote", "()Lcom/kubi/transfer/entity/Quote;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "TransferApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SearchSymbolEntity {

    @Nullable
    private final Base base;

    @Nullable
    private final Quote quote;

    @Nullable
    private final String symbol;

    @Nullable
    private final String symbolName;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchSymbolEntity)) {
            return false;
        }
        SearchSymbolEntity searchSymbolEntity = (SearchSymbolEntity) other;
        return Intrinsics.areEqual(this.symbol, searchSymbolEntity.symbol) && Intrinsics.areEqual(this.symbolName, searchSymbolEntity.symbolName) && Intrinsics.areEqual(this.base, searchSymbolEntity.base) && Intrinsics.areEqual(this.quote, searchSymbolEntity.quote);
    }

    public static /* synthetic */ SearchSymbolEntity copy$default(SearchSymbolEntity searchSymbolEntity, String str, String str2, Base base, Quote quote, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchSymbolEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            str2 = searchSymbolEntity.symbolName;
        }
        if ((i11 & 4) != 0) {
            base = searchSymbolEntity.base;
        }
        if ((i11 & 8) != 0) {
            quote = searchSymbolEntity.quote;
        }
        return searchSymbolEntity.copy(str, str2, base, quote);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbolName() {
        return this.symbolName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Base getBase() {
        return this.base;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Quote getQuote() {
        return this.quote;
    }

    @NotNull
    public final SearchSymbolEntity copy(@Nullable String symbol, @Nullable String symbolName, @Nullable Base base, @Nullable Quote quote) {
        return new SearchSymbolEntity(symbol, symbolName, base, quote);
    }

    @Nullable
    public final Base getBase() {
        return this.base;
    }

    @Nullable
    public final Quote getQuote() {
        return this.quote;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getSymbolName() {
        return this.symbolName;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbolName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Base base = this.base;
        int iHashCode3 = (iHashCode2 + (base == null ? 0 : base.hashCode())) * 31;
        Quote quote = this.quote;
        return iHashCode3 + (quote != null ? quote.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SearchSymbolEntity(symbol=" + this.symbol + ", symbolName=" + this.symbolName + ", base=" + this.base + ", quote=" + this.quote + ')';
    }

    public SearchSymbolEntity(@Nullable String str, @Nullable String str2, @Nullable Base base, @Nullable Quote quote) {
        this.symbol = str;
        this.symbolName = str2;
        this.base = base;
        this.quote = quote;
    }
}
