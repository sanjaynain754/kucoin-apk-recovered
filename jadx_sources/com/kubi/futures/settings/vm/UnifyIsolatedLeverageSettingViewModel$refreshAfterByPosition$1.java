package com.kubi.futures.settings.vm;

import cm.UnifyChangeLeverageResult;
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

/* JADX INFO: compiled from: UnifyIsolatedLeverageSettingViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.vm.UnifyIsolatedLeverageSettingViewModel$refreshAfterByPosition$1", m90122f = "UnifyIsolatedLeverageSettingViewModel.kt", m90123i = {}, m90124l = {69}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UnifyIsolatedLeverageSettingViewModel$refreshAfterByPosition$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BigDecimal $leverage;
    final /* synthetic */ String $positionSide;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ UnifyIsolatedLeverageSettingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifyIsolatedLeverageSettingViewModel$refreshAfterByPosition$1(UnifyIsolatedLeverageSettingViewModel unifyIsolatedLeverageSettingViewModel, String str, BigDecimal bigDecimal, String str2, Continuation<? super UnifyIsolatedLeverageSettingViewModel$refreshAfterByPosition$1> continuation) {
        super(2, continuation);
        this.this$0 = unifyIsolatedLeverageSettingViewModel;
        this.$symbol = str;
        this.$leverage = bigDecimal;
        this.$positionSide = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnifyIsolatedLeverageSettingViewModel$refreshAfterByPosition$1(this.this$0, this.$symbol, this.$leverage, this.$positionSide, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UnifyIsolatedLeverageSettingViewModel$refreshAfterByPosition$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            UnifyIsolatedLeverageSettingViewModel unifyIsolatedLeverageSettingViewModel = this.this$0;
            String str = this.$symbol;
            BigDecimal bigDecimal = this.$leverage;
            String str2 = this.$positionSide;
            this.label = 1;
            obj = unifyIsolatedLeverageSettingViewModel.m26433M(str, bigDecimal, str2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.this$0.m26434O().postValue((UnifyChangeLeverageResult) obj);
        return Unit.INSTANCE;
    }
}
