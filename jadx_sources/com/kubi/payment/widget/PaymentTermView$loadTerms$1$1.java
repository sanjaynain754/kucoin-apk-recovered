package com.kubi.payment.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.LifecycleOwner;
import com.kubi.payment.PaymentServiceLocator;
import com.kubi.payment.data.entities.TermInfo;
import com.kubi.payment.data.source.PaymentRepository;
import kotlinx.coroutines.AbstractC41586e2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p477nt.C42879l;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PaymentTermView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.widget.PaymentTermView$loadTerms$1$1", m90122f = "PaymentTermView.kt", m90123i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m90124l = {70, 143}, m90125m = "invokeSuspend", m90126n = {"paymentRepository", "paymentRepository", "resul", "$this$withResumed$iv", "$this$withStateAtLeastUnchecked$iv$iv", "state$iv$iv", "lifecycleDispatcher$iv$iv", "$i$f$withResumed", "$i$f$withStateAtLeastUnchecked", "dispatchNeeded$iv$iv"}, m90127s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "Z$0"})
@SourceDebugExtension({"SMAP\nPaymentTermView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentTermView.kt\ncom/kubi/payment/widget/PaymentTermView$loadTerms$1$1\n+ 2 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n*L\n1#1,134:1\n75#2:135\n127#2,8:136\n*S KotlinDebug\n*F\n+ 1 PaymentTermView.kt\ncom/kubi/payment/widget/PaymentTermView$loadTerms$1$1\n*L\n71#1:135\n71#1:136,8\n*E\n"})
public final class PaymentTermView$loadTerms$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ LifecycleOwner $lifeCycleOwner;
    final /* synthetic */ TermInfo.Request $request;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    final /* synthetic */ PaymentTermView this$0;

    /* JADX INFO: renamed from: com.kubi.payment.widget.PaymentTermView$loadTerms$1$1$a */
    /* JADX INFO: compiled from: WithLifecycleState.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt$withStateAtLeastUnchecked$2\n+ 2 PaymentTermView.kt\ncom/kubi/payment/widget/PaymentTermView$loadTerms$1$1\n*L\n1#1,134:1\n72#2,3:135\n*E\n"})
    public static final class C21461a implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC42878k f40414b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ PaymentTermView f40415c;

        public C21461a(AbstractC42878k abstractC42878k, PaymentTermView paymentTermView) {
            this.f40414b = abstractC42878k;
            this.f40415c = paymentTermView;
        }

        @Override // p852kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f40415c.m49902d((TermInfo.Response) C42879l.m94041a(this.f40414b));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentTermView$loadTerms$1$1(TermInfo.Request request, LifecycleOwner lifecycleOwner, PaymentTermView paymentTermView, Continuation<? super PaymentTermView$loadTerms$1$1> continuation) {
        super(2, continuation);
        this.$request = request;
        this.$lifeCycleOwner = lifecycleOwner;
        this.this$0 = paymentTermView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentTermView$loadTerms$1$1(this.$request, this.$lifeCycleOwner, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((PaymentTermView$loadTerms$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0098  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cf, code lost:
    
        if (androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(r4, r5, r6, r7, r8, r10) == r0) goto L24;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PaymentRepository paymentRepositoryM45618f;
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
                paymentRepositoryM45618f = (PaymentRepository) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        paymentRepositoryM45618f = PaymentServiceLocator.f38204a.m45618f();
        TermInfo.Request request = this.$request;
        this.L$0 = SpillingKt.nullOutSpilledVariable(paymentRepositoryM45618f);
        this.label = 1;
        obj = paymentRepositoryM45618f.mo46266U(request, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        Lifecycle lifecycle = this.$lifeCycleOwner.getLifecycle();
        PaymentTermView paymentTermView = this.this$0;
        Lifecycle.State state = Lifecycle.State.RESUMED;
        AbstractC41586e2 immediate = C41782z0.m91393c().getImmediate();
        boolean zIsDispatchNeeded = immediate.isDispatchNeeded(get$context());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getState().compareTo(state) >= 0) {
                    paymentTermView.m49902d((TermInfo.Response) C42879l.m94041a(abstractC42878k));
                    Unit unit = Unit.INSTANCE;
                } else {
                    C21461a c21461a = new C21461a(abstractC42878k, paymentTermView);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(paymentRepositoryM45618f);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(lifecycle);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(lifecycle);
                    this.L$4 = SpillingKt.nullOutSpilledVariable(state);
                    this.L$5 = SpillingKt.nullOutSpilledVariable(immediate);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.Z$0 = zIsDispatchNeeded;
                    this.label = 2;
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        } else {
            C21461a c21461a2 = new C21461a(abstractC42878k, paymentTermView);
            this.L$0 = SpillingKt.nullOutSpilledVariable(paymentRepositoryM45618f);
            this.L$1 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
            this.L$2 = SpillingKt.nullOutSpilledVariable(lifecycle);
            this.L$3 = SpillingKt.nullOutSpilledVariable(lifecycle);
            this.L$4 = SpillingKt.nullOutSpilledVariable(state);
            this.L$5 = SpillingKt.nullOutSpilledVariable(immediate);
            this.I$0 = 0;
            this.I$1 = 0;
            this.Z$0 = zIsDispatchNeeded;
            this.label = 2;
        }
        return Unit.INSTANCE;
    }
}
