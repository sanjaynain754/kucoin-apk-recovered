package com.kubi.core.spot.business.holder;

import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.tradecorebiz.R$string;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: BaseOrderHolder.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.spot.business.holder.BaseOrderHolder$initView$4$1", m90122f = "BaseOrderHolder.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class BaseOrderHolder$initView$4$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BaseOrderHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseOrderHolder$initView$4$1(BaseOrderHolder baseOrderHolder, Continuation<? super BaseOrderHolder$initView$4$1> continuation) {
        super(2, continuation);
        this.this$0 = baseOrderHolder;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseOrderHolder$initView$4$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BaseOrderHolder$initView$4$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.this$0.m22963r0()) {
                return Unit.INSTANCE;
            }
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.useful).m54153J4(R$string.unify_margin_acount_amount_tip).m54162S4(R$string.i_already_know, null).m54172c5(this.this$0.getF21029b().mo22357H().getChildFragmentManager());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
