package com.kubi.profit.loss.analysis.lib;

import com.kubi.profit.loss.analysis.exception.ProfitException;
import kotlinx.coroutines.InterfaceC41709m0;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetsProfitLossAnalysisContentVM.kt */
/* JADX INFO: loaded from: classes35.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentVM$bindEvent$2$1", m90122f = "AssetsProfitLossAnalysisContentVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nAssetsProfitLossAnalysisContentVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetsProfitLossAnalysisContentVM.kt\ncom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisContentVM$bindEvent$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ProfitLossAnalysisIssue.kt\ncom/kubi/profit/loss/analysis/exception/ProfitLossAnalysisIssueKt\n*L\n1#1,725:1\n1#2:726\n44#3,2:727\n*S KotlinDebug\n*F\n+ 1 AssetsProfitLossAnalysisContentVM.kt\ncom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisContentVM$bindEvent$2$1\n*L\n86#1:727,2\n*E\n"})
public final class AssetsProfitLossAnalysisContentVM$bindEvent$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $it;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetsProfitLossAnalysisContentVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetsProfitLossAnalysisContentVM$bindEvent$2$1(boolean z11, AssetsProfitLossAnalysisContentVM assetsProfitLossAnalysisContentVM, Continuation<? super AssetsProfitLossAnalysisContentVM$bindEvent$2$1> continuation) {
        super(2, continuation);
        this.$it = z11;
        this.this$0 = assetsProfitLossAnalysisContentVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetsProfitLossAnalysisContentVM$bindEvent$2$1 assetsProfitLossAnalysisContentVM$bindEvent$2$1 = new AssetsProfitLossAnalysisContentVM$bindEvent$2$1(this.$it, this.this$0, continuation);
        assetsProfitLossAnalysisContentVM$bindEvent$2$1.L$0 = obj;
        return assetsProfitLossAnalysisContentVM$bindEvent$2$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetsProfitLossAnalysisContentVM$bindEvent$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean z11 = this.$it;
        AssetsProfitLossAnalysisContentVM assetsProfitLossAnalysisContentVM = this.this$0;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (z11) {
                assetsProfitLossAnalysisContentVM.m50022N();
            } else {
                assetsProfitLossAnalysisContentVM.m50025V();
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new ProfitException(thM103847exceptionOrNullimpl, "AssetsProfitLossAnalysisFragmentContractVM", false, null, 8, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
