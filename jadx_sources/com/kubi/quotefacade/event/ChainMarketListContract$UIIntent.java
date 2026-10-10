package com.kubi.quotefacade.event;

import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.quotefacade.entity.ChainItemEntity;
import com.kubi.quotefacade.entity.ChainListParam;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChainMarketListContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/event/ChainMarketListContract$UIIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "FetchChainListData", "CollectOrCancelChain", "FetchChainRepeatListData", "Lcom/kubi/quotefacade/event/ChainMarketListContract$UIIntent$CollectOrCancelChain;", "Lcom/kubi/quotefacade/event/ChainMarketListContract$UIIntent$FetchChainListData;", "Lcom/kubi/quotefacade/event/ChainMarketListContract$UIIntent$FetchChainRepeatListData;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class ChainMarketListContract$UIIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: ChainMarketListContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/event/ChainMarketListContract$UIIntent$CollectOrCancelChain;", "Lcom/kubi/quotefacade/event/ChainMarketListContract$UIIntent;", "chainItem", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", "itemPosition", "", "<init>", "(Lcom/kubi/quotefacade/entity/ChainItemEntity;I)V", "getChainItem", "()Lcom/kubi/quotefacade/entity/ChainItemEntity;", "getItemPosition", "()I", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CollectOrCancelChain extends ChainMarketListContract$UIIntent {

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

    /* JADX INFO: compiled from: ChainMarketListContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/quotefacade/event/ChainMarketListContract$UIIntent$FetchChainListData;", "Lcom/kubi/quotefacade/event/ChainMarketListContract$UIIntent;", "param", "Lcom/kubi/quotefacade/entity/ChainListParam;", "isLocalSort", "", "<init>", "(Lcom/kubi/quotefacade/entity/ChainListParam;Z)V", "getParam", "()Lcom/kubi/quotefacade/entity/ChainListParam;", "()Z", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class FetchChainListData extends ChainMarketListContract$UIIntent {
        private final boolean isLocalSort;

        @Nullable
        private final ChainListParam param;

        public FetchChainListData(@Nullable ChainListParam chainListParam, boolean z11) {
            super(null);
            this.param = chainListParam;
            this.isLocalSort = z11;
        }

        @Nullable
        public final ChainListParam getParam() {
            return this.param;
        }

        /* JADX INFO: renamed from: isLocalSort, reason: from getter */
        public final boolean getIsLocalSort() {
            return this.isLocalSort;
        }
    }

    /* JADX INFO: compiled from: ChainMarketListContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/event/ChainMarketListContract$UIIntent$FetchChainRepeatListData;", "Lcom/kubi/quotefacade/event/ChainMarketListContract$UIIntent;", InterfaceC33826o0.f71244p, "", "", "orderByRange", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getToken", "()Ljava/util/List;", "getOrderByRange", "()Ljava/lang/String;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class FetchChainRepeatListData extends ChainMarketListContract$UIIntent {

        @Nullable
        private final String orderByRange;

        @NotNull
        private final List<String> token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchChainRepeatListData(@NotNull List<String> token, @Nullable String str) {
            super(null);
            Intrinsics.checkNotNullParameter(token, "token");
            this.token = token;
            this.orderByRange = str;
        }

        @Nullable
        public final String getOrderByRange() {
            return this.orderByRange;
        }

        @NotNull
        public final List<String> getToken() {
            return this.token;
        }
    }

    public /* synthetic */ ChainMarketListContract$UIIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ChainMarketListContract$UIIntent() {
    }
}
