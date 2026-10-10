package com.kubi.futures.trade.marginMode;

import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.data.platform.model.ModifyMarginModeResultEntity;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ModifyMarginModeViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/kumex/data/platform/model/ModifyMarginModeResultEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.marginMode.ModifyMarginModeViewModel$submitMarginMode$1$result$1", m90122f = "ModifyMarginModeViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ModifyMarginModeViewModel$submitMarginMode$1$result$1 extends SuspendLambda implements Function1<Continuation<? super ModifyMarginModeResultEntity>, Object> {
    final /* synthetic */ boolean $isTrial;
    final /* synthetic */ String $marginMode;
    final /* synthetic */ String $symbol;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifyMarginModeViewModel$submitMarginMode$1$result$1(String str, String str2, boolean z11, Continuation<? super ModifyMarginModeViewModel$submitMarginMode$1$result$1> continuation) {
        super(1, continuation);
        this.$symbol = str;
        this.$marginMode = str2;
        this.$isTrial = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ModifyMarginModeViewModel$submitMarginMode$1$result$1(this.$symbol, this.$marginMode, this.$isTrial, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ModifyMarginModeResultEntity> continuation) {
        return ((ModifyMarginModeViewModel$submitMarginMode$1$result$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return MultiBizFacadeManager.m20256j(MultiBizFacadeManager.f19232a, null, 1, null).mo24483g1(this.$isTrial, MapsKt.mapOf(new Pair(this.$symbol, this.$marginMode)));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
