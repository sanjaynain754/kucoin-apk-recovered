package com.kubi.otc;

import com.kubi.widget.web.ui.KWebContainer;
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

/* JADX INFO: compiled from: PaymentWebActivity.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.otc.PaymentWebActivity$startLoad$1", m90122f = "PaymentWebActivity.kt", m90123i = {}, m90124l = {123}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class PaymentWebActivity$startLoad$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $htmlData;
    int label;
    final /* synthetic */ PaymentWebActivity this$0;

    /* JADX INFO: renamed from: com.kubi.otc.PaymentWebActivity$startLoad$1$1 */
    /* JADX INFO: compiled from: PaymentWebActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.otc.PaymentWebActivity$startLoad$1$1", m90122f = "PaymentWebActivity.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C196451 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        final /* synthetic */ String $htmlData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C196451(String str, Continuation<? super C196451> continuation) {
            super(1, continuation);
            this.$htmlData = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C196451(this.$htmlData, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((C196451) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return this.$htmlData;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentWebActivity$startLoad$1(PaymentWebActivity paymentWebActivity, String str, Continuation<? super PaymentWebActivity$startLoad$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentWebActivity;
        this.$htmlData = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentWebActivity$startLoad$1(this.this$0, this.$htmlData, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((PaymentWebActivity$startLoad$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            KWebContainer kWebContainerM67451l0 = this.this$0.m67451l0();
            C196451 c196451 = new C196451(this.$htmlData, null);
            this.label = 1;
            if (kWebContainerM67451l0.m67476B(c196451, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
