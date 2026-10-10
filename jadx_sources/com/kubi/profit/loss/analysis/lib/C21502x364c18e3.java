package com.kubi.profit.loss.analysis.lib;

import com.kubi.utils.extensions.C27025c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pf.C43460a;
import pf.InterfaceC43461b;

/* JADX INFO: renamed from: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisFragment$bindFlowEvent$$inlined$bindFlowEvent$2 */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes35.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¨\u0006\u0004"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$4"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisFragment$bindFlowEvent$$inlined$bindFlowEvent$2", m90122f = "AssetsProfitLossAnalysisFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$4\n+ 2 AssetsProfitLossAnalysisFragment.kt\ncom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisFragment\n*L\n1#1,187:1\n80#2,6:188\n*E\n"})
public final class C21502x364c18e3 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetsProfitLossAnalysisFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21502x364c18e3(String str, Continuation continuation, AssetsProfitLossAnalysisFragment assetsProfitLossAnalysisFragment) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = assetsProfitLossAnalysisFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C21502x364c18e3 c21502x364c18e3 = new C21502x364c18e3(this.$key, continuation, this.this$0);
        c21502x364c18e3.L$0 = obj;
        return c21502x364c18e3;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((C21502x364c18e3) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if ((interfaceC43461b instanceof C43460a) && Intrinsics.areEqual(((C43460a) interfaceC43461b).getKeyEvent(), this.$key)) {
                AssetsProfitLossAnalysisFragment assetsProfitLossAnalysisFragment = this.this$0;
                assetsProfitLossAnalysisFragment.m50045x3(C27025c.m66566d(AssetsProfitLossAnalysisFragment.m50036o3(assetsProfitLossAnalysisFragment).getNeedShowChartLayout()));
                this.this$0.sendIntent(new C21509xeff1afab());
                if (C27025c.m66566d(AssetsProfitLossAnalysisFragment.m50036o3(this.this$0).getNeedShowChartLayout())) {
                    C43852m.m96595g("B1overview", "asset", "trendFold", null, 8, null);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
