package com.kubi.profit.loss.analysis.lib;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AssetsProfitLossAnalysisContentVM.kt */
/* JADX INFO: loaded from: classes35.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/kubi/profit/loss/analysis/lib/ProfitLossAnalysisApiResponse;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentVM$requestGetPointByRange$2", m90122f = "AssetsProfitLossAnalysisContentVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AssetsProfitLossAnalysisContentVM$requestGetPointByRange$2 extends SuspendLambda implements Function2<InterfaceC41635f<? super ProfitLossAnalysisApiResponse>, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $needLoading;
    int label;
    final /* synthetic */ AssetsProfitLossAnalysisContentVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetsProfitLossAnalysisContentVM$requestGetPointByRange$2(boolean z11, AssetsProfitLossAnalysisContentVM assetsProfitLossAnalysisContentVM, Continuation<? super AssetsProfitLossAnalysisContentVM$requestGetPointByRange$2> continuation) {
        super(2, continuation);
        this.$needLoading = z11;
        this.this$0 = assetsProfitLossAnalysisContentVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetsProfitLossAnalysisContentVM$requestGetPointByRange$2(this.$needLoading, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41635f<? super ProfitLossAnalysisApiResponse> interfaceC41635f, Continuation<? super Unit> continuation) {
        return ((AssetsProfitLossAnalysisContentVM$requestGetPointByRange$2) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$needLoading) {
                this.this$0.send(new C21534u());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
