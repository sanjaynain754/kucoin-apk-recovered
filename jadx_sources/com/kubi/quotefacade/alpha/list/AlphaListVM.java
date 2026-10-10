package com.kubi.quotefacade.alpha.list;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.kucoin.manager.C15506i;
import com.kubi.kucoin.manager.MarketWsHelper;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.otc.entity.OtcAd;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.alpha.AlphaCurrent;
import com.kubi.quotefacade.constant.AlphaMenu;
import com.kubi.quotefacade.constant.TimeSelectedEnum;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.quotefacade.entity.AlphaListBodyEntity;
import com.kubi.quotefacade.entity.AlphaListBodyParam;
import com.kubi.quotefacade.entity.AlphaMarketEntity;
import com.kubi.quotefacade.entity.AlphaNetworks;
import com.kubi.quotefacade.entity.ChainFilterData;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import com.kubi.utils.extensions.C27039d;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p814yz.C46614a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: AlphaListVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0014J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\u0016\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0094@¢\u0006\u0002\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0082@¢\u0006\u0002\u0010%J&\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0082@¢\u0006\u0002\u0010(J0\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010 \u001a\u00020\f2\u0006\u0010+\u001a\u00020\n2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0082@¢\u0006\u0002\u0010,J \u0010-\u001a\u00020.2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010/\u001a\u00020\u00152\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u000101H\u0002J\u001e\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\nH\u0082@¢\u0006\u0002\u00106R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u00067"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/list/AlphaListVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UIState;", "<init>", "()V", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "wsHelper", "Lcom/kubi/kucoin/manager/MarketWsHelper;", "currentRequestPage", "", "TAG", "", "lastFetchDataListIntent", "Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchDataList;", "networkRecovery", "Lcom/kubi/sdk/network/NetworkRecoveryMonitor;", "initState", "getInitState", "()Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UIState;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onCleared", "requestNetworkRecoveryRefresh", "dispatchIntent", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchDataList", "resetRefresh", "", "alphaType", "menu", "Lcom/kubi/quotefacade/constant/AlphaMenu;", "localParam", "Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;", "(ZLjava/lang/String;Lcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMoreDataList", "type", "(Ljava/lang/String;Lcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPage", "Lcom/kubi/quotefacade/entity/AlphaMarketEntity;", "currentPage", "(Ljava/lang/String;ILcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertBodyParams", "Lcom/kubi/quotefacade/entity/AlphaListBodyParam;", "subscribeWs", "symbols", "", "favAlpha", "alphaItem", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", ViewProps.POSITION, "(Lcom/kubi/quotefacade/entity/AlphaItemEntity;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlphaListVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaListVM.kt\ncom/kubi/quotefacade/alpha/list/AlphaListVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n774#2:200\n865#2,2:201\n1#3:203\n*S KotlinDebug\n*F\n+ 1 AlphaListVM.kt\ncom/kubi/quotefacade/alpha/list/AlphaListVM\n*L\n103#1:200\n103#1:201,2\n*E\n"})
public final class AlphaListVM extends AbstractC19291m<AlphaListContract$UIState> {

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public AlphaListContract$UiIntent.FetchDataList f41319b0;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final QuoteMarketRepository f41315X = new QuoteMarketRepository();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MarketWsHelper f41316Y = new MarketWsHelper();

    /* JADX INFO: renamed from: Z */
    public int f41317Z = 1;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final String f41318a0 = "AlphaListVM";

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final C46614a f41320c0 = new C46614a("AlphaListVM", new AlphaListVM$networkRecovery$1(this));

    /* JADX INFO: renamed from: i */
    public static final AlphaListBodyEntity m50651i(String str, String str2, String str3) {
        AlphaListBodyEntity alphaListBodyEntity = new AlphaListBodyEntity(null, null, null, null, 15, null);
        alphaListBodyEntity.setFilterBy(str);
        if (str2 == null) {
            str2 = "";
        }
        alphaListBodyEntity.setGte(str2);
        if (str3 == null) {
            str3 = "";
        }
        alphaListBodyEntity.setLte(str3);
        return alphaListBodyEntity;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m50652s(AlphaListVM alphaListVM, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        alphaListVM.send(new C21705j(it));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        AlphaListContract$UiIntent.CollectOrCancelChain collectOrCancelChain;
        AlphaItemEntity alphaItem;
        Object objM50654j;
        if (interfaceC19282d instanceof AlphaListContract$UiIntent.FetchDataList) {
            AlphaListContract$UiIntent.FetchDataList fetchDataList = (AlphaListContract$UiIntent.FetchDataList) interfaceC19282d;
            this.f41319b0 = fetchDataList;
            Object objM50655k = m50655k(fetchDataList.getResetRefresh(), fetchDataList.getAlphaType(), fetchDataList.getMenu(), fetchDataList.getParam(), continuation);
            return objM50655k == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM50655k : Unit.INSTANCE;
        }
        if (interfaceC19282d instanceof AlphaListContract$UiIntent.LoadMoreDataList) {
            AlphaListContract$UiIntent.LoadMoreDataList loadMoreDataList = (AlphaListContract$UiIntent.LoadMoreDataList) interfaceC19282d;
            Object objM50657o = m50657o(loadMoreDataList.getAlphaType(), loadMoreDataList.getMenu(), loadMoreDataList.getParam(), continuation);
            return objM50657o == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM50657o : Unit.INSTANCE;
        }
        if (interfaceC19282d instanceof AlphaListContract$UiIntent.FetchWsDataList) {
            m50660r(((AlphaListContract$UiIntent.FetchWsDataList) interfaceC19282d).getSymbols());
        } else if ((interfaceC19282d instanceof AlphaListContract$UiIntent.CollectOrCancelChain) && (alphaItem = (collectOrCancelChain = (AlphaListContract$UiIntent.CollectOrCancelChain) interfaceC19282d).getAlphaItem()) != null && (objM50654j = m50654j(alphaItem, collectOrCancelChain.getItemPosition(), continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM50654j;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m50654j(AlphaItemEntity alphaItemEntity, int i11, Continuation<? super Unit> continuation) {
        AlphaListVM$favAlpha$1 alphaListVM$favAlpha$1;
        if (continuation instanceof AlphaListVM$favAlpha$1) {
            alphaListVM$favAlpha$1 = (AlphaListVM$favAlpha$1) continuation;
            int i12 = alphaListVM$favAlpha$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                alphaListVM$favAlpha$1.label = i12 - Integer.MIN_VALUE;
            } else {
                alphaListVM$favAlpha$1 = new AlphaListVM$favAlpha$1(this, continuation);
            }
        } else {
            alphaListVM$favAlpha$1 = new AlphaListVM$favAlpha$1(this, continuation);
        }
        Object obj = alphaListVM$favAlpha$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = alphaListVM$favAlpha$1.label;
        if (i13 == 0) {
            ResultKt.throwOnFailure(obj);
            QuoteMarketRepository quoteMarketRepository = this.f41315X;
            List<String> listListOf = CollectionsKt.listOf(alphaItemEntity.getToken() + '-' + alphaItemEntity.getExternalChain());
            alphaListVM$favAlpha$1.L$0 = alphaItemEntity;
            alphaListVM$favAlpha$1.I$0 = i11;
            alphaListVM$favAlpha$1.label = 1;
            if (quoteMarketRepository.m52992f(listListOf, alphaListVM$favAlpha$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = alphaListVM$favAlpha$1.I$0;
            alphaItemEntity = (AlphaItemEntity) alphaListVM$favAlpha$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        send(new C21699g(alphaItemEntity, i11));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: k */
    public final Object m50655k(boolean z11, String str, AlphaMenu alphaMenu, AlphaCurrent.a aVar, Continuation<? super Unit> continuation) {
        AlphaListVM$fetchDataList$1 alphaListVM$fetchDataList$1;
        AlphaMenu alphaMenu2;
        List<AlphaItemEntity> listEmptyList;
        if (continuation instanceof AlphaListVM$fetchDataList$1) {
            alphaListVM$fetchDataList$1 = (AlphaListVM$fetchDataList$1) continuation;
            int i11 = alphaListVM$fetchDataList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                alphaListVM$fetchDataList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                alphaListVM$fetchDataList$1 = new AlphaListVM$fetchDataList$1(this, continuation);
            }
        } else {
            alphaListVM$fetchDataList$1 = new AlphaListVM$fetchDataList$1(this, continuation);
        }
        AlphaListVM$fetchDataList$1 alphaListVM$fetchDataList$2 = alphaListVM$fetchDataList$1;
        Object objM50658p = alphaListVM$fetchDataList$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = alphaListVM$fetchDataList$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM50658p);
            if (z11) {
                this.f41317Z = 1;
            }
            int i13 = this.f41317Z;
            alphaListVM$fetchDataList$2.L$0 = SpillingKt.nullOutSpilledVariable(str);
            alphaListVM$fetchDataList$2.L$1 = alphaMenu;
            alphaListVM$fetchDataList$2.L$2 = SpillingKt.nullOutSpilledVariable(aVar);
            alphaListVM$fetchDataList$2.Z$0 = z11;
            alphaListVM$fetchDataList$2.label = 1;
            objM50658p = m50658p(str, i13, alphaMenu, aVar, alphaListVM$fetchDataList$2);
            if (objM50658p == coroutine_suspended) {
                return coroutine_suspended;
            }
            alphaMenu2 = alphaMenu;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            alphaMenu2 = (AlphaMenu) alphaListVM$fetchDataList$2.L$1;
            ResultKt.throwOnFailure(objM50658p);
        }
        AlphaMarketEntity alphaMarketEntity = (AlphaMarketEntity) objM50658p;
        List<AlphaItemEntity> items = alphaMarketEntity != null ? alphaMarketEntity.getItems() : null;
        if (items == null) {
            items = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            AlphaItemEntity alphaItemEntity = (AlphaItemEntity) obj;
            if (alphaMenu2 == AlphaMenu.NEW || C27039d.m66652l(alphaItemEntity.getAlphaOpeningAt()) <= 0) {
                arrayList.add(obj);
            }
        }
        if (alphaMarketEntity == null || (listEmptyList = alphaMarketEntity.getItems()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        send(new C21701h(listEmptyList));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.kubi.quotefacade.alpha.list.AlphaListContract$UIState] */
    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public AlphaListContract$UIState getInitState() {
        return new InterfaceC19284f() { // from class: com.kubi.quotefacade.alpha.list.AlphaListContract$UIState
        };
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: o */
    public final Object m50657o(String str, AlphaMenu alphaMenu, AlphaCurrent.a aVar, Continuation<? super Unit> continuation) {
        AlphaListVM$loadMoreDataList$1 alphaListVM$loadMoreDataList$1;
        if (continuation instanceof AlphaListVM$loadMoreDataList$1) {
            alphaListVM$loadMoreDataList$1 = (AlphaListVM$loadMoreDataList$1) continuation;
            int i11 = alphaListVM$loadMoreDataList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                alphaListVM$loadMoreDataList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                alphaListVM$loadMoreDataList$1 = new AlphaListVM$loadMoreDataList$1(this, continuation);
            }
        } else {
            alphaListVM$loadMoreDataList$1 = new AlphaListVM$loadMoreDataList$1(this, continuation);
        }
        AlphaListVM$loadMoreDataList$1 alphaListVM$loadMoreDataList$2 = alphaListVM$loadMoreDataList$1;
        Object objM50658p = alphaListVM$loadMoreDataList$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = alphaListVM$loadMoreDataList$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM50658p);
            int i13 = this.f41317Z + 1;
            this.f41317Z = i13;
            alphaListVM$loadMoreDataList$2.L$0 = SpillingKt.nullOutSpilledVariable(str);
            alphaListVM$loadMoreDataList$2.L$1 = SpillingKt.nullOutSpilledVariable(alphaMenu);
            alphaListVM$loadMoreDataList$2.L$2 = SpillingKt.nullOutSpilledVariable(aVar);
            alphaListVM$loadMoreDataList$2.label = 1;
            objM50658p = m50658p(str, i13, alphaMenu, aVar, alphaListVM$loadMoreDataList$2);
            if (objM50658p == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM50658p);
        }
        AlphaMarketEntity alphaMarketEntity = (AlphaMarketEntity) objM50658p;
        List<AlphaItemEntity> items = alphaMarketEntity != null ? alphaMarketEntity.getItems() : null;
        if (items == null) {
            items = CollectionsKt.emptyList();
        }
        send(new C21703i(items, C27039d.m66650j(alphaMarketEntity != null ? alphaMarketEntity.getCurrentPage() : null) < C27039d.m66650j(alphaMarketEntity != null ? alphaMarketEntity.getTotalPage() : null)));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        this.f41320c0.m102779e();
        super.onCleared();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        this.f41320c0.m102780f();
        super.onHide();
        this.f41316Y.m32541F();
    }

    /* JADX INFO: renamed from: p */
    public final Object m50658p(String str, int i11, AlphaMenu alphaMenu, AlphaCurrent.a aVar, Continuation<? super AlphaMarketEntity> continuation) {
        return this.f41315X.m53002r(str, m50653h(this.f41317Z, alphaMenu, aVar), continuation);
    }

    /* JADX INFO: renamed from: q */
    public final void m50659q() {
        AlphaListContract$UiIntent.FetchDataList fetchDataList = this.f41319b0;
        if (fetchDataList == null) {
            C44128b.m97266j(this.f41318a0, "network recovered: skip FetchDataList, no previous params");
        } else {
            sendIntent(new AlphaListContract$UiIntent.FetchDataList(true, fetchDataList.getAlphaType(), fetchDataList.getMenu(), fetchDataList.getParam()));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m50660r(List<String> list) {
        String strM32608d;
        AlphaCurrent.a param;
        TimeSelectedEnum f41148c;
        String constTimeTag;
        C44128b.m97266j(this.f41318a0, "symbols=" + list);
        if (list == null) {
            return;
        }
        AlphaListContract$UiIntent.FetchDataList fetchDataList = this.f41319b0;
        if (fetchDataList == null || (param = fetchDataList.getParam()) == null || (f41148c = param.getF41148c()) == null || (constTimeTag = f41148c.getConstTimeTag()) == null || (strM32608d = C15506i.m32608d(constTimeTag)) == null) {
            strM32608d = "24h";
        }
        MarketWsHelper.m32538x(this.f41316Y, list, strM32608d, 0L, new Function1() { // from class: com.kubi.quotefacade.alpha.list.r0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlphaListVM.m50652s(this.f41369b, (List) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: h */
    public final AlphaListBodyParam m50653h(int i11, AlphaMenu alphaMenu, AlphaCurrent.a aVar) {
        String str;
        String externalChain;
        ChainFilterData f41153h = aVar.getF41153h();
        AlphaListBodyParam alphaListBodyParam = new AlphaListBodyParam(null, null, null, null, null, null, null, null, 255, null);
        alphaListBodyParam.setL1Keyword(AlphaCurrent.f41143a.m50345c(alphaMenu, aVar));
        String constTimeTag = aVar.getF41148c().getConstTimeTag();
        if (Intrinsics.areEqual(constTimeTag, "5m")) {
            constTimeTag = "5min";
        }
        alphaListBodyParam.setSpan(constTimeTag);
        alphaListBodyParam.setOrderBy(aVar.getF41150e());
        alphaListBodyParam.setOrder(aVar.getF41151f());
        alphaListBodyParam.setPageNum(Integer.valueOf(i11));
        alphaListBodyParam.setPageSize(50);
        AlphaListBodyEntity alphaListBodyEntityM50651i = m50651i("priceRate", f41153h.getMinPriceChange24h(), f41153h.getMaxPriceChange24h());
        AlphaListBodyEntity alphaListBodyEntityM50651i2 = m50651i("txCount", f41153h.getMinTxCount24h(), f41153h.getMaxTxCount24h());
        AlphaListBodyEntity alphaListBodyEntityM50651i3 = m50651i("tradingAddressCount", f41153h.getMinMakers24h(), f41153h.getMaxMakers24h());
        AlphaListBodyEntity alphaListBodyEntityM50651i4 = m50651i("tokenHolderCount", f41153h.getMinHolders(), f41153h.getMaxHolders());
        AlphaListBodyEntity alphaListBodyEntityM50651i5 = m50651i("tradingVolume", f41153h.getMinVolume24h(), f41153h.getMaxVolume24h());
        AlphaListBodyEntity alphaListBodyEntityM50651i6 = m50651i("tokenLiquidity", f41153h.getMinTvl(), f41153h.getMaxTvl());
        AlphaListBodyEntity alphaListBodyEntityM50651i7 = m50651i("fdv", f41153h.getMinFdv(), f41153h.getMaxFdv());
        AlphaListBodyEntity alphaListBodyEntityM50651i8 = m50651i("marketCap", f41153h.getMinMarketCap(), f41153h.getMaxMarketCap());
        AlphaListBodyEntity alphaListBodyEntity = new AlphaListBodyEntity(null, null, null, null, 15, null);
        alphaListBodyEntity.setFilterBy("riskLevel");
        if (f41153h.getAve()) {
            str = "0";
        } else {
            str = OtcAd.KYC_NOT_PASS;
        }
        alphaListBodyEntity.setEq(str);
        Unit unit = Unit.INSTANCE;
        AlphaListBodyEntity alphaListBodyEntity2 = new AlphaListBodyEntity(null, null, null, null, 15, null);
        alphaListBodyEntity2.setFilterBy("network");
        AlphaNetworks f41149d = aVar.getF41149d();
        if (f41149d == null || (externalChain = f41149d.getExternalChain()) == null) {
            externalChain = "ALL";
        }
        alphaListBodyEntity2.setEq(externalChain);
        alphaListBodyParam.setItemFilters(CollectionsKt.listOf((Object[]) new AlphaListBodyEntity[]{alphaListBodyEntityM50651i, alphaListBodyEntityM50651i2, alphaListBodyEntityM50651i3, alphaListBodyEntityM50651i4, alphaListBodyEntityM50651i5, alphaListBodyEntityM50651i6, alphaListBodyEntityM50651i7, alphaListBodyEntityM50651i8, alphaListBodyEntity, alphaListBodyEntity2}));
        return alphaListBodyParam;
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        this.f41320c0.m102781g();
    }
}
