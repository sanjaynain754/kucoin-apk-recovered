package com.kubi.futures.trade.welfare.vm;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.compliance.leverage.EuropeUnlockLeverageProcessor;
import com.kubi.futures.trade.challenge.TradeProTrialStateStore;
import com.kubi.kumex.data.platform.model.FuturesWelfareComposeEntity;
import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.network.retrofit.utils.C19331c;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SelectFuturesWelfareViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.welfare.vm.SelectFuturesWelfareViewModel$fetchFuturesWelfare$1", m90122f = "SelectFuturesWelfareViewModel.kt", m90123i = {}, m90124l = {109}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SelectFuturesWelfareViewModel$fetchFuturesWelfare$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currency;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ SelectFuturesWelfareViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.vm.SelectFuturesWelfareViewModel$fetchFuturesWelfare$1$1 */
    /* JADX INFO: compiled from: SelectFuturesWelfareViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.trade.welfare.vm.SelectFuturesWelfareViewModel$fetchFuturesWelfare$1$1", m90122f = "SelectFuturesWelfareViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C144241 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $currency;
        final /* synthetic */ String $symbol;
        int label;
        final /* synthetic */ SelectFuturesWelfareViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144241(SelectFuturesWelfareViewModel selectFuturesWelfareViewModel, String str, String str2, Continuation<? super C144241> continuation) {
            super(1, continuation);
            this.this$0 = selectFuturesWelfareViewModel;
            this.$currency = str;
            this.$symbol = str2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C144241(this.this$0, this.$currency, this.$symbol, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C144241) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            FuturesWelfareComposeEntity futuresWelfareComposeEntityMo100557e;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.this$0.m28802z()) {
                    futuresWelfareComposeEntityMo100557e = RepositoryServiceLocator.f19236a.m20292k().mo100570x();
                } else {
                    futuresWelfareComposeEntityMo100557e = RepositoryServiceLocator.f19236a.m20292k().mo100557e(this.$currency, this.$symbol, "ALL");
                }
                if (futuresWelfareComposeEntityMo100557e != null) {
                    if (this.this$0.m28802z()) {
                        futuresWelfareComposeEntityMo100557e = this.this$0.m28787i(futuresWelfareComposeEntityMo100557e, this.$symbol);
                    }
                    this.this$0.m28799w().postValue(futuresWelfareComposeEntityMo100557e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Unit m28808f(Throwable th2) {
        C19331c.m42836c(th2, null, 2, null);
        TradeProTrialStateStore.m26980c(TradeProTrialStateStore.f23763a, 0L, 1, null);
        EuropeUnlockLeverageProcessor.f22643a.m24701h();
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectFuturesWelfareViewModel$fetchFuturesWelfare$1(SelectFuturesWelfareViewModel selectFuturesWelfareViewModel, String str, String str2, Continuation<? super SelectFuturesWelfareViewModel$fetchFuturesWelfare$1> continuation) {
        super(2, continuation);
        this.this$0 = selectFuturesWelfareViewModel;
        this.$currency = str;
        this.$symbol = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectFuturesWelfareViewModel$fetchFuturesWelfare$1(this.this$0, this.$currency, this.$symbol, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SelectFuturesWelfareViewModel$fetchFuturesWelfare$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C144241 c144241 = new C144241(this.this$0, this.$currency, this.$symbol, null);
            Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.welfare.vm.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelectFuturesWelfareViewModel$fetchFuturesWelfare$1.m28808f((Throwable) obj2);
                }
            };
            this.label = 1;
            if (CoroutineExKt.m36471a(c144241, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
