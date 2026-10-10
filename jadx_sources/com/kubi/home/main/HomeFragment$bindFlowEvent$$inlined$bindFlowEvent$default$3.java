package com.kubi.home.main;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pf.C43460a;
import pf.InterfaceC43461b;

/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¨\u0006\u0004"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$5"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.main.HomeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$3", m90122f = "HomeFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$5\n+ 2 HomeFragment.kt\ncom/kubi/home/main/HomeFragment\n*L\n1#1,187:1\n195#2,2:188\n*E\n"})
public final class HomeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$3 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String[] $keys;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HomeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$3(String[] strArr, Continuation continuation, HomeFragment homeFragment) {
        super(2, continuation);
        this.$keys = strArr;
        this.this$0 = homeFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        HomeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$3 homeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$3 = new HomeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$3(this.$keys, continuation, this.this$0);
        homeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$3.L$0 = obj;
        return homeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$3;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((HomeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$3) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if ((interfaceC43461b instanceof C43460a) && ArraysKt.contains(this.$keys, ((C43460a) interfaceC43461b).getKeyEvent())) {
                this.this$0.m29304D3().m29057u(true);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
