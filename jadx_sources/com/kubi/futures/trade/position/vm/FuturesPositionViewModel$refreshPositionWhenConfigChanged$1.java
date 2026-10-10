package com.kubi.futures.trade.position.vm;

import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p640ti.InterfaceC45033h;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FuturesPositionViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.position.vm.FuturesPositionViewModel$refreshPositionWhenConfigChanged$1", m90122f = "FuturesPositionViewModel.kt", m90123i = {}, m90124l = {212}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FuturesPositionViewModel$refreshPositionWhenConfigChanged$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FuturesPositionViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.position.vm.FuturesPositionViewModel$refreshPositionWhenConfigChanged$1$1 */
    /* JADX INFO: compiled from: FuturesPositionViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.trade.position.vm.FuturesPositionViewModel$refreshPositionWhenConfigChanged$1$1", m90122f = "FuturesPositionViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C140391 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ FuturesPositionViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140391(FuturesPositionViewModel futuresPositionViewModel, Continuation<? super C140391> continuation) {
            super(2, continuation);
            this.this$0 = futuresPositionViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C140391(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C140391) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                PositionsAsyncDealWrapper positionsAsyncDealWrapper = new PositionsAsyncDealWrapper(null, null, 3, null);
                FuturesPositionViewModel futuresPositionViewModel = this.this$0;
                positionsAsyncDealWrapper.m28035c(futuresPositionViewModel.getF24299c0());
                List<InterfaceC45033h> value = futuresPositionViewModel.m27914Z().getValue();
                if (value == null) {
                    value = new ArrayList<>();
                }
                positionsAsyncDealWrapper.m28036d(futuresPositionViewModel.m27906A0(value));
                this.this$0.m27913Y().postValue(positionsAsyncDealWrapper);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesPositionViewModel$refreshPositionWhenConfigChanged$1(FuturesPositionViewModel futuresPositionViewModel, Continuation<? super FuturesPositionViewModel$refreshPositionWhenConfigChanged$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresPositionViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesPositionViewModel$refreshPositionWhenConfigChanged$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FuturesPositionViewModel$refreshPositionWhenConfigChanged$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AbstractC41697j0 abstractC41697j0M94119a = C42911a.m94119a();
            C140391 c140391 = new C140391(this.this$0, null);
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0M94119a, c140391, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
