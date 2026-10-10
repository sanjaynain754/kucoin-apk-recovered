package com.kubi.quotefacade.tradechance;

import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.tradechance.d */
/* JADX INFO: compiled from: TradeChanceContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\"\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bR-\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/TradeChanceContract$ViewDataEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "tabsMap", "Ljava/util/LinkedHashMap;", "", "", "Lkotlin/collections/LinkedHashMap;", "dataList", "", "Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;", "<init>", "(Ljava/util/LinkedHashMap;Ljava/util/List;)V", "getTabsMap", "()Ljava/util/LinkedHashMap;", "getDataList", "()Ljava/util/List;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C22547d implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LinkedHashMap<String, Integer> f42624a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<ITradeChanceDataItem> f42625b;

    public C22547d(@NotNull LinkedHashMap<String, Integer> tabsMap, @NotNull List<ITradeChanceDataItem> dataList) {
        Intrinsics.checkNotNullParameter(tabsMap, "tabsMap");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.f42624a = tabsMap;
        this.f42625b = dataList;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<ITradeChanceDataItem> m53103a() {
        return this.f42625b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final LinkedHashMap<String, Integer> m53104b() {
        return this.f42624a;
    }
}
