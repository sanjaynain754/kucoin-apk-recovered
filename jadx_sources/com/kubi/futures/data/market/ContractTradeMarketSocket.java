package com.kubi.futures.data.market;

import com.kubi.kumex.data.market.model.TickerEntity;
import com.kubi.kumex.logic.book.BookEntity;
import io.reactivex.Observable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.futures.data.market.j, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ContractTradeMarketSocket.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/data/market/ContractTradeMarketSocket;", "", "isHit", "", "observeTicker", "Lio/reactivex/Observable;", "Lcom/kubi/kumex/data/market/model/TickerEntity;", "symbol", "", "observeBook", "Lcom/kubi/kumex/logic/book/BookEntity;", "precision", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ContractTradeMarketSocket {
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BookEntity> mo24719a(@NotNull String str, int i11);

    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<TickerEntity> mo24720b(@NotNull String str);

    /* JADX INFO: renamed from: c */
    boolean mo24721c();
}
