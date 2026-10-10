package com.kubi.futures.trade;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.ContractMaintainEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FuturesTradeViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.FuturesTradeViewModel$bindContractStatus$1", m90122f = "FuturesTradeViewModel.kt", m90123i = {}, m90124l = {267}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FuturesTradeViewModel$bindContractStatus$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FuturesTradeViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.FuturesTradeViewModel$bindContractStatus$1$a */
    /* JADX INFO: compiled from: FuturesTradeViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13607a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FuturesTradeViewModel f23632b;

        public C13607a(FuturesTradeViewModel futuresTradeViewModel) {
            this.f23632b = futuresTradeViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(ContractMaintainEntity contractMaintainEntity, Continuation<? super Unit> continuation) {
            this.f23632b.m26708z1();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesTradeViewModel$bindContractStatus$1(FuturesTradeViewModel futuresTradeViewModel, Continuation<? super FuturesTradeViewModel$bindContractStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresTradeViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesTradeViewModel$bindContractStatus$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FuturesTradeViewModel$bindContractStatus$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e interfaceC41634eM90915g = C41636g.m90915g(C41636g.m90890N(RepositoryServiceLocator.f19236a.m20288g().mo25014j(), C42911a.m94120b()));
            C13607a c13607a = new C13607a(this.this$0);
            this.label = 1;
            if (interfaceC41634eM90915g.collect(c13607a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
