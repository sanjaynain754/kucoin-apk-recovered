package com.kubi.quotefacade.market.futures;

import bv.C4673i0;
import bv.C4692s;
import com.kubi.quotefacade.entity.FutureLevel1;
import com.kubi.resources.widget.BaseTextView;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: QuoteFuturesFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.market.futures.QuoteFuturesFragment$setData$1$1$2$1", m90122f = "QuoteFuturesFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class QuoteFuturesFragment$setData$1$1$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FutureLevel1 $futureLevel1;
    int label;
    final /* synthetic */ QuoteFuturesFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteFuturesFragment$setData$1$1$2$1(QuoteFuturesFragment quoteFuturesFragment, FutureLevel1 futureLevel1, Continuation<? super QuoteFuturesFragment$setData$1$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = quoteFuturesFragment;
        this.$futureLevel1 = futureLevel1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuoteFuturesFragment$setData$1$1$2$1(this.this$0, this.$futureLevel1, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((QuoteFuturesFragment$setData$1$1$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C4673i0 c4673i0;
        BaseTextView baseTextView;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            C4692s c4692sM52431z3 = this.this$0.m52431z3();
            if (c4692sM52431z3 != null && (c4673i0 = c4692sM52431z3.f4525c) != null && (baseTextView = c4673i0.f4375c) != null) {
                baseTextView.setText(this.$futureLevel1.getNameAMultiLang());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
