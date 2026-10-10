package com.kubi.assets.dialog.evm;

import com.kubi.assets.entity.EvmRepeatEntity;
import com.kubi.assets.entity.ReqEvmRepeatEntity;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: EvmRepo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.dialog.evm.EvmRepo$deleteEvmRepeatAddress$2", m90122f = "EvmRepo.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class EvmRepo$deleteEvmRepeatAddress$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super InterfaceC41634e<? extends Boolean>>, Object> {
    final /* synthetic */ List<EvmRepeatEntity> $list;
    int label;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super InterfaceC41634e<? extends Boolean>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super InterfaceC41634e<Boolean>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EvmRepo$deleteEvmRepeatAddress$2(List<EvmRepeatEntity> list, Continuation<? super EvmRepo$deleteEvmRepeatAddress$2> continuation) {
        super(2, continuation);
        this.$list = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EvmRepo$deleteEvmRepeatAddress$2(this.$list, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super InterfaceC41634e<Boolean>> continuation) {
        return ((EvmRepo$deleteEvmRepeatAddress$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return EvmRepo.f17055a.m16285e().m16290b(new ReqEvmRepeatEntity(this.$list));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
