package com.kubi.core.spot.business.holder;

import java.math.BigDecimal;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: SpotDiffHolderImp.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Ljava/math/BigDecimal;", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.spot.business.holder.SpotDiffHolderImp$baseAvailableEquity$2$1", m90122f = "SpotDiffHolderImp.kt", m90123i = {0, 0}, m90124l = {83}, m90125m = "invokeSuspend", m90126n = {"$this$catch", "it"}, m90127s = {"L$0", "L$1"})
public final class SpotDiffHolderImp$baseAvailableEquity$2$1 extends SuspendLambda implements Function3<InterfaceC41635f<? super BigDecimal>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currency;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotDiffHolderImp$baseAvailableEquity$2$1(String str, Continuation<? super SpotDiffHolderImp$baseAvailableEquity$2$1> continuation) {
        super(3, continuation);
        this.$currency = str;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(InterfaceC41635f<? super BigDecimal> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
        SpotDiffHolderImp$baseAvailableEquity$2$1 spotDiffHolderImp$baseAvailableEquity$2$1 = new SpotDiffHolderImp$baseAvailableEquity$2$1(this.$currency, continuation);
        spotDiffHolderImp$baseAvailableEquity$2$1.L$0 = interfaceC41635f;
        spotDiffHolderImp$baseAvailableEquity$2$1.L$1 = th2;
        return spotDiffHolderImp$baseAvailableEquity$2$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.L$0;
        Throwable th2 = (Throwable) this.L$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            C44128b.m97258b("Error fetching base available equity for currency " + this.$currency + ": " + th2.getMessage());
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
            this.L$1 = SpillingKt.nullOutSpilledVariable(th2);
            this.label = 1;
            if (interfaceC41635f.emit(ZERO, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
