package com.kubi.futures.settings.vm;

import cm.UnifyChangeLeverageResult;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.broker.MultiBizFacadeManager;
import java.math.BigDecimal;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import ug.InterfaceC45233b;

/* JADX INFO: compiled from: UnifyIsolatedLeverageSettingViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/kumex/data/trade/model/UnifyChangeLeverageResult;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.vm.UnifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$2", m90122f = "UnifyIsolatedLeverageSettingViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UnifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$2 extends SuspendLambda implements Function1<Continuation<? super UnifyChangeLeverageResult>, Object> {
    final /* synthetic */ BigDecimal $leverage;
    final /* synthetic */ String $positionSide;
    final /* synthetic */ String $symbol;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$2(String str, BigDecimal bigDecimal, String str2, Continuation<? super UnifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$2> continuation) {
        super(1, continuation);
        this.$symbol = str;
        this.$leverage = bigDecimal;
        this.$positionSide = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UnifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$2(this.$symbol, this.$leverage, this.$positionSide, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super UnifyChangeLeverageResult> continuation) {
        return ((UnifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC45233b interfaceC45233bM20259p = MultiBizFacadeManager.m20259p(MultiBizFacadeManager.f19232a, null, 1, null);
            String str = this.$symbol;
            String plainString = C6447a.m11724a(this.$leverage).toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
            return interfaceC45233bM20259p.mo93812n(str, plainString, this.$positionSide);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
