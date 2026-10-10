package com.kubi.core.biz.submit;

import android.os.SystemClock;
import com.kubi.core.biz.margininfo.IMarginInfoApi;
import com.kubi.tradebase.tradetype.TradeType;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.DelayKt;
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
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: TradeSymbolBalanceExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeSymbolBalanceExtKt$scheduleBalanceFetch$1", m90122f = "TradeSymbolBalanceExt.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradeSymbolBalanceExtKt$scheduleBalanceFetch$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $delayMs;
    final /* synthetic */ String $requestSymbol;
    final /* synthetic */ TradeType $requestTradeType;
    final /* synthetic */ TradeSubmitVM $this_scheduleBalanceFetch;
    final /* synthetic */ IMarginInfoApi $utaOrderApi1;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeSymbolBalanceExtKt$scheduleBalanceFetch$1$1 */
    /* JADX INFO: compiled from: TradeSymbolBalanceExt.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeSymbolBalanceExtKt$scheduleBalanceFetch$1$1", m90122f = "TradeSymbolBalanceExt.kt", m90123i = {0}, m90124l = {191}, m90125m = "invokeSuspend", m90126n = {"$this$launch"}, m90127s = {"L$0"})
    public static final class C120671 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $delayMs;
        final /* synthetic */ String $requestSymbol;
        final /* synthetic */ TradeType $requestTradeType;
        final /* synthetic */ TradeSubmitVM $this_scheduleBalanceFetch;
        final /* synthetic */ IMarginInfoApi $utaOrderApi1;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeSymbolBalanceExtKt$scheduleBalanceFetch$1$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: TradeSymbolBalanceExt.kt */
        @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeSymbolBalanceExtKt$scheduleBalanceFetch$1$1$1", m90122f = "TradeSymbolBalanceExt.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            final /* synthetic */ UiState $currentState;
            final /* synthetic */ TradeSubmitVM $this_scheduleBalanceFetch;
            final /* synthetic */ IMarginInfoApi $utaOrderApi1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TradeSubmitVM tradeSubmitVM, UiState uiState, IMarginInfoApi iMarginInfoApi, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$this_scheduleBalanceFetch = tradeSubmitVM;
                this.$currentState = uiState;
                this.$utaOrderApi1 = iMarginInfoApi;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$this_scheduleBalanceFetch, this.$currentState, this.$utaOrderApi1, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    TradeSymbolBalanceExtKt.m22495h(this.$this_scheduleBalanceFetch, this.$currentState, this.$utaOrderApi1);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120671(long j11, TradeSubmitVM tradeSubmitVM, String str, TradeType tradeType, IMarginInfoApi iMarginInfoApi, Continuation<? super C120671> continuation) {
            super(2, continuation);
            this.$delayMs = j11;
            this.$this_scheduleBalanceFetch = tradeSubmitVM;
            this.$requestSymbol = str;
            this.$requestTradeType = tradeType;
            this.$utaOrderApi1 = iMarginInfoApi;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C120671 c120671 = new C120671(this.$delayMs, this.$this_scheduleBalanceFetch, this.$requestSymbol, this.$requestTradeType, this.$utaOrderApi1, continuation);
            c120671.L$0 = obj;
            return c120671;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C120671) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                long j11 = this.$delayMs;
                this.L$0 = interfaceC41709m0;
                this.label = 1;
                if (DelayKt.m90350b(j11, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            UiState uiState = (UiState) this.$this_scheduleBalanceFetch.getState();
            if (Intrinsics.areEqual(uiState.getSymbol(), this.$requestSymbol) && uiState.getTradeType() == this.$requestTradeType) {
                InterfaceC41775x1 f20659f0 = this.$this_scheduleBalanceFetch.getF20659f0();
                if (f20659f0 != null) {
                    InterfaceC41775x1.a.m91377a(f20659f0, null, 1, null);
                }
                this.$this_scheduleBalanceFetch.getF20661h0().set(SystemClock.elapsedRealtime());
                this.$this_scheduleBalanceFetch.m22458L0(C41696j.m91104d(interfaceC41709m0, C42911a.m94120b(), null, new AnonymousClass1(this.$this_scheduleBalanceFetch, uiState, this.$utaOrderApi1, null), 2, null));
                return Unit.INSTANCE;
            }
            C44128b.m97258b("fetchTradeBalanceData: 状态已变化，放弃请求 (request: " + this.$requestSymbol + '/' + this.$requestTradeType + ", current: " + uiState.getSymbol() + '/' + uiState.getTradeType() + ')');
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeSymbolBalanceExtKt$scheduleBalanceFetch$1(TradeSubmitVM tradeSubmitVM, long j11, String str, TradeType tradeType, IMarginInfoApi iMarginInfoApi, Continuation<? super TradeSymbolBalanceExtKt$scheduleBalanceFetch$1> continuation) {
        super(2, continuation);
        this.$this_scheduleBalanceFetch = tradeSubmitVM;
        this.$delayMs = j11;
        this.$requestSymbol = str;
        this.$requestTradeType = tradeType;
        this.$utaOrderApi1 = iMarginInfoApi;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradeSymbolBalanceExtKt$scheduleBalanceFetch$1 tradeSymbolBalanceExtKt$scheduleBalanceFetch$1 = new TradeSymbolBalanceExtKt$scheduleBalanceFetch$1(this.$this_scheduleBalanceFetch, this.$delayMs, this.$requestSymbol, this.$requestTradeType, this.$utaOrderApi1, continuation);
        tradeSymbolBalanceExtKt$scheduleBalanceFetch$1.L$0 = obj;
        return tradeSymbolBalanceExtKt$scheduleBalanceFetch$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradeSymbolBalanceExtKt$scheduleBalanceFetch$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41775x1 f20660g0 = this.$this_scheduleBalanceFetch.getF20660g0();
        if (f20660g0 != null) {
            InterfaceC41775x1.a.m91377a(f20660g0, null, 1, null);
        }
        TradeSubmitVM tradeSubmitVM = this.$this_scheduleBalanceFetch;
        tradeSubmitVM.m22457K0(C41696j.m91104d(interfaceC41709m0, null, null, new C120671(this.$delayMs, tradeSubmitVM, this.$requestSymbol, this.$requestTradeType, this.$utaOrderApi1, null), 3, null));
        return Unit.INSTANCE;
    }
}
