package com.kubi.tradebase.orderbook;

import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.tradebase.orderbook.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IOrderBookData.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R \u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/tradebase/orderbook/IOrderBookData;", "", "symbol", "", "getSymbol", "()Ljava/lang/String;", "bids", "", "", "Ljava/math/BigDecimal;", "getBids", "()Ljava/util/List;", "asks", "getAsks", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IOrderBookData {
    @Nullable
    List<BigDecimal[]> getAsks();

    @Nullable
    List<BigDecimal[]> getBids();

    @Nullable
    String getSymbol();
}
