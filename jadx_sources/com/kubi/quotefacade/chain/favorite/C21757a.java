package com.kubi.quotefacade.chain.favorite;

import com.kubi.quotefacade.entity.ChainItemEntity;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.Pair;

/* JADX INFO: renamed from: com.kubi.quotefacade.chain.favorite.a */
/* JADX INFO: compiled from: ChainFavoriteContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R!\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteContract$ChainCollectOrCancelEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "collectItemBean", "Lkotlin/Pair;", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", "", "<init>", "(Lkotlin/Pair;)V", "getCollectItemBean", "()Lkotlin/Pair;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C21757a implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Pair<ChainItemEntity, Integer> f41507a;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Pair<ChainItemEntity, Integer> m50834a() {
        return this.f41507a;
    }

    public C21757a(@Nullable Pair<ChainItemEntity, Integer> pair) {
        this.f41507a = pair;
    }
}
