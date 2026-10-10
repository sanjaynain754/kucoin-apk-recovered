package com.kubi.spot.dialog.order;

import com.kubi.spot.dialog.order.model.AmendContext;
import com.kubi.spot.dialog.order.model.AmendResult;
import com.kubi.spot.dialog.order.orchestrator.AmendOrchestrator;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AmendOrderDialog.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001*\u00020\u0004H\n"}, m90084d2 = {"<anonymous>", "Lkotlin/Result;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/spot/dialog/order/model/AmendResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.dialog.order.AmendOrderDialog$initView$4$1$1$1$1", m90122f = "AmendOrderDialog.kt", m90123i = {}, m90124l = {180, 181}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AmendOrderDialog$initView$4$1$1$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Result<? extends InterfaceC41634e<? extends AmendResult>>>, Object> {
    final /* synthetic */ AmendContext $amendContext;
    final /* synthetic */ AmendOrderDialog $this_runCatching;
    final /* synthetic */ String $validationToken;
    int label;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Result<? extends InterfaceC41634e<? extends AmendResult>>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super Result<? extends InterfaceC41634e<AmendResult>>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmendOrderDialog$initView$4$1$1$1$1(AmendOrderDialog amendOrderDialog, AmendContext amendContext, String str, Continuation<? super AmendOrderDialog$initView$4$1$1$1$1> continuation) {
        super(2, continuation);
        this.$this_runCatching = amendOrderDialog;
        this.$amendContext = amendContext;
        this.$validationToken = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AmendOrderDialog$initView$4$1$1$1$1(this.$this_runCatching, this.$amendContext, this.$validationToken, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Result<? extends InterfaceC41634e<AmendResult>>> continuation) {
        return ((AmendOrderDialog$initView$4$1$1$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r10 == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM61739a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                    objM61739a = ((Result) obj).getValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Result.m103843boximpl(objM61739a);
        }
        ResultKt.throwOnFailure(obj);
        this.label = 1;
        if (DelayKt.m90350b(50L, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        AmendApi amendApiM61696G4 = this.$this_runCatching.m61696G4();
        Intrinsics.checkNotNullExpressionValue(amendApiM61696G4, "access$getApi(...)");
        AmendOrchestrator amendOrchestrator = new AmendOrchestrator(amendApiM61696G4, null, null, 6, null);
        AmendContext amendContext = this.$amendContext;
        String str = this.$validationToken;
        this.label = 2;
        objM61739a = amendOrchestrator.m61739a(amendContext, str, this);
    }
}
