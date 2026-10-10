package com.kubi.core.biz.submit;

import android.os.SystemClock;
import com.kubi.core.biz.margininfo.IMarginInfoApi;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TradeSymbolBalanceExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeSymbolBalanceExtKt$executeBalanceFetch$1", m90122f = "TradeSymbolBalanceExt.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradeSymbolBalanceExtKt$executeBalanceFetch$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ UiState $state;
    final /* synthetic */ TradeSubmitVM $this_executeBalanceFetch;
    final /* synthetic */ IMarginInfoApi $utaOrderApi1;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeSymbolBalanceExtKt$executeBalanceFetch$1$1 */
    /* JADX INFO: compiled from: TradeSymbolBalanceExt.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeSymbolBalanceExtKt$executeBalanceFetch$1$1", m90122f = "TradeSymbolBalanceExt.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C120651 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ UiState $state;
        final /* synthetic */ TradeSubmitVM $this_executeBalanceFetch;
        final /* synthetic */ IMarginInfoApi $utaOrderApi1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120651(TradeSubmitVM tradeSubmitVM, UiState uiState, IMarginInfoApi iMarginInfoApi, Continuation<? super C120651> continuation) {
            super(2, continuation);
            this.$this_executeBalanceFetch = tradeSubmitVM;
            this.$state = uiState;
            this.$utaOrderApi1 = iMarginInfoApi;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C120651(this.$this_executeBalanceFetch, this.$state, this.$utaOrderApi1, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C120651) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                TradeSymbolBalanceExtKt.m22495h(this.$this_executeBalanceFetch, this.$state, this.$utaOrderApi1);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeSymbolBalanceExtKt$executeBalanceFetch$1(TradeSubmitVM tradeSubmitVM, UiState uiState, IMarginInfoApi iMarginInfoApi, Continuation<? super TradeSymbolBalanceExtKt$executeBalanceFetch$1> continuation) {
        super(2, continuation);
        this.$this_executeBalanceFetch = tradeSubmitVM;
        this.$state = uiState;
        this.$utaOrderApi1 = iMarginInfoApi;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradeSymbolBalanceExtKt$executeBalanceFetch$1 tradeSymbolBalanceExtKt$executeBalanceFetch$1 = new TradeSymbolBalanceExtKt$executeBalanceFetch$1(this.$this_executeBalanceFetch, this.$state, this.$utaOrderApi1, continuation);
        tradeSymbolBalanceExtKt$executeBalanceFetch$1.L$0 = obj;
        return tradeSymbolBalanceExtKt$executeBalanceFetch$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradeSymbolBalanceExtKt$executeBalanceFetch$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41775x1 f20660g0 = this.$this_executeBalanceFetch.getF20660g0();
        if (f20660g0 != null) {
            InterfaceC41775x1.a.m91377a(f20660g0, null, 1, null);
        }
        InterfaceC41775x1 f20659f0 = this.$this_executeBalanceFetch.getF20659f0();
        if (f20659f0 != null) {
            InterfaceC41775x1.a.m91377a(f20659f0, null, 1, null);
        }
        this.$this_executeBalanceFetch.getF20661h0().set(SystemClock.elapsedRealtime());
        this.$this_executeBalanceFetch.m22458L0(C41696j.m91104d(interfaceC41709m0, C42911a.m94120b(), null, new C120651(this.$this_executeBalanceFetch, this.$state, this.$utaOrderApi1, null), 2, null));
        return Unit.INSTANCE;
    }
}
