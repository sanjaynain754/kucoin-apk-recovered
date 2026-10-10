package com.kubi.assets.dialog.evm;

import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: EvmRepeatChainVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.dialog.evm.EvmRepeatChainVM$setInitialData$1", m90122f = "EvmRepeatChainVM.kt", m90123i = {}, m90124l = {79, 87}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class EvmRepeatChainVM$setInitialData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<EvmRepeatChainItem> $items;
    int label;
    final /* synthetic */ EvmRepeatChainVM this$0;

    /* JADX INFO: renamed from: f */
    public static final EvmRepeatChainState m16280f(List list, EvmRepeatChainState evmRepeatChainState) {
        return EvmRepeatChainState.m16307b(evmRepeatChainState, false, null, list, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EvmRepeatChainVM$setInitialData$1(List<EvmRepeatChainItem> list, EvmRepeatChainVM evmRepeatChainVM, Continuation<? super EvmRepeatChainVM$setInitialData$1> continuation) {
        super(2, continuation);
        this.$items = list;
        this.this$0 = evmRepeatChainVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EvmRepeatChainVM$setInitialData$1(this.$items, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((EvmRepeatChainVM$setInitialData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r5.m83045q(r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r5.m83045q(r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        return r0;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            if (this.$items.isEmpty()) {
                EvmRepeatChainVM evmRepeatChainVM = this.this$0;
                EvmRepeatChainEffect.c cVar = EvmRepeatChainEffect.c.f17079a;
                this.label = 1;
            } else {
                EvmRepeatChainVM evmRepeatChainVM2 = this.this$0;
                final List<EvmRepeatChainItem> list = this.$items;
                evmRepeatChainVM2.m83044p(new Function1() { // from class: com.kubi.assets.dialog.evm.y
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EvmRepeatChainVM$setInitialData$1.m16280f(list, (EvmRepeatChainState) obj2);
                    }
                });
                EvmRepeatChainVM evmRepeatChainVM3 = this.this$0;
                EvmRepeatChainEffect.b bVar = EvmRepeatChainEffect.b.f17078a;
                this.label = 2;
            }
        }
        return Unit.INSTANCE;
    }
}
