package com.kubi.profit.loss.analysis.lib;

import android.widget.LinearLayout;
import androidx.exifinterface.media.ExifInterface;
import com.kubi.utils.extensions.core.ViewExtKt;
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
import su.C44545a;

/* JADX INFO: renamed from: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisFragment$bindFlowEvent$$inlined$bindFlowEvent$1 */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes35.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisFragment$bindFlowEvent$$inlined$bindFlowEvent$1", m90122f = "AssetsProfitLossAnalysisFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 AssetsProfitLossAnalysisFragment.kt\ncom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisFragment\n*L\n1#1,187:1\n72#2,6:188\n*E\n"})
public final class C21501x364c18e2 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetsProfitLossAnalysisFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21501x364c18e2(String str, Continuation continuation, AssetsProfitLossAnalysisFragment assetsProfitLossAnalysisFragment) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = assetsProfitLossAnalysisFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C21501x364c18e2 c21501x364c18e2 = new C21501x364c18e2(this.$key, continuation, this.this$0);
        c21501x364c18e2.L$0 = obj;
        return c21501x364c18e2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((C21501x364c18e2) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LinearLayout root;
        LinearLayout root2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof Boolean)) {
                    if (((Boolean) c43460a.getData()).booleanValue()) {
                        C44545a c44545aM50042t3 = this.this$0.m50042t3();
                        if (c44545aM50042t3 != null && (root2 = c44545aM50042t3.getRoot()) != null) {
                            ViewExtKt.m66594y(root2);
                        }
                    } else {
                        C44545a c44545aM50042t4 = this.this$0.m50042t3();
                        if (c44545aM50042t4 != null && (root = c44545aM50042t4.getRoot()) != null) {
                            ViewExtKt.m66577h(root);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
