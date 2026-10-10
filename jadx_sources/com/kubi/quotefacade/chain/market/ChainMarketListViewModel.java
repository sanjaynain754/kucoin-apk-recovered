package com.kubi.quotefacade.chain.market;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.chain.C21781i;
import com.kubi.quotefacade.entity.ChainItemEntity;
import com.kubi.quotefacade.entity.ChainListEntity;
import com.kubi.quotefacade.entity.ChainListParam;
import com.kubi.quotefacade.entity.SortSets;
import com.kubi.quotefacade.event.ChainMarketListContract$UIIntent;
import com.kubi.quotefacade.event.UIState;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p212dv.C36963c;
import p212dv.C36964d;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: ChainMarketListViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u0016\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0094@¢\u0006\u0002\u0010\u0015J \u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0082@¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\nH\u0002J\u001e\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0082@¢\u0006\u0002\u0010$J$\u0010%\u001a\u00020\u000f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060'2\u0006\u0010(\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010)R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006*"}, m90084d2 = {"Lcom/kubi/quotefacade/chain/market/ChainMarketListViewModel;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/quotefacade/event/ChainMarketListContract$UIState;", "<init>", "()V", "TAG", "", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "netDataEntity", "Lcom/kubi/quotefacade/entity/ChainListEntity;", "initState", "getInitState", "()Lcom/kubi/quotefacade/event/ChainMarketListContract$UIState;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "", "onFirstShow", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "dispatchIntent", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChainMarketList", "param", "Lcom/kubi/quotefacade/entity/ChainListParam;", "isLocalSort", "", "(Lcom/kubi/quotefacade/entity/ChainListParam;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "localSortCurrent", "localSortNet", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "addOrDeleteMemeToFavList", "chainItem", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", ViewProps.POSITION, "", "(Lcom/kubi/quotefacade/entity/ChainItemEntity;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startLoopLoadData", InterfaceC33826o0.f71244p, "", "orderByRange", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChainMarketListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainMarketListViewModel.kt\ncom/kubi/quotefacade/chain/market/ChainMarketListViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n25#2:162\n26#2:164\n1#3:163\n1869#4,2:165\n*S KotlinDebug\n*F\n+ 1 ChainMarketListViewModel.kt\ncom/kubi/quotefacade/chain/market/ChainMarketListViewModel\n*L\n94#1:162\n94#1:164\n94#1:163\n153#1:165,2\n*E\n"})
public final class ChainMarketListViewModel extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final String f41572X = "ChainMarketListViewModel";

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final QuoteMarketRepository f41573Y = new QuoteMarketRepository();

    /* JADX INFO: renamed from: Z */
    @Nullable
    public ChainListEntity f41574Z;

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.market.ChainMarketListViewModel$dispatchIntent$1 */
    /* JADX INFO: compiled from: ChainMarketListViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.chain.market.ChainMarketListViewModel", m90122f = "ChainMarketListViewModel.kt", m90123i = {0, 1, 1, 1, 2, 3, 3, 3}, m90124l = {52, 57, 62, 67}, m90125m = "dispatchIntent", m90126n = {"intent", "intent", "it", "$i$a$-let-ChainMarketListViewModel$dispatchIntent$2", "intent", "intent", "it", "$i$a$-let-ChainMarketListViewModel$dispatchIntent$3"}, m90127s = {"L$0", "L$0", "L$1", "I$0", "L$0", "L$0", "L$1", "I$0"})
    public static final class C217951 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C217951(Continuation<? super C217951> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChainMarketListViewModel.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final UIState m50971o(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, new Object(), null, 5, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        if (m50973n(r4, r9, r0) == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
    
        if (m50977s(r2, r9, r0) == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f5, code lost:
    
        if (m50972k(r4, r9, r0) == r1) goto L47;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C217951 c217951;
        ChainMarketListContract$UIIntent.CollectOrCancelChain collectOrCancelChain;
        ChainItemEntity chainItem;
        if (continuation instanceof C217951) {
            c217951 = (C217951) continuation;
            int i11 = c217951.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c217951.label = i11 - Integer.MIN_VALUE;
            } else {
                c217951 = new C217951(continuation);
            }
        } else {
            c217951 = new C217951(continuation);
        }
        Object obj = c217951.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c217951.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c217951.L$0 = interfaceC19282d;
            c217951.label = 1;
            if (super.dispatchIntent(interfaceC19282d, c217951) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
            } else {
                if (i12 == 3) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        interfaceC19282d = (InterfaceC19282d) c217951.L$0;
        ResultKt.throwOnFailure(obj);
        C44128b.m97266j(this.f41572X, "dispatchIntent=" + interfaceC19282d);
        if (interfaceC19282d instanceof ChainMarketListContract$UIIntent.FetchChainListData) {
            ChainMarketListContract$UIIntent.FetchChainListData fetchChainListData = (ChainMarketListContract$UIIntent.FetchChainListData) interfaceC19282d;
            ChainListParam param = fetchChainListData.getParam();
            if (param != null) {
                ChainListParam param2 = fetchChainListData.getParam();
                boolean isLocalSort = fetchChainListData.getIsLocalSort();
                c217951.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                c217951.L$1 = SpillingKt.nullOutSpilledVariable(param);
                c217951.I$0 = 0;
                c217951.label = 2;
            }
            return Unit.INSTANCE;
        }
        if (!(interfaceC19282d instanceof ChainMarketListContract$UIIntent.FetchChainRepeatListData)) {
            if ((interfaceC19282d instanceof ChainMarketListContract$UIIntent.CollectOrCancelChain) && (chainItem = (collectOrCancelChain = (ChainMarketListContract$UIIntent.CollectOrCancelChain) interfaceC19282d).getChainItem()) != null) {
                int itemPosition = collectOrCancelChain.getItemPosition();
                c217951.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                c217951.L$1 = SpillingKt.nullOutSpilledVariable(chainItem);
                c217951.I$0 = 0;
                c217951.label = 4;
            }
            return Unit.INSTANCE;
        }
        ChainMarketListContract$UIIntent.FetchChainRepeatListData fetchChainRepeatListData = (ChainMarketListContract$UIIntent.FetchChainRepeatListData) interfaceC19282d;
        List<String> token = fetchChainRepeatListData.getToken();
        String orderByRange = fetchChainRepeatListData.getOrderByRange();
        if (orderByRange == null) {
            orderByRange = "5m";
        }
        c217951.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
        c217951.label = 3;
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: k */
    public final Object m50972k(ChainItemEntity chainItemEntity, int i11, Continuation<? super Unit> continuation) {
        Object objM42823d = RetrofitFlowExKt.m42823d(this.f41573Y.m52995i(CollectionsKt.listOf(chainItemEntity.getToken() + '-' + chainItemEntity.getChain())), false, new ChainMarketListViewModel$addOrDeleteMemeToFavList$2(chainItemEntity, this, i11, null), continuation);
        return objM42823d == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM42823d : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m50973n(ChainListParam chainListParam, boolean z11, Continuation<? super Unit> continuation) {
        ChainMarketListViewModel$getChainMarketList$1 chainMarketListViewModel$getChainMarketList$1;
        if (continuation instanceof ChainMarketListViewModel$getChainMarketList$1) {
            chainMarketListViewModel$getChainMarketList$1 = (ChainMarketListViewModel$getChainMarketList$1) continuation;
            int i11 = chainMarketListViewModel$getChainMarketList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                chainMarketListViewModel$getChainMarketList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                chainMarketListViewModel$getChainMarketList$1 = new ChainMarketListViewModel$getChainMarketList$1(this, continuation);
            }
        } else {
            chainMarketListViewModel$getChainMarketList$1 = new ChainMarketListViewModel$getChainMarketList$1(this, continuation);
        }
        Object objM42823d = chainMarketListViewModel$getChainMarketList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = chainMarketListViewModel$getChainMarketList$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42823d);
            if (z11 && this.f41574Z != null && StringsKt.equals("hot", chainListParam.getMenuCode(), true)) {
                m50975q(chainListParam);
                return Unit.INSTANCE;
            }
            InterfaceC41634e<ChainListEntity> interfaceC41634eM53007w = this.f41573Y.m53007w(chainListParam);
            ChainMarketListViewModel$getChainMarketList$2 chainMarketListViewModel$getChainMarketList$2 = new ChainMarketListViewModel$getChainMarketList$2(this, chainListParam, null);
            chainMarketListViewModel$getChainMarketList$1.L$0 = SpillingKt.nullOutSpilledVariable(chainListParam);
            chainMarketListViewModel$getChainMarketList$1.Z$0 = z11;
            chainMarketListViewModel$getChainMarketList$1.label = 1;
            objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM53007w, false, chainMarketListViewModel$getChainMarketList$2, chainMarketListViewModel$getChainMarketList$1);
            if (objM42823d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42823d);
        }
        if (((C19334f) objM42823d).getThrowable() != null) {
            C44128b.m97266j(this.f41572X, "getChainMarketList error");
            updateState(new Function1() { // from class: com.kubi.quotefacade.chain.market.j0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChainMarketListViewModel.m50971o((UIState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m50975q(ChainListParam chainListParam) {
        ChainListEntity chainListEntity = this.f41574Z;
        if (chainListEntity == null) {
            return;
        }
        SortSets sortSets = chainListParam.getSortSets();
        String field = sortSets != null ? sortSets.getField() : null;
        if (field == null) {
            field = "";
        }
        SortSets sortSets2 = chainListParam.getSortSets();
        String side = sortSets2 != null ? sortSets2.getSide() : null;
        String str = side != null ? side : "";
        List<ChainItemEntity> items = chainListEntity.getItems();
        if (items == null) {
            items = CollectionsKt.emptyList();
        }
        send(new C36963c(new ChainListEntity(chainListEntity.getCurrentPage(), chainListEntity.getPageSize(), chainListEntity.getTotalNum(), chainListEntity.getTotalPage(), C21781i.m50837c(items, field, str))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public final Object m50977s(List<String> list, String str, Continuation<? super Unit> continuation) {
        ChainMarketListViewModel$startLoopLoadData$1 chainMarketListViewModel$startLoopLoadData$1;
        HashMap map;
        if (continuation instanceof ChainMarketListViewModel$startLoopLoadData$1) {
            chainMarketListViewModel$startLoopLoadData$1 = (ChainMarketListViewModel$startLoopLoadData$1) continuation;
            int i11 = chainMarketListViewModel$startLoopLoadData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                chainMarketListViewModel$startLoopLoadData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                chainMarketListViewModel$startLoopLoadData$1 = new ChainMarketListViewModel$startLoopLoadData$1(this, continuation);
            }
        } else {
            chainMarketListViewModel$startLoopLoadData$1 = new ChainMarketListViewModel$startLoopLoadData$1(this, continuation);
        }
        Object obj = chainMarketListViewModel$startLoopLoadData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = chainMarketListViewModel$startLoopLoadData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C44128b.m97266j(this.f41572X, "startLoopLoadData " + str + " ==》 " + list);
            HashMap map2 = new HashMap();
            QuoteMarketRepository quoteMarketRepository = this.f41573Y;
            chainMarketListViewModel$startLoopLoadData$1.L$0 = SpillingKt.nullOutSpilledVariable(list);
            chainMarketListViewModel$startLoopLoadData$1.L$1 = SpillingKt.nullOutSpilledVariable(str);
            chainMarketListViewModel$startLoopLoadData$1.L$2 = map2;
            chainMarketListViewModel$startLoopLoadData$1.label = 1;
            Object objM53006v = quoteMarketRepository.m53006v(list, str, chainMarketListViewModel$startLoopLoadData$1);
            if (objM53006v == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objM53006v;
            map = map2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (HashMap) chainMarketListViewModel$startLoopLoadData$1.L$2;
            ResultKt.throwOnFailure(obj);
        }
        List<ChainItemEntity> list2 = (List) obj;
        if (!list2.isEmpty()) {
            map.clear();
            for (ChainItemEntity chainItemEntity : list2) {
                if (chainItemEntity.getToken() != null) {
                    String token = chainItemEntity.getToken();
                    Intrinsics.checkNotNull(token);
                    map.put(token, chainItemEntity);
                }
            }
            send(new C36964d(map));
        }
        return Unit.INSTANCE;
    }

    public ChainMarketListViewModel() {
        C44128b.m97266j("ChainMarketListViewModel", "init");
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onFirstShow() {
        super.onFirstShow();
        C44128b.m97266j(this.f41572X, "VM onFirstShow");
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        C44128b.m97266j(this.f41572X, "VM onHide " + this);
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        C44128b.m97266j(this.f41572X, "VM onShow " + this);
    }

    /* JADX INFO: renamed from: r */
    public final ChainListEntity m50976r(ChainListParam chainListParam, ChainListEntity chainListEntity) {
        String field;
        if (StringsKt.equals("hot", chainListParam.getMenuCode(), true)) {
            SortSets sortSets = chainListParam.getSortSets();
            String side = null;
            if (sortSets != null) {
                field = sortSets.getField();
            } else {
                field = null;
            }
            String str = "";
            if (field == null) {
                field = "";
            }
            SortSets sortSets2 = chainListParam.getSortSets();
            if (sortSets2 != null) {
                side = sortSets2.getSide();
            }
            if (side != null) {
                str = side;
            }
            List<ChainItemEntity> items = chainListEntity.getItems();
            if (items == null) {
                items = CollectionsKt.emptyList();
            }
            return new ChainListEntity(chainListEntity.getCurrentPage(), chainListEntity.getPageSize(), chainListEntity.getTotalNum(), chainListEntity.getTotalPage(), C21781i.m50837c(items, field, str));
        }
        return chainListEntity;
    }
}
