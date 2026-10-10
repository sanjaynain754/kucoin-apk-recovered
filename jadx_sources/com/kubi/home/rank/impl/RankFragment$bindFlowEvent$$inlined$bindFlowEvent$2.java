package com.kubi.home.rank.impl;

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
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¨\u0006\u0004"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$4"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.rank.impl.RankFragment$bindFlowEvent$$inlined$bindFlowEvent$2", m90122f = "RankFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$4\n+ 2 RankFragment.kt\ncom/kubi/home/rank/impl/RankFragment\n*L\n1#1,187:1\n86#2,3:188\n*E\n"})
public final class RankFragment$bindFlowEvent$$inlined$bindFlowEvent$2 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RankFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankFragment$bindFlowEvent$$inlined$bindFlowEvent$2(String str, Continuation continuation, RankFragment rankFragment) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = rankFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RankFragment$bindFlowEvent$$inlined$bindFlowEvent$2 rankFragment$bindFlowEvent$$inlined$bindFlowEvent$2 = new RankFragment$bindFlowEvent$$inlined$bindFlowEvent$2(this.$key, continuation, this.this$0);
        rankFragment$bindFlowEvent$$inlined$bindFlowEvent$2.L$0 = obj;
        return rankFragment$bindFlowEvent$$inlined$bindFlowEvent$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((RankFragment$bindFlowEvent$$inlined$bindFlowEvent$2) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if ((interfaceC43461b instanceof C43460a) && Intrinsics.areEqual(((C43460a) interfaceC43461b).getKeyEvent(), this.$key)) {
                RankListAdapter rankListAdapter = this.this$0.f25999U;
                if (rankListAdapter != null) {
                    rankListAdapter.m29863x(true);
                }
                RankListAdapter rankListAdapter2 = this.this$0.f25999U;
                if (rankListAdapter2 != null) {
                    rankListAdapter2.notifyDataSetChanged();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
