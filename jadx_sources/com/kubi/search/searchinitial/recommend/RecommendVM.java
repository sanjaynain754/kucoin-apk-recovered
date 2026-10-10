package com.kubi.search.searchinitial.recommend;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.data.entity.WsFutureSnapshotEntity;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.kucoin.manager.MarketWsHelper;
import com.kubi.mvi.p102vm.BaseVM;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.search.SearchApi;
import com.kubi.search.entity.ContractEntity;
import com.kubi.search.entity.ContractTradeItemBean;
import com.kubi.search.entity.SearchRecommendWrap;
import com.kubi.utils.C27100x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import r10.C43901a;

/* JADX INFO: compiled from: RecommendVM.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u001f\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/search/searchinitial/recommend/RecommendVM;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "api", "Lcom/kubi/search/SearchApi;", "recommendLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/search/entity/SearchRecommendWrap;", "getRecommendLiveData", "()Landroidx/lifecycle/MutableLiveData;", "spotWsLiveData", "", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "getSpotWsLiveData", "futureWsLiveData", "Lcom/kubi/data/entity/WsFutureSnapshotEntity;", "getFutureWsLiveData", "wsHelper", "Lcom/kubi/kucoin/manager/MarketWsHelper;", "onFirstShow", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "loadDatas", "Lkotlinx/coroutines/Job;", "wsSubscribe", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRecommendVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendVM.kt\ncom/kubi/search/searchinitial/recommend/RecommendVM\n+ 2 SearchIssue.kt\ncom/kubi/search/exception/SearchIssueKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n51#2:95\n53#2:100\n47#3,4:96\n1617#4,9:101\n1869#4:110\n1870#4:112\n1626#4:113\n774#4:114\n865#4,2:115\n1563#4:117\n1634#4,3:118\n774#4:121\n865#4,2:122\n1#5:111\n*S KotlinDebug\n*F\n+ 1 RecommendVM.kt\ncom/kubi/search/searchinitial/recommend/RecommendVM\n*L\n55#1:95\n55#1:100\n55#1:96,4\n79#1:101,9\n79#1:110\n79#1:112\n79#1:113\n79#1:114\n79#1:115,2\n85#1:117\n85#1:118,3\n87#1:121\n87#1:122,2\n79#1:111\n*E\n"})
public final class RecommendVM extends BaseVM {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final SearchApi f48951V = (SearchApi) RetrofitFlowExKt.m42820a(SearchApi.class);

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<SearchRecommendWrap> f48952W = new MutableLiveData<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<List<WsMarketSnapshotEntity>> f48953X = new MutableLiveData<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<List<WsFutureSnapshotEntity>> f48954Y = new MutableLiveData<>();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MarketWsHelper f48955Z = new MarketWsHelper();

    /* JADX INFO: renamed from: s */
    public static final Unit m59271s(final RecommendVM recommendVM) {
        SearchRecommendWrap value = recommendVM.f48952W.getValue();
        if (value == null) {
            return Unit.INSTANCE;
        }
        List<TradeItemBean> spotList = value.getSpotList();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = spotList.iterator();
        while (it.hasNext()) {
            String symbol = ((TradeItemBean) it.next()).getSymbol();
            if (symbol != null) {
                arrayList.add(symbol);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            MarketWsHelper.m32519D(recommendVM.f48955Z, arrayList2, 0L, new Function1() { // from class: com.kubi.search.searchinitial.recommend.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return RecommendVM.m59272t(this.f48967b, (List) obj2);
                }
            }, 2, null);
        }
        List<ContractTradeItemBean> futureList = value.getFutureList();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(futureList, 10));
        Iterator<T> it2 = futureList.iterator();
        while (it2.hasNext()) {
            ContractEntity contract = ((ContractTradeItemBean) it2.next()).getContract();
            String symbol2 = contract != null ? contract.getSymbol() : null;
            if (symbol2 == null) {
                symbol2 = "";
            }
            arrayList3.add(symbol2);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (((String) obj2).length() > 0) {
                arrayList4.add(obj2);
            }
        }
        if (!arrayList4.isEmpty()) {
            MarketWsHelper.m32517A(recommendVM.f48955Z, arrayList4, 0L, new Function1() { // from class: com.kubi.search.searchinitial.recommend.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return RecommendVM.m59273u(this.f48968b, (List) obj3);
                }
            }, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m59272t(RecommendVM recommendVM, List wsList) {
        Intrinsics.checkNotNullParameter(wsList, "wsList");
        recommendVM.launchOnMain(new RecommendVM$wsSubscribe$1$1$1(recommendVM, wsList, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m59273u(RecommendVM recommendVM, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        recommendVM.f48954Y.postValue(it);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final MutableLiveData<List<WsFutureSnapshotEntity>> m59274n() {
        return this.f48954Y;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final MutableLiveData<SearchRecommendWrap> m59275o() {
        return this.f48952W;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final MutableLiveData<List<WsMarketSnapshotEntity>> m59276p() {
        return this.f48953X;
    }

    /* JADX INFO: renamed from: r */
    public final void m59278r() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchinitial.recommend.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendVM.m59271s(this.f48966b);
            }
        });
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onFirstShow() {
        super.onFirstShow();
        m59277q();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        this.f48955Z.m32541F();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        m59278r();
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC41775x1 m59277q() {
        return C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(new C43901a(CoroutineExceptionHandler.INSTANCE)), null, new RecommendVM$loadDatas$1(this, null), 2, null);
    }
}
