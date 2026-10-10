package com.kubi.quotefacade.chance;

import com.blankj.utilcode.util.C5286o;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.helper.QuoteBusinessConfigHelp;
import com.kubi.sdk.BaseFragment;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ChanceRnContainer.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.chance.ChanceRnContainer$initRn$1", m90122f = "ChanceRnContainer.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ChanceRnContainer$initRn$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChanceRnContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChanceRnContainer$initRn$1(ChanceRnContainer chanceRnContainer, Continuation<? super ChanceRnContainer$initRn$1> continuation) {
        super(2, continuation);
        this.this$0 = chanceRnContainer;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChanceRnContainer$initRn$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ChanceRnContainer$initRn$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            BaseFragment rnRootFragment = IReactNativeService.INSTANCE.get().getRnRootFragment(this.this$0.m51032n3(QuoteBusinessConfigHelp.f41933a.m51845i()));
            ChanceRnContainer chanceRnContainer = this.this$0;
            chanceRnContainer.f41635U = rnRootFragment;
            C5286o.m6317a(chanceRnContainer.getChildFragmentManager(), rnRootFragment, R$id.fl_container);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
