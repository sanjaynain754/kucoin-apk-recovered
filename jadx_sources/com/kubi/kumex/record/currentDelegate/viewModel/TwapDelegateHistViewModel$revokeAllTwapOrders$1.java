package com.kubi.kumex.record.currentDelegate.viewModel;

import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.network.retrofit.utils.C19331c;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import p595rg.InterfaceC44076d;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TwapDelegateHistViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.record.currentDelegate.viewModel.TwapDelegateHistViewModel$revokeAllTwapOrders$1", m90122f = "TwapDelegateHistViewModel.kt", m90123i = {0}, m90124l = {181}, m90125m = "invokeSuspend", m90126n = {"ex"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nTwapDelegateHistViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwapDelegateHistViewModel.kt\ncom/kubi/kumex/record/currentDelegate/viewModel/TwapDelegateHistViewModel$revokeAllTwapOrders$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,274:1\n1#2:275\n*E\n"})
public final class TwapDelegateHistViewModel$revokeAllTwapOrders$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    Object L$0;
    int label;
    final /* synthetic */ TwapDelegateHistViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.viewModel.TwapDelegateHistViewModel$revokeAllTwapOrders$1$1 */
    /* JADX INFO: compiled from: TwapDelegateHistViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kumex.record.currentDelegate.viewModel.TwapDelegateHistViewModel$revokeAllTwapOrders$1$1", m90122f = "TwapDelegateHistViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C166281 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $symbol;
        int label;
        final /* synthetic */ TwapDelegateHistViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C166281(String str, TwapDelegateHistViewModel twapDelegateHistViewModel, Continuation<? super C166281> continuation) {
            super(1, continuation);
            this.$symbol = str;
            this.this$0 = twapDelegateHistViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C166281(this.$symbol, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C166281) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC44076d.m97138b0(MultiBizFacadeManager.m20260s(MultiBizFacadeManager.f19232a, null, 1, null), this.$symbol, null, 2, null);
                this.this$0.f30124n0.postValue(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwapDelegateHistViewModel$revokeAllTwapOrders$1(TwapDelegateHistViewModel twapDelegateHistViewModel, String str, Continuation<? super TwapDelegateHistViewModel$revokeAllTwapOrders$1> continuation) {
        super(2, continuation);
        this.this$0 = twapDelegateHistViewModel;
        this.$symbol = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final Unit m35624f(Ref.ObjectRef objectRef, Throwable th2) {
        objectRef.element = th2;
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TwapDelegateHistViewModel$revokeAllTwapOrders$1(this.this$0, this.$symbol, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TwapDelegateHistViewModel$revokeAllTwapOrders$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                objectRef = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            C166281 c166281 = new C166281(this.$symbol, this.this$0, null);
            Function1 function1 = new Function1() { // from class: com.kubi.kumex.record.currentDelegate.viewModel.r
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TwapDelegateHistViewModel$revokeAllTwapOrders$1.m35624f(objectRef2, (Throwable) obj2);
                }
            };
            this.L$0 = objectRef2;
            this.label = 1;
            if (CoroutineExKt.m36471a(c166281, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
        }
        this.this$0.f30108X.postValue(Boxing.boxBoolean(false));
        T t11 = objectRef.element;
        if (t11 instanceof CancellationException) {
            return Unit.INSTANCE;
        }
        Throwable th2 = (Throwable) t11;
        if (th2 != null) {
            C19331c.m42836c(th2, null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
