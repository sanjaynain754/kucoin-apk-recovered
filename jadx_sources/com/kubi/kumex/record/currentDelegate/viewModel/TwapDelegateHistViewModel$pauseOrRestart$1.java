package com.kubi.kumex.record.currentDelegate.viewModel;

import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.R$string;
import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: TwapDelegateHistViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.record.currentDelegate.viewModel.TwapDelegateHistViewModel$pauseOrRestart$1", m90122f = "TwapDelegateHistViewModel.kt", m90123i = {0, 1, 1}, m90124l = {203, 213}, m90125m = "invokeSuspend", m90126n = {"ex", "ex", "exception"}, m90127s = {"L$0", "L$0", "L$1"})
public final class TwapDelegateHistViewModel$pauseOrRestart$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $orderId;
    final /* synthetic */ String $orderStatus;
    final /* synthetic */ String $targetStatus;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TwapDelegateHistViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.viewModel.TwapDelegateHistViewModel$pauseOrRestart$1$1 */
    /* JADX INFO: compiled from: TwapDelegateHistViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kumex.record.currentDelegate.viewModel.TwapDelegateHistViewModel$pauseOrRestart$1$1", m90122f = "TwapDelegateHistViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C166261 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {
        final /* synthetic */ String $orderId;
        final /* synthetic */ String $targetStatus;
        int label;

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Object> continuation) {
            return invoke2((Continuation<Object>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C166261(String str, String str2, Continuation<? super C166261> continuation) {
            super(1, continuation);
            this.$orderId = str;
            this.$targetStatus = str2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C166261(this.$orderId, this.$targetStatus, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<Object> continuation) {
            return ((C166261) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return MultiBizFacadeManager.m20260s(MultiBizFacadeManager.f19232a, null, 1, null).mo4516y(this.$orderId, this.$targetStatus);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.viewModel.TwapDelegateHistViewModel$pauseOrRestart$1$3 */
    /* JADX INFO: compiled from: TwapDelegateHistViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kumex.record.currentDelegate.viewModel.TwapDelegateHistViewModel$pauseOrRestart$1$3", m90122f = "TwapDelegateHistViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C166273 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $orderId;
        final /* synthetic */ String $orderStatus;
        int label;
        final /* synthetic */ TwapDelegateHistViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C166273(TwapDelegateHistViewModel twapDelegateHistViewModel, String str, String str2, Continuation<? super C166273> continuation) {
            super(2, continuation);
            this.this$0 = twapDelegateHistViewModel;
            this.$orderId = str;
            this.$orderStatus = str2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C166273(this.this$0, this.$orderId, this.$orderStatus, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C166273) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.m35613Q(this.$orderId, this.$orderStatus);
                ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.common_setting_successful, new Object[0]), new Object[0]);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwapDelegateHistViewModel$pauseOrRestart$1(TwapDelegateHistViewModel twapDelegateHistViewModel, String str, String str2, String str3, Continuation<? super TwapDelegateHistViewModel$pauseOrRestart$1> continuation) {
        super(2, continuation);
        this.this$0 = twapDelegateHistViewModel;
        this.$orderId = str;
        this.$targetStatus = str2;
        this.$orderStatus = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final Unit m35622f(Ref.ObjectRef objectRef, Throwable th2) {
        objectRef.element = th2;
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TwapDelegateHistViewModel$pauseOrRestart$1(this.this$0, this.$orderId, this.$targetStatus, this.$orderStatus, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TwapDelegateHistViewModel$pauseOrRestart$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r2, r5, r9) == r0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
        C166261 c166261 = new C166261(this.$orderId, this.$targetStatus, null);
        Function1 function1 = new Function1() { // from class: com.kubi.kumex.record.currentDelegate.viewModel.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return TwapDelegateHistViewModel$pauseOrRestart$1.m35622f(objectRef, (Throwable) obj2);
            }
        };
        this.L$0 = objectRef;
        this.label = 1;
        if (CoroutineExKt.m36471a(c166261, function1, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        this.this$0.f30108X.postValue(Boxing.boxBoolean(false));
        Throwable th2 = (Throwable) objectRef.element;
        if (th2 instanceof CancellationException) {
            return Unit.INSTANCE;
        }
        if (th2 == null) {
            AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
            C166273 c166273 = new C166273(this.this$0, this.$orderId, this.$orderStatus, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(objectRef);
            this.L$1 = SpillingKt.nullOutSpilledVariable(th2);
            this.label = 2;
        } else {
            C19331c.m42836c(th2, null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
