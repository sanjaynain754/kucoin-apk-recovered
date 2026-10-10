package com.kubi.search.searchresult;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.search.entity.SearchResultViewData;
import com.kubi.search.entity.SearchResultWrap;
import com.kubi.search.searchresult.datasource.RemoteSearchDataSource;
import com.kubi.search.utils.SearchConst;
import com.kubi.search.utils.SearchDurationHelper;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.C33820nf;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: SearchResultVM.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0094@¢\u0006\u0002\u0010\fJ\b\u0010\u0018\u001a\u00020\tH\u0002J\b\u0010\u0019\u001a\u00020\tH\u0002J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J\u0016\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010\u001fJ\r\u0010 \u001a\u00020\tH\u0000¢\u0006\u0002\b!J\b\u0010\"\u001a\u00020\tH\u0014R\u0014\u0010\u0005\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/search/searchresult/SearchResultVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/search/searchresult/SearchIS$UIState;", "<init>", "()V", "initState", "getInitState", "()Lcom/kubi/search/searchresult/SearchIS$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentKey", "", "deliverKeyList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "remoteSearchMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlinx/coroutines/Job;", "viewData", "Lcom/kubi/search/entity/SearchResultViewData;", KlineFlutterMiniConstants.PROP_DATA_SOURCE, "Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource;", "cancelSearchJobs", "searchEmpty", FirebaseAnalytics.Event.SEARCH, "key", "handleSearchResult", DbParams.KEY_CHANNEL_RESULT, "Lcom/kubi/search/entity/SearchResultWrap;", "(Lcom/kubi/search/entity/SearchResultWrap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reset", "reset$SearchLib_googleRelease", "onCleared", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchResultVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchResultVM.kt\ncom/kubi/search/searchresult/SearchResultVM\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,116:1\n216#2,2:117\n*S KotlinDebug\n*F\n+ 1 SearchResultVM.kt\ncom/kubi/search/searchresult/SearchResultVM\n*L\n51#1:117,2\n*E\n"})
public final class SearchResultVM extends AbstractC19291m<SearchIS$UIState> {

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public SearchResultViewData f49031a0;

    /* JADX INFO: renamed from: X */
    @NotNull
    public String f49028X = "";

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final CopyOnWriteArrayList<String> f49029Y = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final ConcurrentHashMap<String, InterfaceC41775x1> f49030Z = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final RemoteSearchDataSource f49032b0 = new RemoteSearchDataSource();

    /* JADX INFO: renamed from: r */
    private final void m59444r(final String str) {
        SearchConst searchConst = SearchConst.f49150a;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        searchConst.m59593b(StringsKt.replace$default(string, C33820nf.f71144W, "", false, 4, (Object) null));
        C44128b.m97268l("searchV2", "search start. key=" + str + " (" + searchConst.m59592a() + ')');
        this.f49028X = str;
        CollectionsKt.removeAll((List) this.f49029Y, new Function1() { // from class: com.kubi.search.searchresult.n0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SearchResultVM.m59445s(str, (String) obj));
            }
        });
        this.f49030Z.put(str, launchOnIO(new SearchResultVM$search$2(this, str, null)));
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        if (interfaceC19282d instanceof Search) {
            m59446n();
            m59444r(((Search) interfaceC19282d).getKey());
        } else if (interfaceC19282d instanceof SearchIS$UIIntent$EmptyInput) {
            m59450t();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public final void m59446n() {
        for (Map.Entry<String, InterfaceC41775x1> entry : this.f49030Z.entrySet()) {
            if (!entry.getValue().isCancelled()) {
                JobKt__JobKt.m90366j(entry.getValue(), null, 1, null);
                InterfaceC41775x1.a.m91377a(entry.getValue(), null, 1, null);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.kubi.search.searchresult.SearchIS$UIState] */
    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public SearchIS$UIState getInitState() {
        return new InterfaceC19284f() { // from class: com.kubi.search.searchresult.SearchIS$UIState
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m59448p(SearchResultWrap searchResultWrap, Continuation<? super Unit> continuation) {
        SearchResultVM$handleSearchResult$1 searchResultVM$handleSearchResult$1;
        if (continuation instanceof SearchResultVM$handleSearchResult$1) {
            searchResultVM$handleSearchResult$1 = (SearchResultVM$handleSearchResult$1) continuation;
            int i11 = searchResultVM$handleSearchResult$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                searchResultVM$handleSearchResult$1.label = i11 - Integer.MIN_VALUE;
            } else {
                searchResultVM$handleSearchResult$1 = new SearchResultVM$handleSearchResult$1(this, continuation);
            }
        } else {
            searchResultVM$handleSearchResult$1 = new SearchResultVM$handleSearchResult$1(this, continuation);
        }
        Object obj = searchResultVM$handleSearchResult$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = searchResultVM$handleSearchResult$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            searchResultVM$handleSearchResult$1.L$0 = searchResultWrap;
            searchResultVM$handleSearchResult$1.label = 1;
            if (DelayKt.m90350b(1L, searchResultVM$handleSearchResult$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            searchResultWrap = (SearchResultWrap) searchResultVM$handleSearchResult$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        String searchKey = searchResultWrap.getSearchKey();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("search end. key=");
        sb2.append(searchKey);
        sb2.append(" (");
        SearchConst searchConst = SearchConst.f49150a;
        sb2.append(searchConst.m59592a());
        sb2.append(')');
        C44128b.m97268l("searchV2", sb2.toString());
        if (Intrinsics.areEqual(this.f49028X, searchKey)) {
            SearchResultViewData searchResultViewData = new SearchResultViewData(searchKey, searchResultWrap.getSpots(), searchResultWrap.getFutures(), searchResultWrap.getEarns(), searchResultWrap.getWeb3(), IQuoteFacadeService.f41383a.get().mo50712o() ? searchResultWrap.getAlpha() : CollectionsKt.emptyList(), searchResultWrap.getDepositInfo());
            if (this.f49029Y.contains(searchKey)) {
                C44128b.m97268l("searchV2", "key=" + searchKey + " has delivered, ignore");
            } else {
                this.f49029Y.add(searchKey);
                SearchTrackUploader.f49039a.m59482m().clear();
                this.f49031a0 = searchResultViewData;
                send(new C24445a(searchResultViewData));
            }
        } else {
            C44128b.m97268l("searchV2", "ignore. currentKey=" + this.f49028X + ",resultKey=" + searchKey + " (" + searchConst.m59592a() + ')');
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public final void m59449q() {
        this.f49029Y.clear();
        this.f49030Z.clear();
        SearchDurationHelper.f49161a.m59621e();
    }

    /* JADX INFO: renamed from: t */
    public final void m59450t() {
        this.f49028X = "";
        m59449q();
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m59445s(String str, String str2) {
        return Intrinsics.areEqual(str2, str);
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        m59449q();
    }
}
