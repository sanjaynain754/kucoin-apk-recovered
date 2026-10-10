package com.kubi.assets.search.depositandwithdraw;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.entity.SearchCoinEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p402kf.C41016c;
import p830zf.InterfaceC46799g0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SearchCoinVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 E2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001EB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\b\u0012\u0004\u0012\u00020\u00190\u0017H\u0000¢\u0006\u0002\b\u001aJ\u001f\u0010\u001b\u001a\u00020\u001c*\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001d\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u001eJ%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0017*\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001d\u001a\u00020\u0005H\u0000¢\u0006\u0002\b J\u0019\u0010\u001b\u001a\u00020\u001c*\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u001eJ\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0019H\u0002J5\u0010#\u001a\u00020\f\"\u0004\b\u0000\u0010$*\b\u0012\u0004\u0012\u0002H$0%2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u00020\f0'H\u0080\bø\u0001\u0000¢\u0006\u0002\b(J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u0005H\u0002J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0017H\u0002J\u0012\u0010,\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u001c0-H\u0002J\u0012\u0010.\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0012\u0010/\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u001c0-H\u0002J\u0012\u00100\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u001c0-H\u0002J\u0012\u00101\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u001c0-H\u0002J\u000e\u00102\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u00103J\u0010\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0019H\u0002J\b\u00108\u001a\u00020\u0015H\u0002J \u00109\u001a\u00020\u00152\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010;\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u0019H\u0002J\u0010\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\fH\u0002J\u0016\u0010?\u001a\u00020\u00152\u0006\u0010@\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010AR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010B\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006F"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/SearchCoinVM;", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UIState;", "fromType", "", "<init>", "(I)V", "getFromType", "()I", "setFromType", "withdrawCoinsEmpty", "", "vmHelper", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinVMHelper;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "needCatchException", "getNeedCatchException", "()Z", "onCleared", "", "toCoinList", "", "Lcom/kubi/data/entity/CoinInfoEntity;", "", "toCoinList$AssetsCenterLib_googleRelease", "toSearchCoinEntity", "Lcom/kubi/assets/entity/SearchCoinEntity;", "type", "toSearchCoinEntity$AssetsCenterLib_googleRelease", "toSearchCoinEntityList", "toSearchCoinEntityList$AssetsCenterLib_googleRelease", "handleAddHistoryItem", FirebaseAnalytics.Param.CURRENCY, "has", ExifInterface.GPS_DIRECTION_TRUE, "", "predicate", "Lkotlin/Function1;", "has$AssetsCenterLib_googleRelease", "handleGetCacheData", "dataType", "getCacheData", "addCoinListToListForWithdraw", "", "buildCoinList", "addHotToList", "addCoinListToListForDeposit", "addHistoryToList", "handleGetServerData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleGetPositionForSection", "intent", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$GetPositionForSection;", "handleGetCoinInfoByCurrentCurrency", "handleRemoveHistory", "handleGetCoinInfoIndexList", "coinInfoEntityList", "handleSearchCoin", "matchStr", "handleStartSearchMode", "searchMode", "dispatchIntentOnIO", "uiIntent", "(Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initState", "getInitState", "()Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UIState;", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchCoinVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchCoinVM.kt\ncom/kubi/assets/search/depositandwithdraw/SearchCoinVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,399:1\n137#1,3:418\n1617#2,9:400\n1869#2:409\n1870#2:411\n1626#2:412\n1563#2:413\n1634#2,3:414\n1068#2:421\n774#2:424\n865#2,2:425\n1563#2:427\n1634#2,3:428\n360#2,7:431\n1563#2:438\n1634#2,3:439\n2746#2,3:442\n1#3:410\n1#3:417\n17#4,2:422\n*S KotlinDebug\n*F\n+ 1 SearchCoinVM.kt\ncom/kubi/assets/search/depositandwithdraw/SearchCoinVM\n*L\n151#1:418,3\n96#1:400,9\n96#1:409\n96#1:411\n96#1:412\n104#1:413\n104#1:414,3\n202#1:421\n268#1:424\n268#1:425,2\n272#1:427\n272#1:428,3\n273#1:431,7\n311#1:438\n311#1:439,3\n159#1:442,3\n96#1:410\n229#1:422,2\n*E\n"})
public final class SearchCoinVM extends BaseStateVM<SearchCoinContract$UiIntent, UIState> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f18597Z = new Companion(null);

    /* JADX INFO: renamed from: a0 */
    public static boolean f18598a0;

    /* JADX INFO: renamed from: V */
    public int f18599V;

    /* JADX INFO: renamed from: W */
    public boolean f18600W = true;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final SearchCoinVMHelper f18601X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final CompositeDisposable f18602Y;

    /* JADX INFO: compiled from: SearchCoinVM.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/SearchCoinVM$Companion;", "", "<init>", "()V", "HISTORY_MAX_LIMIT", "", "TYPE_HISTORY", "TYPE_HOT", "TYPE_REMAIN_COIN", "TYPE_REMAIN_COIN_TEXT", "TYPE_COIN", "TYPE_EMPTY", "TYPE_WITH_COIN", "FROM_SEARCH", "FROM_NORMAL", "FROM_LOCAL", "FROM_SERVER", "FROM_REMOVE_HISTORY", "SEARCH_MODE", "", "getSEARCH_MODE", "()Z", "setSEARCH_MODE", "(Z)V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final boolean getSEARCH_MODE() {
            return SearchCoinVM.f18598a0;
        }

        public final void setSEARCH_MODE(boolean z11) {
            SearchCoinVM.f18598a0 = z11;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.search.depositandwithdraw.SearchCoinVM$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 SearchCoinVM.kt\ncom/kubi/assets/search/depositandwithdraw/SearchCoinVM\n*L\n1#1,328:1\n204#2:329\n*E\n"})
    public static final class C10848a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            CoinInfoEntity coinInfoEntity = (CoinInfoEntity) t12;
            CoinInfoEntity coinInfoEntity2 = (CoinInfoEntity) t11;
            return ComparisonsKt.compareValues(Double.valueOf(C41014a.m89939m(coinInfoEntity.getAvailableBalance(), coinInfoEntity.getCode())), Double.valueOf(C41014a.m89939m(coinInfoEntity2.getAvailableBalance(), coinInfoEntity2.getCode())));
        }
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    public boolean getNeedCatchException() {
        return true;
    }

    /* JADX INFO: renamed from: A */
    public static final UIState m19024A(List list, SearchCoinVM searchCoinVM, int i11, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        boolean z11 = true;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((SearchCoinEntity) it.next()).getType() == 3) {
                    z11 = false;
                    break;
                }
            }
        }
        return UIState.copy$default(updateState, null, 0, list, i11, z11, searchCoinVM.f18600W, 1, 3, null);
    }

    /* JADX INFO: renamed from: C */
    public static final UIState m19025C(SearchCoinVM searchCoinVM, String str, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, searchCoinVM.f18601X.mo18914i(str), 0, null, 0, false, false, 0, 126, null);
    }

    /* JADX INFO: renamed from: F */
    public static final UIState m19026F(Integer num, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, num != null ? num.intValue() : -1, null, 0, false, false, 0, 125, null);
    }

    /* JADX INFO: renamed from: J */
    public static final UIState m19027J(List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, 0, list, 1, false, false, 2, 51, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m19034i(SearchCoinVM searchCoinVM, Boolean bool) {
        searchCoinVM.sendSingleEvent(C10855c.f18608a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public final void m19039B(final String str) {
        updateState(new Function1() { // from class: com.kubi.assets.search.depositandwithdraw.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchCoinVM.m19025C(this.f18622b, str, (UIState) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final void m19040D(List<? extends CoinInfoEntity> list, int i11) {
        List listDistinct;
        if (list != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String currency = ((CoinInfoEntity) it.next()).getCurrency();
                Intrinsics.checkNotNullExpressionValue(currency, "getCurrency(...)");
                String strValueOf = String.valueOf(StringsKt.first(currency));
                Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                arrayList.add(upperCase);
            }
            listDistinct = CollectionsKt.distinct(arrayList);
        } else {
            listDistinct = null;
        }
        sendSingleEvent(new C10853b(listDistinct, i11));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: G */
    public final Object m19042G(Continuation<? super Unit> continuation) {
        SearchCoinVM$handleGetServerData$1 searchCoinVM$handleGetServerData$1;
        if (continuation instanceof SearchCoinVM$handleGetServerData$1) {
            searchCoinVM$handleGetServerData$1 = (SearchCoinVM$handleGetServerData$1) continuation;
            int i11 = searchCoinVM$handleGetServerData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                searchCoinVM$handleGetServerData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                searchCoinVM$handleGetServerData$1 = new SearchCoinVM$handleGetServerData$1(this, continuation);
            }
        } else {
            searchCoinVM$handleGetServerData$1 = new SearchCoinVM$handleGetServerData$1(this, continuation);
        }
        Object objMo18916q = searchCoinVM$handleGetServerData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = searchCoinVM$handleGetServerData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo18916q);
            SearchCoinVMHelper searchCoinVMHelper = this.f18601X;
            searchCoinVM$handleGetServerData$1.label = 1;
            objMo18916q = searchCoinVMHelper.mo18916q(searchCoinVM$handleGetServerData$1);
            if (objMo18916q == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo18916q);
        }
        ((Boolean) objMo18916q).getClass();
        m19057z(4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public final void m19043H() {
        this.f18601X.mo18917s();
        m19057z(5);
    }

    /* JADX INFO: renamed from: K */
    public final void m19045K(boolean z11) {
        if (this.f18599V != 2) {
            return;
        }
        f18598a0 = z11;
        if (z11) {
            m19044I("");
        } else {
            m19057z(3);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final SearchCoinEntity m19046L(@NotNull CoinInfoEntity coinInfoEntity, int i11) {
        Intrinsics.checkNotNullParameter(coinInfoEntity, "<this>");
        return new SearchCoinEntity(i11, coinInfoEntity, null, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final List<SearchCoinEntity> m19047M(@NotNull List<? extends CoinInfoEntity> list, int i11) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m19046L((CoinInfoEntity) it.next(), i11));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public final void m19048q(List<SearchCoinEntity> list) {
        if (this.f18599V == 1) {
            CopyOnWriteArrayList<CoinInfoEntity> copyOnWriteArrayListM19076j = this.f18601X.m19076j();
            if (copyOnWriteArrayListM19076j == null || copyOnWriteArrayListM19076j.isEmpty()) {
                list.add(this.f18601X.m19073f());
            } else {
                list.addAll(m19047M(this.f18601X.m19076j(), 5));
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m19049r(List<SearchCoinEntity> list) {
        Object next;
        if (this.f18599V == 2) {
            List<CoinInfoEntity> listM19078l = this.f18601X.m19078l();
            this.f18600W = listM19078l == null || listM19078l.isEmpty();
            if (listM19078l != null && !listM19078l.isEmpty() && !f18598a0) {
                list.add(this.f18601X.m19074g(4));
                list.addAll(m19047M(CollectionsKt.sortedWith(listM19078l, new C10848a()), 3));
                return;
            }
            CopyOnWriteArrayList<CoinInfoEntity> copyOnWriteArrayListM19076j = this.f18601X.m19076j();
            if (copyOnWriteArrayListM19076j == null || copyOnWriteArrayListM19076j.isEmpty()) {
                list.add(this.f18601X.m19073f());
                return;
            }
            list.addAll(m19047M(this.f18601X.m19076j(), 10));
            if (!f18598a0 || this.f18600W) {
                return;
            }
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((SearchCoinEntity) next).getType() != 1);
            SearchCoinEntity searchCoinEntity = (SearchCoinEntity) next;
            if (searchCoinEntity != null) {
                list.remove(searchCoinEntity);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m19050s(List<SearchCoinEntity> list) {
        List<CoinInfoEntity> listMo18915m = this.f18601X.mo18915m();
        if (listMo18915m != null) {
            this.f18601X.m19079n().clear();
            this.f18601X.m19079n().addAll(listMo18915m);
            list.add(this.f18601X.m19075h(listMo18915m, 1));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m19051t(List<SearchCoinEntity> list) {
        List<CoinInfoEntity> listM19080o;
        if (this.f18599V == 1) {
            Object objM56186h = Router.f46192a.m56186h(InterfaceC46799g0.class, SiteInfoManager.f47913a.m58109c());
            if (!(objM56186h != null ? ((InterfaceC46799g0) objM56186h).m103129b() : true) || (listM19080o = this.f18601X.m19080o()) == null) {
                return;
            }
            list.add(this.f18601X.m19075h(listM19080o, 2));
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m19052u(List<? extends CoinInfoEntity> list) {
        this.f18601X.m19076j().clear();
        this.f18601X.m19076j().addAll(list);
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Object dispatchIntentOnIO(@NotNull SearchCoinContract$UiIntent searchCoinContract$UiIntent, @NotNull Continuation<? super Unit> continuation) {
        if (searchCoinContract$UiIntent instanceof SearchCoinContract$UiIntent.GetCacheData) {
            m19057z(3);
        } else if (searchCoinContract$UiIntent instanceof SearchCoinContract$UiIntent.GetHeaderIndexList) {
            m19040D(this.f18601X.m19076j(), 2);
        } else if (searchCoinContract$UiIntent instanceof SearchCoinContract$UiIntent.AddHistoryIntent) {
            m19056y(((SearchCoinContract$UiIntent.AddHistoryIntent) searchCoinContract$UiIntent).getItem());
        } else if (searchCoinContract$UiIntent instanceof SearchCoinContract$UiIntent.SearchCoinIntent) {
            m19044I(((SearchCoinContract$UiIntent.SearchCoinIntent) searchCoinContract$UiIntent).getMatchStr());
        } else if (searchCoinContract$UiIntent instanceof SearchCoinContract$UiIntent.RemoveHistoryList) {
            m19043H();
        } else if (searchCoinContract$UiIntent instanceof SearchCoinContract$UiIntent.GetPositionForSection) {
            m19041E((SearchCoinContract$UiIntent.GetPositionForSection) searchCoinContract$UiIntent);
        } else if (searchCoinContract$UiIntent instanceof SearchCoinContract$UiIntent.FindCoinInfo) {
            m19039B(((SearchCoinContract$UiIntent.FindCoinInfo) searchCoinContract$UiIntent).getCurrency());
        } else if (searchCoinContract$UiIntent instanceof SearchCoinContract$UiIntent.StartSearchMode) {
            m19045K(((SearchCoinContract$UiIntent.StartSearchMode) searchCoinContract$UiIntent).getSearchMode());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public final List<SearchCoinEntity> m19054w() {
        ArrayList arrayList = new ArrayList();
        List<CoinInfoEntity> listM19077k = this.f18601X.m19077k();
        if (listM19077k != null) {
            m19052u(listM19077k);
        }
        m19050s(arrayList);
        m19051t(arrayList);
        m19048q(arrayList);
        m19049r(arrayList);
        return arrayList;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, 0, null, 0, false, false, 0, 127, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m19056y(String str) {
        Object obj;
        CopyOnWriteArrayList<CoinInfoEntity> copyOnWriteArrayListM19079n = this.f18601X.m19079n();
        if (copyOnWriteArrayListM19079n.size() >= 6) {
            CollectionsKt.removeLastOrNull(copyOnWriteArrayListM19079n);
        }
        CoinInfoEntity coinInfoEntityMo18914i = this.f18601X.mo18914i(str);
        if (coinInfoEntityMo18914i != null) {
            Iterator<T> it = copyOnWriteArrayListM19079n.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                CoinInfoEntity coinInfoEntity = (CoinInfoEntity) next;
                if (Intrinsics.areEqual(coinInfoEntity != null ? coinInfoEntity.getCurrency() : null, coinInfoEntityMo18914i.getCurrency())) {
                    obj = next;
                    break;
                }
            }
            CoinInfoEntity coinInfoEntity2 = (CoinInfoEntity) obj;
            if (coinInfoEntity2 != null) {
                copyOnWriteArrayListM19079n.remove(coinInfoEntity2);
            }
            copyOnWriteArrayListM19079n.add(0, coinInfoEntityMo18914i);
            Unit unit = Unit.INSTANCE;
        }
        this.f18601X.mo18918u();
    }

    public SearchCoinVM(int i11) {
        this.f18599V = i11;
        this.f18601X = C10886r0.m19087a(i11);
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.f18602Y = compositeDisposable;
        if (this.f18599V == 2) {
            PublishSubject<Boolean> publishSubjectM89963a = C41016c.m89963a();
            final Function1 function1 = new Function1() { // from class: com.kubi.assets.search.depositandwithdraw.l0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchCoinVM.m19034i(this.f18634b, (Boolean) obj);
                }
            };
            Disposable disposableSubscribe = publishSubjectM89963a.subscribe(new Consumer() { // from class: com.kubi.assets.search.depositandwithdraw.m0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SearchCoinVM.m19035j(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, compositeDisposable);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m19035j(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E */
    public final void m19041E(SearchCoinContract$UiIntent.GetPositionForSection getPositionForSection) {
        final Integer numValueOf;
        String currency;
        List<SearchCoinEntity> coinList = getPositionForSection.getCoinList();
        if (coinList != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : coinList) {
                SearchCoinEntity searchCoinEntity = (SearchCoinEntity) obj;
                if (searchCoinEntity.getF38450c() == 5 || searchCoinEntity.getF38450c() == 10) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((SearchCoinEntity) it.next()).getCoinEntity());
            }
            Iterator it2 = arrayList2.iterator();
            int i11 = 0;
            while (true) {
                if (it2.hasNext()) {
                    CoinInfoEntity coinInfoEntity = (CoinInfoEntity) it2.next();
                    if (coinInfoEntity != null && (currency = coinInfoEntity.getCurrency()) != null) {
                        char[] charArray = currency.toCharArray();
                        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
                        if (charArray != null) {
                            char c11 = charArray[0];
                            char[] charArray2 = getPositionForSection.getSectionString().toCharArray();
                            Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
                            if (c11 == charArray2[0]) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            numValueOf = Integer.valueOf(i11);
        } else {
            numValueOf = null;
        }
        updateState(new Function1() { // from class: com.kubi.assets.search.depositandwithdraw.j0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return SearchCoinVM.m19026F(numValueOf, (UIState) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final void m19044I(String str) {
        final List<SearchCoinEntity> arrayList;
        if (str.length() == 0) {
            m19057z(1);
            return;
        }
        CopyOnWriteArrayList<CoinInfoEntity> copyOnWriteArrayListM19076j = this.f18601X.m19076j();
        if (copyOnWriteArrayListM19076j != null && !copyOnWriteArrayListM19076j.isEmpty()) {
            arrayList = this.f18601X.mo18913d(copyOnWriteArrayListM19076j);
        } else {
            arrayList = new ArrayList<>();
            arrayList.add(new SearchCoinEntity(6, null, null, 6, null));
        }
        updateState(new Function1() { // from class: com.kubi.assets.search.depositandwithdraw.k0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchCoinVM.m19027J(arrayList, (UIState) obj);
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        f18598a0 = false;
        this.f18602Y.clear();
    }

    /* JADX INFO: renamed from: z */
    public final void m19057z(final int i11) {
        final List<SearchCoinEntity> listM19054w = m19054w();
        if (i11 == 3 && (listM19054w == null || !listM19054w.isEmpty())) {
            Iterator<T> it = listM19054w.iterator();
            do {
                if (!it.hasNext()) {
                    updateState(new Function1() { // from class: com.kubi.assets.search.depositandwithdraw.i0
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SearchCoinVM.m19024A(listM19054w, this, i11, (UIState) obj);
                        }
                    });
                    break;
                }
            } while (((SearchCoinEntity) it.next()).getType() != 6);
        } else {
            updateState(new Function1() { // from class: com.kubi.assets.search.depositandwithdraw.i0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchCoinVM.m19024A(listM19054w, this, i11, (UIState) obj);
                }
            });
            break;
        }
        if (i11 == 3) {
            launchOnIO(new SearchCoinVM$handleGetCacheData$1$2(this, null));
        }
    }
}
