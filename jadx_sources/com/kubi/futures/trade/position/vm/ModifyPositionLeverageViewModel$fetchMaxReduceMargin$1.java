package com.kubi.futures.trade.position.vm;

import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.utils.extensions.C27039d;
import java.math.BigDecimal;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ModifyPositionLeverageViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.position.vm.ModifyPositionLeverageViewModel$fetchMaxReduceMargin$1", m90122f = "ModifyPositionLeverageViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ModifyPositionLeverageViewModel$fetchMaxReduceMargin$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isTrial;
    final /* synthetic */ String $positionSide;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ ModifyPositionLeverageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifyPositionLeverageViewModel$fetchMaxReduceMargin$1(boolean z11, String str, String str2, ModifyPositionLeverageViewModel modifyPositionLeverageViewModel, Continuation<? super ModifyPositionLeverageViewModel$fetchMaxReduceMargin$1> continuation) {
        super(2, continuation);
        this.$isTrial = z11;
        this.$symbol = str;
        this.$positionSide = str2;
        this.this$0 = modifyPositionLeverageViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModifyPositionLeverageViewModel$fetchMaxReduceMargin$1(this.$isTrial, this.$symbol, this.$positionSide, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ModifyPositionLeverageViewModel$fetchMaxReduceMargin$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            BigDecimal bigDecimalMo93806N = MultiBizFacadeManager.m20259p(MultiBizFacadeManager.f19232a, null, 1, null).mo93806N(this.$isTrial, this.$symbol, this.$positionSide);
            this.this$0.f24310c0 = C27039d.m66656p(bigDecimalMo93806N);
            this.this$0.m27924A();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
