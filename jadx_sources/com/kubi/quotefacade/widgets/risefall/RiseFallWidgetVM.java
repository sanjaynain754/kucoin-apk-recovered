package com.kubi.quotefacade.widgets.risefall;

import androidx.lifecycle.ViewModelKt;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.kucoin.manager.MarketWsHelper;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.entity.RiseFallDetailEntity;
import com.kubi.quotefacade.entity.RiseFallEntity;
import com.kubi.quotefacade.entity.RiseFallTopCoinEntity;
import com.kubi.quotefacade.entity.RiseFallTopEntity;
import com.kubi.quotefacade.widgets.QuoteWidgetsRepo;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RiseFallWidgetVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0094@¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\u000e\u0010\u0019\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0014H\u0002J\f\u0010\u001c\u001a\u00020\u0014*\u00020\u001dH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/risefall/RiseFallWidgetVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/quotefacade/widgets/risefall/RiseFallContract$UIState;", "<init>", "()V", "repo", "Lcom/kubi/quotefacade/widgets/QuoteWidgetsRepo;", "firstLoad", "Ljava/util/concurrent/atomic/AtomicBoolean;", "repeatJob", "Lkotlinx/coroutines/Job;", "topUpSymbol", "", "topDownSymbol", "wsHelper", "Lcom/kubi/kucoin/manager/MarketWsHelper;", "initState", "getInitState", "()Lcom/kubi/quotefacade/widgets/risefall/RiseFallContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "startLoadData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetRepeatJob", "sendOut", "Lcom/kubi/quotefacade/entity/RiseFallEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRiseFallWidgetVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiseFallWidgetVM.kt\ncom/kubi/quotefacade/widgets/risefall/RiseFallWidgetVM\n+ 2 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n473#2,4:90\n295#3,2:94\n295#3,2:96\n*S KotlinDebug\n*F\n+ 1 RiseFallWidgetVM.kt\ncom/kubi/quotefacade/widgets/risefall/RiseFallWidgetVM\n*L\n36#1:90,4\n81#1:94,2\n84#1:96,2\n*E\n"})
public final class RiseFallWidgetVM extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: Z */
    @Nullable
    public InterfaceC41775x1 f42887Z;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final QuoteWidgetsRepo f42885X = new QuoteWidgetsRepo();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final AtomicBoolean f42886Y = new AtomicBoolean(true);

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public String f42888a0 = "";

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public String f42889b0 = "";

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MarketWsHelper f42890c0 = new MarketWsHelper();

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.risefall.RiseFallWidgetVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: RiseFallWidgetVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.widgets.risefall.RiseFallWidgetVM", m90122f = "RiseFallWidgetVM.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {36}, m90125m = "dispatchIntent", m90126n = {"intent", "this_$iv", "$this$checkIntent$iv", "it", "$i$f$checkIntent", "$i$a$-checkIntent-RiseFallWidgetVM$dispatchIntent$2"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
    public static final class C226721 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C226721(Continuation<? super C226721> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RiseFallWidgetVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m53641p() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.risefall.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiseFallWidgetVM.m53642q(this.f42926b);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m53642q(RiseFallWidgetVM riseFallWidgetVM) {
        InterfaceC41775x1 interfaceC41775x1 = riseFallWidgetVM.f42887Z;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        riseFallWidgetVM.f42887Z = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m53643s(RiseFallWidgetVM riseFallWidgetVM, List wsList) {
        Object obj;
        Object next;
        Intrinsics.checkNotNullParameter(wsList, "wsList");
        Iterator it = wsList.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((WsMarketSnapshotEntity) next).getSymbolCode(), riseFallWidgetVM.f42888a0));
        final WsMarketSnapshotEntity wsMarketSnapshotEntity = (WsMarketSnapshotEntity) next;
        if (wsMarketSnapshotEntity != null) {
            riseFallWidgetVM.updateState(new Function1() { // from class: com.kubi.quotefacade.widgets.risefall.v
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return RiseFallWidgetVM.m53644t(wsMarketSnapshotEntity, (UIState) obj2);
                }
            });
        }
        for (Object obj2 : wsList) {
            if (Intrinsics.areEqual(((WsMarketSnapshotEntity) obj2).getSymbolCode(), riseFallWidgetVM.f42889b0)) {
                obj = obj2;
                break;
            }
        }
        final WsMarketSnapshotEntity wsMarketSnapshotEntity2 = (WsMarketSnapshotEntity) obj;
        if (wsMarketSnapshotEntity2 != null) {
            riseFallWidgetVM.updateState(new Function1() { // from class: com.kubi.quotefacade.widgets.risefall.w
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return RiseFallWidgetVM.m53645u(wsMarketSnapshotEntity2, (UIState) obj3);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final UIState m53644t(WsMarketSnapshotEntity wsMarketSnapshotEntity, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, new BigDecimal(String.valueOf(wsMarketSnapshotEntity.getChangeRate())), null, 5, null);
    }

    /* JADX INFO: renamed from: u */
    public static final UIState m53645u(WsMarketSnapshotEntity wsMarketSnapshotEntity, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, new BigDecimal(String.valueOf(wsMarketSnapshotEntity.getChangeRate())), 3, null);
    }

    /* JADX INFO: renamed from: v */
    public static final UIState m53646v(RiseFallEntity riseFallEntity, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, riseFallEntity, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C226721 c226721;
        if (continuation instanceof C226721) {
            c226721 = (C226721) continuation;
            int i11 = c226721.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c226721.label = i11 - Integer.MIN_VALUE;
            } else {
                c226721 = new C226721(continuation);
            }
        } else {
            c226721 = new C226721(continuation);
        }
        Object obj = c226721.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c226721.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (interfaceC19282d instanceof RiseFallContract$UiIntent.LoadData) {
                c226721.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                c226721.L$1 = SpillingKt.nullOutSpilledVariable(this);
                c226721.L$2 = interfaceC19282d;
                c226721.L$3 = SpillingKt.nullOutSpilledVariable((RiseFallContract$UiIntent.LoadData) interfaceC19282d);
                c226721.I$0 = 0;
                c226721.I$1 = 0;
                c226721.label = 1;
                if (m53649w(c226721) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, null, 7, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: w */
    public final Object m53649w(Continuation<? super Unit> continuation) {
        RiseFallWidgetVM$startLoadData$1 riseFallWidgetVM$startLoadData$1;
        if (continuation instanceof RiseFallWidgetVM$startLoadData$1) {
            riseFallWidgetVM$startLoadData$1 = (RiseFallWidgetVM$startLoadData$1) continuation;
            int i11 = riseFallWidgetVM$startLoadData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                riseFallWidgetVM$startLoadData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                riseFallWidgetVM$startLoadData$1 = new RiseFallWidgetVM$startLoadData$1(this, continuation);
            }
        } else {
            riseFallWidgetVM$startLoadData$1 = new RiseFallWidgetVM$startLoadData$1(this, continuation);
        }
        Object objM53338g = riseFallWidgetVM$startLoadData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = riseFallWidgetVM$startLoadData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM53338g);
            m53641p();
            if (this.f42886Y.compareAndSet(true, false)) {
                QuoteWidgetsRepo quoteWidgetsRepo = this.f42885X;
                riseFallWidgetVM$startLoadData$1.label = 1;
                objM53338g = quoteWidgetsRepo.m53338g(riseFallWidgetVM$startLoadData$1);
                if (objM53338g == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new RiseFallWidgetVM$startLoadData$2(this, null), 3, null);
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objM53338g);
        RiseFallEntity riseFallEntity = (RiseFallEntity) objM53338g;
        if (riseFallEntity != null) {
            m53648r(riseFallEntity);
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new RiseFallWidgetVM$startLoadData$2(this, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        m53641p();
        this.f42890c0.m32541F();
    }

    /* JADX INFO: renamed from: r */
    public final void m53648r(final RiseFallEntity riseFallEntity) {
        String symbol;
        RiseFallTopEntity declinedTop1;
        RiseFallTopCoinEntity klineMetadata;
        RiseFallTopEntity advancedTop1;
        RiseFallTopCoinEntity klineMetadata2;
        RiseFallDetailEntity raw = riseFallEntity.getRaw();
        String symbol2 = null;
        if (raw != null && (advancedTop1 = raw.getAdvancedTop1()) != null && (klineMetadata2 = advancedTop1.getKlineMetadata()) != null) {
            symbol = klineMetadata2.getSymbol();
        } else {
            symbol = null;
        }
        this.f42888a0 = C27041f.m66668h(symbol);
        RiseFallDetailEntity raw2 = riseFallEntity.getRaw();
        if (raw2 != null && (declinedTop1 = raw2.getDeclinedTop1()) != null && (klineMetadata = declinedTop1.getKlineMetadata()) != null) {
            symbol2 = klineMetadata.getSymbol();
        }
        this.f42889b0 = C27041f.m66668h(symbol2);
        updateState(new Function1() { // from class: com.kubi.quotefacade.widgets.risefall.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RiseFallWidgetVM.m53646v(riseFallEntity, (UIState) obj);
            }
        });
        this.f42890c0.m32541F();
        MarketWsHelper.m32519D(this.f42890c0, CollectionsKt.listOf((Object[]) new String[]{this.f42888a0, this.f42889b0}), 0L, new Function1() { // from class: com.kubi.quotefacade.widgets.risefall.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RiseFallWidgetVM.m53643s(this.f42925b, (List) obj);
            }
        }, 2, null);
    }
}
