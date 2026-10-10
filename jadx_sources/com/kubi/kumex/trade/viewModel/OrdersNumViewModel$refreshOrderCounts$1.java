package com.kubi.kumex.trade.viewModel;

import com.kubi.unify.api.IUnifyAccountService;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: OrdersNumViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.trade.viewModel.OrdersNumViewModel$refreshOrderCounts$1", m90122f = "OrdersNumViewModel.kt", m90123i = {0, 0, 0}, m90124l = {124}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-OrdersNumViewModel$refreshOrderCounts$1$1"}, m90127s = {"L$0", "L$1", "I$0"})
public final class OrdersNumViewModel$refreshOrderCounts$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OrdersNumViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.kumex.trade.viewModel.OrdersNumViewModel$refreshOrderCounts$1$a */
    /* JADX INFO: compiled from: OrdersNumViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16999a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OrdersNumViewModel f30743b;

        public C16999a(OrdersNumViewModel ordersNumViewModel) {
            this.f30743b = ordersNumViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Pair<Long, Long> pair, Continuation<? super Unit> continuation) {
            this.f30743b.f30741g0.postValue(new OrdersNum(pair.getFirst().longValue(), pair.getSecond().longValue(), 0L, pair.getSecond().longValue() + pair.getFirst().longValue()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrdersNumViewModel$refreshOrderCounts$1(OrdersNumViewModel ordersNumViewModel, Continuation<? super OrdersNumViewModel$refreshOrderCounts$1> continuation) {
        super(2, continuation);
        this.this$0 = ordersNumViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OrdersNumViewModel$refreshOrderCounts$1 ordersNumViewModel$refreshOrderCounts$1 = new OrdersNumViewModel$refreshOrderCounts$1(this.this$0, continuation);
        ordersNumViewModel$refreshOrderCounts$1.L$0 = obj;
        return ordersNumViewModel$refreshOrderCounts$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OrdersNumViewModel$refreshOrderCounts$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                OrdersNumViewModel ordersNumViewModel = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                InterfaceC41634e<Pair<Long, Long>> interfaceC41634eMo65003s = IUnifyAccountService.f53155a.get().mo65003s();
                C16999a c16999a = new C16999a(ordersNumViewModel);
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.I$0 = 0;
                this.label = 1;
                if (interfaceC41634eMo65003s.collect(c16999a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return Unit.INSTANCE;
    }
}
