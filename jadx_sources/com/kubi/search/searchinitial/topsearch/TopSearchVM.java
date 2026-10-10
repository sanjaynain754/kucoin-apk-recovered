package com.kubi.search.searchinitial.topsearch;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kucoin.manager.MarketWsHelper;
import com.kubi.mvi.p102vm.BaseVM;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.search.SearchApi;
import com.kubi.search.entity.SearchRealtimeEntity;
import com.kubi.search.entity.TopSearchEntityWrap;
import com.kubi.utils.C27100x0;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import r10.C43901a;

/* JADX INFO: compiled from: TopSearchVM.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0012\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/search/searchinitial/topsearch/TopSearchVM;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "api", "Lcom/kubi/search/SearchApi;", "topSearchLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/search/entity/TopSearchEntityWrap;", "getTopSearchLiveData", "()Landroidx/lifecycle/MutableLiveData;", "topSearchWsData", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "getTopSearchWsData", "wsHelper", "Lcom/kubi/kucoin/manager/MarketWsHelper;", "getWsHelper", "()Lcom/kubi/kucoin/manager/MarketWsHelper;", "wsHelper$delegate", "Lkotlin/Lazy;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "", "refreshTopicAndRealTimeSearch", "subscribeRealtimeWS", "realtimeEntity", "Lcom/kubi/search/entity/SearchRealtimeEntity;", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTopSearchVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopSearchVM.kt\ncom/kubi/search/searchinitial/topsearch/TopSearchVM\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 SearchIssue.kt\ncom/kubi/search/exception/SearchIssueKt\n+ 4 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n132#2,2:104\n51#3:106\n53#3:111\n47#4,4:107\n295#5,2:112\n1#6:114\n*S KotlinDebug\n*F\n+ 1 TopSearchVM.kt\ncom/kubi/search/searchinitial/topsearch/TopSearchVM\n*L\n44#1:104,2\n55#1:106\n55#1:111\n55#1:107,4\n95#1:112,2\n*E\n"})
public final class TopSearchVM extends BaseVM {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final SearchApi f48973V = (SearchApi) RetrofitFlowExKt.m42820a(SearchApi.class);

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<TopSearchEntityWrap> f48974W = new MutableLiveData<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<WsMarketSnapshotEntity> f48975X = new MutableLiveData<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f48976Y = LazyKt.lazy(new Function0() { // from class: com.kubi.search.searchinitial.topsearch.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TopSearchVM.m59292A();
        }
    });

    /* JADX INFO: renamed from: A */
    public static final MarketWsHelper m59292A() {
        return new MarketWsHelper();
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m59300y(SearchRealtimeEntity searchRealtimeEntity, final TopSearchVM topSearchVM) {
        Integer numRealtimeType;
        Integer numRealtimeType2;
        if ((searchRealtimeEntity == null || (numRealtimeType2 = searchRealtimeEntity.realtimeType()) == null || numRealtimeType2.intValue() != 2) && (searchRealtimeEntity == null || (numRealtimeType = searchRealtimeEntity.realtimeType()) == null || numRealtimeType.intValue() != 3)) {
            return Unit.INSTANCE;
        }
        final String symbol = searchRealtimeEntity.getSymbol();
        if (symbol == null) {
            return Unit.INSTANCE;
        }
        MarketWsHelper.m32519D(topSearchVM.m59304v(), CollectionsKt.listOf(symbol), 0L, new Function1() { // from class: com.kubi.search.searchinitial.topsearch.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TopSearchVM.m59301z(symbol, topSearchVM, (List) obj);
            }
        }, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m59301z(String str, TopSearchVM topSearchVM, List wsList) {
        Object next;
        Intrinsics.checkNotNullParameter(wsList, "wsList");
        Iterator it = wsList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((WsMarketSnapshotEntity) next).getSymbolCode(), str));
        WsMarketSnapshotEntity wsMarketSnapshotEntity = (WsMarketSnapshotEntity) next;
        if (wsMarketSnapshotEntity != null) {
            topSearchVM.f48975X.postValue(wsMarketSnapshotEntity);
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final MutableLiveData<TopSearchEntityWrap> m59302t() {
        return this.f48974W;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final MutableLiveData<WsMarketSnapshotEntity> m59303u() {
        return this.f48975X;
    }

    /* JADX INFO: renamed from: v */
    public final MarketWsHelper m59304v() {
        return (MarketWsHelper) this.f48976Y.getValue();
    }

    /* JADX INFO: renamed from: x */
    public final void m59306x(final SearchRealtimeEntity searchRealtimeEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchinitial.topsearch.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TopSearchVM.m59300y(searchRealtimeEntity, this);
            }
        });
    }

    public TopSearchVM() {
        InterfaceC41709m0 viewModelScope = ViewModelKt.getViewModelScope(this);
        if (C12573b.f21598a.m23696a()) {
            "search_event_realtime_countdown_finish".length();
        }
        C12572a.m23693b(viewModelScope, new TopSearchVM$special$$inlined$bindFlowEvent$1("search_event_realtime_countdown_finish", null, this));
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        m59304v().m32541F();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        m59305w();
    }

    /* JADX INFO: renamed from: w */
    public final void m59305w() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(new C43901a(CoroutineExceptionHandler.INSTANCE)), null, new TopSearchVM$refreshTopicAndRealTimeSearch$1(this, null), 2, null);
    }
}
