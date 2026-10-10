package repayment.dialog;

import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import repayment.InterfaceC44005a;
import repayment.InterfaceC44006b;

/* JADX INFO: compiled from: LiabilitySelectedDialog.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "repayment.dialog.LiabilitySelectedDialog$initData$1", m90122f = "LiabilitySelectedDialog.kt", m90123i = {}, m90124l = {113}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class LiabilitySelectedDialog$initData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LiabilitySelectedDialog this$0;

    /* JADX INFO: renamed from: repayment.dialog.LiabilitySelectedDialog$initData$1$1 */
    /* JADX INFO: compiled from: LiabilitySelectedDialog.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lrepayment/RepayContract$UiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "repayment.dialog.LiabilitySelectedDialog$initData$1$1", m90122f = "LiabilitySelectedDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C440131 extends SuspendLambda implements Function2<InterfaceC44006b, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ LiabilitySelectedDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C440131(LiabilitySelectedDialog liabilitySelectedDialog, Continuation<? super C440131> continuation) {
            super(2, continuation);
            this.this$0 = liabilitySelectedDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C440131 c440131 = new C440131(this.this$0, continuation);
            c440131.L$0 = obj;
            return c440131;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC44006b interfaceC44006b, Continuation<? super Unit> continuation) {
            return ((C440131) create(interfaceC44006b, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC44006b interfaceC44006b = (InterfaceC44006b) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (interfaceC44006b instanceof InterfaceC44006b.c) {
                this.this$0.showLoading();
            } else if (interfaceC44006b instanceof InterfaceC44006b.PageEmpty) {
                this.this$0.m97076w4();
            } else if (interfaceC44006b instanceof InterfaceC44006b.PageLoaded) {
                this.this$0.m97075J4((InterfaceC44006b.PageLoaded) interfaceC44006b);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiabilitySelectedDialog$initData$1(LiabilitySelectedDialog liabilitySelectedDialog, Continuation<? super LiabilitySelectedDialog$initData$1> continuation) {
        super(2, continuation);
        this.this$0 = liabilitySelectedDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiabilitySelectedDialog$initData$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((LiabilitySelectedDialog$initData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            this.this$0.m97052C4().m96976D(new InterfaceC44005a.LoadRepayInfo(this.this$0.m97074A4(), this.this$0.m97079z4()));
            InterfaceC41678w<InterfaceC44006b> interfaceC41678wM96989y = this.this$0.m97052C4().m96989y();
            C440131 c440131 = new C440131(this.this$0, null);
            this.label = 1;
            if (C41636g.m90925l(interfaceC41678wM96989y, c440131, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
