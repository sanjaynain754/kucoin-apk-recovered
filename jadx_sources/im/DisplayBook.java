package im;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: im.e, reason: from toString */
/* JADX INFO: compiled from: BookEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0013\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Jv\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\tHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014¨\u0006*"}, m90084d2 = {"Lcom/kubi/kumex/logic/book/DisplayBook;", "", "symbol", "", "asks", "", "Lcom/kubi/kumex/logic/book/DisplayBookItem;", "bids", "askRate", "", "bidRate", "originAsks", "", "", "originBids", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)V", "getSymbol", "()Ljava/lang/String;", "getAsks", "()Ljava/util/List;", "getBids", "getAskRate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBidRate", "getOriginAsks", "getOriginBids", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Lcom/kubi/kumex/logic/book/DisplayBook;", "equals", "", "other", "hashCode", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DisplayBook {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final String symbol;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final List<DisplayBookItem> asks;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final List<DisplayBookItem> bids;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final Integer askRate;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final Integer bidRate;

    /* JADX INFO: renamed from: f, reason: from toString */
    @Nullable
    public final List<double[]> originAsks;

    /* JADX INFO: renamed from: g, reason: from toString */
    @Nullable
    public final List<double[]> originBids;

    public DisplayBook(@Nullable String str, @NotNull List<DisplayBookItem> asks, @NotNull List<DisplayBookItem> bids, @Nullable Integer num, @Nullable Integer num2, @Nullable List<double[]> list, @Nullable List<double[]> list2) {
        Intrinsics.checkNotNullParameter(asks, "asks");
        Intrinsics.checkNotNullParameter(bids, "bids");
        this.symbol = str;
        this.asks = asks;
        this.bids = bids;
        this.askRate = num;
        this.bidRate = num2;
        this.originAsks = list;
        this.originBids = list2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayBook)) {
            return false;
        }
        DisplayBook displayBook = (DisplayBook) other;
        return Intrinsics.areEqual(this.symbol, displayBook.symbol) && Intrinsics.areEqual(this.asks, displayBook.asks) && Intrinsics.areEqual(this.bids, displayBook.bids) && Intrinsics.areEqual(this.askRate, displayBook.askRate) && Intrinsics.areEqual(this.bidRate, displayBook.bidRate) && Intrinsics.areEqual(this.originAsks, displayBook.originAsks) && Intrinsics.areEqual(this.originBids, displayBook.originBids);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<DisplayBookItem> m87450a() {
        return this.asks;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<DisplayBookItem> m87451b() {
        return this.bids;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final List<double[]> m87452c() {
        return this.originAsks;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final List<double[]> m87453d() {
        return this.originBids;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.asks.hashCode()) * 31) + this.bids.hashCode()) * 31;
        Integer num = this.askRate;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.bidRate;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<double[]> list = this.originAsks;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<double[]> list2 = this.originBids;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DisplayBook(symbol=" + this.symbol + ", asks=" + this.asks + ", bids=" + this.bids + ", askRate=" + this.askRate + ", bidRate=" + this.bidRate + ", originAsks=" + this.originAsks + ", originBids=" + this.originBids + ')';
    }

    public /* synthetic */ DisplayBook(String str, List list, List list2, Integer num, Integer num2, List list3, List list4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list, (i11 & 4) != 0 ? CollectionsKt.emptyList() : list2, num, num2, (i11 & 32) != 0 ? null : list3, (i11 & 64) != 0 ? null : list4);
    }
}
