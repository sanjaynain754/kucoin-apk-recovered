package com.kubi.core.biz.kline;

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

/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¨\u0006\u0004"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$4"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.kline.KLineNtfFragmentBase$bindFlowEvent$$inlined$bindFlowEvent$1", m90122f = "KLineNtfFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$4\n+ 2 KLineNtfFragmentBase.kt\ncom/kubi/core/biz/kline/KLineNtfFragmentBase\n*L\n1#1,187:1\n157#2,3:188\n*E\n"})
public final class KLineNtfFragmentBase$bindFlowEvent$$inlined$bindFlowEvent$1 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ KLineNtfFragmentBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineNtfFragmentBase$bindFlowEvent$$inlined$bindFlowEvent$1(String str, Continuation continuation, KLineNtfFragmentBase kLineNtfFragmentBase) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = kLineNtfFragmentBase;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        KLineNtfFragmentBase$bindFlowEvent$$inlined$bindFlowEvent$1 kLineNtfFragmentBase$bindFlowEvent$$inlined$bindFlowEvent$1 = new KLineNtfFragmentBase$bindFlowEvent$$inlined$bindFlowEvent$1(this.$key, continuation, this.this$0);
        kLineNtfFragmentBase$bindFlowEvent$$inlined$bindFlowEvent$1.L$0 = obj;
        return kLineNtfFragmentBase$bindFlowEvent$$inlined$bindFlowEvent$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((KLineNtfFragmentBase$bindFlowEvent$$inlined$bindFlowEvent$1) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if ((interfaceC43461b instanceof C43460a) && Intrinsics.areEqual(((C43460a) interfaceC43461b).getKeyEvent(), this.$key)) {
                C11898b.m21762a(this.this$0);
                KLineNtfVM kLineNtfVMM21011A3 = this.this$0.m21011A3();
                if (kLineNtfVMM21011A3 != null) {
                    kLineNtfVMM21011A3.m21798F(KLineNtfContract$UiIntent.KLineHide.INSTANCE);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
