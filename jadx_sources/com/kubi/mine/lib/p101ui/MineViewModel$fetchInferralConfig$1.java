package com.kubi.mine.lib.p101ui;

import com.kubi.advert.api.IAdvertService;
import com.kubi.advert.api.entity.PromotionConfig;
import com.kubi.mine.lib.service.MineDepend;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MineViewModel.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.MineViewModel$fetchInferralConfig$1", m90122f = "MineViewModel.kt", m90123i = {}, m90124l = {182}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MineViewModel$fetchInferralConfig$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MineViewModel$fetchInferralConfig$1(MineViewModel mineViewModel, Continuation<? super MineViewModel$fetchInferralConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = mineViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MineViewModel$fetchInferralConfig$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MineViewModel$fetchInferralConfig$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MineViewModel$fetchInferralConfig$1 mineViewModel$fetchInferralConfig$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                mineViewModel$fetchInferralConfig$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            IAdvertService iAdvertServiceM41822a = MineDepend.f35159a.m41822a();
            this.label = 1;
            mineViewModel$fetchInferralConfig$1 = this;
            obj = IAdvertService.m14757j(iAdvertServiceM41822a, "toc", "APPPersonalReferral", false, mineViewModel$fetchInferralConfig$1, 4, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        mineViewModel$fetchInferralConfig$1.this$0.m42148E().postValue((PromotionConfig) obj);
        return Unit.INSTANCE;
    }
}
