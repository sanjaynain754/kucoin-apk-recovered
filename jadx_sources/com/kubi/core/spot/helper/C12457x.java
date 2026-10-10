package com.kubi.core.spot.helper;

import com.kubi.data.entity.OrderBookEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.spot.helper.x */
/* JADX INFO: compiled from: OrderBookHelper.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, m90084d2 = {"normalizeRestOrderBookForCurrentSymbol", "Lcom/kubi/data/entity/OrderBookEntity;", "currentSymbol", "", "orderBook", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C12457x {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final OrderBookEntity m23359a(@NotNull String currentSymbol, @NotNull OrderBookEntity orderBook) {
        Intrinsics.checkNotNullParameter(currentSymbol, "currentSymbol");
        Intrinsics.checkNotNullParameter(orderBook, "orderBook");
        if (orderBook.getSymbol().length() > 0 && !Intrinsics.areEqual(orderBook.getSymbol(), currentSymbol)) {
            return null;
        }
        if (orderBook.getSymbol().length() == 0) {
            orderBook.setSymbol(currentSymbol);
        }
        return orderBook;
    }
}
