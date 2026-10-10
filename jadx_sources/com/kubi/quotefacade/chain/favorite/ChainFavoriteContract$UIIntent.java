package com.kubi.quotefacade.chain.favorite;

import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.quotefacade.entity.ChainItemEntity;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ChainFavoriteContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteContract$UIIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "CollectOrCancelChain", "Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteContract$UIIntent$CollectOrCancelChain;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class ChainFavoriteContract$UIIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: ChainFavoriteContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteContract$UIIntent$CollectOrCancelChain;", "Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteContract$UIIntent;", "chainItem", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", "itemPosition", "", "<init>", "(Lcom/kubi/quotefacade/entity/ChainItemEntity;I)V", "getChainItem", "()Lcom/kubi/quotefacade/entity/ChainItemEntity;", "getItemPosition", "()I", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CollectOrCancelChain extends ChainFavoriteContract$UIIntent {

        @Nullable
        private final ChainItemEntity chainItem;
        private final int itemPosition;

        public CollectOrCancelChain(@Nullable ChainItemEntity chainItemEntity, int i11) {
            super(null);
            this.chainItem = chainItemEntity;
            this.itemPosition = i11;
        }

        @Nullable
        public final ChainItemEntity getChainItem() {
            return this.chainItem;
        }

        public final int getItemPosition() {
            return this.itemPosition;
        }
    }

    public /* synthetic */ ChainFavoriteContract$UIIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ChainFavoriteContract$UIIntent() {
    }
}
