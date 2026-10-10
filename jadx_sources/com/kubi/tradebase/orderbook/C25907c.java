package com.kubi.tradebase.orderbook;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.tradebase.orderbook.c */
/* JADX INFO: compiled from: OrderBookDataHelper.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m90084d2 = {"ensureHolder", "", "Lcom/kubi/tradebase/orderbook/OrderBookItemData;", "size", "", "TradeBaseLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C25907c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<OrderBookItemData> m63280a(@NotNull List<OrderBookItemData> list, int i11) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<OrderBookItemData> mutableList = CollectionsKt.toMutableList((Collection) list);
        if (list.size() < i11) {
            int size = i11 - list.size();
            for (int i12 = 0; i12 < size; i12++) {
                mutableList.add(new OrderBookItemData(null, null, null, 0.0f, false, 0.0f, 63, null));
            }
        }
        return mutableList;
    }
}
