package com.kubi.search.searchinitial.history;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mvi.p102vm.BaseVM;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.search.entity.SearchHistoryBean;
import com.kubi.search.entity.SearchItemData;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.search.utils.SearchExKt;
import com.kubi.utils.C27100x0;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import r10.C43901a;

/* JADX INFO: compiled from: HistoryVM.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000bJ\u0012\u0010\u0013\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002R\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/search/searchinitial/history/HistoryVM;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "historyListLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kubi/search/entity/SearchHistoryBean;", "getHistoryListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "onFirstShow", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "loadHistoryDataList", "addhistory", "Lkotlinx/coroutines/Job;", "data", "Lcom/kubi/search/entity/SearchItemData;", "cleanHistory", "notifyUI", "filterHistory", "", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHistoryVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryVM.kt\ncom/kubi/search/searchinitial/history/HistoryVM\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 SearchIssue.kt\ncom/kubi/search/exception/SearchIssueKt\n+ 4 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n106#2,2:98\n51#3:100\n53#3:105\n47#4,4:101\n1869#5,2:106\n*S KotlinDebug\n*F\n+ 1 HistoryVM.kt\ncom/kubi/search/searchinitial/history/HistoryVM\n*L\n37#1:98,2\n53#1:100\n53#1:105\n53#1:101,4\n84#1:106,2\n*E\n"})
public final class HistoryVM extends BaseVM {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final MutableLiveData<List<SearchHistoryBean>> f48918V = new MutableLiveData<>();

    @NotNull
    /* JADX INFO: renamed from: h */
    public final InterfaceC41775x1 m59231h(@NotNull SearchItemData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(new C43901a(CoroutineExceptionHandler.INSTANCE)), null, new HistoryVM$addhistory$1(data, this, null), 2, null);
    }

    /* JADX INFO: renamed from: n */
    public final void m59232n() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchinitial.history.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HistoryVM.m59228o(this.f48928b);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final List<SearchHistoryBean> m59233p(List<SearchHistoryBean> list) {
        final ArrayList arrayList = new ArrayList();
        for (final SearchHistoryBean searchHistoryBean : list) {
            String category = searchHistoryBean.getCategory();
            int iHashCode = category.hashCode();
            if (iHashCode != -503567600) {
                if (iHashCode != 3105752) {
                    if (iHashCode != 3645279 || !category.equals(SearchCategory$Companion.WEB3)) {
                        arrayList.add(searchHistoryBean);
                    } else if (SearchExKt.m59536r()) {
                        arrayList.add(searchHistoryBean);
                    }
                } else if (category.equals(SearchCategory$Companion.EARN)) {
                    C24129b.m58033e(SiteVisibleConfigKey.Financing, new Function0() { // from class: com.kubi.search.searchinitial.history.g
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HistoryVM.m59230r(arrayList, searchHistoryBean);
                        }
                    });
                } else {
                    arrayList.add(searchHistoryBean);
                }
            } else if (category.equals(SearchCategory$Companion.FUTURES)) {
                C24129b.m58033e(SiteVisibleConfigKey.Futures, new Function0() { // from class: com.kubi.search.searchinitial.history.f
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HistoryVM.m59229q(arrayList, searchHistoryBean);
                    }
                });
            } else {
                arrayList.add(searchHistoryBean);
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final MutableLiveData<List<SearchHistoryBean>> m59234s() {
        return this.f48918V;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m59228o(HistoryVM historyVM) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(historyVM), C42911a.m94120b(), null, new HistoryVM$cleanHistory$1$1(historyVM, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m59229q(List list, SearchHistoryBean searchHistoryBean) {
        list.add(searchHistoryBean);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m59230r(List list, SearchHistoryBean searchHistoryBean) {
        list.add(searchHistoryBean);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onFirstShow() {
        super.onFirstShow();
        InterfaceC41709m0 viewModelScope = ViewModelKt.getViewModelScope(this);
        if (C12573b.f21598a.m23696a()) {
            "search_event_result_click".length();
        }
        C12572a.m23693b(viewModelScope, new HistoryVM$onFirstShow$$inlined$bindFlowEvent$1("search_event_result_click", null, this));
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        m59235t();
    }

    /* JADX INFO: renamed from: t */
    public final void m59235t() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new HistoryVM$loadHistoryDataList$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC41775x1 m59236u(List<SearchHistoryBean> list) {
        return C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94121c(), null, new HistoryVM$notifyUI$1(this, list, null), 2, null);
    }
}
