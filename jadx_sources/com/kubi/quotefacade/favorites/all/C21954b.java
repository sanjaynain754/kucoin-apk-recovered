package com.kubi.quotefacade.favorites.all;

import com.kubi.data.entity.TradeItemBean;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.kubi.quotefacade.favorites.all.b */
/* JADX INFO: compiled from: FavAllContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R!\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/all/FavAllContract$RemoveCollectEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "item", "Lkotlin/Pair;", "Lcom/kubi/data/entity/TradeItemBean;", "", "<init>", "(Lkotlin/Pair;)V", "getItem", "()Lkotlin/Pair;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C21954b implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Pair<TradeItemBean, Integer> f41733a;

    /* JADX WARN: Multi-variable type inference failed */
    public C21954b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21954b(@Nullable Pair<? extends TradeItemBean, Integer> pair) {
        this.f41733a = pair;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Pair<TradeItemBean, Integer> m51532a() {
        return this.f41733a;
    }

    public /* synthetic */ C21954b(Pair pair, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : pair);
    }
}
