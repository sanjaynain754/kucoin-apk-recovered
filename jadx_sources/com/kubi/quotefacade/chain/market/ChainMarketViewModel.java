package com.kubi.quotefacade.chain.market;

import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.entity.ChainMenuEntity;
import com.kubi.quotefacade.event.ChainMarketContract$UIIntent;
import com.kubi.quotefacade.event.UIState;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: ChainMarketViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0016\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0094@¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/quotefacade/chain/market/ChainMarketViewModel;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/quotefacade/event/ChainMarketContract$UIState;", "<init>", "()V", "TAG", "", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "initState", "getInitState", "()Lcom/kubi/quotefacade/event/ChainMarketContract$UIState;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "", "onFirstShow", "dispatchIntent", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChainMenuList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChainMarketViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainMarketViewModel.kt\ncom/kubi/quotefacade/chain/market/ChainMarketViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n25#2:70\n26#2:72\n1#3:71\n*S KotlinDebug\n*F\n+ 1 ChainMarketViewModel.kt\ncom/kubi/quotefacade/chain/market/ChainMarketViewModel\n*L\n61#1:70\n61#1:72\n61#1:71\n*E\n"})
public final class ChainMarketViewModel extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final String f41575X = "ChainMarketViewModel";

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final QuoteMarketRepository f41576Y = new QuoteMarketRepository();

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.market.ChainMarketViewModel$dispatchIntent$1 */
    /* JADX INFO: compiled from: ChainMarketViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.chain.market.ChainMarketViewModel", m90122f = "ChainMarketViewModel.kt", m90123i = {0, 1}, m90124l = {41, 45}, m90125m = "dispatchIntent", m90126n = {"intent", "intent"}, m90127s = {"L$0", "L$0"})
    public static final class C217961 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C217961(Continuation<? super C217961> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChainMarketViewModel.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final UIState m50987i(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, new Object(), null, 5, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (m50988h(r0) == r1) goto L23;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C217961 c217961;
        if (continuation instanceof C217961) {
            c217961 = (C217961) continuation;
            int i11 = c217961.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c217961.label = i11 - Integer.MIN_VALUE;
            } else {
                c217961 = new C217961(continuation);
            }
        } else {
            c217961 = new C217961(continuation);
        }
        Object obj = c217961.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c217961.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c217961.L$0 = interfaceC19282d;
            c217961.label = 1;
            if (super.dispatchIntent(interfaceC19282d, c217961) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            interfaceC19282d = (InterfaceC19282d) c217961.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        C44128b.m97266j(this.f41575X, "dispatchIntent=" + interfaceC19282d);
        if (!(interfaceC19282d instanceof ChainMarketContract$UIIntent.FetchMenuList)) {
            return Unit.INSTANCE;
        }
        c217961.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
        c217961.label = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m50988h(Continuation<? super Unit> continuation) {
        ChainMarketViewModel$getChainMenuList$1 chainMarketViewModel$getChainMenuList$1;
        if (continuation instanceof ChainMarketViewModel$getChainMenuList$1) {
            chainMarketViewModel$getChainMenuList$1 = (ChainMarketViewModel$getChainMenuList$1) continuation;
            int i11 = chainMarketViewModel$getChainMenuList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                chainMarketViewModel$getChainMenuList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                chainMarketViewModel$getChainMenuList$1 = new ChainMarketViewModel$getChainMenuList$1(this, continuation);
            }
        } else {
            chainMarketViewModel$getChainMenuList$1 = new ChainMarketViewModel$getChainMenuList$1(this, continuation);
        }
        Object objM42823d = chainMarketViewModel$getChainMenuList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = chainMarketViewModel$getChainMenuList$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42823d);
            InterfaceC41634e<List<ChainMenuEntity>> interfaceC41634eM53008x = this.f41576Y.m53008x();
            ChainMarketViewModel$getChainMenuList$2 chainMarketViewModel$getChainMenuList$2 = new ChainMarketViewModel$getChainMenuList$2(this, null);
            chainMarketViewModel$getChainMenuList$1.label = 1;
            objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM53008x, false, chainMarketViewModel$getChainMenuList$2, chainMarketViewModel$getChainMenuList$1);
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
            C44128b.m97266j(this.f41575X, "getChainMenuList error");
            updateState(new Function1() { // from class: com.kubi.quotefacade.chain.market.m0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChainMarketViewModel.m50987i((UIState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, null, 7, null);
    }

    public ChainMarketViewModel() {
        C44128b.m97266j("ChainMarketViewModel", "init");
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onFirstShow() {
        super.onFirstShow();
        C44128b.m97266j(this.f41575X, "onFirstShow");
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        C44128b.m97266j(this.f41575X, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW);
    }
}
