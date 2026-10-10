package com.kubi.futures.settings.vm;

import cm.UnifyChangeLeverageResult;
import java.math.BigDecimal;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.kubi.futures.settings.vm.UnifyIsolatedLeverageSettingViewModel$fetchLeverageCalResultOfAfter$1 */
/* JADX INFO: compiled from: UnifyIsolatedLeverageSettingViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.vm.UnifyIsolatedLeverageSettingViewModel$fetchLeverageCalResultOfAfter$1", m90122f = "UnifyIsolatedLeverageSettingViewModel.kt", m90123i = {}, m90124l = {46, 47}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class C13519xe7b2da77 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BigDecimal $leverage;
    final /* synthetic */ String $positionSide;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ UnifyIsolatedLeverageSettingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13519xe7b2da77(UnifyIsolatedLeverageSettingViewModel unifyIsolatedLeverageSettingViewModel, String str, BigDecimal bigDecimal, String str2, Continuation<? super C13519xe7b2da77> continuation) {
        super(2, continuation);
        this.this$0 = unifyIsolatedLeverageSettingViewModel;
        this.$symbol = str;
        this.$leverage = bigDecimal;
        this.$positionSide = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C13519xe7b2da77(this.this$0, this.$symbol, this.$leverage, this.$positionSide, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((C13519xe7b2da77) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
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
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.m26434O().postValue((UnifyChangeLeverageResult) obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        this.label = 1;
        if (DelayKt.m90350b(500L, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        UnifyIsolatedLeverageSettingViewModel unifyIsolatedLeverageSettingViewModel = this.this$0;
        String str = this.$symbol;
        BigDecimal bigDecimal = this.$leverage;
        String str2 = this.$positionSide;
        this.label = 2;
        obj = unifyIsolatedLeverageSettingViewModel.m26433M(str, bigDecimal, str2, this);
    }
}
