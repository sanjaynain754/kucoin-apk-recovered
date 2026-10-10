package com.kubi.tradebase.marketamount;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.kubi.tradebase.marketamount.m, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarketAmountUnitStore.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lcom/kubi/tradebase/marketamount/MarketAmountUnitStoreProvider;", "", "<init>", "()V", "shared", "Lcom/kubi/tradebase/marketamount/MarketAmountUnitStore;", "getShared", "()Lcom/kubi/tradebase/marketamount/MarketAmountUnitStore;", "shared$delegate", "Lkotlin/Lazy;", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarketAmountUnitStoreProvider {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final MarketAmountUnitStoreProvider f51583a = new MarketAmountUnitStoreProvider();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f51584b = LazyKt.lazy(new Function0() { // from class: com.kubi.tradebase.marketamount.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketAmountUnitStoreProvider.m63250c();
        }
    });

    /* JADX INFO: renamed from: c */
    public static final MarketAmountUnitStore m63250c() {
        return new MarketAmountUnitStore(new MmkvMarketAmountUnitPreferences());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final MarketAmountUnitStore m63251b() {
        return (MarketAmountUnitStore) f51584b.getValue();
    }
}
