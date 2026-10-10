package com.kubi.quotefacade.chain.market.sectors;

import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.entity.ChainMarketSectorsEntity;
import com.kubi.quotefacade.helper.QuoteCoroutineScope;
import com.kubi.utils.C27100x0;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p844zu.InterfaceC46925b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChainSectorsVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\b\u0010\u0016\u001a\u00020\u000fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/quotefacade/chain/market/sectors/ChainSectorsVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/quotefacade/chain/market/sectors/ChainSectorsContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/quotefacade/api/IQuoteApi;", "ioScope", "Lcom/kubi/quotefacade/helper/QuoteCoroutineScope;", "repeatJob", "Lkotlinx/coroutines/Job;", "initState", "getInitState", "()Lcom/kubi/quotefacade/chain/market/sectors/ChainSectorsContract$UIState;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "fetchHotSectors", "isLoopQuery", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startLooperQuery", "resetLooper", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChainSectorsVM extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC46925b f41604X = (InterfaceC46925b) RetrofitFlowExKt.m42820a(InterfaceC46925b.class);

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final QuoteCoroutineScope f41605Y = new QuoteCoroutineScope(C42911a.m94120b(), "ChainSectorsVM");

    /* JADX INFO: renamed from: Z */
    @Nullable
    public InterfaceC41775x1 f41606Z;

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.market.sectors.ChainSectorsVM$onShow$1 */
    /* JADX INFO: compiled from: ChainSectorsVM.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.chain.market.sectors.ChainSectorsVM$onShow$1", m90122f = "ChainSectorsVM.kt", m90123i = {}, m90124l = {34}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C218321 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C218321(Continuation<? super C218321> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChainSectorsVM.this.new C218321(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C218321) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ChainSectorsVM chainSectorsVM = ChainSectorsVM.this;
                this.label = 1;
                if (ChainSectorsVM.m51007i(chainSectorsVM, false, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            ChainSectorsVM.this.m51013q();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Object m51007i(ChainSectorsVM chainSectorsVM, boolean z11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return chainSectorsVM.m51010h(z11, continuation);
    }

    /* JADX INFO: renamed from: j */
    public static final UIState m51008j(List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy(list);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m51009p(ChainSectorsVM chainSectorsVM) {
        InterfaceC41775x1 interfaceC41775x1 = chainSectorsVM.f41606Z;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        chainSectorsVM.f41606Z = null;
        chainSectorsVM.f41605Y.close();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: h */
    public final Object m51010h(boolean z11, Continuation<? super Unit> continuation) {
        ChainSectorsVM$fetchHotSectors$1 chainSectorsVM$fetchHotSectors$1;
        if (continuation instanceof ChainSectorsVM$fetchHotSectors$1) {
            chainSectorsVM$fetchHotSectors$1 = (ChainSectorsVM$fetchHotSectors$1) continuation;
            int i11 = chainSectorsVM$fetchHotSectors$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                chainSectorsVM$fetchHotSectors$1.label = i11 - Integer.MIN_VALUE;
            } else {
                chainSectorsVM$fetchHotSectors$1 = new ChainSectorsVM$fetchHotSectors$1(this, continuation);
            }
        } else {
            chainSectorsVM$fetchHotSectors$1 = new ChainSectorsVM$fetchHotSectors$1(this, continuation);
        }
        ChainSectorsVM$fetchHotSectors$1 chainSectorsVM$fetchHotSectors$2 = chainSectorsVM$fetchHotSectors$1;
        Object objM42826g = chainSectorsVM$fetchHotSectors$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = chainSectorsVM$fetchHotSectors$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42826g);
            InterfaceC41634e<List<ChainMarketSectorsEntity>> interfaceC41634eM103367g = this.f41604X.m103367g();
            chainSectorsVM$fetchHotSectors$2.Z$0 = z11;
            chainSectorsVM$fetchHotSectors$2.label = 1;
            objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM103367g, false, null, chainSectorsVM$fetchHotSectors$2, 2, null);
            if (objM42826g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = chainSectorsVM$fetchHotSectors$2.Z$0;
            ResultKt.throwOnFailure(objM42826g);
        }
        final List list = (List) RetrofitFlowExKt.m42829j((C19334f) objM42826g);
        if (list == null) {
            return Unit.INSTANCE;
        }
        if (z11 && list.isEmpty()) {
            return Unit.INSTANCE;
        }
        updateState(new Function1() { // from class: com.kubi.quotefacade.chain.market.sectors.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChainSectorsVM.m51008j(list, (UIState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, 1, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m51012o() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.chain.market.sectors.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainSectorsVM.m51009p(this.f41613b);
            }
        });
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        m51012o();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        launchOnIO(new C218321(null));
    }

    /* JADX INFO: renamed from: q */
    public final void m51013q() {
        m51012o();
        C41696j.m91104d(this.f41605Y, null, null, new ChainSectorsVM$startLooperQuery$1(this, null), 3, null);
    }
}
