package com.kubi.futures.trade;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.market.model.TickerEntity;
import com.kubi.kumex.utils.CoroutineExKt;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FuturesViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.FuturesViewModel$getFundingRateChange$1", m90122f = "FuturesViewModel.kt", m90123i = {}, m90124l = {231}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FuturesViewModel$getFundingRateChange$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ FuturesViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.FuturesViewModel$getFundingRateChange$1$1 */
    /* JADX INFO: compiled from: FuturesViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.trade.FuturesViewModel$getFundingRateChange$1$1", m90122f = "FuturesViewModel.kt", m90123i = {}, m90124l = {232}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C136121 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $symbol;
        int label;
        final /* synthetic */ FuturesViewModel this$0;

        /* JADX INFO: renamed from: com.kubi.futures.trade.FuturesViewModel$getFundingRateChange$1$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: FuturesViewModel.kt */
        @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.futures.trade.FuturesViewModel$getFundingRateChange$1$1$1", m90122f = "FuturesViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            final /* synthetic */ String $symbol;
            int label;
            final /* synthetic */ FuturesViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, FuturesViewModel futuresViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.$symbol = str;
                this.this$0 = futuresViewModel;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.$symbol, this.this$0, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                TickerEntity tickerEntityMo24822t = RepositoryServiceLocator.f19236a.m20286e().mo24822t(this.$symbol);
                if (tickerEntityMo24822t == null) {
                    tickerEntityMo24822t = new TickerEntity(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
                }
                this.this$0.m26716D().postValue(tickerEntityMo24822t);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136121(String str, FuturesViewModel futuresViewModel, Continuation<? super C136121> continuation) {
            super(2, continuation);
            this.$symbol = str;
            this.this$0 = futuresViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C136121(this.$symbol, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C136121) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m26733f(FuturesViewModel futuresViewModel, Throwable th2) {
            futuresViewModel.m26716D().postValue(new TickerEntity(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null));
            return Unit.INSTANCE;
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
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$symbol, this.this$0, null);
                final FuturesViewModel futuresViewModel = this.this$0;
                Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.a1
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return FuturesViewModel$getFundingRateChange$1.C136121.m26733f(futuresViewModel, (Throwable) obj2);
                    }
                };
                this.label = 1;
                if (CoroutineExKt.m36471a(anonymousClass1, function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesViewModel$getFundingRateChange$1(String str, FuturesViewModel futuresViewModel, Continuation<? super FuturesViewModel$getFundingRateChange$1> continuation) {
        super(2, continuation);
        this.$symbol = str;
        this.this$0 = futuresViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesViewModel$getFundingRateChange$1(this.$symbol, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FuturesViewModel$getFundingRateChange$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            C136121 c136121 = new C136121(this.$symbol, this.this$0, null);
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0M94120b, c136121, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
