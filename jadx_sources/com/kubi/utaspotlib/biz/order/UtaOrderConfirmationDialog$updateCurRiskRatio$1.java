package com.kubi.utaspotlib.biz.order;

import com.kubi.resources.widget.BaseTextView;
import com.kubi.unify.api.IUnifyAccountService;
import java.math.BigDecimal;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import q70.C43660g;

/* JADX INFO: compiled from: UtaOrderConfirmationDialog.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.utaspotlib.biz.order.UtaOrderConfirmationDialog$updateCurRiskRatio$1", m90122f = "UtaOrderConfirmationDialog.kt", m90123i = {}, m90124l = {282}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UtaOrderConfirmationDialog$updateCurRiskRatio$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UtaOrderConfirmationDialog this$0;

    /* JADX INFO: renamed from: com.kubi.utaspotlib.biz.order.UtaOrderConfirmationDialog$updateCurRiskRatio$1$1 */
    /* JADX INFO: compiled from: UtaOrderConfirmationDialog.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Ljava/math/BigDecimal;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.utaspotlib.biz.order.UtaOrderConfirmationDialog$updateCurRiskRatio$1$1", m90122f = "UtaOrderConfirmationDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C269121 extends SuspendLambda implements Function2<BigDecimal, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UtaOrderConfirmationDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C269121(UtaOrderConfirmationDialog utaOrderConfirmationDialog, Continuation<? super C269121> continuation) {
            super(2, continuation);
            this.this$0 = utaOrderConfirmationDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C269121 c269121 = new C269121(this.this$0, continuation);
            c269121.L$0 = obj;
            return c269121;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(BigDecimal bigDecimal, Continuation<? super Unit> continuation) {
            return ((C269121) create(bigDecimal, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            BaseTextView baseTextView;
            BigDecimal bigDecimal = (BigDecimal) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C43660g c43660gM66145R3 = this.this$0.m66145R3();
            if (c43660gM66145R3 != null && (baseTextView = c43660gM66145R3.f96393k) != null) {
                baseTextView.setText(this.this$0.m66138K3(bigDecimal));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtaOrderConfirmationDialog$updateCurRiskRatio$1(UtaOrderConfirmationDialog utaOrderConfirmationDialog, Continuation<? super UtaOrderConfirmationDialog$updateCurRiskRatio$1> continuation) {
        super(2, continuation);
        this.this$0 = utaOrderConfirmationDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UtaOrderConfirmationDialog$updateCurRiskRatio$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UtaOrderConfirmationDialog$updateCurRiskRatio$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e<BigDecimal> interfaceC41634eMo64993h = IUnifyAccountService.f53155a.get().mo64993h();
            C269121 c269121 = new C269121(this.this$0, null);
            this.label = 1;
            if (C41636g.m90925l(interfaceC41634eMo64993h, c269121, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
