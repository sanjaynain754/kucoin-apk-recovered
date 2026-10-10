package com.kubi.kumex.market.p091v2;

import com.kubi.kumex.data.platform.model.ContractEntity;
import fm.C37567b;
import gf.C37878b0;
import im.BookAmountConfig;
import im.C38683c;
import im.DisplayBook;
import ki.C41050b;
import ki.InterfaceC41049a;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p314hi.InterfaceC38213a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KuMexBookFragmentV2.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.market.v2.KuMexBookFragmentV2$changeBookAmountConfig$1", m90122f = "KuMexBookFragmentV2.kt", m90123i = {0, 0, 0, 0}, m90124l = {257}, m90125m = "invokeSuspend", m90126n = {"contractConfig", "qtyUnit", "it", "$i$a$-let-KuMexBookFragmentV2$changeBookAmountConfig$1$1"}, m90127s = {"L$0", "L$1", "L$2", "I$0"})
public final class KuMexBookFragmentV2$changeBookAmountConfig$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ContractEntity $contract;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ KuMexBookFragmentV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KuMexBookFragmentV2$changeBookAmountConfig$1(ContractEntity contractEntity, KuMexBookFragmentV2 kuMexBookFragmentV2, Continuation<? super KuMexBookFragmentV2$changeBookAmountConfig$1> continuation) {
        super(2, continuation);
        this.$contract = contractEntity;
        this.this$0 = kuMexBookFragmentV2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KuMexBookFragmentV2$changeBookAmountConfig$1(this.$contract, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KuMexBookFragmentV2$changeBookAmountConfig$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC38213a interfaceC38213aM84629s = C37567b.m84629s(this.$contract);
            InterfaceC41049a interfaceC41049aM90019b = C41050b.f91264a.m90019b(this.$contract);
            C38683c c38683c = this.this$0.f29596V;
            if (C37878b0.f85252a.m85530k() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            c38683c.m87443g(new BookAmountConfig(interfaceC38213aM84629s, interfaceC41049aM90019b, z11));
            DisplayBook displayBookM87445i = this.this$0.f29596V.m87445i(null);
            if (displayBookM87445i != null) {
                InterfaceC41669n interfaceC41669n = this.this$0.f29597W;
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC38213aM84629s);
                this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41049aM90019b);
                this.L$2 = SpillingKt.nullOutSpilledVariable(displayBookM87445i);
                this.I$0 = 0;
                this.label = 1;
                if (interfaceC41669n.emit(displayBookM87445i, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
