package com.kubi.profit.loss.analysis.lib;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentVM$bindEvent$$inlined$bindFlowEvent$2 */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes35.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$2"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentVM$bindEvent$$inlined$bindFlowEvent$2", m90122f = "AssetsProfitLossAnalysisContentVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$2\n+ 2 AssetsProfitLossAnalysisContentVM.kt\ncom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisContentVM\n*L\n1#1,187:1\n84#2,6:188\n*E\n"})
public final class C21498x51385b01 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetsProfitLossAnalysisContentVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21498x51385b01(String str, Continuation continuation, AssetsProfitLossAnalysisContentVM assetsProfitLossAnalysisContentVM) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = assetsProfitLossAnalysisContentVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C21498x51385b01 c21498x51385b01 = new C21498x51385b01(this.$key, continuation, this.this$0);
        c21498x51385b01.L$0 = obj;
        return c21498x51385b01;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((C21498x51385b01) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key)) {
                    C44128b.m97259c("FlowEventBus", Intrinsics.stringPlus("bindFlowEvent:", this.$key));
                    if (c43460a.getData() instanceof Boolean) {
                        boolean zBooleanValue = ((Boolean) c43460a.getData()).booleanValue();
                        AssetsProfitLossAnalysisContentVM assetsProfitLossAnalysisContentVM = this.this$0;
                        assetsProfitLossAnalysisContentVM.launchOnIO(new AssetsProfitLossAnalysisContentVM$bindEvent$2$1(zBooleanValue, assetsProfitLossAnalysisContentVM, null));
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
