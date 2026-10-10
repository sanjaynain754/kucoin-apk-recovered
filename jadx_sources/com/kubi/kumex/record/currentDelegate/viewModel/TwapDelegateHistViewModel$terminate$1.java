package com.kubi.kumex.record.currentDelegate.viewModel;

import com.kubi.broker.MultiBizFacadeManager;
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
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: TwapDelegateHistViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.record.currentDelegate.viewModel.TwapDelegateHistViewModel$terminate$1", m90122f = "TwapDelegateHistViewModel.kt", m90123i = {0, 1, 1}, m90124l = {241, 252}, m90125m = "invokeSuspend", m90126n = {"ex", "ex", "exception"}, m90127s = {"L$0", "L$0", "L$1"})
public final class TwapDelegateHistViewModel$terminate$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $orderId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TwapDelegateHistViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.viewModel.TwapDelegateHistViewModel$terminate$1$1 */
    /* JADX INFO: compiled from: TwapDelegateHistViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kumex.record.currentDelegate.viewModel.TwapDelegateHistViewModel$terminate$1$1", m90122f = "TwapDelegateHistViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C166291 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {
        final /* synthetic */ String $orderId;
        int label;

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Object> continuation) {
            return invoke2((Continuation<Object>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C166291(String str, Continuation<? super C166291> continuation) {
            super(1, continuation);
            this.$orderId = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C166291(this.$orderId, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<Object> continuation) {
            return ((C166291) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return MultiBizFacadeManager.m20260s(MultiBizFacadeManager.f19232a, null, 1, null).mo4512r(this.$orderId);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.viewModel.TwapDelegateHistViewModel$terminate$1$3 */
    /* JADX INFO: compiled from: TwapDelegateHistViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kumex.record.currentDelegate.viewModel.TwapDelegateHistViewModel$terminate$1$3", m90122f = "TwapDelegateHistViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C166303 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $orderId;
        int label;
        final /* synthetic */ TwapDelegateHistViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C166303(TwapDelegateHistViewModel twapDelegateHistViewModel, String str, Continuation<? super C166303> continuation) {
            super(2, continuation);
            this.this$0 = twapDelegateHistViewModel;
            this.$orderId = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C166303(this.this$0, this.$orderId, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C166303) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.m35612N(this.$orderId);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwapDelegateHistViewModel$terminate$1(TwapDelegateHistViewModel twapDelegateHistViewModel, String str, Continuation<? super TwapDelegateHistViewModel$terminate$1> continuation) {
        super(2, continuation);
        this.this$0 = twapDelegateHistViewModel;
        this.$orderId = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final Unit m35626f(Ref.ObjectRef objectRef, Throwable th2) {
        objectRef.element = th2;
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TwapDelegateHistViewModel$terminate$1(this.this$0, this.$orderId, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TwapDelegateHistViewModel$terminate$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r15, r4, r14) == r0) goto L20;
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
        C166291 c166291 = new C166291(this.$orderId, null);
        Function1 function1 = new Function1() { // from class: com.kubi.kumex.record.currentDelegate.viewModel.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return TwapDelegateHistViewModel$terminate$1.m35626f(objectRef, (Throwable) obj2);
            }
        };
        this.L$0 = objectRef;
        this.label = 1;
        if (CoroutineExKt.m36471a(c166291, function1, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        this.this$0.f30108X.postValue(Boxing.boxBoolean(false));
        Throwable th2 = (Throwable) objectRef.element;
        if (th2 instanceof CancellationException) {
            return Unit.INSTANCE;
        }
        if (th2 == null) {
            this.this$0.f30126p0.postValue(new com.kubi.kumex.trade.order.viewModel.a(true, this.$orderId, (Throwable) null, 4, (DefaultConstructorMarker) null));
            AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
            C166303 c166303 = new C166303(this.this$0, this.$orderId, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(objectRef);
            this.L$1 = SpillingKt.nullOutSpilledVariable(th2);
            this.label = 2;
        } else {
            this.this$0.f30126p0.postValue(new com.kubi.kumex.trade.order.viewModel.a(false, (String) null, th2, 2, (DefaultConstructorMarker) null));
        }
        return Unit.INSTANCE;
    }
}
