package com.kubi.quotefacade.favorites.all;

import com.kubi.data.entity.TradeItemBean;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.kubi.quotefacade.favorites.all.c */
/* JADX INFO: compiled from: FavAllContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/all/FavAllContract$ShowTradeItemListEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "favCollectDataList", "", "Lcom/kubi/data/entity/TradeItemBean;", "<init>", "(Ljava/util/List;)V", "getFavCollectDataList", "()Ljava/util/List;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C21956c implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final List<TradeItemBean> f41734a;

    /* JADX WARN: Multi-variable type inference failed */
    public C21956c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21956c(@Nullable List<? extends TradeItemBean> list) {
        this.f41734a = list;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final List<TradeItemBean> m51533a() {
        return this.f41734a;
    }

    public /* synthetic */ C21956c(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list);
    }
}
