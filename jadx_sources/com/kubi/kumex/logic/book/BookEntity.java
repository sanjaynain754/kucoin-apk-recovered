package com.kubi.kumex.logic.book;

import androidx.annotation.Keep;
import cn.jiguang.privates.push.constants.JPushConstants;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BookEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0013\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J^\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001e¨\u0006/"}, m90084d2 = {"Lcom/kubi/kumex/logic/book/BookEntity;", "", "symbol", "", JPushConstants.Operation.KEY_SEQUENCE, "", "ts", "timestamp", "bids", "", "", "asks", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;)V", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getSequence", "()Ljava/lang/Long;", "setSequence", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getTs", "setTs", "getTimestamp", "setTimestamp", "getBids", "()Ljava/util/List;", "setBids", "(Ljava/util/List;)V", "getAsks", "setAsks", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;)Lcom/kubi/kumex/logic/book/BookEntity;", "equals", "", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BookEntity {

    @NotNull
    private List<double[]> asks;

    @NotNull
    private List<double[]> bids;

    @Nullable
    private Long sequence;

    @Nullable
    private String symbol;

    @Nullable
    private Long timestamp;

    @Nullable
    private Long ts;

    public BookEntity() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookEntity)) {
            return false;
        }
        BookEntity bookEntity = (BookEntity) other;
        return Intrinsics.areEqual(this.symbol, bookEntity.symbol) && Intrinsics.areEqual(this.sequence, bookEntity.sequence) && Intrinsics.areEqual(this.ts, bookEntity.ts) && Intrinsics.areEqual(this.timestamp, bookEntity.timestamp) && Intrinsics.areEqual(this.bids, bookEntity.bids) && Intrinsics.areEqual(this.asks, bookEntity.asks);
    }

    public BookEntity(@Nullable String str, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @NotNull List<double[]> bids, @NotNull List<double[]> asks) {
        Intrinsics.checkNotNullParameter(bids, "bids");
        Intrinsics.checkNotNullParameter(asks, "asks");
        this.symbol = str;
        this.sequence = l11;
        this.ts = l12;
        this.timestamp = l13;
        this.bids = bids;
        this.asks = asks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BookEntity copy$default(BookEntity bookEntity, String str, Long l11, Long l12, Long l13, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bookEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            l11 = bookEntity.sequence;
        }
        if ((i11 & 4) != 0) {
            l12 = bookEntity.ts;
        }
        if ((i11 & 8) != 0) {
            l13 = bookEntity.timestamp;
        }
        if ((i11 & 16) != 0) {
            list = bookEntity.bids;
        }
        if ((i11 & 32) != 0) {
            list2 = bookEntity.asks;
        }
        List list3 = list;
        List list4 = list2;
        return bookEntity.copy(str, l11, l12, l13, list3, list4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getSequence() {
        return this.sequence;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTs() {
        return this.ts;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final List<double[]> component5() {
        return this.bids;
    }

    @NotNull
    public final List<double[]> component6() {
        return this.asks;
    }

    @NotNull
    public final BookEntity copy(@Nullable String symbol, @Nullable Long sequence, @Nullable Long ts2, @Nullable Long timestamp, @NotNull List<double[]> bids, @NotNull List<double[]> asks) {
        Intrinsics.checkNotNullParameter(bids, "bids");
        Intrinsics.checkNotNullParameter(asks, "asks");
        return new BookEntity(symbol, sequence, ts2, timestamp, bids, asks);
    }

    @NotNull
    public final List<double[]> getAsks() {
        return this.asks;
    }

    @NotNull
    public final List<double[]> getBids() {
        return this.bids;
    }

    @Nullable
    public final Long getSequence() {
        return this.sequence;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final Long getTs() {
        return this.ts;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.sequence;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.ts;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.timestamp;
        return ((((iHashCode3 + (l13 != null ? l13.hashCode() : 0)) * 31) + this.bids.hashCode()) * 31) + this.asks.hashCode();
    }

    public final void setAsks(@NotNull List<double[]> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.asks = list;
    }

    public final void setBids(@NotNull List<double[]> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.bids = list;
    }

    public final void setSequence(@Nullable Long l11) {
        this.sequence = l11;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTimestamp(@Nullable Long l11) {
        this.timestamp = l11;
    }

    public final void setTs(@Nullable Long l11) {
        this.ts = l11;
    }

    @NotNull
    public String toString() {
        return "BookEntity(symbol=" + this.symbol + ", sequence=" + this.sequence + ", ts=" + this.ts + ", timestamp=" + this.timestamp + ", bids=" + this.bids + ", asks=" + this.asks + ')';
    }

    public /* synthetic */ BookEntity(String str, Long l11, Long l12, Long l13, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : l12, (i11 & 8) != 0 ? null : l13, (i11 & 16) != 0 ? new ArrayList() : list, (i11 & 32) != 0 ? new ArrayList() : list2);
    }
}
