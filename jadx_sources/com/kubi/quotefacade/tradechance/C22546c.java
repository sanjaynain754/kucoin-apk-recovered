package com.kubi.quotefacade.tradechance;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.tradechance.c */
/* JADX INFO: compiled from: TradeChanceContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/TradeChanceContract$RefreshUIDataEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "dataList", "", "Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;", "<init>", "(Ljava/util/List;)V", "getDataList", "()Ljava/util/List;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C22546c implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<ITradeChanceDataItem> f42623a;

    public C22546c(@NotNull List<ITradeChanceDataItem> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.f42623a = dataList;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<ITradeChanceDataItem> m53102a() {
        return this.f42623a;
    }
}
