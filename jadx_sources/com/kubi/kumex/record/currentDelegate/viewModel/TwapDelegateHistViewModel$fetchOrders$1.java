package com.kubi.kumex.record.currentDelegate.viewModel;

import com.kubi.kumex.data.trade.model.TwapDelegateHistPageEntity;
import com.kubi.kumex.utils.CoroutineExKt;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: TwapDelegateHistViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.record.currentDelegate.viewModel.TwapDelegateHistViewModel$fetchOrders$1", m90122f = "TwapDelegateHistViewModel.kt", m90123i = {0, 1, 1}, m90124l = {89, 108}, m90125m = "invokeSuspend", m90126n = {"exception", "exception", "records"}, m90127s = {"L$0", "L$0", "L$1"})
public final class TwapDelegateHistViewModel$fetchOrders$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $orderIdLt;
    final /* synthetic */ String $symbol;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TwapDelegateHistViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.viewModel.TwapDelegateHistViewModel$fetchOrders$1$1 */
    /* JADX INFO: compiled from: TwapDelegateHistViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kumex.record.currentDelegate.viewModel.TwapDelegateHistViewModel$fetchOrders$1$1", m90122f = "TwapDelegateHistViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C166251 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<Throwable> $exception;
        final /* synthetic */ String $orderIdLt;
        final /* synthetic */ TwapDelegateHistPageEntity $records;
        int label;
        final /* synthetic */ TwapDelegateHistViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C166251(TwapDelegateHistViewModel twapDelegateHistViewModel, String str, Ref.ObjectRef<Throwable> objectRef, TwapDelegateHistPageEntity twapDelegateHistPageEntity, Continuation<? super C166251> continuation) {
            super(2, continuation);
            this.this$0 = twapDelegateHistViewModel;
            this.$orderIdLt = str;
            this.$exception = objectRef;
            this.$records = twapDelegateHistPageEntity;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C166251(this.this$0, this.$orderIdLt, this.$exception, this.$records, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C166251) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.m35615S(this.$orderIdLt);
                String str = this.$orderIdLt;
                if (str == null || str.length() == 0) {
                    this.this$0.f30128r0.clear();
                }
                Throwable th2 = this.$exception.element;
                if (th2 != null) {
                    this.this$0.m35617y(th2);
                } else {
                    this.this$0.m35618z(this.$records, this.$orderIdLt);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwapDelegateHistViewModel$fetchOrders$1(String str, String str2, TwapDelegateHistViewModel twapDelegateHistViewModel, Continuation<? super TwapDelegateHistViewModel$fetchOrders$1> continuation) {
        super(2, continuation);
        this.$symbol = str;
        this.$orderIdLt = str2;
        this.this$0 = twapDelegateHistViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final Unit m35620f(Ref.ObjectRef objectRef, Throwable th2) {
        objectRef.element = th2;
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TwapDelegateHistViewModel$fetchOrders$1(this.$symbol, this.$orderIdLt, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TwapDelegateHistViewModel$fetchOrders$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r10, r3, r9) == r0) goto L20;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final Ref.ObjectRef objectRef;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                objectRef = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        objectRef = new Ref.ObjectRef();
        TwapDelegateHistViewModel$fetchOrders$1$records$1 twapDelegateHistViewModel$fetchOrders$1$records$1 = new TwapDelegateHistViewModel$fetchOrders$1$records$1(this.$symbol, this.$orderIdLt, null);
        Function1 function1 = new Function1() { // from class: com.kubi.kumex.record.currentDelegate.viewModel.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return TwapDelegateHistViewModel$fetchOrders$1.m35620f(objectRef, (Throwable) obj2);
            }
        };
        this.L$0 = objectRef;
        this.label = 1;
        obj = CoroutineExKt.m36471a(twapDelegateHistViewModel$fetchOrders$1$records$1, function1, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        Ref.ObjectRef objectRef2 = objectRef;
        TwapDelegateHistPageEntity twapDelegateHistPageEntity = (TwapDelegateHistPageEntity) obj;
        if (objectRef2.element instanceof CancellationException) {
            return Unit.INSTANCE;
        }
        AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
        C166251 c166251 = new C166251(this.this$0, this.$orderIdLt, objectRef2, twapDelegateHistPageEntity, null);
        this.L$0 = SpillingKt.nullOutSpilledVariable(objectRef2);
        this.L$1 = SpillingKt.nullOutSpilledVariable(twapDelegateHistPageEntity);
        this.label = 2;
    }
}
